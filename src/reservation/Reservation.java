package reservation;

import java.util.Date;

public class Reservation {
    int numResa;
    Date dateResa;
    Date finResa;

    public Reservation(int numResa, Date dateResa, Date finResa) {
        this.numResa = numResa;
        this.dateResa = dateResa;
        this.finResa = finResa;
    }

    public int getNumResa() {
        return numResa;
    }

    public void setNumResa(int numResa) {
        this.numResa = numResa;
    }

    public Date getDateResa() {
        return dateResa;
    }

    public void setDateResa(Date dateResa) {
        this.dateResa = dateResa;
    }

    public Date getFinResa() {
        return finResa;
    }

    public void setFinResa(Date finResa) {
        this.finResa = finResa;
    }
}
