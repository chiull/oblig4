public class Legemiddel{ //class Legemiddel
    //deklarasjon av ting som trengs
    String navn; 
    int id;
    double pris;
    double virkestoff;
    public static int teller = 0;

    public Legemiddel(String n, double p, double v){ //verdiene som Legemiddel tar i mot i konstruktooren
        navn = n; //navn faar n verdi
        pris = p; //pris faar p verdi
        virkestoff = v; //virkestoff faar v verdi
        id = teller; //id faar telleren sin verdi 
        teller++; //teller ooker med en
    }

    public String toString(){ //metode for aa lettere skrive ut
        return ("ID: " + id + ". Medisin: " + navn + ". Pris: " + pris + ". Virkestoffer: " + virkestoff);
    }

    public int hentID(){ //metode for aa hente id
        return id;
    }

    public String hentNavn(){ //metode for aa hente navn pa legemiddelet
        return navn;
    }

    public double hentPris(){ //metode for aa hente pris
        return pris;
    }

    public double hentVirkestoffer(){ //metode for aa hente virkestoffer
        return virkestoff;
    }

    public void settNyPris(double ny){ //metode for aa sette ny pris paa legemiddelet
        pris = ny; //pris faar verdien til ny
    }
}