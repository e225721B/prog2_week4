public class Main {
    public static void main(String[] args){
    System.out.println("main method runs");
    Chatbot bot1 = new Chatbot();
    Chatbot bot2 = new Chatbot("tomokai");
    bot2.greeting();
    bot2.name = "peppa-";
    bot2.greeting();
    bot1.greeting();
    
    }
}
