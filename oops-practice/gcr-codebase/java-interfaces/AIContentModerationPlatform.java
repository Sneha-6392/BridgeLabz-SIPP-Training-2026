interface TextModeration {
    
    boolean isOffensive(String post);

    default void displayModerationPolicy() {
        System.out.println("Text Moderation Policy:");
        System.out.println("Posts containing offensive words are not allowed.");
    }

    static boolean containsRestrictedWords(String post) {
        String[] restrictedWords = {"hate", "abuse", "badword"};

        post = post.toLowerCase();

        for (String word : restrictedWords) {
            if (post.contains(word)) {
                return true;
            }
        }
        return false;
    }
}

interface SpamDetection {

    boolean isSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("Spam Detection Policy:");
        System.out.println("Repeated promotional content is not allowed.");
    }
}

class ContentModerator implements TextModeration, SpamDetection {

    public boolean isOffensive(String post) {
        return TextModeration.containsRestrictedWords(post);
    }


    @Override
    public boolean isSpam(String post) {
        post = post.toLowerCase();

        return post.contains("buy now") || post.contains("free money") || post.contains("click here");
    }

    @Override
    public void displayModerationPolicy() {
        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }
}

public class AIContentModerationPlatform {

    public static void main(String[] args) {

        String[] posts = {
            "Welcome everyone to our community!",
            "Buy now and get 50% discount!",
            "I hate this product.",
            "Click here to win free money!",
            "Have a great day everyone!"
        };

        ContentModerator moderator = new ContentModerator();

        moderator.displayModerationPolicy();

        System.out.println("\nPost Analysis:\n");

        for (String post : posts) {

            System.out.println("Post: " + post);

            if (moderator.isSpam(post)) {
                System.out.println("Status: Spam Post");
            } else if (moderator.isOffensive(post)) {
                System.out.println("Status: Offensive Post");
            } else {
                System.out.println("Status: Valid Post");
            }

            System.out.println();
        }
    }
}