package controller.site;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import controller.BaseRoutes;
import model.Note;
import model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import static spark.Spark.get;
import static spark.Spark.post;

public class SiteRoutes extends BaseRoutes {
    private static Logger log = Logger.getLogger(SiteRoutes.class.getName());

    private final String ROOT = "/api/";

    private void initRoutes() {
//        new UsersApi();
    }

    @Override
    public void routes() {
        initRoutes();
        get(ROOT + "getNotes", (request, response) -> {
            Gson gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();

            ArrayList<Note> noteList = new ArrayList();
            noteList.add(new Note("Заметка 1", "не забудь то что ты обычно забываешь", "http://i.imgur.com/DvpvklR.png", 1));
            noteList.add(new Note("Заметка 2", "hesoyam", "https://fthmb.tqn.com/I14hr1j7E2I_GSvXEYxxiQIzCbc=/768x0/filters:no_upscale()/about/GTA_logo-56a9c3925f9b58b7d0fec930.jpg", 2));
            noteList.add(new Note("Покормить котят", "Покормить барсика и кузю", "https://i.ytimg.com/vi/IprVGYC3hRY/maxresdefault.jpg", 3));

            System.out.println(gson.toJson(noteList));

            return gson.toJson(noteList);
        });

        post(ROOT + "login", (request, response) -> {
            String query_email = request.queryParams("email");
            String query_password = request.queryParams("password");

            System.out.println("email " + query_email);
            System.out.println("password " + query_password);

            Gson gson = new Gson();

            return gson.toJson(new User("", query_email, query_password));
        });
        post(ROOT + "registration", (request, response) -> {

            String query_name = request.queryParams("name");
            String query_email = request.queryParams("email");
            String query_password = request.queryParams("password");

            System.out.println("name " + query_name);
            System.out.println("email " + query_email);
            System.out.println("password " + query_password);

            Gson gson = new Gson();

            return gson.toJson(new User(query_name, query_email, query_password));
        });

//        get(ROOT + "pdf", (request, response) -> {
//
//            return new Gson().toJson("{byte:"+read("D:\\Downloads\\mnj_2016_3_24.pdf")+"}");
//
//        });

    }


}
