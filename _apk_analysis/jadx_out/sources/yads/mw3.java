package yads;

import java.util.ArrayDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public final class mw3 implements xv3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f92591b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public gw3 f92592c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadPoolExecutor f92590a = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public final void a() {
        gw3 gw3Var = (gw3) this.f92591b.poll();
        this.f92592c = gw3Var;
        if (gw3Var != null) {
            gw3Var.a(this.f92590a);
        }
    }

    public final void a(gw3 gw3Var) {
        gw3Var.f90143a = this;
        this.f92591b.add(gw3Var);
        if (this.f92592c == null) {
            a();
        }
    }
}
