package yads;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import yads.oe0;

/* JADX INFO: loaded from: classes11.dex */
public final class oe0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final y43 f93193h = new y43() { // from class: bt.o7
        @Override // yads.y43
        public final Object get() {
            return oe0.a();
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Random f93194i = new Random();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r63 f93195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p63 f93196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f93197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y43 f93198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public he2 f93199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s63 f93200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f93201g;

    public oe0() {
        this(f93193h);
    }

    public oe0(y43 y43Var) {
        this.f93198d = y43Var;
        this.f93195a = new r63();
        this.f93196b = new p63();
        this.f93197c = new HashMap();
        this.f93200f = s63.f94726b;
    }

    public static String a() {
        byte[] bArr = new byte[12];
        f93194i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0075 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yads.ne0 a(int r14, yads.ym1 r15) {
        /*
            r13 = this;
            java.util.HashMap r0 = r13.f93197c
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L10:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L78
            java.lang.Object r4 = r0.next()
            yads.ne0 r4 = (yads.ne0) r4
            long r5 = r4.f92834c
            r7 = -1
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L2e
            int r5 = r4.f92833b
            if (r14 != r5) goto L2e
            if (r15 == 0) goto L2e
            long r5 = r15.f94495d
            r4.f92834c = r5
        L2e:
            if (r15 != 0) goto L35
            int r5 = r4.f92833b
            if (r14 != r5) goto L10
            goto L5c
        L35:
            yads.ym1 r5 = r4.f92835d
            if (r5 != 0) goto L48
            boolean r5 = r15.a()
            if (r5 != 0) goto L10
            long r5 = r15.f94495d
            long r9 = r4.f92834c
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L10
            goto L5c
        L48:
            long r9 = r15.f94495d
            long r11 = r5.f94495d
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 != 0) goto L10
            int r6 = r15.f94493b
            int r9 = r5.f94493b
            if (r6 != r9) goto L10
            int r6 = r15.f94494c
            int r5 = r5.f94494c
            if (r6 != r5) goto L10
        L5c:
            long r5 = r4.f92834c
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L75
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 >= 0) goto L67
            goto L75
        L67:
            if (r7 != 0) goto L10
            int r5 = yads.ib3.f90737a
            yads.ym1 r5 = r1.f92835d
            if (r5 == 0) goto L10
            yads.ym1 r5 = r4.f92835d
            if (r5 == 0) goto L10
            r1 = r4
            goto L10
        L75:
            r1 = r4
            r2 = r5
            goto L10
        L78:
            if (r1 != 0) goto L8c
            yads.y43 r0 = r13.f93198d
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            yads.ne0 r1 = new yads.ne0
            r1.<init>(r13, r0, r14, r15)
            java.util.HashMap r14 = r13.f93197c
            r14.put(r0, r1)
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.oe0.a(int, yads.ym1):yads.ne0");
    }

    public final void a(he2 he2Var) {
        this.f93199e = he2Var;
    }

    public final synchronized void a(ye yeVar) {
        he2 he2Var;
        this.f93201g = null;
        Iterator it = this.f93197c.values().iterator();
        while (it.hasNext()) {
            ne0 ne0Var = (ne0) it.next();
            it.remove();
            if (ne0Var.f92836e && (he2Var = this.f93199e) != null) {
                ((mm1) he2Var).b(yeVar, ne0Var.f92832a);
            }
        }
    }

    public final synchronized void a(ye yeVar, int i10) {
        this.f93199e.getClass();
        if (i10 == 0) {
        }
        Iterator it = this.f93197c.values().iterator();
        while (it.hasNext()) {
            ne0 ne0Var = (ne0) it.next();
            if (ne0Var.a(yeVar)) {
                it.remove();
                if (ne0Var.f92836e) {
                    if (ne0Var.f92832a.equals(this.f93201g)) {
                        this.f93201g = null;
                    }
                    ((mm1) this.f93199e).b(yeVar, ne0Var.f92832a);
                }
            }
        }
        b(yeVar);
    }

    public final void b(ye yeVar) {
        ym1 ym1Var;
        if (yeVar.f97091b.c()) {
            this.f93201g = null;
            return;
        }
        ne0 ne0Var = (ne0) this.f93197c.get(this.f93201g);
        this.f93201g = a(yeVar.f97092c, yeVar.f97093d).f92832a;
        c(yeVar);
        ym1 ym1Var2 = yeVar.f97093d;
        if (ym1Var2 == null || !ym1Var2.a()) {
            return;
        }
        if (ne0Var != null) {
            long j10 = ne0Var.f92834c;
            ym1 ym1Var3 = yeVar.f97093d;
            if (j10 == ym1Var3.f94495d && (ym1Var = ne0Var.f92835d) != null && ym1Var.f94493b == ym1Var3.f94493b && ym1Var.f94494c == ym1Var3.f94494c) {
                return;
            }
        }
        ym1 ym1Var4 = yeVar.f97093d;
        a(yeVar.f97092c, new ym1(ym1Var4.f94492a, ym1Var4.f94495d));
        this.f93199e.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r1.f94495d < r2) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void c(yads.ye r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            yads.he2 r0 = r7.f93199e     // Catch: java.lang.Throwable -> Lbf
            r0.getClass()     // Catch: java.lang.Throwable -> Lbf
            yads.s63 r0 = r8.f97091b     // Catch: java.lang.Throwable -> Lbf
            boolean r0 = r0.c()     // Catch: java.lang.Throwable -> Lbf
            if (r0 == 0) goto L10
            monitor-exit(r7)
            return
        L10:
            java.util.HashMap r0 = r7.f93197c     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r1 = r7.f93201g     // Catch: java.lang.Throwable -> Lbf
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Lbf
            yads.ne0 r0 = (yads.ne0) r0     // Catch: java.lang.Throwable -> Lbf
            yads.ym1 r1 = r8.f97093d     // Catch: java.lang.Throwable -> Lbf
            if (r1 == 0) goto L37
            if (r0 == 0) goto L37
            long r2 = r0.f92834c     // Catch: java.lang.Throwable -> Lbf
            r4 = -1
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 != 0) goto L2f
            int r0 = r0.f92833b     // Catch: java.lang.Throwable -> Lbf
            int r2 = r8.f97092c     // Catch: java.lang.Throwable -> Lbf
            if (r0 == r2) goto L37
            goto L35
        L2f:
            long r4 = r1.f94495d     // Catch: java.lang.Throwable -> Lbf
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L37
        L35:
            monitor-exit(r7)
            return
        L37:
            int r0 = r8.f97092c     // Catch: java.lang.Throwable -> Lbf
            yads.ne0 r0 = r7.a(r0, r1)     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r1 = r7.f93201g     // Catch: java.lang.Throwable -> Lbf
            if (r1 != 0) goto L45
            java.lang.String r1 = r0.f92832a     // Catch: java.lang.Throwable -> Lbf
            r7.f93201g = r1     // Catch: java.lang.Throwable -> Lbf
        L45:
            yads.ym1 r1 = r8.f97093d     // Catch: java.lang.Throwable -> Lbf
            r2 = 1
            if (r1 == 0) goto L99
            boolean r1 = r1.a()     // Catch: java.lang.Throwable -> Lbf
            if (r1 == 0) goto L99
            yads.ym1 r1 = new yads.ym1     // Catch: java.lang.Throwable -> Lbf
            yads.ym1 r3 = r8.f97093d     // Catch: java.lang.Throwable -> Lbf
            java.lang.Object r4 = r3.f94492a     // Catch: java.lang.Throwable -> Lbf
            long r5 = r3.f94495d     // Catch: java.lang.Throwable -> Lbf
            int r3 = r3.f94493b     // Catch: java.lang.Throwable -> Lbf
            r1.<init>(r3, r5, r4)     // Catch: java.lang.Throwable -> Lbf
            int r3 = r8.f97092c     // Catch: java.lang.Throwable -> Lbf
            yads.ne0 r1 = r7.a(r3, r1)     // Catch: java.lang.Throwable -> Lbf
            boolean r3 = r1.f92836e     // Catch: java.lang.Throwable -> Lbf
            if (r3 != 0) goto L99
            r1.f92836e = r2     // Catch: java.lang.Throwable -> Lbf
            yads.s63 r1 = r8.f97091b     // Catch: java.lang.Throwable -> Lbf
            yads.ym1 r3 = r8.f97093d     // Catch: java.lang.Throwable -> Lbf
            java.lang.Object r3 = r3.f94492a     // Catch: java.lang.Throwable -> Lbf
            yads.p63 r4 = r7.f93196b     // Catch: java.lang.Throwable -> Lbf
            r1.a(r3, r4)     // Catch: java.lang.Throwable -> Lbf
            yads.p63 r1 = r7.f93196b     // Catch: java.lang.Throwable -> Lbf
            yads.ym1 r3 = r8.f97093d     // Catch: java.lang.Throwable -> Lbf
            int r3 = r3.f94493b     // Catch: java.lang.Throwable -> Lbf
            yads.e6 r1 = r1.f93453h     // Catch: java.lang.Throwable -> Lbf
            yads.d6 r1 = r1.a(r3)     // Catch: java.lang.Throwable -> Lbf
            long r3 = r1.f88761b     // Catch: java.lang.Throwable -> Lbf
            long r3 = yads.ib3.b(r3)     // Catch: java.lang.Throwable -> Lbf
            yads.p63 r1 = r7.f93196b     // Catch: java.lang.Throwable -> Lbf
            long r5 = r1.f93451f     // Catch: java.lang.Throwable -> Lbf
            long r5 = yads.ib3.b(r5)     // Catch: java.lang.Throwable -> Lbf
            long r5 = r5 + r3
            r3 = 0
            java.lang.Math.max(r3, r5)     // Catch: java.lang.Throwable -> Lbf
            yads.he2 r1 = r7.f93199e     // Catch: java.lang.Throwable -> Lbf
            r1.getClass()     // Catch: java.lang.Throwable -> Lbf
        L99:
            boolean r1 = r0.f92836e     // Catch: java.lang.Throwable -> Lbf
            if (r1 != 0) goto La4
            r0.f92836e = r2     // Catch: java.lang.Throwable -> Lbf
            yads.he2 r1 = r7.f93199e     // Catch: java.lang.Throwable -> Lbf
            r1.getClass()     // Catch: java.lang.Throwable -> Lbf
        La4:
            java.lang.String r1 = r0.f92832a     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r3 = r7.f93201g     // Catch: java.lang.Throwable -> Lbf
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> Lbf
            if (r1 == 0) goto Lbd
            boolean r1 = r0.f92837f     // Catch: java.lang.Throwable -> Lbf
            if (r1 != 0) goto Lbd
            r0.f92837f = r2     // Catch: java.lang.Throwable -> Lbf
            yads.he2 r1 = r7.f93199e     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r0 = r0.f92832a     // Catch: java.lang.Throwable -> Lbf
            yads.mm1 r1 = (yads.mm1) r1     // Catch: java.lang.Throwable -> Lbf
            r1.a(r8, r0)     // Catch: java.lang.Throwable -> Lbf
        Lbd:
            monitor-exit(r7)
            return
        Lbf:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.oe0.c(yads.ye):void");
    }
}
