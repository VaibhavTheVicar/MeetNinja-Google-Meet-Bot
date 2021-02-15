
import java.util.*;
public class Solution {
    

    public static int[] lps(String s, int l,int h)
    {

        if(l<0 || h>s.length()-1 || s.charAt(l) != s.charAt(h)) 
            return new int[]{l+1,h-1};

        return lps(s,l-1,h+1);
    }

        
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int lmax = 0;
        int smax = 0;

        for(int i=0;i<s.length();i++)
        {
            int[] t = lps(s,i-1,i+1);
            if(t[1]-t[0]+1>lmax){
                 lmax = t[1]-t[0]+1;
                 smax = t[0];
            }
        }
        
        for(int i=0;i<s.length();i++)
        {
            int[] t = lps(s,i-1,i);
            if(t[1]-t[0]+1>lmax){
                 lmax = t[1]-t[0]+1;
                 smax = t[0];
            }
        }
    System.out.println(lmax+"\n"+s.substring(smax,lmax+smax));
    }

}