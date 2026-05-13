package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes10.dex */
public final class bh1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f88003f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile bh1 f88004g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eh1 f88005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dh1 f88006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dw2 f88007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ox2 f88008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f88009e;

    public bh1(Context context, eh1 eh1Var, dh1 dh1Var, dw2 dw2Var, ox2 ox2Var) {
        this.f88005a = eh1Var;
        this.f88006b = dh1Var;
        this.f88007c = dw2Var;
        this.f88008d = ox2Var;
        this.f88009e = uz.a(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.location.Location a() {
        /*
            r4 = this;
            java.lang.Object r0 = yads.bh1.f88003f
            monitor-enter(r0)
            yads.dw2 r1 = r4.f88007c     // Catch: java.lang.Throwable -> L51
            boolean r1 = r1.a()     // Catch: java.lang.Throwable -> L51
            if (r1 == 0) goto L4e
            yads.ox2 r1 = r4.f88008d     // Catch: java.lang.Throwable -> L51
            android.content.Context r2 = r4.f88009e     // Catch: java.lang.Throwable -> L51
            r1.getClass()     // Catch: java.lang.Throwable -> L51
            boolean r1 = yads.ox2.a(r2)     // Catch: java.lang.Throwable -> L51
            r1 = r1 ^ 1
            if (r1 == 0) goto L4e
            yads.dh1 r1 = r4.f88006b     // Catch: java.lang.Throwable -> L51
            android.content.Context r2 = r4.f88009e     // Catch: java.lang.Throwable -> L51
            r1.getClass()     // Catch: java.lang.Throwable -> L51
            java.util.ArrayList r1 = yads.dh1.a(r2)     // Catch: java.lang.Throwable -> L51
            java.util.List r2 = cn.v.c()     // Catch: java.lang.Throwable -> L51
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L51
        L2d:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L51
            if (r3 == 0) goto L43
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L51
            yads.ch1 r3 = (yads.ch1) r3     // Catch: java.lang.Throwable -> L51
            android.location.Location r3 = r3.a()     // Catch: java.lang.Throwable -> L51
            if (r3 == 0) goto L2d
            r2.add(r3)     // Catch: java.lang.Throwable -> L51
            goto L2d
        L43:
            java.util.List r1 = cn.v.a(r2)     // Catch: java.lang.Throwable -> L51
            yads.eh1 r2 = r4.f88005a     // Catch: java.lang.Throwable -> L51
            android.location.Location r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L51
            goto L4f
        L4e:
            r1 = 0
        L4f:
            monitor-exit(r0)
            return r1
        L51:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.bh1.a():android.location.Location");
    }
}
