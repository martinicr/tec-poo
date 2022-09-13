package tec.poo.clases.herencia.interfaz;

public class Printer implements Printable {

    @Override
    public void print(Report report) {
        System.out.println("==> From PRINTER. Report: " + report.getTitle());
    }
}
