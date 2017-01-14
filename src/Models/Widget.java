package Models;

/**
 * Created by Руслан on 14.01.2017.
 */
public class Widget
{
    private Text text;

    private Window window;

    private Image image;

    private String debug;

    public Text getText ()
    {
        return text;
    }

    public void setText (Text text)
    {
        this.text = text;
    }

    public Window getWindow ()
    {
        return window;
    }

    public void setWindow (Window window)
    {
        this.window = window;
    }

    public Image getImage ()
    {
        return image;
    }

    public void setImage (Image image)
    {
        this.image = image;
    }

    public String getDebug ()
    {
        return debug;
    }

    public void setDebug (String debug)
    {
        this.debug = debug;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [text = "+text+", window = "+window+", image = "+image+", debug = "+debug+"]";
    }
}