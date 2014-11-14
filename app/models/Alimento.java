/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import play.db.jpa.Model;

@Entity
public class Alimento extends Model {
    
    
    public String desc;
    public double proteina;
    public double calorias;
    public double grasas;
    public double carbs;
    
    
    @ManyToMany(mappedBy = "alimentos")
    private List<Dieta> dieta;

    public Alimento(String desc, int calorias) {
        this.desc = desc;
        this.calorias = calorias;
    }
    
    
    
    
}
