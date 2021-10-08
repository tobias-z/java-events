import java.util.ArrayList;
import java.util.List;

public class Action<T> {
    private final List<IObservable<T>> observables;

    public Action() {
        this.observables = new ArrayList<>();
    }

    public void addEvent(IObservable<T> observable) {
        observables.add(observable);
    }

    public void removeEvent(IObservable<T> observable) {
        observables.remove(observable);
    }

    public void invoke(T param) {
        for (IObservable<T> observable : observables) {
            observable.commit(param);
        }
    }

}
