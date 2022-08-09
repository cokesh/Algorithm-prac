package algo.src.algo;

public class Yaksu {
    public int solution(int s) {
        //매개변수로 들어오는 수의 약수를 모두 구해야 한다.
        //모든 약수들의 합을 구해야 한다.
        int sum = 0;
//        int j = s;
        if(s==0) {
            return sum;
        } else if (s==1) {
            sum = s;
            return sum;
        }

        for ( int i = 1; i < s; i++ ) {
            for ( int j = s; j >= i ; j-- ) {
                if (i * j == s) {
                    if(i == j) {
                        sum += i;
                    } else {
                        sum += i + j;
                    }
                    System.out.println( i + " * " + j + "---"+ sum);
                    break;
                }
            }

        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        Yaksu y = new Yaksu();
        y.solution(312);
    }
}
