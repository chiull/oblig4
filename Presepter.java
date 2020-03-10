public class Presepter extends Hvite{ //subclass av hvite resepter

    double avslag = 108; //deklarasjon av avslag
    public Presepter(Legemiddel mid, Lege lege, int pID){ //tar i mot verdier i konstruktooren
        super(mid, lege, pID, 3); //referere til objektene til superclass
    }

    public double prisAaBetale(){ //metode for aa finne ut hvor mye som maa betales
        if ((middel.hentPris() - avslag) > 0){ //hvis prisen er hooyere enn 0 saa returner det prisen minus avslag
            return (middel.hentPris() - avslag);
        }else{ // hvis den er mindre enn null saa returnerer det 0
            return 0;
        }
    }

    public String toString(){ //metode for å skrive ut infoene til class letere
        return ("ID: " + ID + ". Resept farge: " + farge() + ". Medisin: " + middel.hentNavn() + ". Lege: " + utskrivendeLege.hentNavn() + ". Pasient ID " + pasientID + ". Reit: " + reit + ". Pris: " + prisAaBetale());
    }
}