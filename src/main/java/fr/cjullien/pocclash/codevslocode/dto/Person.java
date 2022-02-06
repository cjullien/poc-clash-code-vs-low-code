package fr.cjullien.pocclash.codevslocode.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.charset.StandardCharsets;
import javax.imageio.ImageIO;

import lombok.Data;

@Entity
@Data
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firstname;
    private String name;
    private String email;
    //private transient String image = randomImage();

    public String randomImage() {
        String image;
        int width = 1000;
        int height = 1000;
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int a = (int) (Math.random() * 256); //alpha
                int r = (int) (Math.random() * 256); //red
                int g = (int) (Math.random() * 256); //green
                int b = (int) (Math.random() * 256); //blue

                int p = (a << 24) | (r << 16) | (g << 8) | b; //pixel

                img.setRGB(x, y, p);
            }
        }
        try {
            var baos = new ByteArrayOutputStream();
            ImageIO.write(img, "png", baos);
            image = new String(baos.toByteArray(), StandardCharsets.UTF_8);
            return image;
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
