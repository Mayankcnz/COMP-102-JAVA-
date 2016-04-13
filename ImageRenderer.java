

import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;

/** Renders plain ppm images onto the graphics panel
 *  ppm images are the simplest possible colour image format.
 */

public class ImageRenderer{
    public static final int top = 20;   // top edge of the image
    public static final int left = 20;  // left edge of the image
    public static final int pixelSize = 2;  

    public void renderImageCore(){
    String filename = UIFileChooser.open("Choose a file");
        UI.println("Printing contents of"+filename);

        try {

            Scanner scan = new Scanner(new File(filename));

            String p3 = scan.next();
            int cols = scan.nextInt();
            int rows = scan.nextInt();
            int max = scan.nextInt();

            int row = 0;
            while(row<rows) {
                int col = 0;
                while(col<cols) {
                    int x = left+ pixelSize*col;
                    int y = top+pixelSize*row;
                    int red = scan.nextInt();
                    int green = scan.nextInt();
                    int blue = scan.nextInt();
                    UI.setColor(new Color(red,green,blue));

                    UI.fillRect(x, y, pixelSize, pixelSize);
                    col++;
                }
                row++;

            }
        }
        catch(IOException e){UI.println("File reading failed");}

    }
}


    // Constructer
    public ImageRenderer() {
        UI.initialise();
        UI.addButton("Clear", UI::clearGraphics );
        UI.addButton("Render (core)", this::renderImageCore );
        UI.addButton("Render (compl)", this::renderAnimatedImage );
        UI.addButton("Quit", UI::quit );
        UI.setWindowSize(850, 700);
        UI.setDivider(0.0);
    }


}
