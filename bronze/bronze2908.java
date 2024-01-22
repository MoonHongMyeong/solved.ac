package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * # 2908 
 * # 상수
 * 
 * -문제-
 * 상근이의 동생 상수는 수학을 정말 못한다. 상수는 숫자를 읽는데 문제가 있다. 
 * 이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다. 
 * 상근이는 세 자리 수 두 개를 칠판에 써주었다. 그 다음에 크기가 큰 수를 말해보라고 했다.
 * 상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 
 * 예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다. 
 * 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
 * 두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.
 * 
 * -입력-
 * 첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다. 두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다.
 * 
 * -출력-
 * 첫째 줄에 상수의 대답을 출력한다.
 * 
 * -생각-
 * 1. 단서는 같지 않은 세 자리수, 0이 포함 되지 않음.
 * 2. 두 수를 입력 받고 char[]로 치환해서 0번째와 2번쨰의 자리를 바꾼걸 String -> int로 변환해서 크기 확인 후 출력
 */
public class bronze2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        char[] example1 = st.nextToken().toCharArray();
        char[] example2 = st.nextToken().toCharArray();

        char temp = example1[2];
        example1[2] = example1[0];
        example1[0] = temp;
        
        temp = example2[2];
        example2[2] = example2[0];
        example2[0] = temp;

        int answer1BySangsu = Integer.parseInt(String.valueOf(example1));
        int answer2BySangsu = Integer.parseInt(String.valueOf(example2));

        System.out.println(answer1BySangsu > answer2BySangsu ? answer1BySangsu : answer2BySangsu);
        
        br.close();
        
    }
}
