package exception;

public class EntierNaturel {
    int val;

    public EntierNaturel(int val) {
        try {
            if (val < 0 ) throw new NombreNegatifException("Nombre négatif", val);
            this.val = val;
        }catch (NombreNegatifException e) {
            System.out.println(e.getMessage());
        }
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) throws NombreNegatifException {
        if (val < 0 ) throw new NombreNegatifException("La valeur inserée est négative", val);
    }
}
