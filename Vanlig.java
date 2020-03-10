public class Vanlig extends Legemiddel{ //subclass av Legemiddel
    public Vanlig(String n, double p, double v){ //konstruktorren
        super(n, p, v); //referer til objektene til superclass legemiddel
    }

    public String toString(){ //metode for å lettere skrive ut infoene til class 
        return ("ID: " + id + ". Medisin: " + navn + ". Pris: " + pris + ". Virkestoffer: " + virkestoff);
    }
}