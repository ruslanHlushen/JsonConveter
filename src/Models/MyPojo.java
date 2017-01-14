package Models;

/**
 * Created by Руслан on 14.01.2017.
 */
public class MyPojo
{
    private Widget widget;

    public Widget getWidget ()
    {
        return widget;
    }

    public void setWidget (Widget widget)
    {
        this.widget = widget;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [widget = "+widget+"]";
    }
}