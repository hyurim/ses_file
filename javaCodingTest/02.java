class Solution {
    boolean solution(String s) {
        
        int p = s.toLowerCase().replace("p", "").length();

        int y = s.toLowerCase().replace("y", "").length();
        
        return p == y ? true : false;
        
    }
}

// p와 y 개수 구하기