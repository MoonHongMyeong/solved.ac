package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * # 1076
 * # 저항
 * 
 * 문제
 * 전자 제품에는 저항이 들어간다. 저항은 색 3개를 이용해서 그 저항이 몇 옴인지 나타낸다. 
 * 처음 색 2개는 저항의 값이고, 마지막 색은 곱해야 하는 값이다. 저항의 값은 다음 표를 이용해서 구한다.
 * 
 * 색	    값	곱
 * black	0	1
 * brown	1	10
 * red	    2	100
 * orange	3	1,000
 * yellow	4	10,000
 * green	5	100,000
 * blue	    6	1,000,000
 * violet	7	10,000,000
 * grey	    8	100,000,000
 * white	9	1,000,000,000
 * 예를 들어, 저항의 색이 yellow, violet, red였다면 저항의 값은 4,700이 된다.
 * 
 * 입력
 * 첫째 줄에 첫 번째 색, 둘째 줄에 두 번째 색, 셋째 줄에 세 번째 색이 주어진다. 위의 표에 있는 색만 입력으로 주어진다.
 * 
 * 출력
 * 입력으로 주어진 저항의 저항값을 계산하여 첫째 줄에 출력한다.
 * 
 * 생각 
 * 값을 enum 의 index로 생각하고 곱은 10의 index 승만큼 이라고 생각하고 구현하면 될듯?
 */
public class bronze1076 {
    enum Resistor{
        black, brown, red, orange, yellow, green, blue, violet, grey, white
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long resistance = 0;
        for ( int i = 0; i < 3; i++ ) {
            String val = br.readLine();
            int idx = Resistor.valueOf(val).ordinal();
            // 3번째 입력받는 값 == 곱해야 하는 값
            if(i == 2){
                resistance = (long) (resistance * Math.pow(10, idx));
            }else{
                resistance = Long.parseLong(Long.toString(resistance) + Long.toString(idx));
            }
        }

        System.out.println(resistance);

        br.close();
    }
}
