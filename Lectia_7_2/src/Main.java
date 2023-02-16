public class Main {
    public static void main(String[] args) {

        Invoice invoice=new Invoice("computer", "gamer", 2, 20000);
        System.out.println(invoice.getAmount());
    }
}