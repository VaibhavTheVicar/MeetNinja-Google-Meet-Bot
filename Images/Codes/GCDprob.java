import java.util.*;
public class GCDprob {

    public static void print(ArrayList <Integer> l){
        for(int i = 0; i < l.size(); i++){
            System.out.print(l.get(i)+" ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
  
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      
      for(int tc = 0;tc<t;tc++){

        int l = sc.nextInt();
        ArrayList <Integer> g1 = new ArrayList<>();
        ArrayList <Integer> g2 = new ArrayList<>();

        for(int i = 0;i<l;i++)
            {
                g1.add(sc.nextInt());
            }
        
        g2  = (ArrayList)g1.clone();
        Collections.sort(g2);
        String Ans = "YES";
        for(int i = 0;i<l;i++)
            if(g1.get(i)!=g2.get(i) && g1.get(i)%g2.get(0)!=0)
                {Ans = "NO";break;}
        System.out.println(Ans);

      }


  }

}