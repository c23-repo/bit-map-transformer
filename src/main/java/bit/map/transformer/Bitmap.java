package bit.map.transformer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Bitmap {

    // data about the image
    private String inputName;
    private String outputName;
    private BufferedImage image;


    // constructor
    public Bitmap(String inputName, String outputName) {
        this.inputName = inputName;
        this.outputName = outputName;

        this.createImage(inputName);
    }

    // method to create object
    private void createImage(String inputName) {
        try {
            File bmpFile = new File("src/main/resources/" + inputName);
            this.image = ImageIO.read(bmpFile);

        } catch(IOException e) {
            System.out.println(e);
        }
    }

    // method to write changes to a new file

    // four transform methods
        // flipHorizontally
}
