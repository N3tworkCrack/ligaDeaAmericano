/*
 * This java source file is generated by DAO4J v1.19
 * Generated on Sun Feb 25 05:11:23 CST 2018
 * For more information, please contact b-i-d@163.com
 * Please check http://sourceforge.net/projects/dao4j/ for the latest version.
 */

package modelo;

import java.util.Date;

/*
 * For Table Jugador
 */
public class Jugador extends Persona implements java.io.Serializable, Cloneable {
    private JugadorKey _key = new JugadorKey();

    /* CURP, PK */
    

    /* posicion */
    protected String posicion;

    /* numero */
    protected int numero;

    /* salario */
    protected double salario;

    /* nombreEquipo */
    protected String nombreequipo;

    /* bajaPorLesion */
    protected boolean bajaporlesion;

    /* Return the key object. */

    
    public Jugador(String curp,String nombre, String paterno, String materno, int edad, Date fechanacimiento,
        int numero,String posicion,double salario,String nombreEquipo, boolean bajaporlesion){
        
        super(curp,nombre,paterno,materno,edad,fechanacimiento);
        this.numero = numero;
        this.salario = salario;
        this.nombreequipo = nombreEquipo;
        this.bajaporlesion = this.bajaporlesion;
        this.posicion = posicion;
        
    }

    public Jugador() {
        
    }

    /* CURP, PK */
    public String getCurp() {
        return curp;
    }

    /* CURP, PK */
    public void setCurp(String curp) {
        this.curp = curp;
        _key.setCurp(curp);
    }

    /* posicion */
    public String getPosicion() {
        return posicion;
    }

    /* posicion */
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    /* numero */
    public int getNumero() {
        return numero;
    }

    /* numero */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /* salario */
    public double getSalario() {
        return salario;
    }

    /* salario */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /* nombreEquipo */
    public String getNombreequipo() {
        return nombreequipo;
    }

    /* nombreEquipo */
    public void setNombreequipo(String nombreequipo) {
        this.nombreequipo = nombreequipo;
    }

    /* bajaPorLesion */
    public boolean getBajaporlesion() {
        return bajaporlesion;
    }

    /* bajaPorLesion */
    public void setBajaporlesion(boolean bajaporlesion) {
        this.bajaporlesion = bajaporlesion;
    }

    /* Indicates whether some other object is "equal to" this one. */
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || !(obj instanceof Jugador))
            return false;

        Jugador bean = (Jugador) obj;

        if (this.curp == null) {
            if (bean.curp != null)
                return false;
        }
        else if (!this.curp.equals(bean.curp)) 
            return false;

        if (this.posicion == null) {
            if (bean.posicion != null)
                return false;
        }
        else if (!this.posicion.equals(bean.posicion)) 
            return false;

        if (this.numero != bean.numero)
            return false;

        if (this.salario != bean.salario)
            return false;

        if (this.nombreequipo == null) {
            if (bean.nombreequipo != null)
                return false;
        }
        else if (!this.nombreequipo.equals(bean.nombreequipo)) 
            return false;

        if (this.bajaporlesion != bean.bajaporlesion)
            return false;

        return true;
    }

    /* Creates and returns a copy of this object. */
    public Object clone()
    {
        Jugador bean = new Jugador();
        bean.curp = this.curp;
        bean.posicion = this.posicion;
        bean.numero = this.numero;
        bean.salario = this.salario;
        bean.nombreequipo = this.nombreequipo;
        bean.bajaporlesion = this.bajaporlesion;
        return bean;
    }

    /* Returns a string representation of the object. */
    public String toString() {
        String sep = "\r\n";
        StringBuffer sb = new StringBuffer();
        sb.append(this.getClass().getName()).append(sep);
        sb.append("[").append("curp").append(" = ").append(curp).append("]").append(sep);
        sb.append("[").append("posicion").append(" = ").append(posicion).append("]").append(sep);
        sb.append("[").append("numero").append(" = ").append(numero).append("]").append(sep);
        sb.append("[").append("salario").append(" = ").append(salario).append("]").append(sep);
        sb.append("[").append("nombreequipo").append(" = ").append(nombreequipo).append("]").append(sep);
        sb.append("[").append("bajaporlesion").append(" = ").append(bajaporlesion).append("]").append(sep);
        return sb.toString();
    }
}