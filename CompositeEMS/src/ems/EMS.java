package ems;

import java.util.*;

//Component
abstract class Employee {
 protected String name;
 protected String id;
 protected double salary;

 public Employee(String name, String id, double salary) {
     this.name = name;
     this.id = id;
     this.salary = salary;
 }

 public abstract void add(Employee e);
 public abstract void remove(Employee e);
 public abstract double getTotalSalary();
 public abstract int getTotalEmployees();
 public abstract void promote();

 public String getName() { return name; }
 public String getId() { return id; }
 public double getSalary() { return salary; }
}

//Leaf
class Worker extends Employee {
 public Worker(String name, String id, double salary) {
     super(name, id, salary);
 }

 @Override
 public void add(Employee e) {
     throw new UnsupportedOperationException("Worker cannot add employees.");
 }

 @Override
 public void remove(Employee e) {
     throw new UnsupportedOperationException("Worker cannot remove employees.");
 }

 @Override
 public double getTotalSalary() {
     return salary;
 }

 @Override
 public int getTotalEmployees() {
     return 1;
 }

 @Override
 public void promote() {
     System.out.println(name + " promoted to Leader.");
 }
}

//Composite
class Leader extends Employee {
 private List<Employee> subordinates = new ArrayList<>();

 public Leader(String name, String id, double salary) {
     super(name, id, salary);
 }

 @Override
 public void add(Employee e) {
     subordinates.add(e);
 }

 @Override
 public void remove(Employee e) {
     subordinates.remove(e);
 }

 @Override
 public double getTotalSalary() {
     double total = salary;
     for (Employee e : subordinates) {
         total += e.getTotalSalary();
     }
     return total;
 }

 @Override
 public int getTotalEmployees() {
     int count = 1;
     for (Employee e : subordinates) {
         count += e.getTotalEmployees();
     }
     return count;
 }

 @Override
 public void promote() {
     System.out.println(name + " promoted to Manager.");
 }
}

//Composite
class Manager extends Employee {
 private List<Employee> subordinates = new ArrayList<>();
 private String department;

 public Manager(String name, String id, double salary, String department) {
     super(name, id, salary);
     this.department = department;
 }

 @Override
 public void add(Employee e) {
     subordinates.add(e);
 }

 @Override
 public void remove(Employee e) {
     subordinates.remove(e);
 }

 @Override
 public double getTotalSalary() {
     double total = salary;
     for (Employee e : subordinates) {
         total += e.getTotalSalary();
     }
     return total;
 }

 @Override
 public int getTotalEmployees() {
     int count = 1;
     for (Employee e : subordinates) {
         count += e.getTotalEmployees();
     }
     return count;
 }

 public String getDepartment() {
     return department;
 }

 @Override
 public void promote() {
     System.out.println(name + " is already a Manager.");
 }
}

//CEO - Top-level Composite
class CEO extends Employee {
 private List<Manager> managers = new ArrayList<>();

 public CEO(String name, String id, double salary) {
     super(name, id, salary);
 }

 @Override
 public void add(Employee e) {
     if (e instanceof Manager) {
         managers.add((Manager) e);
     } else {
         throw new UnsupportedOperationException("CEO can only manage Managers.");
     }
 }

 @Override
 public void remove(Employee e) {
     if (e instanceof Manager) {
         managers.remove(e);
     }
 }

 @Override
 public double getTotalSalary() {
     double total = salary;
     for (Manager m : managers) {
         total += m.getTotalSalary();
     }
     return total;
 }

 @Override
 public int getTotalEmployees() {
     int count = 1;
     for (Manager m : managers) {
         count += m.getTotalEmployees();
     }
     return count;
 }

 @Override
 public void promote() {
     System.out.println("CEO cannot be promoted.");
 }

 public Manager getDepartmentManager(String department) {
     for (Manager m : managers) {
         if (m.getDepartment().equalsIgnoreCase(department)) {
             return m;
         }
     }
     return null;
 }
}

//EMS client
public class EMS {
 public static void main(String[] args) {
     CEO ceo = new CEO("Alice", "C001", 200000);

     Manager m1 = new Manager("Bob", "M001", 120000, "Engineering");
     Manager m2 = new Manager("Carol", "M002", 115000, "Marketing");

     Leader l1 = new Leader("Dave", "L001", 90000);
     Leader l2 = new Leader("Eve", "L002", 85000);

     Worker w1 = new Worker("Frank", "W001", 50000);
     Worker w2 = new Worker("Grace", "W002", 52000);
     Worker w3 = new Worker("Heidi", "W003", 51000);

     // Build structure
     l1.add(w1);
     l1.add(w2);
     m1.add(l1);
     m2.add(l1);
     m1.add(w3);
     ceo.add(m1);
     ceo.add(m2);

     // Operations
     System.out.println("Total Company Salary: " + ceo.getTotalSalary());
     System.out.println("Total Company Employees: " + ceo.getTotalEmployees());
     System.out.println("Engineering Dept Salary: " + m1.getTotalSalary());
     System.out.println("Marketing Dept Employees: " + m2.getTotalEmployees());

     // Promote a worker
     w1.promote(); // Output: Frank promoted to Leader.
 }
}

