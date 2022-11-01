package Study221102;

public class Exercise08 {
	public static void main(String[] args) {
		int[][]array = {
				{95,86},
				{83, 92, 96},
				{78,83,93,87,88}
		};
		int sum = 0;	// 초기값을 설정 
		double avg = 0.0;	// 평균의 초기값을 설정
		int count = 0;	// 배열의 갯수를 카운팅을 설정
		for(int i =0;i<array.length;i++) {	// i행의 개수ㅡㄹ 추가
			for(int j=0; j<array[i].length;j++) {	// 열의 개수를 카운팅ㅎ암
				sum += array[i][j];	// 모든 배열의 총합을 구한닥.
				count++;	// 이게중요함(배열의 개수를 세어줌)
			}
		}
		avg = (double)sum/count;
		
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
		
	}	
}

