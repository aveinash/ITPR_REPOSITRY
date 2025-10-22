import java.util.Scanner; // importing Scanner class for user input

class EvenNumberCalculator {
    int[] numbers; // declaration of array to store numbers

    // Constructor
    public EvenNumberCalculator() {
        numbers = new int[20];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any 20 numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = sc.nextInt(); // reading input
        }

        System.out.println("--------------------------------------------");
    }

    // method to display even numbers
    public void displayData() {
        System.out.println("Even numbers are: ");
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] % 2 == 0) { // check if even
                System.out.print(numbers[index] + " , ");
            }
        }
        System.out.println("\n----------------------------------");
    }
}

/*------------------------*/
public class EvenNumber {
    public static void main(String[] args) {
        // Creating object
        EvenNumberCalculator obj = new EvenNumberCalculator();
        obj.displayData();
    }
}

