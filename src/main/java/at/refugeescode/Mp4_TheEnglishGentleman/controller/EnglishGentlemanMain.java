package at.refugeescode.Mp4_TheEnglishGentleman.controller;

import at.refugeescode.Mp4_TheEnglishGentleman.EnglishGentleman;

public class EnglishGentlemanMain {
    public static void main(String[] args) {
        EnglishGentleman englishGentleman = new EnglishGentleman();
        if(englishGentleman.readNewspaper() || englishGentleman.smokeCigar()) {
            System.out.println("Iam happy.");
        }
    }
}
