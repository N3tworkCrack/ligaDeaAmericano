/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Conexiones.Conexion;
import DAOimpl.JugadorDAOImpl;
import DAOimpl.PersonaDAOImpl;
import interfaces.InterfazAdministrarPlantillaDeJugadores;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Jugador;
import modelo.JugadorKey;
import modelo.Persona;
import vista.panelAdminEquipo;
import vista.panelAdminPlantilla;

/**ControladorJugador.java:29
 *
 * @author manuel
 */
public class ControladorJugador implements InterfazAdministrarPlantillaDeJugadores{
    
    
    private panelAdminPlantilla panelAdminPlantilla;
    private JugadorDAOImpl jugadorDAOImpl;
    private Jugador unJugador;
    
    private PersonaDAOImpl personaDAOImpl;
    private Connection conn;

    public ControladorJugador() {
        


        try{
			
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lmfa?autoReconnect=true&useSSL=false", "root" , "manolito130");
            if (conn!=null) {
                
                unJugador = new Jugador();
                panelAdminPlantilla = new panelAdminPlantilla(this);
                personaDAOImpl = new PersonaDAOImpl();
                jugadorDAOImpl = new JugadorDAOImpl();
                cargarTablaJugador();
                
            
            }else{
                System.out.println("NO SE PUDO CARGAR LA CONEXION");
                        
            }

	}
	catch (Exception exc) {
            
            exc.printStackTrace();
	}
        
       
        

    }

    @Override
    public void agregar(String curp,String nombre, String paterno, String materno, int edad, java.util.Date fechanacimiento,
        int numero,String posicion,double salario,String nombreEquipo, boolean bajaporlesion) {
        

        try {
             
            
            
            unJugador = new Jugador(curp,nombre,paterno,materno,edad,fechanacimiento,
            numero,posicion,salario,nombreEquipo,bajaporlesion);
            
            personaDAOImpl.create(unJugador,conn);

            jugadorDAOImpl.create(unJugador, conn);
            
            cargarTablaJugador();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorJugador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void borrar(String curp) {
        

        
        try {
            
            JugadorKey jk = new JugadorKey();
            jk.setCurp(curp);
            jugadorDAOImpl.delete(jk, conn);
            cargarTablaJugador();
            
        } catch (SQLException ex) {
            Logger.getLogger(ControladorJugador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    public void actualizar(String curp,String nombre, String paterno, String materno, int edad, java.util.Date fechanacimiento,
        int numero,String posicion,double salario,String nombreEquipo, boolean bajaporlesion){
        
        try {
            
            unJugador = new Jugador(curp, nombre, paterno, materno, edad, fechanacimiento, numero, posicion,salario, nombreEquipo, false);
            personaDAOImpl.update((Persona)unJugador, conn);
            jugadorDAOImpl.update(unJugador, conn);
            cargarTablaJugador();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorJugador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void cargarTablaJugador() {
                   
            List<Jugador> jugadores;
            try {
                jugadores = jugadorDAOImpl.load(conn);
                panelAdminPlantilla.actualizarTabla(jugadores);
            } catch (SQLException ex) {
                Logger.getLogger(ControladorPersona.class.getName()).log(Level.SEVERE, null, ex);
            }
            
           
            
    }

    
    public void mostrarPanelAdminPlantilla(){
        
        panelAdminPlantilla.setVisible(true);
    }

    @Override
    public void actualizar(String curp, String nombre, String paterno, String materno, int edad, java.util.Date fechanacimiento, int numero, double salario, String nombreEquipo, boolean bajaporlesion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


  
    
    
    
}
