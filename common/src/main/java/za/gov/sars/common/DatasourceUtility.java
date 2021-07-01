/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.gov.sars.common;

import com.zaxxer.hikari.HikariDataSource;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
//import sun.util.logging.PlatformLogger;

/**
 *
 * @author S2028398
 */
public class DatasourceUtility {

    public static DataSource getDataSource() {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setInitializationFailTimeout(0);
        dataSource.setMaximumPoolSize(5);

        dataSource.setDataSourceClassName("com.microsoft.sqlserver.jdbc.SQLServerDataSource");
//        dataSource.addDataSourceProperty("url", "jdbc:sqlserver;//LPT823DI\\SQLEXPRESS;user=sa;passwords=Passwords.;databaseName=school_DB_TR");
        dataSource.addDataSourceProperty("url", "jdbc:sqlserver://ptadvsql18;databaseName=school_DB_TR");
        dataSource.addDataSourceProperty("user", "sa");
        dataSource.addDataSourceProperty("password", "P@ssw0rd");

////        dataSource.addDataSourceProperty("url", "jdbc:sqlserver;//LPT823DI\\SQLEXPRESS;user=sa;passwords=Passwords.;databaseName=school_DB");
//        dataSource.addDataSourceProperty("url", "jdbc:sqlserver//LPT823DI\\SQLEXPRESS;databaseName=school_DB");
//        dataSource.addDataSourceProperty("user", "sa");
//        dataSource.addDataSourceProperty("password", "Passwords.");
        return dataSource;
    }

    public static DataSource getDataSourceLookup() {
        try {
            InitialContext initialContext = new InitialContext();
//        DataSource dataSource =(DataSource) initialContext.lookup("jdbc/schoolDS2");
            DataSource dataSource = (DataSource) initialContext.lookup("java:/schoolDS");
            return dataSource;

        } catch (NamingException ex) {
            Logger.getLogger(DatasourceUtility.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
