package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  # 8958
 *  # OX퀴즈
 * 
 * -문제-
 * "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 
 * 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 
 * 예를 들어, 10번 문제의 점수는 3이 된다.
 * "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
 * OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
 * 
 * -입력-
 * 첫째 줄에 테스트 케이스의 개수가 주어진다. 
 * 각 테스트 케이스는 한 줄로 이루어져 있고, 길이가 0보다 크고 80보다 작은 문자열이 주어진다. 
 * 문자열은 O와 X만으로 이루어져 있다.
 * 
 * -출력-
 * 각 테스트 케이스마다 점수를 출력한다.
 * 
 * -생각-
 * 1. 주어지는 테스트 String을 char의 배열로 바꾸고 반복 순회하면 될듯?
 * 2. marking 라는 변수를 선언해서 이전 결과가 O면 +1 해서 추가 X면 0으로 만들면 될거 같고
 * 3. int 배열에 채점 결과를 하나씩 넣어서 합한 값을 출력
 */
public class bronze8958 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for ( int i = 0; i < testCase; i++ ){
            char[] quizResult = br.readLine().toCharArray();
            int[] scores = new int[quizResult.length];

            int marking = 0;
            for ( int j = 0; j < quizResult.length; j++ ){
                if ( Character.compare(quizResult[j], Character.valueOf('O')) == 0 ){
                    marking++;
                }else{
                    marking = 0;
                }
                scores[j] = marking;
            }

            int result = 0;
            for (int score : scores){
                result += score;
            }
            
            System.out.println(result);
        }

        br.close();
    }
}
