package exception;

public class Application {
    public static void main(String[] args) {
        EntierNaturel entierNaturel = new EntierNaturel(5);
        System.out.println(entierNaturel.getVal());
        try {
            entierNaturel.setVal(-8);
        }catch (NombreNegatifException e){
            e.getMessage();
            System.out.println("La valeur erronée est " + e.getVal());
        }
        System.out.println(entierNaturel.getVal());
    }
}
