package at.refugeescode.Mp4_TheEnglishGentleman;

import at.refugeescode.Mp4_TheEnglishGentleman.model.Newspaper;

public class Monocle {
    private Newspaper newspaper = new Newspaper();
    public boolean getNewspaper() {
        return( newspaper.getName() == "Derspiegl");
    }
}
