package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * # 10811
 * # 바구니 뒤집기
 * 
 * -문제-
 * 도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 순서대로 적혀져 있다. 바구니는 일렬로 놓여져 있고, 가장 왼쪽 바구니를 1번째 바구니, 그 다음 바구니를 2번째 바구니, ..., 가장 오른쪽 바구니를 N번째 바구니라고 부른다. 
 * 도현이는 앞으로 M번 바구니의 순서를 역순으로 만들려고 한다. 도현이는 한 번 순서를 역순으로 바꿀 때, 순서를 역순으로 만들 범위를 정하고, 그 범위에 들어있는 바구니의 순서를 역순으로 만든다.
 * 바구니의 순서를 어떻게 바꿀지 주어졌을 때, M번 바구니의 순서를 역순으로 만든 다음, 바구니에 적혀있는 번호를 가장 왼쪽 바구니부터 출력하는 프로그램을 작성하시오.
 * 
 * -입력-
 * 첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
 * 둘째 줄부터 M개의 줄에는 바구니의 순서를 역순으로 만드는 방법이 주어진다. 방법은 i j로 나타내고, 왼쪽으로부터 i번째 바구니부터 j번째 바구니의 순서를 역순으로 만든다는 뜻이다. (1 ≤ i ≤ j ≤ N)
 * 도현이는 입력으로 주어진 순서대로 바구니의 순서를 바꾼다.
 * 
 * -출력-
 * 모든 순서를 바꾼 다음에, 가장 왼쪽에 있는 바구니부터 바구니에 적혀있는 순서를 공백으로 구분해 출력한다.
 * 
 * -생각-
 * 다른 배열로 복사해서 값을 바꿔 넣는 것 밖에 생각이 안남
 * 나중에 다른 방법으로 다시 풀어보기
 * copyOfRange(원본 배열, 시작할 인덱스, 끝 인덱스)-> 끝 인덱스 직전 까지 복사 & 생성(끝인덱스 포함 X)
 */
public class bronze10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int basketCnt = Integer.parseInt(st.nextToken());
        int testCaseCnt = Integer.parseInt(st.nextToken());
        
        int[] basket = new int[basketCnt];
        for (int i = 0; i < basketCnt; i++ ){
            basket[i] = i+1;
        }
        
        for ( int i = 0; i < testCaseCnt; i++ ){
            st = new StringTokenizer(br.readLine());
            int startIndex = Integer.parseInt(st.nextToken());
            int endIndex = Integer.parseInt(st.nextToken());
            
            if( startIndex != endIndex ){
                int[] copy = Arrays.copyOfRange(basket, startIndex-1, endIndex);
                for (int j = startIndex - 1; j < endIndex ; j++ ){
                    basket[j] = copy[endIndex - 1 - j];
                }
            }
        }

        for ( int i = 0; i < basketCnt; i ++ ){
            System.out.print(basket[i] + " ");
        }
    
        br.close();    
    }
}
