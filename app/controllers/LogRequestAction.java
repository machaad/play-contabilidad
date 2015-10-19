package controllers;

import play.Logger;
import play.libs.F;
import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Result;

/**
 * Created by JoseLuis on 16/10/2015.
 */
public class LogRequestAction extends Action<LogRequest> {
    @Override
    public F.Promise<Result> call(Http.Context ctx) throws Throwable {
        Logger.info("The request was called " + ctx);
        return delegate.call(ctx);
    }
}
