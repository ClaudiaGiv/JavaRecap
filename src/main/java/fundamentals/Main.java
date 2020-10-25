package fundamentals;

public class Main {
    public static void main(String[] args) {

        int v[] = {3,5,8,1,3,9};
        for(int i=0; i<v.length-1;i++){
            for(int j=i+1; j<v.length;j++){
                if(v[i]>v[j]){
                    int aux = v[i];
                    v[i]=v[j];
                    v[j] = aux;
                }
            }
        }
        for(int i=0; i<v.length;i++) {
            System.out.println(v[i]);
        }
    }
}
