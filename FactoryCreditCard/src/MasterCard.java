
public class MasterCard extends CreditCard{

	public MasterCard(String cardNumber, String expiryDate, String cardHolder) {
		super(cardNumber, expiryDate, cardHolder);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getCardType() {
		// TODO Auto-generated method stub
		return "MasterCard";
	}

}
