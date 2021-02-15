import java.util.*;
public class xxx {

    public static void main(String[] args) {
  
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      
      ArrayList <Integer> g1 = new ArrayList<>();
      ArrayList <Integer> g2 = new ArrayList<>();

      int rs =(num*(num+1))/4;

      for(int i=num;i>0;i--)
      {
          if(rs-i>=0){
              g1.add(i);
              rs=rs-i;
          }
          else{
              g2.add(i);
          }
      }

      System.out.println();
      int sm = 0;
      for(int i = 0; i<g1.size();i++)
      {
          System.out.println(g1.get(i));
        sm = sm + g1.get(i);
        }

      System.out.println(sm);
      System.out.println();
      sm = 0;
      for(int i = 0; i<g2.size();i++)
      {System.out.println(g2.get(i));
        sm = sm + g2.get(i);
    }
    System.out.println(sm);
  }

}

// import java.io.*;
// import java.util.*;

// public class Solution {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//          if(num%4==0 || num%4==3)
//             System.out.println(0);
//         else
//          System.out.println(1);
// }
// }