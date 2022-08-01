//Main class  file
public class Mobile  {
      public static void main(String[] args) {
            SimCard sim=new Airtel();
            sim.calling();
            sim.msg();
            sim=new Jio();
            sim.calling();
            sim.msg();
            ((Jio) sim).Mms();
            sim=new Idea();
            sim.calling();
            sim.msg();      
      }
}
