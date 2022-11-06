public class Chatbot {
    String name;
    public Chatbot(){
        System.out.println("チャットボットの原型を作成します。");
    }
    public Chatbot(String name){
        System.out.println("チャットボット名" + name + "を作成します。");
    }
    public void greeting(){
        System.out.println("はじめまして" + this.name + "です、よろしくお願いします");
    }
}