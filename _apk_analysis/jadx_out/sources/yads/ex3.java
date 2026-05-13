package yads;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ex3 {
    public static void a(wv3 wv3Var) {
        if (!wv3Var.f96537f) {
            throw new IllegalStateException("AdSession is not started");
        }
        if (wv3Var.f96538g) {
            throw new IllegalStateException("AdSession is finished");
        }
    }
}
