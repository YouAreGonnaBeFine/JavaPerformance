package chapter6;

public class AvailableProcessors {

	public static void main(String[] args) {
		
		//获得可用处理器数目，可据此确定同时并发执行的Java线程数。
		int availableProcessors = Runtime.getRuntime().availableProcessors();
		
		System.out.println(availableProcessors);

	}

}
