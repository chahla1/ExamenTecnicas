//Ejercicio 4

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CodigoEmpleadoTest {


    private int[] tbl = new int[10]; // Definimos tbl para las pruebas

    @Test
    public void testConsistentHashCode() {
        CodigoEmpleado emp = new CodigoEmpleado("A", 23, tbl);
        int hash1 = emp.hashCode();
        int hash2 = emp.hashCode();
        int hash3 = emp.hashCode();
        assertEquals(hash1, hash2);
        assertEquals(hash2, hash3);
    }

    @Test
    public void testEqualObjectsSameHashCode() {
        CodigoEmpleado emp1 = new CodigoEmpleado("B", 45, tbl);
        CodigoEmpleado emp2 = new CodigoEmpleado("B", 45, tbl);
        assertEquals(emp1.hashCode(), emp2.hashCode());
    }

    @Test
    public void testDifferentObjectsDifferentHashCode() {
        CodigoEmpleado emp1 = new CodigoEmpleado("C", 134, tbl);
        CodigoEmpleado emp2 = new CodigoEmpleado("D", 134, tbl);
        assertNotEquals(emp1.hashCode(), emp2.hashCode());
    }

    @Test
    public void testHashCodeContract() {
        CodigoEmpleado emp1 = new CodigoEmpleado("E", 1, tbl);
        CodigoEmpleado emp2 = new CodigoEmpleado("E", 2, tbl);
        CodigoEmpleado emp3 = new CodigoEmpleado("E", 1, tbl);

        assertEquals(emp1.hashCode(), emp1.hashCode());
        assertEquals(emp1.hashCode(), emp3.hashCode());
        assertEquals(emp3.hashCode(), emp1.hashCode());
        assertEquals(emp1.hashCode(), emp1.hashCode());
        assertNotEquals(emp1.hashCode(), 0);
        assertNotEquals(emp1.hashCode(), emp2.hashCode());
    }
}