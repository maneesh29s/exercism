import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.*;

public class PythagoreanTriplet{
    final int a;
    final int b;
    final int c;

    public PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PythagoreanTriplet)) return false;
        PythagoreanTriplet other = (PythagoreanTriplet) o;
        return a == other.a &&
                b == other.b &&
                c == other.c;
    }

    static TripletBuilder makeTripletsList(){
        return new TripletBuilder();
    }

    static class TripletBuilder {
        private int factor;
        private int sum;

        TripletBuilder withFactorsLessThanOrEqualTo(int n) {
            factor = n;
            return this;
        }

        TripletBuilder thatSumTo(int n) {
            sum = n;
            return this;
        }

        List<PythagoreanTriplet> build() {
            List<PythagoreanTriplet> tripletList = new ArrayList<PythagoreanTriplet>();

//            for (int a = 1; a <= factor / 2; a++)
//                for (int b = a + 1; b <= (factor - a) / 2; b++)
//                    if (b != a) {
//                        int c = sum - (a + b);

//                        if (c != b)
//                            if (a * a + b * b == c * c)
//                                tripletList.add(new PythagoreanTriplet(a, b, c));
//                    }

            for (int cc = (int) (floor(factor/ 2)-1); cc > (int) (sum*(sqrt(2)-1)); cc-- )
            {
                var D = sqrt(cc*cc + 2*cc*sum - sum*sum);
                if (D == floor(D) && D == ceil(D) ){
                    int aa = (int) ((sum-cc+D)/2);
                    int bb = (int) ((sum-cc-D)/2);
                    tripletList.add(new PythagoreanTriplet(aa,bb,cc));
                }
            }

            return tripletList;
        }
    }

}
