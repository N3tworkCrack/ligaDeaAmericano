/*
 * This java source file is generated by DAO4J v1.19
 * Generated on Sun Feb 25 05:11:22 CST 2018
 * For more information, please contact b-i-d@163.com
 * Please check http://sourceforge.net/projects/dao4j/ for the latest version.
 */

package DAOimpl;

import modelo.Articulo;
import modelo.ArticuloKey;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.ArrayList;
import DAO.ArticuloDAO;

/**
 * This class provides methods to populate DB Table of Articulo
 */
public class ArticuloDAOImpl implements ArticuloDAO {
    /* SQL to insert data */
    private static final String SQL_INSERT =
        "INSERT INTO Articulo ("
        + "categoria, proveedor, nombre, precio"
        + ") VALUES (?, ?, ?, ?)";

    /* SQL to select data */
    private static final String SQL_SELECT =
        "SELECT "
        + "categoria, proveedor, nombre, precio "
        + "FROM Articulo WHERE "
        + "proveedor = ? AND nombre = ?";

    /* SQL to update data */
    private static final String SQL_UPDATE =
        "UPDATE Articulo SET "
        + "categoria = ?, precio = ? "
        + "WHERE "
        + "proveedor = ? AND nombre = ?";

    /* SQL to delete data */
    private static final String SQL_DELETE =
        "DELETE FROM Articulo WHERE "
        + "proveedor = ? AND nombre = ?";

    /**
     * Create a new record in Database.
     * @param bean   The Object to be inserted.
     * @param conn   JDBC Connection.
     * @exception    SQLException if something is wrong.
     */
    public void create(Articulo bean, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_INSERT);
            ps.setString(1, bean.getCategoria());
            ps.setString(2, bean.getProveedor());
            ps.setString(3, bean.getNombre());
            ps.setDouble(4, bean.getPrecio());
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
    public Articulo load(ArticuloKey key, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(SQL_SELECT);
            ps.setString(1, key.getProveedor());
            ps.setString(2, key.getNombre());
            rs = ps.executeQuery();
            List results = getResults(rs);
            if (results.size() > 0)
                return (Articulo) results.get(0);
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
    public void update(Articulo bean, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_UPDATE);
            ps.setString(1, bean.getCategoria());
            ps.setDouble(2, bean.getPrecio());
            ps.setString(3, bean.getProveedor());
            ps.setString(4, bean.getNombre());
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
    public void delete(ArticuloKey key, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_DELETE);
            ps.setString(1, key.getProveedor());
            ps.setString(2, key.getNombre());
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
    protected List<Articulo> getResults(ResultSet rs) throws SQLException {
        List results = new ArrayList<Articulo>();
        while (rs.next()) {
            Articulo bean = new Articulo();
            bean.setCategoria(rs.getString("categoria"));
            bean.setProveedor(rs.getString("proveedor"));
            bean.setNombre(rs.getString("nombre"));
            bean.setPrecio(rs.getDouble("precio"));
            results.add(bean);
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