import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (args.length == 1) {

            List<Integer> sourceList = new ArrayList<>();

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

            Collections.sort(sourceList);
            int targetNumber = sourceList.get(sourceList.size() / 2);
            for (Integer number : sourceList) {
                result += Math.abs(number - targetNumber);
            }
            System.out.println(result);
        }
    }
}