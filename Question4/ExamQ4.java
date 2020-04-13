import java.util.Random; 

public class ExamQ4
{

     public static void main(String []args)
     {
        StringReverse obj = new StringReverse();
        String res = obj.reverseString("ascd");
        System.out.println(res);
     }
}

class StringReverse
{
    public String reverseString(String str)
    {
        String res="";
        for(int i=str.length()-1;i>=0;i--)
        {
           res=res+str.charAt(i); 
        }
        return res;
    }
}
