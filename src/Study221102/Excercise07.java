package Study221102;

public class Excercise07 {
	public static void main(String[] args) {
		int max =0;
		int[] array = {1,5,3,8,2};	// 배열이 5개 가 있음
		for(int i=0; i<array.length;i++) {	// 배열의 길이가 증가함
			 if(max<array[i]){	//	맥스가 0의 값으로 최기화 했고, 배열의 인덱스가 클때
				 max=array[i];	// 맥스를 인덱 위치의 값과 동이하게 한후 돌린다.
			 }
				
			
		}
		
		System.out.println("max :" + max);
	}
}
