package section7.encapsulation;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("intial page count" + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted);
        System.out.println("The new total print count " + printer.getPagesPrinted());


    }



}
