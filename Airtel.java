//file Airtel
interface SimCard{
      public void calling();
      public void msg();
}
class Airtel implements SimCard{
      public void calling(){
            System.out.println("Provides Calling");
      }
      public void msg(){
            System.out.println("Provides Messaging");
      }
}