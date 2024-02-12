package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * # 1212
 * # 8진수 -> 2진수
 * 
 * 문제
 * 8진수가 주어졌을 때, 2진수로 변환하는 프로그램을 작성하시오.
 * 
 * 입력
 * 첫째 줄에 8진수가 주어진다. 주어지는 수의 길이는 333,334을 넘지 않는다.
 * 
 * 출력
 * 첫째 줄에 주어진 수를 2진수로 변환하여 출력한다. 수가 0인 경우를 제외하고는 반드시 1로 시작해야 한다.
 * 
 * 생각
 * 10진수로 만들고 그 결과값을 2진수로 변환하는게 ? -> 10진법을 2진법으로 바꾸는게 더 어려운듯? -> 제일 크게 나눌수 있는 2의 배수를 찾아야하는데 이 부분이 애매함
 * 그래서 8진수의 자리는 어차피 2의 3승씩이니까 8진법을 직접 2진법으로 바꾸는 걸로 해야겠구나.
 * 
 * 8진법의 1자리는 2진법의 3자리임
 * 예제로 확인하면 8진법의 314는 3 -> 2진법의 11, 1 -> 1, 4 -> 100
 * "11" + "001" + "100" 으로 붙이면 11001100 이 출력됨
 * 첫자리가 아니고 2진법으로 1자리가 나온다면 앞에 00을 붙여줘야하고
 * 첫자리가 아니고 2진법으로 2자리가 나온다면 앞에 0을 붙여줘야함
 * 첫자리는 시작이기 떄문에 문제 없음.
 */
public class bronze1212 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] octal = br.readLine().toCharArray();

        for ( int i = 0; i < octal.length; i++ ){
            int demical = Character.getNumericValue(octal[i]);
            String binary = Integer.toBinaryString(demical);
            // binary가 2자리고 시작점이 아니면
            if ( binary.length() == 2 && i != 0 ){
                sb.append("0" + binary);
            // binary가 1자리고 시작점이 아니면
            }else if ( binary.length() == 1 && i != 0 ){
                sb.append("00"+ binary);
            }else {
                sb.append(binary);
            }
        }

        System.out.println(sb.toString());

        br.close();
    }
}
