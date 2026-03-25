package OrientadoAInterface.checkout.model;

public class Cielo implements Operator {

	@Override
	public boolean authorize(Authorizable authorizable, Card card) {
		return card.getCardNumber().startsWith("123");
	}

}
