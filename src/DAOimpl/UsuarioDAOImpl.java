/*
 * This java source file is generated by DAO4J v1.19
 * Generated on Fri Mar 09 06:08:56 CST 2018
 * For more information, please contact b-i-d@163.com
 * Please check http://sourceforge.net/projects/dao4j/ for the latest version.
 */

package DAOimpl;

import modelo.UsuarioKey;
import modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.ArrayList;
import DAO.UsuarioDAO;

/**
 * This class provides methods to populate DB Table of Usuario
 */
public class UsuarioDAOImpl implements UsuarioDAO {
    /* SQL to insert data */
    private static final String SQL_INSERT =
        "INSERT INTO Usuario ("
        + "CURP, nombreUsuario, contrasena, categoriaUsuario"
        + ") VALUES (?, ?, ?, ?)";

    /* SQL to select data */
    
      
    private static final String SQL_LOG =
          "SELECT "
        + "p.CURP, nombre, paterno, nombreUsuario, contrasena, categoriaUsuario "
        + "FROM Persona p INNER JOIN Usuario u ON p.CURP = u.CURP "
        + "WHERE "
        + "nombreUsuario = ? AND contrasena = ? ";
    
    
    private static final String SQL_SELECT =
        "SELECT "
        + "CURP, nombreUsuario, contrasena, categoriaUsuario "
        + "FROM Usuario WHERE "
        + "CURP = ? AND nombreUsuario = ?";

    /* SQL to update data */
    private static final String SQL_UPDATE =
        "UPDATE Usuario SET "
        + "contrasena = ?, categoriaUsuario = ?,nombreUsuario = ? "
        + "WHERE "
        + "CURP = ?";

    /* SQL to delete data */
    private static final String SQL_DELETE =
        "DELETE FROM Usuario WHERE "
        + "CURP = ? AND nombreUsuario = ?";

    /**
     * Create a new record in Database.
     * @param bean   The Object to be inserted.
     * @param conn   JDBC Connection.
     * @exception    SQLException if something is wrong.
     */
    public void create(Usuario bean, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_INSERT);
            ps.setString(1, bean.getCurp());
            ps.setString(2, bean.getNombreusuario());
            ps.setString(3, bean.getContrasena());
            ps.setString(4, bean.getCategoriausuario());
            ps.executeUpdate();
        }finally {
            close(ps);
        }
    }

    /**
     * Retrive a record from Database.
     * @param beanKey   The PK Object to be retrived.
     * @param conn      JDBC Connection.
     * @exception       SQLException if something is wrong.
     */
    
    
    public Object[] LoadUsuario(String username,String pass,Connection conn) throws SQLException{
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(SQL_LOG);
            ps.setString(1, username);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            Object[] results = getResultsLog(rs);
            if (results!=null)
                return results;
            else
                return null;
        }finally {
            close(rs);
            close(ps);
        }
        
        
    }
    
    public Usuario load(UsuarioKey key, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(SQL_SELECT);
            ps.setString(1, key.getCurp());
            ps.setString(2, key.getNombreusuario());
            rs = ps.executeQuery();
            List results = getResults(rs);
            if (results.size() > 0)
                return (Usuario) results.get(0);
            else
                return null;
        }finally {
            close(rs);
            close(ps);
        }
    }

    /**
     * Update a record in Database.
     * @param bean   The Object to be saved.
     * @param conn   JDBC Connection.
     * @exception    SQLException if something is wrong.
     */
    public void update(Usuario bean, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_UPDATE);
            ps.setString(1, bean.getContrasena());
            ps.setString(2, bean.getCategoriausuario());
            ps.setString(4, bean.getCurp());
            ps.setString(3, bean.getNombreusuario());
            ps.executeUpdate();
        }finally {
            close(ps);
        }
    }

    /**
     * Create a new record in Database.
     * @param bean   The PK Object to be deleted.
     * @param conn   JDBC Connection.
     * @exception    SQLException if something is wrong.
     */
    public void delete(UsuarioKey key, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_DELETE);
            ps.setString(1, key.getCurp());
            ps.setString(2, key.getNombreusuario());
            ps.executeUpdate();
        }finally {
            close(ps);
        }
    }
    
    /**
     * Populate the ResultSet.
     * @param rs     The ResultSet.
     * @return       The Object to retrieve from DB.
     * @exception    SQLException if something is wrong.
     */
    
        
    protected List<Usuario> getResults(ResultSet rs) throws SQLException {
        List results = new ArrayList<Usuario>();
        while (rs.next()) {
            Usuario bean = new Usuario();
            bean.setCurp(rs.getString("CURP"));
            bean.setNombreusuario(rs.getString("nombreUsuario"));
            bean.setContrasena(rs.getString("contrasena"));
            bean.setCategoriausuario(rs.getString("categoriaUsuario"));
            results.add(bean);
        }
        return results;
    }
    
    protected Object[] getResultsLog(ResultSet rs) throws SQLException {
        
        Object[] results = new Object[5];
        while (rs.next()) {
            
            results[0]=(rs.getString("CURP"));
            results[1]=(rs.getString("nombre"));
            results[2]=(rs.getString("paterno"));
            results[3]=(rs.getString("nombreUsuario"));
            results[4]=(rs.getString("categoriaUsuario"));
            
            
        }
        return results;
    }

    /**
     * Close JDBC Statement.
     * @param stmt  Statement to be closed.
     */
    protected void close(Statement stmt) {
        if (stmt != null) {
            try {
                stmt.close();
            }catch(SQLException e){}
        }
    }

    /**
     * Close JDBC ResultSet.
     * @param rs  ResultSet to be closed.
     */
    protected void close(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            }catch(SQLException e){}
        }
    }
}