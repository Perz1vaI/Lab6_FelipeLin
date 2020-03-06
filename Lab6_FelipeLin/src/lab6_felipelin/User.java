package lab6_felipelin;

import java.util.Date;

public class User {

    private String nombre;
    private String usuario;
    private String password;
    private Date Fecha;

    public User() {
    }

    public User(String nombre, String usuario, String password, Date Fecha) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.password = password;
        this.Fecha = Fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    @Override
    public String toString() {
        return "User{" + "nombre=" + nombre + ", usuario=" + usuario + ", password=" + password + ", Fecha=" + Fecha + '}';
    }

}
