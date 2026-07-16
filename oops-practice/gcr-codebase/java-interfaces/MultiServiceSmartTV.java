interface StreamingService {

    void streamMovie(String movie);

    default void showSubscriptionDetails() {
        System.out.println("Streaming Subscription: Premium Plan");
    }
}

interface GamingService {

    void playGame(String game);

    default void showSubscriptionDetails() {
        System.out.println("Gaming Subscription: Gold Plan");
    }
}

class SmartTV implements StreamingService, GamingService {

    @Override
    public void streamMovie(String movie) {
        System.out.println("Streaming Movie: " + movie);
    }

    @Override
    public void playGame(String game) {
        System.out.println("Playing Game: " + game);
    }

    @Override
    public void showSubscriptionDetails() {
        System.out.println("Smart TV Subscription Details:");

        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }

    void displayContent(String[] movies, String[] games) {

        System.out.println("\nAvailable Movies:");
        for (String movie : movies) {
            System.out.println("- " + movie);
        }

        System.out.println("\nAvailable Games:");
        for (String game : games) {
            System.out.println("- " + game);
        }
    }
}


public class MultiServiceSmartTV {
    public static void main(String[] args) {

        String[] movies = {
                "Inception",
                "Avengers: Endgame",
                "Interstellar"
        };

        String[] games = {
                "FIFA 25",
                "Minecraft",
                "Need for Speed"
        };

        SmartTV tv = new SmartTV();

        tv.showSubscriptionDetails();

        tv.displayContent(movies, games);

        System.out.println();
        tv.streamMovie(movies[0]);
        tv.playGame(games[0]);
    }
}
