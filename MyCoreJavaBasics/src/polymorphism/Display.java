package polymorphism;

public class Display extends Car implements Tata {

	public void makeSalt() {
		System.out.println("Another Product has been added to Salt");
	}

	public void makeCar() {
		System.out.println("New Car has been added:Tata Innova");
	}

	public static void main(String[] args) {
		Tata display = new Display();
		Car tata = new Display();
		tata.makeCar();
		tata.makeSalt();
		display.makeCar();
		display.makeSalt();
	}

}
