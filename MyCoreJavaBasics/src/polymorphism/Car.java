package polymorphism;

public class Car implements Tata {
	public void makeCar() {

		System.out.println("Tata Innova");
	}

	public void makeSalt() {
		System.out.println("Tata salt");

	}

	public void makePower() {
		System.out.println("Tata Power Services");

	}

	public void makeCompany() {
		System.out.println("Tata Consultancy services");

	}

	public static void main(String[] args) {
		Tata tata = new Car();
		tata.makeCar();
		tata.makeCompany();
		tata.makePower();
		tata.makeSalt();

	}
}
