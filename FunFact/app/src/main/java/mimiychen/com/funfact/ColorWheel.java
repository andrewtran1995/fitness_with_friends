package mimiychen.com.funfact;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by mimichen on 7/6/16.
 */
public class ColorWheel {

    // Fields (Member variables) - properties about the object; either set public or private
    private String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };
    // Methods - actions that the object can take
    public int getColor(){
        String color;
        //The button was clicked, so update the fact TextView with new fact
        //Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColors.length);
        color = mColors[randomNumber]; // string representation of a number

        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }
}
