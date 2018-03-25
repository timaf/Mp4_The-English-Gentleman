package at.refugeescode.Mp4_TheEnglishGentleman;

import at.refugeescode.Mp4_TheEnglishGentleman.model.Cigar;
import at.refugeescode.Mp4_TheEnglishGentleman.model.Newspaper;
import org.springframework.stereotype.Component;

@Component
public class EnglishGentleman {

    private Lighter lighter;
    private Monocle monocle;

    private boolean read;
    private boolean smoked;

    public EnglishGentleman(Lighter lighter, Monocle monocle) {
        this.lighter = lighter;
        this.monocle = monocle;
    }

    public void read(Newspaper newspaper) {
        monocle.read(newspaper);
        read = true;
    }


    public void smoke(Cigar cigar) {
        lighter.light(cigar);
        cigar.smoke();
        smoked = true;
    }

    public boolean hadAgoodDay() {
        return read && smoked;
    }
}
