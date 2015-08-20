import java.util.ArrayList;
import java.util.Random;
import java.io.*;

import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        String layout = "templates/layout.vtl";

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("template", "templates/home.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        get("/game", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("template", "templates/game.vtl");

            Game myGame = new Game();
            myGame.newGame();

            ArrayList<Card> playerHand = myGame.handHashMap.get("p1");
            ArrayList<Card> computerHand = myGame.handHashMap.get("comp");

            String displayPHand = Deck.displayHand(playerHand);
            String displayCHand = Deck.displayHand(computerHand);

            model.put("pHand", displayPHand);
            model.put("cHand", displayCHand);

            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());



    }
}
