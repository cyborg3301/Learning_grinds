public class sumofArray {
    public static void main(String[] args) {

        int[] myArray = { 1, 2, 3, 4, 5 };
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];

            // System.out.println(sum); //to print the iterative summation use print here
            // else in out of loop.
        }
        System.out.println(sum);
    }
}