package Java_Starter;

public class Main {
    public static void main(String[] arg){
        System.out.println("Hello Vistula");

        //Testing debugging features
        try{
            System.out.println(3/0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
