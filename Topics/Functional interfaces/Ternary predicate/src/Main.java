class Predicate {

    @FunctionalInterface
    public interface TernaryIntPredicate {
        boolean test(int i, int j, int k);
    }

    public static final TernaryIntPredicate allValuesAreDifferentPredicate = (x, y, z) -> x != y && x != z && y != z;;

}