//-WAP to remove the duplicate Characters in the given String

import java.util.Arrays;
import java.util.Scanner;

public class RemoveChar {
    private static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        RemoveDuplicateImp removeDuplicateImp = new RemoveDuplicateImp();
//        System.out.println('a'+32);
        System.out.println("Enter the String");
        String name = SCANNER.next();
        int stringLength = name.length();
        char arr[] = new char[stringLength];
        arr = name.toCharArray();
        display(removeDuplicateImp.removeDuplicate(arr));
//        System.out.println(Arrays.toString(arr));

    }

    public static void display(char arr[]) {
        System.out.println("Element in array");
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] >= 'a' && arr[i] <= 'z') || (arr[i] >= 'A' && arr[i] <= 'Z'))
                System.out.println(arr[i]);
        }
    }

}
