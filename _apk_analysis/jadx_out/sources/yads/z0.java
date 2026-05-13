package yads;

import android.app.Application;
import android.content.Context;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class z0 implements w0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f97340f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile z0 f97341g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f97342a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f97343b = new WeakHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakHashMap f97344c = new WeakHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0 f97345d = new y0(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f97346e;

    public final void a(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            tn.p.i(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this.f97345d);
            this.f97346e = true;
        } catch (Throwable unused) {
            boolean z10 = ad1.f87661a;
        }
    }

    public final void a(Context context, d1 d1Var) {
        synchronized (this.f97342a) {
            this.f97344c.put(d1Var, null);
            if (!a()) {
                a(context);
            }
            bn.r rVar = bn.r.f5635a;
        }
    }

    public final void a(Context context, l1 l1Var) {
        synchronized (this.f97342a) {
            this.f97343b.put(l1Var, null);
            if (!a()) {
                a(context);
            }
            bn.r rVar = bn.r.f5635a;
        }
    }

    public final boolean a() {
        boolean z10;
        synchronized (this.f97342a) {
            z10 = this.f97346e;
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000b, B:12:0x002d, B:13:0x002f, B:8:0x0013, B:10:0x0019), top: B:19:0x0003, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f97342a
            monitor-enter(r0)
            java.util.WeakHashMap r1 = r2.f97343b     // Catch: java.lang.Throwable -> L33
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L2f
            java.util.WeakHashMap r1 = r2.f97344c     // Catch: java.lang.Throwable -> L33
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L2f
            boolean r1 = r2.a()     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L2f
            android.content.Context r3 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = "null cannot be cast to non-null type android.app.Application"
            tn.p.i(r3, r1)     // Catch: java.lang.Throwable -> L2d
            android.app.Application r3 = (android.app.Application) r3     // Catch: java.lang.Throwable -> L2d
            yads.y0 r1 = r2.f97345d     // Catch: java.lang.Throwable -> L2d
            r3.unregisterActivityLifecycleCallbacks(r1)     // Catch: java.lang.Throwable -> L2d
            r3 = 0
            r2.f97346e = r3     // Catch: java.lang.Throwable -> L2d
            goto L2f
        L2d:
            boolean r3 = yads.ad1.f87661a     // Catch: java.lang.Throwable -> L33
        L2f:
            bn.r r3 = bn.r.f5635a     // Catch: java.lang.Throwable -> L33
            monitor-exit(r0)
            return
        L33:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.z0.b(android.content.Context):void");
    }

    public final void b(Context context, l1 l1Var) {
        synchronized (this.f97342a) {
            this.f97343b.remove(l1Var);
            b(context);
            bn.r rVar = bn.r.f5635a;
        }
    }
}
