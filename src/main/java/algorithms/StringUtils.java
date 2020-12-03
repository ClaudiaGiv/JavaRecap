package algorithms;

public class StringUtils {

    //Scrieti un program care determina daca un string e permutarea circulara a celui de-al doilea string dat ca parametru fara a folosi vector de frecventa.
    //Ex: mare => permutare circulara la dreapta: 1 caracter=> arem => 2 caractere=> rema ….etc
    public static boolean areCircularPermuted(String s1, String s2){
        //mare
        //rema
        if(s1.length() != s2.length())
            return false;
        s1+=s1; // maremare
        return s1.contains(s2);
    }
}
