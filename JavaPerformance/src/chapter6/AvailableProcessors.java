package chapter6;

public class AvailableProcessors {

	public static void main(String[] args) {
		
		//获得可用处理器数目
		int availableProcessors = Runtime.getRuntime().availableProcessors();
		
		System.out.println(availableProcessors);

	}

}
