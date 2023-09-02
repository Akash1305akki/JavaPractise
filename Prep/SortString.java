package Prep;

public class SortString {
//    public class RangeInSwitch {
        public static void main(String[] args) {
//            int number = 5;
//
//            switch (number) {
//                case 1:
//                case 2:
//                case 3:
//                    System.out.println("Number is between 1 and 3");
//                    break;
//                case 4:
//                case 5:
//                case 6:
//                    System.out.println("Number is between 4 and 6");
//                    break;
//                default:
//                    System.out.println("Number is not in the specified ranges");
//            }
//        }


//
//        public static void main(String[] args) {
            String input = "aBcD123XYZ!@#";

            String uppercase = "";
            String lowercase = "";
            String numbers = "";
            String specialChars = "";

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                int asciiValue = (int) ch;

                switch (asciiValue) {

                    case 65:
                    case 66:
                    case 67:

                    case 90: // Uppercase 'A'
                    // Uppercase 'Z'
                        uppercase += ch;
                        break;
                    case 97: // Lowercase 'a'
                    case 122: // Lowercase 'z'
                        lowercase += ch;
                        break;
                    case 48: // Digit '0'
                    case 57: // Digit '9'
                        numbers += ch;
                        break;
                    default:
                        specialChars += ch;
                        break;
                }
            }

            System.out.println("Uppercase: " + uppercase);
            System.out.println("Lowercase: " + lowercase);
            System.out.println("Numbers: " + numbers);
            System.out.println("Special Characters: " + specialChars);
        }



}
