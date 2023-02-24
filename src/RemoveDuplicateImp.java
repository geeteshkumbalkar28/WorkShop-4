import java.util.HashMap;

public class RemoveDuplicateImp implements ERemoveDuplicate {

    public char[] removeDuplicate(char arr[]) {
        char brr[] = new char[arr.length];
        brr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (checkCondition(arr, arr[i], brr)) {
                brr[i] = arr[i];
            }
        }
        return brr;
    }

    private boolean checkCondition(char arr[], char ch, char brr[]) {
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
//            boolean check = checkCondition(brr, ch);
            if ((brr[i] == ch ||brr[i] == ch+32 || brr[i] == ch-32)) {
                return false;
            }
        }
        return flag;
    }

//    private boolean checkCondition(char arr[], char ch) {
//        boolean flag = true;
//        for (int i = 0; i < arr.length; i++) {
//            if ((arr[i] == ch || arr[i] == ch+32||arr[i] == ch-32)) {
//                return false;
//            }
//        }
//        return flag;
//    }
}
