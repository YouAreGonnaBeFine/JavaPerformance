package chapter6;

public class AvailableProcessors {

	public static void main(String[] args) {
		
		int availableProcessors = Runtime.getRuntime().availableProcessors();
		
		System.out.println(availableProcessors);

	}

}
