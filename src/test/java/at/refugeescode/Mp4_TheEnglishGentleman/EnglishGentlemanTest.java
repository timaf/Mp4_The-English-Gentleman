package at.refugeescode.Mp4_TheEnglishGentleman;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(SpringExtension.class)
@SpringBootTest
class EnglishGentlemanTest {
    @Autowired
    private EnglishGentleman englishGentleman;

    @Test
    void tesThadAgoodDay() {
    assertEquals(englishGentleman.hadAgoodDay(),false);
    }
}