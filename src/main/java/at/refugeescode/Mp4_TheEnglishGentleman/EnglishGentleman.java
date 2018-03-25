package at.refugeescode.Mp4_TheEnglishGentleman;

public class EnglishGentleman {

    private Lighter lighter = new Lighter();
    private Monocle monocle = new Monocle();

    public boolean readNewspaper(){
     return (monocle.getNewspaper());
    }

    public boolean smokeCigar() {
     return (lighter.lightCigar());

    }
}
