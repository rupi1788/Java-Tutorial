public class MainClass {
      public static void main(String[] args){
          Welcome create = new Welcome();
          String result = create.createWelcomeMessage("Samrudh");
          System.out.println("Welcome " + result +"!");
          System.out.println("How are you " + result + "?");

    }
}
