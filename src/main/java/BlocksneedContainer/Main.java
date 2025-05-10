package BlocksneedContainer;

import java.text.MessageFormat;

public class Main {
    public static void main(String[] arg){
        int amountOfBricks = 77;
        int containerCapacity = 6;

        int fullContainer = amountOfBricks / containerCapacity;
        System.out.println(MessageFormat.format("We have {0} full containers ",fullContainer));

        int containers = fullContainer + (amountOfBricks % containerCapacity);
        System.out.println(MessageFormat.format("We have {0} containers in general ",containers));

        int notFullContainer = amountOfBricks % containerCapacity;
        System.out.println(MessageFormat.format("We have {0} not full containers ",notFullContainer));


    }
}
