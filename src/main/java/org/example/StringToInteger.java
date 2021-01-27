package org.example;

public class StringToInteger {

    public static int stringToInteger(String s){
        int rtn = 0;
        Boolean minus = false;
        for(char c: s.toCharArray()){
            if(c == ' '){

            } else if(c == '+'){

            }else if(c == '-'){
                minus = true;
            }else if(Character.isDigit(c)){
                rtn = rtn * 10 + Character.getNumericValue(c);
            }
        }

        if(minus){
            rtn = -1 * rtn;
        }

        if(rtn < Integer.MIN_VALUE){rtn = Integer.MIN_VALUE;}
        if(rtn > Integer.MAX_VALUE){rtn = Integer.MAX_VALUE;}
        
        return rtn;
    }
}
