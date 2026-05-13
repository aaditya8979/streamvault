package yads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
public final class cj0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f88468e = new AtomicBoolean(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f88469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f88470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a5 f88471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d11 f88472d;

    public /* synthetic */ cj0(Context context, w5 w5Var) {
        this(w5Var, context.getApplicationContext(), new a5(), new d11());
    }

    public cj0(w5 w5Var, Context context, a5 a5Var, d11 d11Var) {
        this.f88469a = w5Var;
        this.f88470b = context;
        this.f88471c = a5Var;
        this.f88472d = d11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(hn.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof yads.yi0
            if (r0 == 0) goto L13
            r0 = r9
            yads.yi0 r0 = (yads.yi0) r0
            int r1 = r0.f97153f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f97153f = r1
            goto L18
        L13:
            yads.yi0 r0 = new yads.yi0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f97151d
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f97153f
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            yads.v5 r1 = r0.f97150c
            yads.w5 r0 = r0.f97149b
            kotlin.c.b(r9)     // Catch: java.lang.Throwable -> L2d
            goto L6e
        L2d:
            r9 = move-exception
            goto L69
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L37:
            kotlin.c.b(r9)
            java.util.concurrent.atomic.AtomicBoolean r9 = yads.cj0.f88468e
            r2 = 0
            boolean r9 = r9.getAndSet(r2)
            if (r9 == 0) goto L73
            yads.w5 r9 = r8.f88469a
            yads.v5 r2 = yads.v5.f95947z
            r9.b(r2)
            do.h0 r4 = yads.w10.a()     // Catch: java.lang.Throwable -> L64
            yads.zi0 r5 = new yads.zi0     // Catch: java.lang.Throwable -> L64
            r6 = 0
            r5.<init>(r8, r6)     // Catch: java.lang.Throwable -> L64
            r0.f97149b = r9     // Catch: java.lang.Throwable -> L64
            r0.f97150c = r2     // Catch: java.lang.Throwable -> L64
            r0.f97153f = r3     // Catch: java.lang.Throwable -> L64
            java.lang.Object r0 = p000do.g.g(r4, r5, r0)     // Catch: java.lang.Throwable -> L64
            if (r0 != r1) goto L61
            return r1
        L61:
            r0 = r9
            r1 = r2
            goto L6e
        L64:
            r0 = move-exception
            r1 = r2
            r7 = r0
            r0 = r9
            r9 = r7
        L69:
            r9.getMessage()
            boolean r9 = yads.ad1.f87661a
        L6e:
            bn.r r9 = bn.r.f5635a
            r0.a(r1)
        L73:
            bn.r r9 = bn.r.f5635a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.cj0.a(hn.c):java.lang.Object");
    }

    public final void a(String str) {
        if (this.f88472d.a(2000, str)) {
            boolean z10 = ad1.f87661a;
        } else {
            boolean z11 = ad1.f87661a;
        }
    }
}
