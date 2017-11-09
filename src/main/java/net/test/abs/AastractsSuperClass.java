package net.test.abs;

import net.lct.proxy.inteface.ICom;

public abstract class AastractsSuperClass {
    private AastractsSuperClass aastractsSuperClass = null;

    public void prepend(AastractsSuperClass... aastractsSuperClass) {
        this.aastractsSuperClass = aastractsSuperClass[0];
        if (aastractsSuperClass.length > 1) {
            this.aastractsSuperClass.prepend(aastractsSuperClass[1]);
        }
    }

    public AastractsSuperClass getPostHandler() {
        return this.aastractsSuperClass;
    }

    public final void handle() {
        System.out.println("AastractsSuperClass handle Method");
        preHandle();
        getSupperCom().preCheck();
        if (null != getSupperCom()) {
            getPostHandler().handle();
        }
        postHandle();
    }


    protected abstract ICom getSupperCom();

    protected abstract void preHandle();

    protected abstract void postHandle();
}
