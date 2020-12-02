package advanced.cloneable;

public class SimpleObject implements Cloneable{
    int firstSimpleField;
    int secondSimpleField;

    SimpleObject(){
        firstSimpleField = 10;
        secondSimpleField = 20;
    }

    public SimpleObject clone() throws
            CloneNotSupportedException
    {
        SimpleObject simpleObject = (SimpleObject) super.clone();
        return simpleObject;
    }
}
