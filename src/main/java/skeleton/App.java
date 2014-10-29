package skeleton;

import sinetja.Server;

public class App {
  public static void main(String[] args) {
    new Server()

    .GET("/", (req, res) -> {
      res.respondText("Hello world");
    })

    .GET("/hello/:name", (req, res) -> {
      String name = req.param("name");
      res.respondText("Hello " + name);
    })

    .start(8000);
  }
}
