package models;


import play.data.validation.Constraints.*;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by JoseLuis on 08/10/2015.
 */

@Entity
public class Contact extends Model {

    @Id
    @GeneratedValue
    public Long id;

    @Required
    public String name;

    @Required
    public String  phone;

    @Required
    @Email
    public String email;

    public static Finder<Long, Contact> find = new Finder<Long, Contact>(Long.class, Contact.class);

}
