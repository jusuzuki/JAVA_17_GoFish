import java.util.ArrayList;
// import java.util.Random;
// import java.io.*;

// import java.util.Map;
// import java.util.HashMap;
// import spark.ModelAndView;
// import spark.template.velocity.VelocityTemplateEngine;
// import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
    //     String layout = "templates/layout.vtl";
    //
    //     get("/", (request, response) -> {
    //         Map<String, Object> model = new HashMap<String, Object>();
    //         model.put("template", "templates/home.vtl");
    //         return new ModelAndView(model, layout);
    //     }, new VelocityTemplateEngine());
    //
    //     get("/game", (request, response) -> {
    //         Map<String, Object> model = new HashMap<String, Object>();
    //         model.put("template", "templates/game.vtl");
    //
    //         Game myGame = new Game();
    //         myGame.initializeGame();
    //
    //         ArrayList<Card> pHand = myGame.playHand;
    //         ArrayList<Card> cHand = myGame.compHand;
    //
    //         String displayPHand = Deck.displayHand(pHand);
    //         String displayCHand = Deck.displayHand(cHand);
    //
    //         model.put("pHand", displayPHand);
    //         model.put("cHand", displayCHand);
    //
    //         return new ModelAndView(model, layout);
    //     }, new VelocityTemplateEngine());

        Game myGame = new Game();
        myGame.initializeGame();
        System.out.println(myGame.myDeck.displayDeck());

        System.out.println();

        System.out.println("PLAYER HAND");
        ArrayList<Card> pHand = myGame.playHand;
        System.out.println(Deck.displayHand(pHand));

        System.out.println();

        System.out.println("COMPUTER HAND");
        ArrayList<Card> cHand = myGame.compHand;
        System.out.println(Deck.displayHand(cHand));

        System.out.println();

        System.out.println("Does the computer have 8? " + myGame.hasCard(myGame.compHand, "8"));

        System.out.println();

        myGame.transfer(myGame.compHand, myGame.playHand, "8");

        System.out.println();
        
        System.out.println("NEW PLAYER HAND");
        System.out.println(Deck.displayHand(myGame.playHand));

        System.out.println();

        System.out.println("NEW COMPUTER HAND");
        System.out.println(Deck.displayHand(myGame.compHand));
    }
}
