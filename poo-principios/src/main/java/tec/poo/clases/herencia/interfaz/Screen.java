package tec.poo.clases.herencia.interfaz;

public class Screen implements Printable {

    @Override
    public void print(Report report) {
        System.out.println("+++ From SCREEN. Report: " + report.getTitle());
    }
}
