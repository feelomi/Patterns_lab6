package pt5.task12;

class SecurePrinter extends Printer {
    @Override
    void print(String document) {
        System.out.println("Printing securely: " + document);
        super.print(document);
    }
}