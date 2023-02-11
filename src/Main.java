
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

           
                Scanner input = new Scanner(System.in);
                System.out.print("Sayı girin: ");
                int num = input.nextInt();
                int temp = num;
                int rev = 0;
                while (temp != 0) {
                    int digit = temp % 10;
                    rev = rev * 10 + digit;
                    temp /= 10;
                }
                if (num == rev) {
                    System.out.println(num + " palindrom bir sayıdır.");
                } else {
                    System.out.println(num + " palindrom bir sayı değildir.");
                }
                input.close();
            }
        }
        
    
