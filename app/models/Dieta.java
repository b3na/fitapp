/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import play.db.jpa.Model;

@Entity
public class Dieta extends Model {
    
      
    @ManyToMany(cascade = CascadeType.ALL)
    public List<Alimento> alimentos;
    
    public double proteina;
    public double calorias;
    public double grasas;
    public double carbs;
    
    
    public Dieta(){
        this.alimentos = new ArrayList();
        
    }   
    public void addAlimento(Alimento a){
        
        this.alimentos.add(a);
        calorias = calorias + a.calorias;
        this.save();
        
    }
    
    
    
    
}
