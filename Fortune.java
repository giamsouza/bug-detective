import java.util.Random;

public class Fortune {
    public static void main(String[] args) {
        String[] fortunes = {
                "Flattery will go far tonight.",
                "Don't behave with cold manners.",
                "May you someday be carbon neutral.",
                "You have rice in your teeth.",
                "A conclusion is simply the place where you got tired of thinking."
        };

        Random randomGenerator = new Random();
        int randomIndex = randomGenerator.nextInt(fortunes.length);
        System.out.println(fortunes[randomIndex]);
    }
}
