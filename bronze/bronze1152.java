package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * #1152
 * #단어의 개수
 * 
 * - 문제 - 
 * 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 
 * 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 
 * 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
 * 
 * - 입력 - 
 * 첫 줄에 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 
 * 이 문자열의 길이는 1,000,000을 넘지 않는다. 
 * 단어는 공백 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 
 * 또한 문자열은 공백으로 시작하거나 끝날 수 있다.
 * 
 * - 출력 - 
 * 첫째 줄에 단어의 개수를 출력한다.
 * 
 * - 생각 - 
 * 1. String 클래스의 split()을 사용하면 될 것 같은데 공백으로 시작할 수 있다는 문장이 걸림.
 * 2. split 전에 문자열의 가장 앞과 뒤에 trim을 적용하면 될 것 같음.
 * 3. Java 11 부터 trim() 말고 strip() 이라는 새로운 메서드가 추가 됨.
 *    차이점은 trim() 은 '\u0020' 이하의 공백들만 제거
 *    strip()은 유니코드 공백들을 모두 제거
 * 4. 빈 문자열("")이 들어왔을 때의 처리도 생각해야 함.
 */
public class bronze1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int result = 0;

        String stripedStr = str.strip();
        String[] splitedStr = stripedStr.split(" ");
        
        if (!stripedStr.equals("")){
            result = splitedStr.length;
        }

        System.out.println(result);

        br.close();
    }
}
