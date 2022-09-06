package tec.poo.clases.herencia.interfaz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ReportManagerTest {

    @Test
    public void printInPrinter() {
        /* Dos formas de imprimir, una a una impresora y otra a la pantalla */
        Printable printer = new Printer();
        Printable screen = new Screen();

        ReportManager reportManager = new ReportManager(printer);
        Report report = new Report();
        report.setTitle("Reporte de Activos");

        reportManager.printReport(report);

        reportManager.printReport(report, screen);
    }
}
