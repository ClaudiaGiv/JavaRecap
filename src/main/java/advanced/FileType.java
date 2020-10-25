package advanced;

public enum FileType {
    XML("xml",1), JSON("json",2), HTML("html",3);

    FileType(String value, int n) {
        this.value = value;
        this.n = n;
    }
    String value;
    int n;
}
