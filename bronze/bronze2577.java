package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * # 2577
 * # 숫자의 개수
 * 
 * -문제-
 * 세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
 * 예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고, 
 * 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
 * 
 * -입력-
 * 첫째 줄에 A, 둘째 줄에 B, 셋째 줄에 C가 주어진다. A, B, C는 모두 100보다 크거나 같고, 1,000보다 작은 자연수이다.
 * 
 * -출력-
 * 첫째 줄에는 A × B × C의 결과에 0 이 몇 번 쓰였는지 출력한다. 마찬가지로 둘째 줄부터 열 번째 줄까지 A × B × C의 결과에 1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력한다.
 * 
 * -생각-
 * 1. 받은 String을 int로 치환해서 연산 후에 char배열로 바꿔서 배열 순회
 * 2. 0부터 9까지니까 10자리 int 배열 선언해서 카운팅
 */
public class bronze2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int multiplyResult = A*B*C;
        char[] arr = Integer.toString(multiplyResult).toCharArray();

        int[] result = new int[10];
        Arrays.fill(result, 0);

        for ( int i = 0; i < arr.length; i++ ){
            int resultIdx = Character.getNumericValue(arr[i]);
            result[resultIdx] += 1;
        }

        for (int resultValue : result){
            System.out.println(resultValue);
        }
        br.close();
    }
}
