package tec.poo.clases.herencia;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class PersonaTest {

    @Test
    public void newSubClasses() {

        // Error de compilación, no se puede instanciar una clase abstracta
        // Persona persona = new Persona();

        Profesor profesor = new Profesor();
        Persona administrativo = new Administrativo();
        Persona mantenimiento = new Mantenimiento();

        assertThat(profesor.getSalary()).isEqualTo(1500);
        assertThat(profesor.numberOfVacationsPerYear()).isEqualTo(12);
        assertThat(administrativo.getSalary()).isEqualTo(2000);
        assertThat(administrativo.numberOfVacationsPerYear()).isEqualTo(10);
        assertThat(mantenimiento.getSalary()).isEqualTo(1000);
        assertThat(mantenimiento.numberOfVacationsPerYear()).isEqualTo(10);

        // Error de compilación. Declaramos mantenimiento de tipo Persona y
        // persona no cuenta con el método setSchedule. Este método es propio
        // de Mantenimiento.
        // mantenimiento.setSchedule();

        Mantenimiento m = new Mantenimiento();
        m.setSchedule();

    }
}
