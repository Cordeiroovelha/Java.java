package OrientadoAInterface.checkout.model;

public interface Operator {
	
	boolean authorize(Authorizable authorizable, Card card);

}
