package dhbw.fowler1.videostore;

public class RegularMovie extends Movie {
    public RegularMovie(String title, int priceCode) {
        super(title, priceCode);
    }

    @Override
    double getCharge(int daysRented) {
        double result = 0;
        result += 2;
        if (daysRented > 2)
            result += (daysRented - 2) * 1.5;

        return result;
    }
}
