package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * # 10996
 * # 별 찍기
 * 
 * 문제
 * 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
 * 
 * 입력
 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 * 
 * 출력
 * 첫째 줄부터 차례대로 별을 출력한다. 
 * 
 * 생각
 * 1. 1을 제외하면 2줄에 나눠서 출력한다.
 * 
 */
public class bronze10996{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        // 줄
        for ( int i = 0; i < input * 2; i++ ){
            // input이 1일때 예외처리
            if (input == 1){
                System.out.println("*");
                break;
            }
            // 홀수 줄일 때
            if ( i % 2 == 0 ) {
                for ( int j = 1; j <= input; j++ ){
                    if ( j % 2 == 0 ) {
                        if ( j / input == 0 && j % input == 0){
                            break;
                        }
                        System.out.print(" ");
                    }
                    if ( j % 2 == 1 ) {
                        System.out.print("*");
                    }
                }
                System.out.println();
                continue;
            }
            // 짝수 줄 일때
            if ( i % 2 == 1 ) {
                for (int j = 1; j <= input; j++ ){
                    if( j % 2 == 0 ) {
                        System.out.print("*");
                    }
                    if ( j % 2 == 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
                continue;
            }
        }

        br.close();
    }
}