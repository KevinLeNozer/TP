package appartement;

public class Appartement {
    String adresse;
    Double prixLocNuit;
    int nbrMaxClient;
    int etageApp;

    public Appartement(String adresse, Double prixLocNuit, int nbrMaxClient, int etageApp) {
        this.adresse = adresse;
        this.prixLocNuit = prixLocNuit;
        this.nbrMaxClient = nbrMaxClient;
        this.etageApp = etageApp;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Double getPrixLocNuit() {
        return prixLocNuit;
    }

    public void setPrixLocNuit(Double prixLocNuit) {
        this.prixLocNuit = prixLocNuit;
    }

    public int getNbrMaxClient() {
        return nbrMaxClient;
    }

    public void setNbrMaxClient(int nbrMaxClient) {
        this.nbrMaxClient = nbrMaxClient;
    }

    public int getEtageApp() {
        return etageApp;
    }

    public void setEtageApp(int etageApp) {
        this.etageApp = etageApp;
    }
}
