package Models;

/**
 * Created by Руслан on 14.01.2017.
 */
public class Text
{
    private String alignment;

    private String onMouseUp;

    private String hOffset;

    private String style;

    private String name;

    private String data;

    private String vOffset;

    private String size;

    public String getAlignment ()
    {
        return alignment;
    }

    public void setAlignment (String alignment)
    {
        this.alignment = alignment;
    }

    public String getOnMouseUp ()
    {
        return onMouseUp;
    }

    public void setOnMouseUp (String onMouseUp)
    {
        this.onMouseUp = onMouseUp;
    }

    public String getHOffset ()
    {
        return hOffset;
    }

    public void setHOffset (String hOffset)
    {
        this.hOffset = hOffset;
    }

    public String getStyle ()
    {
        return style;
    }

    public void setStyle (String style)
    {
        this.style = style;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getData ()
    {
        return data;
    }

    public void setData (String data)
    {
        this.data = data;
    }

    public String getVOffset ()
    {
        return vOffset;
    }

    public void setVOffset (String vOffset)
    {
        this.vOffset = vOffset;
    }

    public String getSize ()
    {
        return size;
    }

    public void setSize (String size)
    {
        this.size = size;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [alignment = "+alignment+", onMouseUp = "+onMouseUp+", hOffset = "+hOffset+", style = "+style+", name = "+name+", data = "+data+", vOffset = "+vOffset+", size = "+size+"]";
    }
}
