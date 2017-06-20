import com.google.gson.Gson;
import controller.site.SiteRoutes;

import java.io.*;

import static spark.Spark.port;
import static spark.Spark.staticFileLocation;

public class Application {
    public static void main(String[] args){

        staticFileLocation("/public");
        port(2525);
//        int port;
//        port = Integer.parseInt(args[0]);
//        port(port);
        new SiteRoutes();

    }


}
