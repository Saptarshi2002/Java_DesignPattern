package Singleton;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import javax.swing.JOptionPane;

public class FactTest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		String input = JOptionPane.showInputDialog("Enter a index :");
		int index = Integer.parseInt(input);
		
		List<Integer> numbers = new ArrayList<>();
		BufferedReader reader = new BufferedReader(new FileReader("Numbers.txt"));
		
		String line;
		while((line = reader.readLine())!= null) {
			numbers.add(Integer.parseInt(line.trim()));
		}
		reader.close();
		
		
		int n = numbers.get(index);
		FactUtil fact = FactUtil.getInstance();
		int factorial = fact.factorial(n);
		

//		JOptionPane.showMessageDialog(null, fact, line, factorial);
		JOptionPane.showMessageDialog(null, "Factorial is "+factorial, "Required Factorial", JOptionPane.PLAIN_MESSAGE);
	}

}
