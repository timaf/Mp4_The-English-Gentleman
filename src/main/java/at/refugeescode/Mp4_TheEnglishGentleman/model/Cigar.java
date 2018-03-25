package at.refugeescode.Mp4_TheEnglishGentleman.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cigar {
    private Random random = new Random();
    private static List<String> names = Stream.of(
            "Marlboro",
            "Camel",
            "winston"
    ).collect(Collectors.toList());

    public static List<String> asList(){
        return new ArrayList<>(names);
    }

    public String getCigar(){
        List<String> cigarTypes = Cigar.asList();
        int randomIndex = random.nextInt(cigarTypes.size());
        return  cigarTypes.get(randomIndex);

    }

}

