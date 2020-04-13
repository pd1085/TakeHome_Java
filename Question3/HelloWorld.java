import java.util.Random; 

public class HelloWorld{

     public static void main(String []args){
         Random rand = new Random();
         int val[] = new int[10];
         int sum=0;
         for(int i=0;i<10;i++)
         {
             val[i]=rand.nextInt(100);
             sum=sum+val[i];
         }
         for(int i=0;i<10;i++)
         {
            System.out.println(val[i]);
         }
        System.out.println(sum);
     }
}
