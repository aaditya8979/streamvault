package mq;

import java.io.IOException;
import javax.servlet.ServletException;
import mq.c;
import org.eclipse.jetty.util.LazyList;
import org.eclipse.jetty.util.MultiException;

/* JADX INFO: compiled from: Server.java */
/* JADX INFO: loaded from: classes12.dex */
public class p extends oq.g implements sq.b {
    public static final vq.c C = vq.b.a(p.class);
    public static final String D;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ar.d f74980s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public f[] f74981t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public s f74982u;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f74986y;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final uq.c f74978q = new uq.c();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final sq.c f74979r = new sq.c();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f74983v = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f74984w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f74985x = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f74987z = false;
    public boolean A = false;
    public boolean B = false;

    /* JADX INFO: compiled from: Server.java */
    public interface a extends i {
        void r(boolean z10);
    }

    static {
        if (p.class.getPackage() == null || !"Eclipse.org - Jetty".equals(p.class.getPackage().getImplementationVendor()) || p.class.getPackage().getImplementationVersion() == null) {
            D = System.getProperty("jetty.version", "8.y.z-SNAPSHOT");
        } else {
            D = p.class.getPackage().getImplementationVersion();
        }
    }

    public p() {
        f(this);
    }

    public static String K0() {
        return D;
    }

    public void C0(f fVar) {
        R0((f[]) LazyList.addToArray(D0(), fVar, f.class));
    }

    public f[] D0() {
        return this.f74981t;
    }

    public uq.c E0() {
        return this.f74978q;
    }

    public boolean F0() {
        return this.f74984w;
    }

    public boolean G0() {
        return this.f74983v;
    }

    public s H0() {
        return this.f74982u;
    }

    public boolean I0() {
        return this.f74986y;
    }

    public ar.d J0() {
        return this.f74980s;
    }

    public void L0(b bVar) throws ServletException, IOException {
        String strL = bVar.x().l();
        n nVarX = bVar.x();
        o oVarB = bVar.B();
        vq.c cVar = C;
        if (!cVar.isDebugEnabled()) {
            a0(strL, nVarX, nVarX, oVarB);
            return;
        }
        cVar.h("REQUEST " + strL + " on " + bVar, new Object[0]);
        a0(strL, nVarX, nVarX, oVarB);
        cVar.h("RESPONSE " + strL + "  " + bVar.B().w() + " handled=" + nVarX.X(), new Object[0]);
    }

    public void M0(b bVar) throws ServletException, IOException {
        c cVarY = bVar.x().y();
        c.a aVarJ = cVarY.j();
        n nVarX = bVar.x();
        String strG = aVarJ.g();
        if (strG != null) {
            gq.n nVar = new gq.n(sq.q.a(aVarJ.h().e(), strG));
            nVarX.F0(nVar);
            nVarX.v0(null);
            nVarX.p0(nVarX.v());
            if (nVar.k() != null) {
                nVarX.Z(nVar.k());
            }
        }
        String strL = nVarX.l();
        an.a aVar = (an.a) cVarY.l();
        an.c cVar = (an.c) cVarY.getResponse();
        vq.c cVar2 = C;
        if (!cVar2.isDebugEnabled()) {
            a0(strL, nVarX, aVar, cVar);
            return;
        }
        cVar2.h("REQUEST " + strL + " on " + bVar, new Object[0]);
        a0(strL, nVarX, aVar, cVar);
        cVar2.h("RESPONSE " + strL + "  " + bVar.B().w(), new Object[0]);
    }

    public boolean N0() {
        return this.f74987z;
    }

    public boolean O0() {
        return this.A;
    }

    public boolean P0() {
        return this.B;
    }

    public void Q0(f fVar) {
        R0((f[]) LazyList.removeFromArray(D0(), fVar));
    }

    public void R0(f[] fVarArr) {
        if (fVarArr != null) {
            for (f fVar : fVarArr) {
                fVar.f(this);
            }
        }
        this.f74978q.update((Object) this, (Object[]) this.f74981t, (Object[]) fVarArr, "connector");
        this.f74981t = fVarArr;
    }

    public void S0(int i10) {
        this.f74985x = i10;
    }

    public void T0(s sVar) {
        s sVar2 = this.f74982u;
        if (sVar2 != null) {
            w0(sVar2);
        }
        this.f74978q.update((Object) this, (Object) this.f74982u, (Object) sVar, "sessionIdManager", false);
        this.f74982u = sVar;
        if (sVar != null) {
            m0(sVar);
        }
    }

    public void U0(ar.d dVar) {
        ar.d dVar2 = this.f74980s;
        if (dVar2 != null) {
            w0(dVar2);
        }
        this.f74978q.update((Object) this, (Object) this.f74980s, (Object) dVar, "threadpool", false);
        this.f74980s = dVar;
        if (dVar != null) {
            m0(dVar);
        }
    }

    @Override // sq.b
    public void a(String str, Object obj) {
        this.f74979r.a(str, obj);
    }

    @Override // oq.g, oq.a, uq.b, uq.a
    public void d0() throws Exception {
        int i10 = 0;
        if (I0()) {
            ar.c.d(this);
        }
        u.q().r();
        vq.c cVar = C;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("jetty-");
        String str = D;
        sb2.append(str);
        cVar.i(sb2.toString(), new Object[0]);
        org.eclipse.jetty.http.b.I(str);
        MultiException multiException = new MultiException();
        if (this.f74980s == null) {
            U0(new ar.b());
        }
        try {
            super.d0();
        } catch (Throwable th2) {
            multiException.add(th2);
        }
        if (this.f74981t != null && multiException.size() == 0) {
            while (true) {
                f[] fVarArr = this.f74981t;
                if (i10 >= fVarArr.length) {
                    break;
                }
                try {
                    fVarArr[i10].start();
                } catch (Throwable th3) {
                    multiException.add(th3);
                }
                i10++;
            }
        }
        if (N0()) {
            r0();
        }
        multiException.ifExceptionThrow();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(1:4)|5|(6:7|(2:9|(2:10|(5:12|41|13|49|17)(1:47)))(0)|18|(2:21|19)|50|22)|23|(5:25|(2:26|(4:45|28|52|32)(0))|33|37|(2:39|40)(1:53))(0)|43|33|37|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0078, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0079, code lost:
    
        r0.add(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    @Override // oq.g, oq.a, uq.b, uq.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e0() throws java.lang.Exception {
        /*
            r9 = this;
            boolean r0 = r9.O0()
            if (r0 == 0) goto L9
            r9.r0()
        L9:
            org.eclipse.jetty.util.MultiException r0 = new org.eclipse.jetty.util.MultiException
            r0.<init>()
            int r1 = r9.f74985x
            if (r1 <= 0) goto L5d
            mq.f[] r1 = r9.f74981t
            java.lang.String r2 = "Graceful shutdown {}"
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L3a
            int r1 = r1.length
        L1b:
            int r5 = r1 + (-1)
            if (r1 <= 0) goto L3a
            vq.c r1 = mq.p.C
            java.lang.Object[] r6 = new java.lang.Object[r4]
            mq.f[] r7 = r9.f74981t
            r7 = r7[r5]
            r6[r3] = r7
            r1.i(r2, r6)
            mq.f[] r1 = r9.f74981t     // Catch: java.lang.Throwable -> L34
            r1 = r1[r5]     // Catch: java.lang.Throwable -> L34
            r1.close()     // Catch: java.lang.Throwable -> L34
            goto L38
        L34:
            r1 = move-exception
            r0.add(r1)
        L38:
            r1 = r5
            goto L1b
        L3a:
            java.lang.Class<mq.p$a> r1 = mq.p.a.class
            mq.i[] r1 = r9.U(r1)
            r5 = r3
        L41:
            int r6 = r1.length
            if (r5 >= r6) goto L57
            r6 = r1[r5]
            mq.p$a r6 = (mq.p.a) r6
            vq.c r7 = mq.p.C
            java.lang.Object[] r8 = new java.lang.Object[r4]
            r8[r3] = r6
            r7.i(r2, r8)
            r6.r(r4)
            int r5 = r5 + 1
            goto L41
        L57:
            int r1 = r9.f74985x
            long r1 = (long) r1
            java.lang.Thread.sleep(r1)
        L5d:
            mq.f[] r1 = r9.f74981t
            if (r1 == 0) goto L74
            int r1 = r1.length
        L62:
            int r2 = r1 + (-1)
            if (r1 <= 0) goto L74
            mq.f[] r1 = r9.f74981t     // Catch: java.lang.Throwable -> L6e
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L6e
            r1.stop()     // Catch: java.lang.Throwable -> L6e
            goto L72
        L6e:
            r1 = move-exception
            r0.add(r1)
        L72:
            r1 = r2
            goto L62
        L74:
            super.e0()     // Catch: java.lang.Throwable -> L78
            goto L7c
        L78:
            r1 = move-exception
            r0.add(r1)
        L7c:
            r0.ifExceptionThrow()
            boolean r0 = r9.I0()
            if (r0 == 0) goto L88
            ar.c.a(r9)
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mq.p.e0():void");
    }

    @Override // sq.b
    public Object getAttribute(String str) {
        return this.f74979r.getAttribute(str);
    }

    @Override // uq.b
    public boolean m0(Object obj) {
        if (!super.m0(obj)) {
            return false;
        }
        this.f74978q.b(obj);
        return true;
    }

    @Override // sq.b
    public void removeAttribute(String str) {
        this.f74979r.removeAttribute(str);
    }

    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    @Override // sq.b
    public void u() {
        this.f74979r.u();
    }

    @Override // oq.b, uq.b, uq.e
    public void w(Appendable appendable, String str) throws IOException {
        s0(appendable);
        uq.b.p0(appendable, str, sq.p.a(N()), u0(), sq.p.a(this.f74981t));
    }

    @Override // uq.b
    public boolean w0(Object obj) {
        if (!super.w0(obj)) {
            return false;
        }
        this.f74978q.d(obj);
        return true;
    }
}
