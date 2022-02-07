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

    private String username;
    private String name;
    private String email;
    private String phone;
    private transient String picture = randomImage();

    public String randomImage() {
        int random = (int) (Math.random() * 100);
        if(random%2 == 0) 
            return "iVBORw0KGgoAAAANSUhEUgAAAIAAAACACAIAAABMXPacAAABqElEQVR4nOzTIUoeABiH8X3bl3aAhcWF3eDbwsqawSQfiEXxDt5BDyAIYjNYBYNdg1kQi+ghTILJI5henvL7HeD/hod3ef3j/Muko187o/t/jq9G9++eZ/e/jq7zKQFiAsQEiAkQEyAmQEyAmAAxAWICxASICRATICZATICYADEBYgLEBIgJEBMgJkBMgJgAMQFiAsQEiAkQEyAmQGy5sX06euDm5ffo/uPD1uj+7cXf0X0fEBMgJkBMgJgAMQFiAsQEiAkQEyAmQEyAmAAxAWICxASICRATICZATICYADEBYgLEBIgJEBMgJkBMgJgAMQFiAsSWh/vvowdWr99G93+eHIzub779H933ATEBYgLEBIgJEBMgJkBMgJgAMQFiAsQEiAkQEyAmQEyAmAAxAWICxASICRATICZATICYADEBYgLEBIgJEBMgJkBssX76PnrgbH0/ur+7txjd/3e5Gt33ATEBYgLEBIgJEBMgJkBMgJgAMQFiAsQEiAkQEyAmQEyAmAAxAWICxASICRATICZATICYADEBYgLEBIgJEBMgJkDsIwAA//9sVRhUug4wsAAAAABJRU5ErkJggg==";
        return "iVBORw0KGgoAAAANSUhEUgAAAIAAAACACAIAAABMXPacAAABqklEQVR4nOzTIUoeABiH8W18YRcYKxvsDEtbWZjgEcSiSbPewBN8WG2mD8EjaLSatItgsZhEFETwCKaXp/x+B/i/4eFdLFfrnya93m2N7r+8/Rnd3107Gt3/MrrOhwSICRATICZATICYADEBYgLEBIgJEBMgJkBMgJgAMQFiAsQEiAkQEyAmQEyAmAAxAWICxASICRATICZATICYALHF8+ly9MDZw//R/R+3h6P7O/fHo/s+ICZATICYADEBYgLEBIgJEBMgJkBMgJgAMQFiAsQEiAkQEyAmQEyAmAAxAWICxASICRATICZATICYADEBYgLEBIgt9r8+jR643DwY3b/+9Xd0//f299F9HxATICZATICYADEBYgLEBIgJEBMgJkBMgJgAMQFiAsQEiAkQEyAmQEyAmAAxAWICxASICRATICZATICYADEBYgLEPl+c/Bs9cL7aGN3f+3kzuv949W103wfEBIgJEBMgJkBMgJgAMQFiAsQEiAkQEyAmQEyAmAAxAWICxASICRATICZATICYADEBYgLEBIgJEBMgJkBMgJgAsfcAAAD//9zOGzjCIJaCAAAAAElFTkSuQmCC";
    }
}
