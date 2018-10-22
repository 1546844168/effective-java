package chapterEleven;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author 江峰
 * @create 2018-10-22 10:47
 */
public class AbstractFoo {
    private int x, y;

    private enum State {NEW, INITIALIZING, INITIALIZED};
    private final AtomicReference<State> init = new AtomicReference<>(State.NEW);
    protected AbstractFoo(){}
    public AbstractFoo(int x,int y){
        initialize(x,y);
    }

    protected final void initialize(int x, int y){
        if (!init.compareAndSet(State.NEW,State.INITIALIZING)){
            throw new IllegalStateException("alerady init");
        }
        this.x = x;
        this.y = y;
        init.set(State.INITIALIZED);
    }

    protected final int getX(){
        checkInit();
        return x;
    }

    protected final int getY(){
        checkInit();
        return y;
    }

    private final void checkInit(){
        if (init.get() != State.INITIALIZED){
            throw new IllegalStateException("uninit");
        }
    }

    public static void main(String[] args){
      AbstractFoo af = new AbstractFoo(1,3);
        af.initialize(1,5);
        int x = af.getX();
        System.out.println(x);

    }

}
