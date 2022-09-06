package tec.poo.clases.herencia.interfaz;

public class ReportManager {

    private Printable printable;

    public ReportManager(Printable printable) {
        this.printable = printable;
    }

    public void printReport(Report report) {
        this.printable.print(report);
    }

    public void printReport(Report report, Printable printable) {
        printable.print(report);
    }
}
