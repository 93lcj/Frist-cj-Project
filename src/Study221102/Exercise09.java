package Study221102;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] score = null;
		try (Scanner scanner = new Scanner(System.in)) {
			while(run) {
				System.out.println(("---------------------------"));
				System.out.println("1.학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5.종료");
				System.out.println(("---------------------------"));
				System.out.println("선택>");	

				int selecNo = scanner.nextInt();
				
				if(selecNo ==1) {
					System.out.println("학생수 > ");
					studentNum = scanner.nextInt();
					score = new int[studentNum];		
				}
				else if(selecNo ==2) {
					for(int i =0; i<studentNum; i++) {
						System.out.println("score" +"[" + i+"]");
						score[i] = scanner.nextInt();
					}
				}
				
				else if(selecNo ==3) {
					for(int i =0; i<studentNum; i++) {
						System.out.println("score" +"[" + i+"]" + score[i]);
				
					}
				}
				
				else if(selecNo ==4) {
					int maxscore = 0;
					int totalscore =0;
					for(int i =0; i<studentNum;i++) {
						if(maxscore<score[i]) {
							maxscore=score[i];
						}
						totalscore += score[i];
					}
					System.out.println("최고 점수 : " + maxscore);
					System.out.println("평균 점수 : " + (double)(totalscore)/score.length);
					
				}
				
				else if (selecNo ==5) {
				run = false;
				}
				
				}
		}
		
		System.out.println("프로그램 종료");
		}
		
	}

