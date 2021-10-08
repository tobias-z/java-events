public class Enemy {
    public Action<Integer> attack = new Action<>();

    private final float attackRange = 30;

    public void update() {
        int examplePlayerRange = 20;
        if (attackRange > examplePlayerRange) {
            attack.invoke(40);
        }
    }
}
