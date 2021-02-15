import java.io.*;
import java.util.*;

public class Solution {

    public static void emp(int[]arr,ArrayList<Integer> st,int el,int idx,int[] ans){
        if(st.size()==0 || arr[st.get(st.size()-1)] >el)
            st.add(idx);
        
        else if(arr[st.get(st.size()-1)]<el){
            ans[pop(st)] = arr[idx];
            emp(arr,st,el,idx,ans);
        }
    }

    public static int pop(ArrayList<Integer> ans){
        int r = ans.get(ans.size()-1);
        ans.remove(ans.size()-1);
        return r;
    }
    
    public static int[] nle(int[] arr,int n){
        
        int[] ans = new int[n];for(int i=0;i<n;i++) ans[i] = -1;
        ArrayList<Integer> st =  new ArrayList<>();
        for(int idx=0;idx<n;idx++)
            if(st.size() == 0)
                st.add(idx);
            else
                if(arr[st.get(st.size()-1)]>=arr[idx])
                    st.add(idx);
                else
                    emp(arr,st,arr[idx],idx,ans);
            
        
        return ans;
    }

    public static void main(String[] args) {
        int[] x = nle(new int[]{1,3,2,4},4);
        System.out.println(x[0]+" "+x[1]+" "+x[2]+" "+x[3]+" ");
}
}