// 학점 메기기
// 연습중임
package study;

public class Study1028 {
	public static void main(String[] args) {
		int result = 0;
		while(result!=5) {
			int x = (int)(Math.random()*6)+1;
			int y = (int)(Math.random()*6)+1;
			result = x +y;
			System.out.println("("+x +"," + y +")"); 
		}
	}
}
