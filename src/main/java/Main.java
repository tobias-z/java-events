public class Main {
    public static void main(String[] args) {
        Enemy enemy = new Enemy();
        enemy.attack.addEvent(someMethod());
        enemy.attack.addEvent(someOtherMethod());
        enemy.update();
    }

    private static IObservable<Integer> someMethod() {
        return (amount) -> System.out.println("first event " + amount);
    }

    private static IObservable<Integer> someOtherMethod() {
        return (amount) -> System.out.println("second event " + amount);
    }
}
