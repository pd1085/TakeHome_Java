mport java.util.Random; 

public class ExamQ5
{

     public static void main(String []args)
     {
        ExamSingleton obj = ExamSingleton.createInstance();
        System.out.println(obj.tellJoke());
     
        
     }
}

class ExamSingleton
{
       private static ExamSingleton singleton = new ExamSingleton( );

    private ExamSingleton() { }
    public  static ExamSingleton createInstance()
    {
    
      return singleton;
    }
    
    public String tellJoke()
    {
        return "Job interviewer: 'And where would you see yourself in five years’ time Mr. Jeffries?'"+"\n"+"Mr. Jeffries: 'Personally believe my biggest weakness is in listening.'";
    }
}

