package exception;

public class NombreNegatifException extends Exception{
    int val;
    NombreNegatifException(String message, int val){
        super(message);
        this.val = val;
    }

    public int getVal() {
        return val;
    }
}
