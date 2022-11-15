package section8;

//-Write a method called reverse() with an int array as a parameter.
//-The method should not return any value. In other words, the method is allowed to modify the array parameter.
//-In main() test the reverse() method and print the array both reversed and non-reversed.
//-To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
//-For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.
//Tip:
//-Create a new console project with the name ReverseArrayChallenge

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {2 , 34, 0, 78};

        System.out.println("Original array = ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        reverse(array);
        System.out.println("Reversed array = ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void reverse(int[] array){
        int n = array.length;
        int mid = n/2;
        for (int i = 0; i < mid; i++) {
            int temp = array[i];
            array[i] = array[n-1-i];
            array[n-1-i] = temp;
        }
    }
}
