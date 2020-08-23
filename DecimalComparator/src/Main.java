public class Main {
    public static void main(String[] args) {
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.012,3.012));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.112,3.012));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.1123,3.1123));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.120,3.0120));
    }
}
