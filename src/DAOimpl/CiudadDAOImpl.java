/*
 * This java source file is generated by DAO4J v1.19
 * Generated on Sun Feb 25 05:11:22 CST 2018
 * For more information, please contact b-i-d@163.com
 * Please check http://sourceforge.net/projects/dao4j/ for the latest version.
 */

package DAOimpl;

import modelo.CiudadKey;
import modelo.Ciudad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.ArrayList;
import DAO.CiudadDAO;

/**
 * This class provides methods to populate DB Table of Ciudad
 */
public class CiudadDAOImpl implements CiudadDAO {
    /* SQL to insert data */
    private static final String SQL_INSERT =
        "INSERT INTO Ciudad ("
        + "nombreCiudad"
        + ") VALUES (?)";

    /* SQL to select data */
    private static final String SQL_SELECT =
        "SELECT "
        + "nombreCiudad "
        + "FROM Ciudad WHERE "
        + "nombreCiudad = ?";

    /* SQL to update data */
    private static final String SQL_UPDATE =
        "UPDATE Ciudad SET "
        + "WHERE "
        + "nombreCiudad = ?";

    /* SQL to delete data */
    private static final String SQL_DELETE =
        "DELETE FROM Ciudad WHERE "
        + "nombreCiudad = ?";

    /**
     * Create a new record in Database.
     * @param bean   The Object to be inserted.
     * @param conn   JDBC Connection.
     * @exception    SQLException if something is wrong.
     */
    public void create(Ciudad bean, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_INSERT);
            ps.setString(1, bean.getNombreciudad());
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
    public Ciudad load(CiudadKey key, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(SQL_SELECT);
            ps.setString(1, key.getNombreciudad());
            rs = ps.executeQuery();
            List results = getResults(rs);
            if (results.size() > 0)
                return (Ciudad) results.get(0);
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
    public void update(Ciudad bean, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_UPDATE);
            ps.setString(1, bean.getNombreciudad());
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
    public void delete(CiudadKey key, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_DELETE);
            ps.setString(1, key.getNombreciudad());
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
    protected List<Ciudad> getResults(ResultSet rs) throws SQLException {
        List results = new ArrayList<Ciudad>();
        while (rs.next()) {
            Ciudad bean = new Ciudad();
            bean.setNombreciudad(rs.getString("nombreCiudad"));
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