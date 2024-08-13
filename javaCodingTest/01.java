class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int a = 1; a <= n; a++){
            if (n % a == 0) {
                answer += a;
            }
        }
        return answer;
    }

// 약수 합을 구하기

    public static void main(String[] args) {
        Solution sol = new Solution();
        int result = sol.solution(12); 
        System.out.println( result);
    }
}
