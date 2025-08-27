public class AlternatingSum {
    private int sum;
    private boolean addNext;
  
    private AlternatingSum(int num, boolean addNext) {
        this.sum = num;
        this.addNext = !addNext;
    }

    public static AlternatingSum add_subtract(int num) {
        return new AlternatingSum(num, false);
    }

    public AlternatingSum add_subtract(int num) {
        if (addNext) {
            sum += num;
        } else {
            sum -= num;
        }
        addNext = !addNext;
        return this;
    }

    @Override
    public String toString() {
        return String.valueOf(sum);
    }

    public int getValue() {
        return sum;
    }
