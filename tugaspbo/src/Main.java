import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Login 
        System.out.println("SELAMAT DATANG DI CLOUD MART");
        System.out.println("==============================");
        System.out.println("Log in");

        // Password yang benar
        String predefinedPassword = "cloudmart99";

        // Input Password
        System.out.print("Password     : ");
        String enteredPassword = scanner.nextLine();

        // Message
        if (enteredPassword.equals(predefinedPassword)) {
            
           
            String generatedCaptcha = generateCaptcha();
            System.out.println("Inputkan Captcha sesuai yang tertera!");
            System.out.println("Kode Captcha : " + generatedCaptcha);
            System.out.print("Entry Captcha : ");
            String enteredCaptcha = scanner.nextLine();

            if (enteredCaptcha.equals(generatedCaptcha)) {
                

                // Input data transaksi
                System.out.print("Nama Pelanggan : ");
                String name = scanner.nextLine();

                System.out.print("No. HP         : ");
                String phoneNumber = scanner.nextLine();

                System.out.print("Alamat         : ");
                String address = scanner.nextLine();

                System.out.print("Kode Barang    : ");
                String productCode = scanner.nextLine();

                System.out.print("Nama Barang    : ");
                String productName = scanner.nextLine();

                System.out.print("Harga Barang   : ");
                double productPrice = scanner.nextDouble();

                System.out.print("Jumlah Beli    : ");
                int quantity = scanner.nextInt();

                System.out.print("Kasir          : ");
                String cashier = scanner.next();

                CustomerData customerData = new CustomerData(name, phoneNumber, address);

                Date currentDate = new Date();

                
                SupermarketTransaction transaction = new SupermarketTransaction(currentDate,
                        "hh:mm:ss time zone", customerData, productCode, productName, productPrice,
                        quantity, cashier);

                transaction.displayTransaction();
            } else {
                System.out.println("Captcha salah. Silahkan log in kembali.");
            }
        } else {
            System.out.println("Password salah. Silakan log in kembali.");
        }
    }
    private static String generateCaptcha() {
       
        return "CLM09";
    }
}
