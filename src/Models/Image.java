package Models;

/**
 * Created by Руслан on 14.01.2017.
 */
public class Image
{
    private String alignment;

    private String hOffset;

    private String name;

    private String src;

    private String vOffset;

    public String getAlignment ()
    {
        return alignment;
    }

    public void setAlignment (String alignment)
    {
        this.alignment = alignment;
    }

    public String getHOffset ()
    {
        return hOffset;
    }

    public void setHOffset (String hOffset)
    {
        this.hOffset = hOffset;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getSrc ()
    {
        return src;
    }

    public void setSrc (String src)
    {
        this.src = src;
    }

    public String getVOffset ()
    {
        return vOffset;
    }

    public void setVOffset (String vOffset)
    {
        this.vOffset = vOffset;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [alignment = "+alignment+", hOffset = "+hOffset+", name = "+name+", src = "+src+", vOffset = "+vOffset+"]";
    }
}
