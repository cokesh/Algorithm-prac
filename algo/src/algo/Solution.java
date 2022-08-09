package algo;

public class Solution {
	public String solution(String s) {
		String answer = "";
//		System.out.println(s.length());
		char[] arr = s.toCharArray();
		if(s.length() % 2 == 1) {
			for ( int i = 0; i < arr.length; i++ ) {
				int d = arr.length /2;
				answer = String.valueOf(arr[d]);
				
				System.out.println(answer);
				return answer;
			}
			
//			answer = s.substring((int)(s.length()/2), (int)(s.length()/2)+1);
			
		} else {
//			answer = s.substring((int)(s.length()/2)-1, (int)(s.length()/2)+1);
			
			for ( int i = 0; i < arr.length; i++ ) {
				int d = arr.length /2 -1;
				answer = String.valueOf(arr[d]) + String.valueOf(arr[d+1]);
				
				System.out.println(answer);
				return answer;
			}
//			answer = Integer.toString(s.indexOf(s.length()/2)).concat(Integer.toString(s.indexOf(s.length()/2 + 1)));
//			System.out.println(answer);
			
		}
//		System.out.println(answer);
		return answer;
	}


	public static void main(String[] args) {
		Solution sol = new Solution();
		sol.solution("125223");
	}
}
