public class Spesialister extends Lege implements Godkjenningsfritak{ //Subclass av Lege og bruker interface Godkjenningsfritak
    int kontrollID; //deklarerer kontrollID
    
    public Spesialister(String n, int i){ //tar i mot verdier i konstruktooren
        super(n); //referere til objektet i superclass Lege
        kontrollID = i; //kontrollID faar verdiene til i
    }

    public int hentKontrollID(){ //metode for aa hente kontrollID
        return kontrollID;
    }

    public String toString(){ //metode for aa lettere aa skrive ut infoene til class
        return ("Spesialist: " + navn + ". Kontroll ID: " + hentKontrollID());
    }
}