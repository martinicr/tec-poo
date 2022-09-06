package tec.poo.clases.herencia;

public class Profesor extends Persona {

    @Override
    public int getSalary() {
        return 1500;
    }

    @Override
    public int numberOfVacationsPerYear() {
        // Se podria obtener el valor de la super clase
        // var actual = super.numberOfVacationsPerYear();

        return 12;
    }
}
