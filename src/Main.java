import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (args.length == 1) {

            List<Integer> sourceList = new ArrayList<>();
            int upperLimit = Integer.MIN_VALUE;
            int lowerLimit = Integer.MAX_VALUE;
            int targetNumber = 0;
            int result = 0;

            Scanner scanner = null;
            try {
                scanner = new Scanner(new File(args[0]));
            } catch (IOException e) {
                e.printStackTrace();
            }
            while (scanner.hasNext()) {
                sourceList.add(scanner.nextInt());
            }
            for (Integer number : sourceList) {
                if (number > upperLimit) {
                    upperLimit = number;
                }
                if (number < lowerLimit) {
                    lowerLimit = number;
                }
            }

            targetNumber = (upperLimit - lowerLimit) / 2;

            for (Integer number : sourceList) {
                if (number < targetNumber) {
                    result += targetNumber - number;
                } else if (number > targetNumber) {
                    result += number - targetNumber;
                }
            }
            System.out.println(result);
        }
    }
}