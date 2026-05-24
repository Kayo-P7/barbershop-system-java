package libs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoJ {

    final String url = "jdbc:mysql://localhost:3306/BARBEARIA";
    final String user = "root";
    final String password = "";

    private Connection conn;

    public Connection getConn() {
        return conn;
    }

    public ConexaoJ() throws SQLException {

        try {
            conn = DriverManager.getConnection(url, user, password);

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
