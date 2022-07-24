import java.util.Scanner;

public class GiaiPhuongTrinh {
    public static void main(String[] args) {
////giải pt bậc 1//////
        System.out.println("làm PT bậc 1");
        System.out.println("PT có dạng a*x + b = c,giờ hãy nhập các số");
     ///nhận dữ liệu nhập vào//////////
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào a :");
        double a = scanner.nextDouble();
        System.out.println("Nhập vào b :");
        double b = scanner.nextDouble();
        System.out.println("Nhập vào c :");
        double c = scanner.nextDouble();
        if (a != 0){
            double x = (c-b)/a;
            System.out.println("x = " + x);
        }else {
            if (b==c){
                System.out.println("PT có vô số nghiệm");
            }else {
                System.out.println("PT vô nghiệm ");
            }
        }
    }
}
