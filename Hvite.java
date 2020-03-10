public class Hvite extends Resepter{ //class Hvite er en subclass av Resepter
    
    public Hvite(Legemiddel mid, Lege lege, int pID, int r){ //tar i mot verdiene
        super(mid, lege, pID, r); //referer til objektene i superclassen resepeter
    }

    @Override //Override farge() i Resepter class
    public String farge() {
        return "Hvit resept"; //returnerer hvit resepter
    }

    @Override //Override prisAaBetale i Resepter class
    public double prisAaBetale() {
        return 0; //returner 0
    }

    public String toString(){ //metode for skrive ut infoene lettere
        return ("ID: " + ID + ". Resept farge: " + farge() + ". Medisin: " + middel.hentNavn() + ". Lege: " + utskrivendeLege.hentNavn() + ". Pasient ID " + pasientID + ". Reit: " + reit + ". Pris: " + prisAaBetale());
    }
} 