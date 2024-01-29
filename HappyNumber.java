class Solution {
    public int solution(int n){
        if(n<10){return n;}
        if(n ==10){return 1;}
        int sum =0;
        while(n>0){
            sum += Math.pow(n%10, 2);
            n=n/10;
        }
        return solution(sum);
    }
    public boolean isHappy(int n) {
        if(solution(n)==1 || solution(n)==7){return true;}
        return false;
    }
}
