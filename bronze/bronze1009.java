package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * #1009
 * #분산처리
 * 
 * - 문제 -
 * 재용이는 최신 컴퓨터 10대를 가지고 있다. 
 * 어느 날 재용이는 많은 데이터를 처리해야 될 일이 생겨서 각 컴퓨터에 1번부터 10번까지의 번호를 부여하고, 
 * 10대의 컴퓨터가 다음과 같은 방법으로 데이터들을 처리하기로 하였다.
 * 1번 데이터는 1번 컴퓨터, 2번 데이터는 2번 컴퓨터, 3번 데이터는 3번 컴퓨터, ... ,
 * 10번 데이터는 10번 컴퓨터, 11번 데이터는 1번 컴퓨터, 12번 데이터는 2번 컴퓨터, ...
 * 총 데이터의 개수는 항상 a^b개의 형태로 주어진다. 재용이는 문득 마지막 데이터가 처리될 컴퓨터의 번호가 궁금해졌다. 
 * 이를 수행해주는 프로그램을 작성하라.
 * 
 * - 입력 - 
 * 입력의 첫 줄에는 테스트 케이스의 개수 T가 주어진다. 
 * 그 다음 줄부터 각각의 테스트 케이스에 대해 정수 a와 b가 주어진다. (1 ≤ a < 100, 1 ≤ b < 1,000,000)
 * 
 * - 출력 - 
 * 각 테스트 케이스에 대해 마지막 데이터가 처리되는 컴퓨터의 번호를 출력한다.
 * 
 * - 생각 - 
 * 컴퓨터가 10대니까 11번 데이터는 1번, 12번 데이터는 2번 컴퓨터에 들어옴.
 * 1. 연산할 때 a의 1의 자리 수만 가져와서 b의 값만큼 반복하면 될 것 같음. 
 * 2. 밑수가 10이면 어차피 10번 컴퓨터에서 작업 함.
 */

public class bronze1009 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCaseCount = Integer.parseInt(br.readLine());

        for ( int i = 0; i < testCaseCount; i++ ){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            
            int baseNumber = Integer.parseInt(st.nextToken());
            int exponentNumber = Integer.parseInt(st.nextToken());
            
            int result = 1;
         
            for ( int j = 1; j <= exponentNumber; j++ ){
                result = result*baseNumber%10;
            }

            if (result == 0) result = 10;

            System.out.println(result);
        }
        br.close();
	}
}
