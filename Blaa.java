public class Blaa extends Resepter{ //class Blaa arver fra class Resepter
    double avslag = 0.25; //Blaa resept gir en 75% rabatt saa, man har 0.25 for å finne prisen som man maa betale
    public Blaa(Legemiddel mid, Lege lege, int pID, int r){ //tar i mot verdiene
        super(mid, lege, pID, r); //referer til objektene i superclassen
    }

    @Override //Override farge() i Resepter class
    public String farge() {
        return "Blaa resept"; //returner Blaa resepter
    }

    @Override //Override prisAaBetale i Resepter class
    public double prisAaBetale() {
        return (middel.hentPris() * avslag); //returner prisen man må betale
    }

    public String toString(){ //Metode for å lettere å skrive ut infoene.
        return ("ID: " + ID + ". Resept farge: " + farge() + ". Medisin: " + middel.hentNavn() + ". Lege: " + utskrivendeLege.hentNavn() + ". Pasient ID " + pasientID + ". Reit: " + reit + ". Pris: " + prisAaBetale());
    }
}