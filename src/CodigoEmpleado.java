//Ejercicio 1

public class CodigoEmpleado {
    private String codPais;// Este es el codigo del pais del empleado
    private int codEmpleado;// este es el codigo del empleado
    private int[] tbl;//esta es la tabla de valores para el calculo de hash

    //creamos un constructor que inicializa los atributos de la clase
    public CodigoEmpleado(String codPais, int codEmpleado, int[] tbl) {
        this.codPais = codPais;
        this.codEmpleado = codEmpleado;
        this.tbl = tbl;
    }
    //ahora creamos un metodo para obtener el codigo del pais
    public String getCodPais() {
        return codPais;
    }
    //creamos un metodo para obtener el codigo del empleado
    public int getCodEmpleado() {
        return codEmpleado;
    }
    //metodo para calcular el hash
    @Override
    public int hashCode() {
        return codPais.hashCode() * 31 + codEmpleado;
    }
    //metodo en el que comparamos si dos objetos son iguales
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CodigoEmpleado that = (CodigoEmpleado) obj;
        return codEmpleado == that.codEmpleado && codPais.equals(that.codPais);
    }
//metodo para obtener una representacion en cadena
    @Override
    public String toString() {
        return codPais + "-" + String.format("%03d", codEmpleado);
    }
//metodo para calcular un hash en la tabla de valores
    protected int fHash(CodigoEmpleado codigo) {
        return codigo.hashCode() % tbl.length;
    }
}