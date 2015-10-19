package auth;

import play.mvc.Http;
import play.mvc.Security;

/**
 * Created by JoseLuis on 16/10/2015.
 */
public class AgendaAuthenticator extends Security.Authenticator{

    @Override
    public String getUsername(Http.Context context) {
        BasicAuthHelper.BasicAuthUser basicAuthUser = BasicAuthHelper.auth(context);
        if(basicAuthUser==null){
            return null;
        }
        else
        {
            if(basicAuthUser.name.equals("mgoto") && basicAuthUser.password.equals("mgoto")){
                return basicAuthUser.name;
            }else{
                return null;
            }
        }
    }
}
