package dhbw.fowler1.videostore;

public class ChildrensMovie extends Movie{
    public ChildrensMovie(String title, int priceCode) {
        super(title, priceCode);
    }

    @Override
    double getCharge(int daysRented) {
        double result = 1.5;

        if (daysRented > 3){
            result += (daysRented - 3) * 1.5;
        }

        return result;
    }
}
