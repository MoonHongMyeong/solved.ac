package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * # 2745
 * # 진법 변환
 * 
 * 문제
 * B진법 수 N이 주어진다. 이 수를 10진법으로 바꿔 출력하는 프로그램을 작성하시오.
 * 10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
 * A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
 * 
 * 입력
 * 첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36)
 * B진법 수 N을 10진법으로 바꾸면, 항상 10억보다 작거나 같다.
 * 
 * 출력
 * 첫째 줄에 B진법 수 N을 10진법으로 출력한다.
 * 
 * 생각
 * 2진법을 10진법으로 변활할 때 처럼하면 될듯?
 * ex 11010 을 10진법으로 하면 2^4*1 + 2^3*1 + 2^2*0 + 2^1*1 + 2^0*0 = 26
 * 1. 문자들은 if문 처리를 해야하나? -> char 배열로 변환해서 switch문으로 => 틀렸습니다 처리됨 
 * 2. Character클래스에 getNumericValue라는 메서드가 있는데 이게 원하는 A=10 ... Z=35까지 알려줌. => 틀렸습니다 처리됨
 * 3. 그냥 아스키 코드로 처리하라는 걸까> => Math 클래스도 쓰지않고 구하는 것으로 함... => 맞았습니다!!
 */
public class bronze2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        char[] target = st.nextToken().toCharArray();
        int notation = Integer.parseInt(st.nextToken());

        int case1 = case1(target, notation);
        int case2 = case2(target, notation);
        int case3 = case3(target, notation);
        
        System.out.println("case1: " + case1);
        System.out.println("case2: " + case2);
        System.out.println("case3: " + case3);

        br.close();
    }

    private static int case3(char[] target, int notation){
        int result = 0;
        int temp = 1;
        for ( int i = target.length-1; i>=0; i-- ){
            if ( target[i] >= '0' && target[i] <= '9'){
                result += (target[i] - '0') * temp;
            }else{
                result += (target[i] - 'A' + 10) * temp;
            }
            temp *= notation;
        }
        return result;
    }

    private static int case2(char[] target, int notation){
        int result = 0;
        for ( int i = target.length-1; i >= 0; i-- ) {
            result = result + ((int) Math.pow(notation, i)) * Character.getNumericValue(target[i]);
        }
        return result;
    }

    private static int case1(char[] target, int notation){
        int[] result = new int[target.length];
        for ( int i = 0; i < result.length; i++){
            result[i] = 0;
        }

        for ( int i = target.length-1; i >= 0; i-- ) {
            switch(target[i]){
                case '0':
                    result[i] = (int) Math.pow(notation, i) * 0;
                    break;
                case '1':   
                    result[i] = (int) Math.pow(notation, i) * 1;
                    break;
                case '2':
                    result[i] = (int) Math.pow(notation, i) * 2;
                    break;
                case '3':
                    result[i] = (int) Math.pow(notation, i) * 3;
                    break;
                case '4':
                    result[i] = (int) Math.pow(notation, i) * 4;
                    break;
                case '5':
                    result[i] = (int) Math.pow(notation, i) * 5;
                    break;
                case '6':
                    result[i] = (int) Math.pow(notation, i) * 6;
                    break;
                case '7':
                    result[i] = (int) Math.pow(notation, i) * 7;
                    break;
                case '8':
                    result[i] = (int) Math.pow(notation, i) * 8;
                    break;
                case '9':
                    result[i] = (int) Math.pow(notation, i) * 9;
                    break;
                case 'A':
                    result[i] = (int) Math.pow(notation, i) * 10;
                    break;
                case 'B':
                    result[i] = (int) Math.pow(notation, i) * 11;
                    break;
                case 'C':
                    result[i] = (int) Math.pow(notation, i) * 12;
                    break;
                case 'D':
                    result[i] = (int) Math.pow(notation, i) * 13;
                    break;
                case 'E':
                    result[i] = (int) Math.pow(notation, i) * 14;
                    break;
                case 'F':
                    result[i] = (int) Math.pow(notation, i) * 15;
                    break;
                case 'G':
                    result[i] = (int) Math.pow(notation, i) * 16;
                    break;
                case 'H':
                    result[i] = (int) Math.pow(notation, i) * 17;
                    break;
                case 'I':
                    result[i] = (int) Math.pow(notation, i) * 18;
                    break;
                case 'J':
                    result[i] = (int) Math.pow(notation, i) * 19;
                    break;
                case 'K':
                    result[i] = (int) Math.pow(notation, i) * 20;
                    break;
                case 'L':
                    result[i] = (int) Math.pow(notation, i) * 21;
                    break;
                case 'M':
                    result[i] = (int) Math.pow(notation, i) * 22;
                    break;
                case 'N':
                    result[i] = (int) Math.pow(notation, i) * 23;
                    break;
                case 'O':
                    result[i] = (int) Math.pow(notation, i) * 24;
                    break;
                case 'P':
                    result[i] = (int) Math.pow(notation, i) * 25;
                    break;
                case 'Q':
                    result[i] = (int) Math.pow(notation, i) * 26;
                    break;
                case 'R':
                    result[i] = (int) Math.pow(notation, i) * 27;
                    break;
                case 'S':
                    result[i] = (int) Math.pow(notation, i) * 28;
                    break;
                case 'T':
                    result[i] = (int) Math.pow(notation, i) * 29;
                    break;
                case 'U':
                    result[i] = (int) Math.pow(notation, i) * 30;
                    break;
                case 'V':
                    result[i] = (int) Math.pow(notation, i) * 31;
                    break;
                case 'W':
                    result[i] = (int) Math.pow(notation, i) * 32;
                    break;
                case 'X':
                    result[i] = (int) Math.pow(notation, i) * 33;
                    break;
                case 'Y':
                    result[i] = (int) Math.pow(notation, i) * 34;
                    break;
                case 'Z':
                    result[i] = (int) Math.pow(notation, i) * 35;
                    break;
            }
        }

        int sum = 0;
        for ( int i = 0; i < result.length; i++ ){
            sum += result[i];
        }

        return sum;
    }
}
