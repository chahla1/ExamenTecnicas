public class CodigoEmpleado {
    private String codPais;
    private int codEmpleado;
    private int[] tbl;

    public CodigoEmpleado(String codPais, int codEmpleado, int[] tbl) {
        this.codPais = codPais;
        this.codEmpleado = codEmpleado;
        this.tbl = tbl;
    }

    public String getCodPais() {
        return codPais;
    }

    public int getCodEmpleado() {
        return codEmpleado;
    }

    @Override
    public int hashCode() {
        return codPais.hashCode() * 31 + codEmpleado;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CodigoEmpleado that = (CodigoEmpleado) obj;
        return codEmpleado == that.codEmpleado && codPais.equals(that.codPais);
    }

    @Override
    public String toString() {
        return codPais + "-" + String.format("%03d", codEmpleado);
    }

    protected int fHash(CodigoEmpleado codigo) {
        return codigo.hashCode() % tbl.length;
    }
}