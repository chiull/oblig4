public class Lege{ //lege class
    String navn; //deklarerer String navn

    public Lege(String n){ //tar i mot en string verdi
        navn = n; //navn faar n verdi
    }

    public String hentNavn(){ //metode for å hente fram navnet til legen
        return navn; //returnerer navn
    }

    public String toString(){ //metode for lettere skrive ut infoene
        return ("Lege: " + hentNavn());
    }
}