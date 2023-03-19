using System;

public class Solution {
    public static bool IsPalindrome(int x) {
        string a=x.ToString();
        string gecici="";
        for(int i=a.Length-1;i>=0;i--){
            gecici+=a[i];

        }
        if(gecici == a){
            return true;
        }else{
            return false;
        }
    }
}
