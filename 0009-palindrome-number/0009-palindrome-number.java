class Solution {
    public boolean isPalindrome(int x) {

        if(x<0){
            return  false;
        }
        String s = String.valueOf(x);
        boolean flag=true;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)  != s.charAt(s.length()-i-1)){
                 flag = false;
                 return flag;
            }
            else{
                flag=true;
            }
        }
        return flag;
    }
}