package algo.src.algo;

import java.util.Arrays;

public class PhysicalUniformLost {
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        answer = n - lost.length; // 잃어버린 사람수를 뺀 후의 값 초기화

        for( int i = 0; i < lost.length; i++ ) {
            for( int j = 0; j < reserve.length; j++) {
                int borrower = reserve[j] - lost[i];
                if (lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }else {
                    if(borrower == 1 || borrower == -1) {
                        answer++;
                        reserve[j] = 0; // 빌린사람이다 해서 0으로 값을 초기화 시켜줌.
                        break;
                    }

                }
            }
            continue;
        }
        System.out.println(answer);
        return answer;
    }

//    public static void main(String[] args) {
//        int[] lost = {1,3};
//        int[] reserve = {4};
//        solution(4, lost, reserve);
//    }
}
