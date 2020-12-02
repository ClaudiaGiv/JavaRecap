package advanced.cloneable;

public class CloneableMain {

    public static void main(String[] args) throws CloneNotSupportedException {
        // without object clone
//        SimpleObject firstSimpleObject = new SimpleObject();
//        SimpleObject secondSimpleObject = firstSimpleObject;
//        secondSimpleObject.firstSimpleField=100;
//        System.out.println(firstSimpleObject.firstSimpleField);
//        System.out.println(secondSimpleObject.firstSimpleField);

        DependenciesObject dependenciesObject = new DependenciesObject();
        dependenciesObject.firstDependenciesField = 10;
        dependenciesObject.secondDependenciesField = 20;
        dependenciesObject.simpleObject.firstSimpleField = 30;
        dependenciesObject.simpleObject.secondSimpleField = 40;

        DependenciesObject secondDependenciesObject = dependenciesObject.clone();

        secondDependenciesObject.firstDependenciesField = 100;
        secondDependenciesObject.simpleObject.firstSimpleField = 300;


        System.out.println(dependenciesObject.firstDependenciesField);
        System.out.println(dependenciesObject.secondDependenciesField);
        System.out.println(dependenciesObject.simpleObject.firstSimpleField);
        System.out.println(dependenciesObject.simpleObject.secondSimpleField);
        System.out.println(secondDependenciesObject.firstDependenciesField);
        System.out.println(secondDependenciesObject.secondDependenciesField);
        System.out.println(secondDependenciesObject.simpleObject.firstSimpleField);
        System.out.println(secondDependenciesObject.simpleObject.secondSimpleField);
    }
}
