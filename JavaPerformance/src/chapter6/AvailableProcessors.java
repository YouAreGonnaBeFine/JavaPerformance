package chapter6;

public class AvailableProcessors {

	public static void main(String[] args) {
		
		//��ÿ��ô�������Ŀ
		int availableProcessors = Runtime.getRuntime().availableProcessors();
		
		System.out.println(availableProcessors);

	}

}
