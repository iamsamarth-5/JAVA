package workshop_5;
//Function to print binary values of various input like integer ,cahr , also perform shift operations on


public class pgm_20 {


//Function to remove spaces from the string removeSpaces

        static String removeSpaces(String input){

            StringBuilder result = new StringBuilder();

            for(int index = 0; index < input.length(); index++){
                char oneChar = input.charAt(index);

                if(oneChar == ' '){
                    continue;
                }
                else{
                    result = result.append(oneChar);
                }
            }
            return result.toString();
        }

        public static void main(String[] args) {
            String input = "How are you";

            System.out.println(removeSpaces(input));
        }
    }