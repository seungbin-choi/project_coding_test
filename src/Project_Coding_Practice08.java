// for문과 continue문을 사용하여
// 2부터 9까지의 구구단 중에서 짝수 단만 출력하는
// 자바 프로그램을 제작해 봅니다.

public class Project_Coding_Practice08 {

	public static void main(String[] args) {
		for (int i=2; i <=9; i++) {
			if (i%2==1) {
				continue;
			}
			System.out.println(i +"단 구구단");
			for (int a =1; a <=9; a++ ) {
				System.out.println(i +"x" +a +"=" +(i*a));
			}
		}
				




	}
}
