import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CreditCardProcessor {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String file = "creditcards.txt";
		
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line;
		
		while((line = reader.readLine())!=null) {
			String[] parts = line.split(",");
			
			String number = parts[0].trim();
			String expiry = parts[1].trim();
            String name = parts[2].trim();
            
            CreditCard card = CreditCardFactory.createCard(number, expiry, name);
            System.out.println(card);
		}

	}

}
