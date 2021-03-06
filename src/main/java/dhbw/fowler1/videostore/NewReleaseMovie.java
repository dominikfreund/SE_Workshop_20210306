package dhbw.fowler1.videostore;

public class NewReleaseMovie extends Movie {
    public NewReleaseMovie(String title, int priceCode) {
        super(title, priceCode);
    }

    @Override
    double getCharge(int daysRented) {
        double result = 0;
        result += daysRented * 3;

        return result;
    }
}
