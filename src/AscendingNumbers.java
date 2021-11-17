import java.util.Scanner;
public class AscendingNumbers {
    //find asscendingnumbers using Array
    public static void main(String[] args)
        {
            int count, temp;

            //User inputs the array size
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter number of elements you want in the array: ");
            count = scan.nextInt();

            int num[] = new int[count];
            System.out.println("Enter array elements:");  // Put elements
            for (int i = 0; i < count; i++)
            {
                num[i] = scan.nextInt();
            }
            scan.close();
            for (int i = 0; i < count; i++)
            {
                for (int j = i + 1; j < count; j++) {
                    if (num[i] > num[j])
                    {
                        temp = num[i];
                        num[i] = num[j];
                        num[j] = temp;
                    }
                }
            }
            //declare array elements in ascending order
            System.out.print("Array Elements in Ascending Order: ");
            for (int i = 0; i < count - 1; i++)
            {
                System.out.print(num[i] + ", ");
            }
            System.out.print(num[count - 1]);
        }
}
