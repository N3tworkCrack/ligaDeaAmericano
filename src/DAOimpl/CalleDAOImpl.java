/*
 * This java source file is generated by DAO4J v1.19
 * Generated on Sun Feb 25 05:11:22 CST 2018
 * For more information, please contact b-i-d@163.com
 * Please check http://sourceforge.net/projects/dao4j/ for the latest version.
 */

package DAOimpl;

import modelo.Calle;
import modelo.CalleKey;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.ArrayList;
import DAO.CalleDAO;

/**
 * This class provides methods to populate DB Table of Calle
 */
public class CalleDAOImpl implements CalleDAO {
    /* SQL to insert data */
    private static final String SQL_INSERT =
        "INSERT INTO Calle ("
        + "nombreColonia, nombreCalle"
        + ") VALUES (?, ?)";

    /* SQL to select data */
    private static final String SQL_SELECT =
        "SELECT "
        + "nombreColonia, nombreCalle "
        + "FROM Calle WHERE "
        + "nombreCalle = ?";

    /* SQL to update data */
    private static final String SQL_UPDATE =
        "UPDATE Calle SET "
        + "nombreColonia = ? "
        + "WHERE "
        + "nombreCalle = ?";

    /* SQL to delete data */
    private static final String SQL_DELETE =
        "DELETE FROM Calle WHERE "
        + "nombreCalle = ?";

    /**
     * Create a new record in Database.
     * @param bean   The Object to be inserted.
     * @param conn   JDBC Connection.
     * @exception    SQLException if something is wrong.
     */
    public void create(Calle bean, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_INSERT);
            ps.setString(1, bean.getNombrecolonia());
            ps.setString(2, bean.getNombrecalle());
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
    public Calle load(CalleKey key, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(SQL_SELECT);
            ps.setString(1, key.getNombrecalle());
            rs = ps.executeQuery();
            List results = getResults(rs);
            if (results.size() > 0)
                return (Calle) results.get(0);
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
    public void update(Calle bean, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_UPDATE);
            ps.setString(1, bean.getNombrecolonia());
            ps.setString(2, bean.getNombrecalle());
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
    public void delete(CalleKey key, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_DELETE);
            ps.setString(1, key.getNombrecalle());
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
    protected List<Calle> getResults(ResultSet rs) throws SQLException {
        List results = new ArrayList<Calle>();
        while (rs.next()) {
            Calle bean = new Calle();
            bean.setNombrecolonia(rs.getString("nombreColonia"));
            bean.setNombrecalle(rs.getString("nombreCalle"));
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