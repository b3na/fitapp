/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import play.data.validation.MaxSize;
import play.data.validation.Required;
import play.db.jpa.Model;

/**
 *
 * @author abenavid
 */
@Entity
public class Usuario extends Model {
    public String nombre;
   
    @Required @MaxSize(value=255) @play.data.validation.Email public String mail;
    
    @Required @play.data.validation.Password public String pass;
    public double cintura;
    public double peso;
    public double estatura;
    public double imc;
    public Date fecha_ultimo_pago;
    public Boolean status_membresia;
    public Dieta dieta;

    public Usuario(String nombre, String mail, String pass) {
        this.nombre = nombre;
        this.mail = mail;
        this.pass = pass;
    }
    
    public static Usuario connect(String email, String password){
        return find("byMailAndPass",email,password).first();
    }

   
    
    
}
