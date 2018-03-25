package at.refugeescode.Mp4_TheEnglishGentleman;

import at.refugeescode.Mp4_TheEnglishGentleman.model.Cigar;

import java.util.EmptyStackException;

public class Lighter {
    private Cigar cigar = new Cigar();

    public boolean lightCigar (){
        if (cigar.getCigar() == "Marlboro"){
            return true;
        }else{
            throw new EmptyStackException();
        }


    }

}
