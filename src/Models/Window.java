package Models;

/**
 * Created by Руслан on 14.01.2017.
 */
public class Window
{
    private String title;

    private String height;

    private String width;

    private String name;

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getHeight ()
    {
        return height;
    }

    public void setHeight (String height)
    {
        this.height = height;
    }

    public String getWidth ()
    {
        return width;
    }

    public void setWidth (String width)
    {
        this.width = width;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [title = "+title+", height = "+height+", width = "+width+", name = "+name+"]";
    }
}