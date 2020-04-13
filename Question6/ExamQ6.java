import java.util.Random; 
abstract class SpaceShip
{
 int tonnage;
 String name;

 public int getTonnage() 
 {
     return tonnage; 
 }

 public String getName()
 {
     return name;
 }

 public abstract String getFranchise();
}

 class StarWarsShips extends SpaceShip 
 {
      public String getFranchise()
      {
          return "StarWarsShips";
      }
 }

 class StarTrekShips extends SpaceShip
 {
     public String getFranchise()
      {
          return "StarTrekShips";
      }
 }

 class OtherSciFiSpaceShips extends SpaceShip 
 {
     public String getFranchise()
      {
          return "OtherSciFiSpaceShips";
      }
 } 
 
public class ExamQ3Abstract
{
    public static void main(String args[])
    {
       StarWarsShips obj1=new StarWarsShips();
       obj1.tonnage=100;
       obj1.name="war1";
       StarTrekShips obj2=new StarTrekShips();
       obj2.tonnage=200;
       obj2.name="trek1";
       OtherSciFiSpaceShips obj3=new OtherSciFiSpaceShips();
       obj3.tonnage=300;
       obj3.name="SciFi1";
       SpaceShip  arr[] = new SpaceShip[3];
       arr[0] = obj1;
       arr[1] = obj2;
       arr[2] = obj3;
       for(int i=0;i<3;i++)
       {
           System.out.println("Name "+arr[i].getName());
           System.out.println("Tonnage "+arr[i].getTonnage());
           System.out.println("Franchise "+arr[i].getFranchise());
       }
    }
}

