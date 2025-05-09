package EvenAndOddChecker;

public class Main {
    public static void main(String[] arg){
        int randomNumber = (int)(Math.random() * 100 + 1);
        if(randomNumber % 2 == 0)
            System.out.println(randomNumber + " is even number");
        else
            System.out.println(randomNumber + " Its odd number");
    }
}
