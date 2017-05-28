package skeleton;

import sinetja.Server;
import sinetja.Action;
import sinetja.Request;
import sinetja.Response;

public class App {
    public static void main(String[] args) {
        Server server = new Server(8000);

        server
                .GET("/", new Action() {
                    public void run(Request req, Response res) throws Exception {
                        res.respondText("Hello world");
                    }
                })
                .GET("/hello/:name", new Action() {
                    public void run(Request req, Response res) throws Exception {
                        String name = req.param("name");
                        res.respondText("Hello " + name);
                    }
                });

        server.start();
        server.stopAtShutdown();
    }
}
