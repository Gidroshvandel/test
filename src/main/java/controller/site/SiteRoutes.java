package controller.site;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import controller.BaseRoutes;

import java.util.logging.Logger;

import static spark.Spark.get;

public class SiteRoutes extends BaseRoutes {
    private static Logger log = Logger.getLogger(SiteRoutes.class.getName());

    private final String ROOT = "/";

    private void initRoutes(){
//        new UsersApi();
    }

    @Override
    public void routes() {
        initRoutes();
        get(ROOT+"json.get", (request, response) -> {
            Gson gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();

            String a = "a";

            return gson.toJson(a);
        });
    }

}
