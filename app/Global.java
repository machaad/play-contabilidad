import play.GlobalSettings;
import play.libs.F;
import play.mvc.Http;
import play.mvc.Result;

/**
 * Created by JoseLuis on 16/10/2015.
 */
public class Global extends GlobalSettings {

    @Override
    public F.Promise<Result> onHandlerNotFound(Http.RequestHeader requestHeader) {
        return super.onHandlerNotFound(requestHeader);
    }
}
