
public class CreditCardFactory {
	
	public static CreditCard createCard(String cardNumber,String expiryDate,String cardHolder) {
//		if (cardNumber.length() == 16 && cardNumber.startsWith("5") && "12345".contains(""+cardNumber.charAt(1)))
//			return new MasterCard(cardHolder, cardHolder, cardHolder);
		
		if (cardNumber.length() == 16 && cardNumber.startsWith("5") &&
	            "12345".contains("" + cardNumber.charAt(1))) {
	            return new MasterCard(cardNumber, expiryDate, cardHolder);
	        } else if ((cardNumber.length() == 13 || cardNumber.length() == 16) &&
	                    cardNumber.startsWith("4")) {
	            return new VisaCard(cardNumber, expiryDate, cardHolder);
	        } else if (cardNumber.length() == 15 && cardNumber.startsWith("34") || cardNumber.startsWith("37")) {
	            return new AmexCard(cardNumber, expiryDate, cardHolder);
	        } else if (cardNumber.length() == 16 && cardNumber.startsWith("6011")) {
	            return new DiscoverCard(cardNumber, expiryDate, cardHolder);
	        } else {
	            throw new IllegalArgumentException("Unknown card type or invalid number: " + cardNumber);
	        }
}
}
