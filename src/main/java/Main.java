import spark.ModelAndView;
import spark.Spark;
import spark.template.thymeleaf.ThymeleafTemplateEngine;

import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        Spark.port(8080);
        Spark.staticFileLocation("/assets");
        Spark.get("/", (rq, rs) -> {rs.redirect("/html/index.html"); return "";});
        Spark.get("/instagram", (rq, rs) -> new ModelAndView(Collections.emptyMap(), "instagram"), new ThymeleafTemplateEngine());
        Spark.get("/hello", (rq, rs) -> new ModelAndView(Collections.singletonMap("name","alborz"), "hello"), new ThymeleafTemplateEngine());
    }
}
