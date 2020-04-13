interface BakedGoods
{
   
public int getPrice();

public String getDescription();

public String getSellByDate();
}

 

 class Cookie implements BakedGoods
{
    int  price=0;
    String desc="";
    String date="";
    
    
    public int getPrice()
    {
        return this.price;
    }
    public String getDescription()
    {
        return this.desc;
    }
    public String getSellByDate()
    {
        return this.date;
    }
    
}

class CinnamonRoll extends Cookie implements BakedGoods 
{
  
    public int getPrice()
    {
        return this.price;
    }
    public String getDescription()
    {
        return this.desc;
    }
    public String getSellByDate()
    {
        return this.date;
    }
    
}

 class Brownie  extends Cookie implements BakedGoods 
{
    

    public int getPrice()
    {
        return this.price;
    }
    public String getDescription()
    {
        return this.desc;
    }
    public String getSellByDate()
    {
        return this.date;
    }
    
}
public class ExamQ3Interface{
     public static void main(String []args){
       Cookie obj1 = new Cookie();
       obj1.price=10;
       obj1.desc="cookie";
       obj1.date="12/12/2020";
       CinnamonRoll obj2 = new CinnamonRoll();
       obj2.price=12;
       obj2.desc="cinnamonroll";
       obj2.date="12/14/2020";
       Brownie obj3 = new Brownie();
       obj3.price=15;
       obj3.desc="Brownie";
       obj3.date="12/18/2020";
       Cookie  arr[] = new Cookie[3];
       arr[0] = obj1;
       arr[1] = obj2;
       arr[2] = obj3;
       for(int i=0;i<3;i++)
       {
           System.out.println("Price: "+arr[i].getPrice());
           System.out.println("Description: "+arr[i].getDescription());
           System.out.println("Sell Date: "+arr[i].getSellByDate());
       }
       
     }
}


