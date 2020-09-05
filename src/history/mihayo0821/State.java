package history.mihayo0821;

/**
 * @author wangyao2221
 * @date 2020/8/21 21:32
 */
public abstract class State {
    public abstract State action1();
    public abstract State action2();
    public abstract State action3();

    public static class StateA extends State {
        @Override
        public State action1() {
            return null;
        }
        @Override
        public State action2() {
            return null;
        }
        @Override
        public State action3() {
            return null;
        }
    }

    public static class StateB extends State {
        @Override
        public State action1() {
            return null;
        }
        @Override
        public State action2() {
            return null;
        }
        @Override
        public State action3() {
            return null;
        }
    }
}
