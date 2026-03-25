package OrientadoAInterface.checkout.view;

import OrientadoAInterface.checkout.model.Card;
import OrientadoAInterface.checkout.model.Checkout;
import OrientadoAInterface.checkout.model.Cielo;
import OrientadoAInterface.checkout.model.Epson;
import OrientadoAInterface.checkout.model.Operator;
import OrientadoAInterface.checkout.model.Printer;
import OrientadoAInterface.checkout.model.Buy;

public class Main {

	public static void main(String[] args) {
		Operator operator = new Cielo();
		Printer printer = new Epson();
		Card card = new Card("PEDRO P SILVA", "123456");
		Buy buy = new Buy("Pedro Paulo da Silva", 10.0, "Sorvete");
		Checkout checkout = new Checkout(operator, printer);
		checkout.closeBuy(buy, card);
	}

}
