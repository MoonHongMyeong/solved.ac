package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** 
 * # 1100
 * # 하얀 칸
 * 
 * 문제
 * 체스판은 8×8크기이고, 검정 칸과 하얀 칸이 번갈아가면서 색칠되어 있다. 가장 왼쪽 위칸 (0,0)은 하얀색이다. 
 * 체스판의 상태가 주어졌을 때, 하얀 칸 위에 말이 몇 개 있는지 출력하는 프로그램을 작성하시오.
 * 
 * 입력
 * 첫째 줄부터 8개의 줄에 체스판의 상태가 주어진다. ‘.’은 빈 칸이고, ‘F’는 위에 말이 있는 칸이다.
 * 
 * 출력
 * 첫째 줄에 문제의 정답을 출력한다.
 * 
 * 생각
 * 흰검흰검흰.... 다음줄은 검희검흰검... 이 상태를 포함해야되고 말의 위치도 생각해야됨.
 * 1. 홀수 줄은 흰검흰검... 시작이고 짝수 줄은 검흰검흰 시작이고
 * 2. 홀수 줄의 홀수가 F면 카운트, 짝수 줄의 짝수가 F면 카운트
 * 
 */
public class bronze1100 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int result = 0;
    
        for ( int i = 0; i < 8; i++ ){
            char[] chessLine = br.readLine().toCharArray();

            for ( int j = 0; j < chessLine.length; j++ ){
                if( i%2 == 1 && j%2 == 1 ){
                    if(chessLine[j] == 'F') result++;
                }
                if( i%2 == 0 && j%2 == 0 ){
                    if(chessLine[j] == 'F') result++;
                }
            }
        }

        System.out.println(result);

        br.close();
    }
}
