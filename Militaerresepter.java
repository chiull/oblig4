public class Militaerresepter extends Hvite{ //Militaerresepter er subclass av Hvite resepter

    public Militaerresepter(Legemiddel mid, Lege lege, int pID, int r){ //verdiene den tar i mot i konstruktooren
        super(mid, lege, pID, r); //referer til superclassen hvite sine objekter
    }

    public double prisAabetale(){ //metode for prisen til legemiddelet i med denne resepteret
        return 0;
    }

    public String toString(){ //metode for aa skrive ut infoene lettere
        return ("ID: " + ID + ". Resept farge: " + farge() + ". Medisin: " + middel.hentNavn() + ". Lege: " + utskrivendeLege.hentNavn() + ". Pasient ID " + pasientID + ". Reit: " + reit + ". Pris: " + prisAaBetale());
    }
}