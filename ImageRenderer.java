// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a COMP102 assignment.
// You may not distribute it in any other way without permission.

/* Code for COMP102 Assignment 5
 * Name:
 * Usercode:
 * ID:
 */

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

    /** Core:
     * Renders a ppm image file.
     * Asks for the name of the file, then calls renderImageHelper.
     */
    public void renderImageCore(){
        /*# YOUR CODE HERE */

    }

    /** Core:
     * Renders a ppm image file.
     * Renders the image at position (left, top).
     * Each pixel of the image  is rendered by a square of size pixelSize
     * Assumes that
     * - the colour depth is 255,
     * - there is just one image in the file (not "animated"), and
     * - there are no comments in the file.
     * The first four tokens are "P3", number of columns, number of rows, 255
     * The remaining tokens are the pixel values (red, green, blue for each pixel)
     */
    public void renderImageHelper(Scanner sc){
        /*# YOUR CODE HERE */

    }

    /** Completion
     * Renders a ppm image file which may be animated (multiple images in the file)
     * Asks for the name of the file, then renders the image at position (left, top).
     * Each pixel of the image  is rendered by a square of size pixelSize
     * Renders each image in the file in turn with 200 mSec delay.
     * Repeats the sequence 3 times.
     */
    public void renderAnimatedImage(){
        /*# YOUR CODE HERE */

    }


    /** ---------- The code below is already written for you ---------- **/

    // Constructor
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
