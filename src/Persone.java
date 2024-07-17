import java.util.*;

public class Persone {

   private List<Persone> listaPersone;

   private static Persone persone;
   public static Persone getInstance(){
       if(persone == null){
           persone = new Persone();
       } return persone;
   }
}
