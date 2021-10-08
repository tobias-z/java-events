@FunctionalInterface
public interface IObservable<T> {
    void commit(T param);
}
