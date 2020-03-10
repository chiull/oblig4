public class Narkotisk extends Legemiddel{ //subclass av Legemiddel
    int styrke; // deklarerer styrke
    public Narkotisk(String n, double p, double v, int s){ //tar i mot verdierer i konstruktooren
        super(n, p, v); //referer til objektene til superclassen legemiddel
        styrke = s; //stryke faar verdien til s
    }

    public int hentNarkotiskStyrke(){ //metode for aa finne styrken til narkotiske stoffer
        return styrke;
    }

    public String toString(){ //metode for aa lettere aa skrive ut
        return ("ID: " + id + ". Medisin: " + navn + ". Pris: " + pris + ". Virkestoffer: " + virkestoff + ". Styrke: " + hentNarkotiskStyrke());
    }
}