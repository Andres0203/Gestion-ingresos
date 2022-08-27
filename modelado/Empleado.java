public class Empleado {

    private int id;
    private String correo;
    private String role;
    private Empresa empresa;
    private MovimientoDinero numeroTransacciones;


    public Empleado(int id, String correo, String role, Empresa empresa,
                    MovimientoDinero numeroTransacciones) {
        this.id = id;
        this.correo = correo;
        this.role = role;
        this.empresa = empresa;
        this.numeroTransacciones = numeroTransacciones;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public MovimientoDinero getNumeroTransacciones() {
        return numeroTransacciones;
    }

    public void setNumeroTransacciones(MovimientoDinero numeroTransacciones) {
        this.numeroTransacciones = numeroTransacciones;
    }
}
