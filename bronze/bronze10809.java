package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * #10809
 * #알파벳 찾기
 * 
 * -문제-
 * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
 * 
 * -입력-
 * 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
 * 
 * -출력-
 * 각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
 * 만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.
 * 
 * -생각-
 * 1. String 의 indexOf()에 대하여 묻는 문제 같음.
 * 2. 아 indexOf()를 구현하라는 건가?
 */
public class bronze10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        
        // indexOf 사용 -> 채점결과는 정답인데 이렇게 구현하는게 아닌거 같아서 뺌.
        // useIndexOf(S);

        // 1. 받은 문자열 쪼개기 char의 배열로 변환
        char[] charArray = S.toCharArray();

        // 2. 조건이 소문자로 이루어진 알파벳이기 때문에 모든 값이 -1인 26자리 정수 배열 선언
        int[] result = new int[26];
        Arrays.fill(result, -1);

        // 3. char 배열을 순회하면서 배열 안의 값을 바꿔줌.
        for ( int i = 0; i < charArray.length; i++ ){
            int asciiIndex = charArray[i] - 97; //ascii table에 a는 97
            if ( result[asciiIndex] == -1 ){
                result[asciiIndex] = i;
            }
        }
        
        // 4. 정답 출력
        for ( int i = 0; i < result.length; i++ ) System.out.print(result[i]+" ");

        br.close();
    }

    private static void useIndexOf(String S){
        System.out.println(S.indexOf("a") + " "
                        + S.indexOf("b") + " "
                        + S.indexOf("c") + " "
                        + S.indexOf("d") + " "
                        + S.indexOf("e") + " "
                        + S.indexOf("f") + " "
                        + S.indexOf("g") + " "
                        + S.indexOf("h") + " "
                        + S.indexOf("i") + " "
                        + S.indexOf("j") + " "
                        + S.indexOf("k") + " "
                        + S.indexOf("l") + " "
                        + S.indexOf("m") + " "
                        + S.indexOf("n") + " "
                        + S.indexOf("o") + " "
                        + S.indexOf("p") + " "
                        + S.indexOf("q") + " "
                        + S.indexOf("r") + " "
                        + S.indexOf("s") + " "
                        + S.indexOf("t") + " "
                        + S.indexOf("u") + " "
                        + S.indexOf("v") + " "
                        + S.indexOf("w") + " "
                        + S.indexOf("x") + " "
                        + S.indexOf("y") + " "
                        + S.indexOf("z")
                        );
    }
}


