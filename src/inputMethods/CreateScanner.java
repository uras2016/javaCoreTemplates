package inputMethods;


import java.util.Scanner;


        public class CreateScanner {

        public static void main(String[] args) {


            Scanner userInput = new Scanner(System.in); // создаем обьект. System.in - системный ввод

            String firstName;
            System.out.println("Enter your first name:");
            firstName = userInput.next(); // next - следующая строка, которую введет пользователь

            // .next() выведет тип данных String
            // .nextInt() выведет тип данных Int


        }


    }


