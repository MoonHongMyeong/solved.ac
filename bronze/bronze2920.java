package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * # 2920
 * # 음계
 * 
 * - 문제 -
 * 다장조는 c d e f g a b C, 총 8개 음으로 이루어져있다. 이 문제에서 8개 음은 다음과 같이 숫자로 바꾸어 표현한다. c는 1로, d는 2로, ..., C를 8로 바꾼다.
 * 1부터 8까지 차례대로 연주한다면 ascending, 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면 mixed 이다.
 * 연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 아니면 mixed인지 판별하는 프로그램을 작성하시오.
 * 
 * - 입력 -
 * 첫째 줄에 8개 숫자가 주어진다. 이 숫자는 문제 설명에서 설명한 음이며, 1부터 8까지 숫자가 한 번씩 등장한다.
 * 
 * - 출력 -
 * 첫째 줄에 ascending, descending, mixed 중 하나를 출력한다.
 * 
 * - 생각 - 
 * 1. 배열에서 현재 인덱스의 값과 다음 인덱스의 값의 차이가 -1 이면 다음 인덱스의 값이 1만큼 크기 때문에 ascending으로 유지
 * 2. 반대로 차이가 +1 이면 뒤의 인덱스가 작은 것이므로 dscending
 * 3. 그 외의 차이면 이미 순서대로가 깨지기 때문에 mixed
 */
public class bronze2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] charArray = br.readLine().split(" ");
        int[] arr = new int[charArray.length];

        for (int i = 0; i < charArray.length; i++ ){
            arr[i] = Integer.parseInt(charArray[i]);
        }

        String result = "";
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] - arr[i+1] == -1) result = "ascending";
            else if (arr[i] - arr[i+1] == 1) result= "descending";
            else {
                result = "mixed";
                break;
            }
        }

        System.out.println(result);

        br.close();
    }
}
