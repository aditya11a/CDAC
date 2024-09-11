package problem1;

class demo {
	// static field
	public static int counter = 0;

	demo() {
		demo.counter++;
		System.out.println("Instance created: " + demo.counter);
	}
}

public class instanceCounter {

	public static void main(String[] args) {
		demo d = new demo();
		demo d1 = new demo();
		demo d2 = new demo();

	}

}
