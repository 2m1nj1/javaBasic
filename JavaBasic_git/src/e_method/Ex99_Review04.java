package e_method;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex99_Review04 {

	public static void main(String[] args) {
		
		
		String str[] = ballotBox();
		int elected[] = solution(str);
		
		System.out.print("당선인은 ");
		for(int i = 0; i < elected.length; i++) {
			System.out.print(elected[i] + "번 ");
		} // end of for i
		System.out.println("후보 입니다.");
		
	} // end of main()
	
	static String[] ballotBox() {
		Scanner input = new Scanner(System.in);
		System.out.println(">> 후보의 수를 입력하세요.");
		String candiNum = input.nextLine();
		
		System.out.println(">> 투표 결과를 입력하세요. e.g. [1,5,4,3,2]");
		String voteStr = input.nextLine();
		
		StringTokenizer st = new StringTokenizer(voteStr, ",");
		
		int arryL = st.countTokens() + 1;
		String[] votes = new String[arryL];
		
		votes[0] = candiNum;
		
		for(int i = 1; i < arryL; i++) {
			votes[i] = st.nextToken();
		} // end of for i
		
		return votes;
	} // end of ballotBox()
	
	static int[] solution(String[] votes) {
		int candiNum = Integer.parseInt(votes[0]);
		int cntVote[] = new int[candiNum];
		
		// 표 수 초기화
		for(int i = 0; i < candiNum; i++) {
			cntVote[i] = 0;
		} // end of for i
		
		// 후보 별 표 세기
		for(int i = 0; i < votes.length -1; i++) {
			int v = Integer.parseInt(votes[i+1]);
			for(int j = 0; j < cntVote.length; j++) {
				//System.out.println(" i = " + i + ", v = " + v + ", j = " + j);
				if(j+1 == v) {
					cntVote[j]++;
					//System.out.printf("cntVote[%d] = %d\n", j, cntVote[j]);
				} // end of if
			} // end of for j
		} // end of for i
		
//		for(int i = 0; i < cntVote.length; i++) {
//			System.out.printf("cntVote[%d] = %d\n", i, cntVote[i] );
//		}
		
		// 가장 많은 표를 받은 후보 찾기
		int max = 0;
		int maxCandi = 0;
		
		for (int i = 0; i < cntVote.length; i++) {
			if ( max < cntVote[i]) {
				maxCandi = i; // 최대 투표값을 가진 후보의 인덱스 값 (근데 중복인 경우는 모름...)
				max = cntVote[i]; // 최대 투표값
				System.out.println("max = " + max);
			} // end of if
		} // end of for i
		
		// 최고 표 당선인 수 세기
		int maxCandiCnt = 0;
		for (int i = 0; i<cntVote.length; i++) {
			if(cntVote[i] == max) {
				maxCandiCnt++;
			} // end of if
		} // end of for i
		
		int maxCandiArry[] = new int[maxCandiCnt];
		
		int idx = 0;
		for (int i = 0; i < cntVote.length; i++) {
			if(cntVote[i] == max) {
				maxCandiArry[idx++] = i+1;
				System.out.printf("%d번 후보가 %d표\n", i+1, cntVote[i]);
			} // end of if
		} // end of for i
		
		// return 가장 많은 표를 받은 후보의 번호
		return maxCandiArry;
	} // end of solution()
	
} // end of class
