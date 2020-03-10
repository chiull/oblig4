public class Vanedannende extends Legemiddel{ //subclass av Legemiddel
    int styrke; //deklarerer styrke
    public Vanedannende(String n, double p, double v, int s){ //konstruktooren til Vannedannende
        super(n, p, v); //referer til objektene til superclass Legemiddel
        styrke = s; //styrke faar verdiene til s
    }

    public int hentVanedannende(){ //metode for aa hente styrken til vanedannende
        return styrke;
    }

    public String toString(){ //metode for aa lettere skrive ut infoene til class
        return ("ID: " + id + ". Medisin: " + navn + ". Pris: " + pris + ". Virkestoffer: " + virkestoff + ". Styrke: " +hentVanedannende());
    }
}