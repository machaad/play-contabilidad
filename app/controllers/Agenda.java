package controllers;


import models.Contact;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

import static play.data.Form.form;

/**
 * Created by JoseLuis on 08/10/2015.
 */
@LogRequest
//@Authenticated(AgendaAuthenticator.class)
public class Agenda extends Controller {


    public static  Result list(){
        List<Contact> contact = Contact.find.all();
        return ok( views.html.list.render(contact));
        }

    public static Result show(Long id){
        Contact contact = Contact.find.byId(id);
        if (contact == null){
            return notFound();
        }else{
            return ok();
        }
    }

    public static Result newContact(){
        Form<Contact> contactForm = form(Contact.class);
        return ok(views.html.newContact.render(contactForm));
        }

    public static Result createContact(){
        Form<Contact> contactForm= form(Contact.class).bindFromRequest();
        if (contactForm.hasErrors()){
            return badRequest(views.html.newContact.render(contactForm));
        }
        else{
            Contact contact = contactForm.get();
            contact.save();
            return redirect(controllers.routes.Agenda.list());
        }

    }
}
