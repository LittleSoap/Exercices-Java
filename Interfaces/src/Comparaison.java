public interface Comparaison extends Comparable {

    @Override
    public int compareTo(Object o);

    public boolean isLess(Object o);

    public boolean isLess0rEqual(Object o);

    public boolean isEqual(Object o);

    public boolean isDifferent(Object o);

    public boolean isGreater(Object o);

    public boolean isGreaterOrEuqal(Object o);
}
