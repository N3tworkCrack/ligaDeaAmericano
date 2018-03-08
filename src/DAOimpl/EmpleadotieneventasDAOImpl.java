/*
 * This java source file is generated by DAO4J v1.19
 * Generated on Tue Mar 06 22:47:33 CST 2018
 * For more information, please contact b-i-d@163.com
 * Please check http://sourceforge.net/projects/dao4j/ for the latest version.
 */

package DAOimpl;

import modelo.EmpleadotieneventasKey;
import modelo.Empleadotieneventas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.ArrayList;
import DAO.EmpleadotieneventasDAO;

/**
 * This class provides methods to populate DB Table of EmpleadoTieneVentas
 */
public class EmpleadotieneventasDAOImpl implements EmpleadotieneventasDAO {
    /* SQL to insert data */
    private static final String SQL_INSERT =
        "INSERT INTO EmpleadoTieneVentas ("
        + "vendedorCURP, idVenta, anio, trimestre"
        + ") VALUES (?, ?, ?, ?)";

    /* SQL to select data */
    private static final String SQL_SELECT =
        "SELECT "
        + "vendedorCURP, idVenta, anio, trimestre "
        + "FROM EmpleadoTieneVentas WHERE "
        + "vendedorCURP = ? AND idVenta = ? AND anio = ? AND trimestre = ?";

    /* SQL to update data */
    private static final String SQL_UPDATE =
        "UPDATE EmpleadoTieneVentas SET "
        + "WHERE "
        + "vendedorCURP = ? AND idVenta = ? AND anio = ? AND trimestre = ?";

    /* SQL to delete data */
    private static final String SQL_DELETE =
        "DELETE FROM EmpleadoTieneVentas WHERE "
        + "vendedorCURP = ? AND idVenta = ? AND anio = ? AND trimestre = ?";

    /**
     * Create a new record in Database.
     * @param bean   The Object to be inserted.
     * @param conn   JDBC Connection.
     * @exception    SQLException if something is wrong.
     */
    public void create(Empleadotieneventas bean, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_INSERT);
            ps.setString(1, bean.getVendedorcurp());
            ps.setInt(2, bean.getIdventa());
            ps.setInt(3, bean.getAnio());
            ps.setInt(4, bean.getTrimestre());
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
    public Empleadotieneventas load(EmpleadotieneventasKey key, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(SQL_SELECT);
            ps.setString(1, key.getVendedorcurp());
            ps.setInt(2, key.getIdventa());
            ps.setInt(3, key.getAnio());
            ps.setInt(4, key.getTrimestre());
            rs = ps.executeQuery();
            List results = getResults(rs);
            if (results.size() > 0)
                return (Empleadotieneventas) results.get(0);
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
    public void update(Empleadotieneventas bean, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_UPDATE);
            ps.setString(1, bean.getVendedorcurp());
            ps.setInt(2, bean.getIdventa());
            ps.setInt(3, bean.getAnio());
            ps.setInt(4, bean.getTrimestre());
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
    public void delete(EmpleadotieneventasKey key, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_DELETE);
            ps.setString(1, key.getVendedorcurp());
            ps.setInt(2, key.getIdventa());
            ps.setInt(3, key.getAnio());
            ps.setInt(4, key.getTrimestre());
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
    protected List<Empleadotieneventas> getResults(ResultSet rs) throws SQLException {
        List results = new ArrayList<Empleadotieneventas>();
        while (rs.next()) {
            Empleadotieneventas bean = new Empleadotieneventas();
            bean.setVendedorcurp(rs.getString("vendedorCURP"));
            bean.setIdventa(rs.getInt("idVenta"));
            bean.setAnio(rs.getInt("anio"));
            bean.setTrimestre(rs.getInt("trimestre"));
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