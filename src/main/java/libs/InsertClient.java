package libs;

import entities.Barbearia;
import entities.Client;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertClient {



    public InsertClient(ConexaoJ conn, Client client, Barbearia barbearia) throws SQLException {
        String sql = "INSERT INTO client (telephone, nome, scheduling_date) VALUES (?, ?, ?)";

        PreparedStatement ps = conn.getConn().prepareStatement(sql);



        ps.setString(1,client.getName());
        ps.setString(2, client.getNumber());
        ps.setTimestamp(3, java.sql.Timestamp.valueOf(barbearia.getDate()));
        ps.executeUpdate();
        System.out.println("Cadaster client success!");
    }

    public InsertClient() throws SQLException {

    }
}
