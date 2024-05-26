package Day1;

public class Variables {
    public static void main(String[] args) {
        String studentName = "Jack";
        int studentAge = 18;
        double studentHeight = 173.5;
        char studentFirstNameFirstLetter = 'J';
        boolean studentStatus = true;

        System.out.println("Student Name                   : " + studentName);
        System.out.println("Student Age                    : " + studentAge);
        System.out.println("Student Height                 : " + studentHeight);
        System.out.println("Student First Name First Letter: " + studentFirstNameFirstLetter);
        System.out.println("Student Status                 : " + (studentStatus ? "YES" : "NO"));

        System.out.println("----------------------------------------------------------");

        int productId = 1;
        String productName = "Keyboard";
        int productStock = 20;
        float productPrice = 3.5f;
        String productSupplier = "Msi";

        System.out.println("Product ID      : " + productId);
        System.out.println("Product Name    : " + productName);
        System.out.println("Product Stock   : " + productStock);
        System.out.println("Product Price   : " + productPrice+"₺");
        System.out.println("Product Supplier: " + productSupplier);

        //sabit - constant - final
        //let(swift) - val(kotlin) - dart(const)
        int number = 123;
        System.out.println(number);

        number=321; //you can change variable value, its not contant defined
        System.out.println(number);

        final int secondNumber = 456;
        System.out.println(secondNumber);

        //secondNumber = 654 //if you want to change variable value, you will get error beacuse you defined constant to variable



    }
}
