package net.test.abs.test;


public abstract class AbsClass {
    private AbsClass absClass = null;

    public void prepend(AbsClass... absClasses) {
        this.absClass = absClasses[0];
        if (absClasses.length > 1) {
            this.absClass.prepend(absClasses[1]);
        }
    }

    public final void handle() {
        System.out.println("AbsClass handle Method");
        preHandle();
        getSupperCom().preCheck();
        if (null != getPostHandler()) {
            getPostHandler().handle();
        }
        postHandle();
    }

    public AbsClass getPostHandler() {
        return this.absClass;
    }

    protected abstract net.lct.proxy.inteface.ICom getSupperCom();

    protected abstract void preHandle();

    protected abstract void postHandle();
}
