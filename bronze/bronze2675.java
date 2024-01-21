package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * # 2675
 * # 문자열 반복
 * 
 * -문제-
 * 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 
 * 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. 
 * S에는 QR Code "alphanumeric" 문자만 들어있다.
 * QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
 * 
 * -입력-
 * 첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 
 * 각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다. 
 * S의 길이는 적어도 1이며, 20글자를 넘지 않는다. 
 * 
 * -출력-
 * 각 테스트 케이스에 대해 P를 출력한다.
 * 
 * -생각-
 * 1. alphanumeric은 ascii table 범위에 들어있다.
 * 2. 두 번째 받는 문자열을 쪼개서 첫 번째 값만큼 반복시키고 반환하면 되겠는데?
 */
public class bronze2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCaseCount = Integer.parseInt(br.readLine());
        
        for ( int i = 0; i < testCaseCount; i++ ){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int repeatCount = Integer.parseInt(st.nextToken());
            char[] repeatTarget = st.nextToken().toCharArray();

            StringBuilder result = new StringBuilder();

            for ( int j = 0; j < repeatTarget.length; j++ ){
                for ( int k = 0; k < repeatCount; k++ ){
                    result.append(repeatTarget[j]);
                }
            }

            System.out.println(result);
        }
        br.close();
    }
}
