import java.util.Scanner;

public class DigitAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0, place = 1, carry = 0;

        while(num > 0){
            int d = num % 10;
            d = d + 1 + carry;
            carry = d / 10;
            d = d % 10;
            result = d * place + result;
            place *= 10;
            num /= 10;
        }
        System.out.println(result);
    }
}
