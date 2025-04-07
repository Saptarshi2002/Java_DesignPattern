
public abstract class CreditCard {
	
	String cardNumber;
	String expiryDate;
	String cardHolder;
	
	public CreditCard(String cardNumber,String expiryDate,String cardHolder) {
		// TODO Auto-generated constructor stub
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
		this.cardHolder = cardHolder;
	}
	
	public abstract String getCardType();
	
	public String toString(){
		return "Card Type: " + getCardType() +
	               ", Card Number: " + cardNumber +
	               ", Expiry Date: " + expiryDate +
	               ", Card Holder: " + cardHolder;
	}
}
