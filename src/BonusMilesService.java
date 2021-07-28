public class BonusMilesService {

    public int calculate(int cost) {
        int miles;
        int amount = 20; // в рублях, потраченные на билет, за которые  начисляется 1 миля.
        miles = cost / amount;
        return miles;
    }
}
