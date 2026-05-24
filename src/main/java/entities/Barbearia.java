package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Barbearia {
    static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private LocalDateTime date = LocalDateTime.now();
    private Client client;

   public Barbearia(LocalDateTime date, Client client){
        this.date = date;
        this.client = client;

    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "BARBEARIA: " +
                "DATE: " + dtf.format(date) +
                " CLIENT: " + client;
    }
}
