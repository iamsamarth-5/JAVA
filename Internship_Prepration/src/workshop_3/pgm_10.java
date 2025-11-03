package workshop_3;

public class pgm_10 {
    //Function to get Sum of all elements in the integer array getSum


        public static int getSum(int[] array){
            int sum = 0;

            for(int i = 0; i<array.length; i++){
                sum = sum + array[i];
            }
            return sum;
        }

        public static void main(String[] args) {
            int[] array = {1,2,3,4,5};

            System.out.println("Sum of array of Integer :" +getSum(array));
        }

}
