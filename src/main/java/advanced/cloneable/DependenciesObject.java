package advanced.cloneable;

public class DependenciesObject implements Cloneable{

    int firstDependenciesField;
    int secondDependenciesField;
    SimpleObject simpleObject = new SimpleObject();

    public DependenciesObject clone() throws
            CloneNotSupportedException
    {
        DependenciesObject dependenciesObject = (DependenciesObject) super.clone();
        dependenciesObject.simpleObject=this.simpleObject.clone();
        return dependenciesObject;
    }

}
