public abstract class Resepter{
    //deklarerer varablene jeg trenger
    Legemiddel middel;
    Lege utskrivendeLege;
    int pasientID;
    int reit;
    int ID;
    public static int teller = 0;

    public Resepter(Legemiddel mid, Lege lege, int pID, int r){ //verdiene den tar i mot i konstruktooren
        middel = mid; //middel faar verdien til mid
        utskrivendeLege = lege; //utskrivendeLege faar verdien til lege
        pasientID = pID; //pasientID faar verdien til pID
        reit = r; //reit faar verdien til r
        ID = teller; //ID faar verdien til teller
        teller++; //teller ooker med en
    }

    public String toString(){//metide faar aa skrive ut infoene til class lettere
        return ("ID: " + ID + ". Medisin: " + middel.hentNavn() + ". Lege: " + utskrivendeLege.hentNavn() + ". Pasient ID " + pasientID + ". Reit: " + reit);
    }

    public int hentId(){ //metode for aa hente ID
        return ID;
    }

    public String hentLegemiddel(){ //metode for aa hente navnet til legemiddel
        String medisin = middel.hentNavn(); //medisin faar navnet til middel som verdi
        return medisin;
    }

    public String hentLege(){ //metode for aa hente navnet til legen
        String lNavn = utskrivendeLege.hentNavn(); //lNavn faar navnet til legen som verdi
        return lNavn;
    }

    public int hentPasientId(){ //metode for aa hente pasient ID
        return pasientID;
    }

    public int  hentReit(){ //metode for aa hente Reit
        return reit;
    }

    public boolean oppbrukt(){ //metode for aa se om en resept er oppbrutk
        if (reit>0){ //dersom reit er mer enn 0 saa kjoorer denne
            reit -= 1; //reit blir en mindre
            return true;//returnere true
        }else{ //hvis den er 0 så kjoorer den
            return false; //returner false
        }
    }

    abstract public String farge();

    abstract public double prisAaBetale();
}