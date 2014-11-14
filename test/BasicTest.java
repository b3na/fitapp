import org.junit.*;
import java.util.*;
import play.test.*;
import models.*;

public class BasicTest extends UnitTest {

    @Test
    public void asignarDieta() {
        
        Usuario pedro = new Usuario("pedro","a271595@uach.mx","123123");
        pedro.save();
        
       // Alimento pollo = new Alimento("Pollo",400).save();
        Alimento manzana = new Alimento("manzana",200).save();
        Alimento pastel = new Alimento("pastel",800).save();
        
        Dieta dieta = new Dieta();
        dieta.save();
        
        dieta.addAlimento(pastel);
        //dieta.addAlimento(pollo);
        dieta.addAlimento(manzana);
        
        pedro.dieta = dieta;
        
        Usuario pedrito = Usuario.find("byMail", "a271595@uach.mx").first();
        assertNotNull(pedro);
        assertEquals("pedro", pedrito.nombre);
       
        
        
    }

}
