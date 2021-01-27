package org.example;

public class LongestPalindrome {
    public static String longestPalindrome(String s){
        String rtn = "";
        String findAns1 = "";
        String findAns2 = "";
        int count = 0;

        for(int i=0; i< s.length(); i++){
            findAns1 = palindrome(i, i, s);
            findAns2 = palindrome(i-1, i, s);
            System.out.println(findAns2);

            if(Math.max(findAns1.length(), findAns2.length()) > count){
                if(findAns1.length() > findAns2.length()){
                    count = findAns1.length();
                    rtn = findAns1;
                }else{
                    count = findAns2.length();
                    rtn = findAns2;
                }
            }
        }

        return rtn;
    }

    public static String palindrome(int i, int j, String s){
        String rtn = "";

        while(i>=0 && j< s.length() && s.charAt(i) == s.charAt(j)){
            i--;
            j++;
        }
        i++;
        System.out.println(i);
        System.out.println(j);
        return s.substring(i,j);
    }
}
