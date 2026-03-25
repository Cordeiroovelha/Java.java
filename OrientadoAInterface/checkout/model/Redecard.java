package OrientadoAInterface.checkout.model;

public class Redecard implements Operator {

	@Override
	public boolean authorize(Authorizable authorizable, Card card) {
		return card.getCardNumber().startsWith("987") && authorizable.getTotal() < 2000;
	}

}
