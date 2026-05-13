package ep;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.Choreographer;
import ep.h;
import fp.k;
import java.util.LinkedList;
import jp.a;
import master.flame.danmaku.danmaku.model.android.DanmakuContext;
import tv.cjump.jni.DanDeviceUtils;

/* JADX INFO: compiled from: DrawHandler.java */
/* JADX INFO: loaded from: classes2.dex */
public class c extends Handler {
    public boolean A;
    public boolean B;
    public boolean C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DanmakuContext f61240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f61241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f61242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f61243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f61244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f61245f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f61246g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public fp.e f61247h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ip.a f61248i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h f61249j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g f61250k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f61251l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public fp.a f61252m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a.b f61253n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinkedList<Long> f61254o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public i f61255p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f61256q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f61257r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f61258s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f61259t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f61260u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f61261v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f61262w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f61263x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f61264y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f61265z;

    /* JADX INFO: compiled from: DrawHandler.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.f61242c = 0L;
            c.this.f61245f = true;
            if (c.this.f61246g != null) {
                c.this.f61246g.c();
            }
        }
    }

    /* JADX INFO: compiled from: DrawHandler.java */
    public class b extends i {
        public b(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            long jB = lp.b.b();
            while (!a() && !c.this.f61243d) {
                long jB2 = lp.b.b();
                if (c.this.f61259t - (lp.b.b() - jB) <= 1 || c.this.C) {
                    long jV = c.this.V(jB2);
                    if (jV >= 0 || c.this.C) {
                        long jC = c.this.f61250k.c();
                        if (jC > c.this.f61258s) {
                            c.this.f61247h.a(jC);
                            c.this.f61254o.clear();
                        }
                        if (!c.this.f61251l) {
                            c.this.a0(10000000L);
                        } else if (c.this.f61253n.f72527p && c.this.B) {
                            long j10 = c.this.f61253n.f72526o - c.this.f61247h.f61800a;
                            if (j10 > 500) {
                                c.this.H();
                                c.this.a0(j10 - 10);
                            }
                        }
                    } else {
                        lp.b.a(60 - jV);
                    }
                    jB = jB2;
                } else {
                    lp.b.a(1L);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ep.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DrawHandler.java */
    public class C0755c implements h.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f61268a;

        public C0755c(Runnable runnable) {
            this.f61268a = runnable;
        }

        @Override // ep.h.a
        public void a(fp.c cVar) {
            if (c.this.f61246g != null) {
                c.this.f61246g.b(cVar);
            }
        }

        @Override // ep.h.a
        public void b() {
            c.this.D();
            this.f61268a.run();
        }

        @Override // ep.h.a
        public void c(fp.c cVar) {
            if (cVar.v()) {
                return;
            }
            long jB = cVar.b() - c.this.A();
            if (jB < c.this.f61240a.f74049z.f62722f && (c.this.A || c.this.f61253n.f72527p)) {
                c.this.H();
            } else {
                if (jB <= 0 || jB > c.this.f61240a.f74049z.f62722f) {
                    return;
                }
                c.this.sendEmptyMessageDelayed(11, jB);
            }
        }

        @Override // ep.h.a
        public void d() {
            if (c.this.f61246g != null) {
                c.this.f61246g.a();
            }
        }

        @Override // ep.h.a
        public void e() {
            c.this.O();
        }
    }

    /* JADX INFO: compiled from: DrawHandler.java */
    public interface d {
        void a();

        void b(fp.c cVar);

        void c();

        void d(fp.e eVar);
    }

    /* JADX INFO: compiled from: DrawHandler.java */
    @TargetApi(16)
    public class e implements Choreographer.FrameCallback {
        public e() {
        }

        public /* synthetic */ e(c cVar, a aVar) {
            this();
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            c.this.sendEmptyMessage(2);
        }
    }

    public c(Looper looper, g gVar, boolean z10) {
        super(looper);
        this.f61242c = 0L;
        this.f61243d = true;
        this.f61247h = new fp.e();
        this.f61251l = true;
        this.f61253n = new a.b();
        this.f61254o = new LinkedList<>();
        this.f61257r = 30L;
        this.f61258s = 60L;
        this.f61259t = 16L;
        this.B = true ^ DanDeviceUtils.f();
        v(gVar);
        if (z10) {
            U(null);
        } else {
            C(false);
        }
        this.f61251l = z10;
    }

    public long A() {
        long jB;
        long j10;
        if (!this.f61245f) {
            return 0L;
        }
        if (this.f61262w) {
            return this.f61263x;
        }
        if (this.f61243d || !this.A) {
            jB = this.f61247h.f61800a;
            j10 = this.f61264y;
        } else {
            jB = lp.b.b();
            j10 = this.f61244e;
        }
        return jB - j10;
    }

    public k B() {
        h hVar = this.f61249j;
        if (hVar != null) {
            return hVar.b(A());
        }
        return null;
    }

    public long C(boolean z10) {
        if (!this.f61251l) {
            return this.f61247h.f61800a;
        }
        this.f61251l = false;
        removeMessages(8);
        removeMessages(9);
        obtainMessage(9, Boolean.valueOf(z10)).sendToTarget();
        return this.f61247h.f61800a;
    }

    public final void D() {
        long jMax = Math.max(33L, (long) (16 * 2.5f));
        this.f61257r = jMax;
        this.f61258s = (long) (jMax * 2.5f);
        long jMax2 = Math.max(16L, 15L);
        this.f61259t = jMax2;
        this.f61260u = jMax2 + 3;
    }

    public boolean E() {
        return this.f61245f;
    }

    public boolean F() {
        return this.f61243d;
    }

    public void G(int i10, int i11) {
        fp.a aVar = this.f61252m;
        if (aVar == null) {
            return;
        }
        if (aVar.getWidth() == i10 && this.f61252m.getHeight() == i11) {
            return;
        }
        this.f61252m.o(i10, i11);
        obtainMessage(10, Boolean.TRUE).sendToTarget();
    }

    public final void H() {
        if (this.A) {
            h hVar = this.f61249j;
            if (hVar != null) {
                hVar.g();
            }
            if (this.f61256q) {
                synchronized (this) {
                    this.f61254o.clear();
                }
                synchronized (this.f61249j) {
                    this.f61249j.notifyAll();
                }
            } else {
                this.f61254o.clear();
                removeMessages(2);
                sendEmptyMessage(2);
            }
            this.A = false;
        }
    }

    public void I() {
        removeMessages(3);
        W();
        sendEmptyMessage(7);
    }

    public void J() {
        this.f61245f = false;
        if (this.f61240a.B == 0) {
            this.f61241b = new e(this, null);
        }
        this.f61256q = this.f61240a.B == 1;
        sendEmptyMessage(5);
    }

    public final void K(Runnable runnable) {
        if (this.f61249j == null) {
            this.f61249j = w(this.f61250k.f(), this.f61247h, this.f61250k.getContext(), this.f61250k.getViewWidth(), this.f61250k.getViewHeight(), this.f61250k.isHardwareAccelerated(), new C0755c(runnable));
        } else {
            runnable.run();
        }
    }

    public void L() {
        this.f61243d = true;
        sendEmptyMessage(6);
    }

    public final synchronized void M() {
        i iVar = this.f61255p;
        this.f61255p = null;
        if (iVar != null) {
            synchronized (this.f61249j) {
                this.f61249j.notifyAll();
            }
            iVar.b();
            try {
                iVar.join(2000L);
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
        }
    }

    public final synchronized void N() {
        this.f61254o.addLast(Long.valueOf(lp.b.b()));
        if (this.f61254o.size() > 500) {
            this.f61254o.removeFirst();
        }
    }

    public final void O() {
        if (this.f61243d && this.f61251l) {
            removeMessages(12);
            sendEmptyMessageDelayed(12, 100L);
        }
    }

    public void P() {
        removeMessages(7);
        sendEmptyMessage(3);
    }

    public void Q(Long l10) {
        this.f61262w = true;
        this.f61263x = l10.longValue();
        removeMessages(2);
        removeMessages(3);
        removeMessages(4);
        obtainMessage(4, l10).sendToTarget();
    }

    public void R(d dVar) {
        this.f61246g = dVar;
    }

    public void S(DanmakuContext danmakuContext) {
        this.f61240a = danmakuContext;
    }

    public void T(ip.a aVar) {
        this.f61248i = aVar;
        fp.e eVarC = aVar.c();
        if (eVarC != null) {
            this.f61247h = eVarC;
        }
    }

    public void U(Long l10) {
        if (this.f61251l) {
            return;
        }
        this.f61251l = true;
        removeMessages(8);
        removeMessages(9);
        obtainMessage(8, l10).sendToTarget();
    }

    public final long V(long j10) {
        long jB = 0;
        if (!this.f61262w && !this.f61265z) {
            this.f61265z = true;
            long j11 = j10 - this.f61244e;
            if (this.C) {
                d dVar = this.f61246g;
                if (dVar != null) {
                    dVar.d(this.f61247h);
                    jB = this.f61247h.b();
                }
            } else if (!this.f61251l || this.f61253n.f72527p || this.A) {
                this.f61247h.update(j11);
                this.f61264y = 0L;
                d dVar2 = this.f61246g;
                if (dVar2 != null) {
                    dVar2.d(this.f61247h);
                }
            } else {
                long j12 = j11 - this.f61247h.f61800a;
                long jMax = Math.max(this.f61259t, y());
                if (j12 <= 2000) {
                    long j13 = this.f61253n.f72524m;
                    long j14 = this.f61257r;
                    if (j13 <= j14 && jMax <= j14) {
                        long j15 = this.f61259t;
                        long jMin = Math.min(this.f61257r, Math.max(j15, jMax + (j12 / j15)));
                        long j16 = this.f61261v;
                        long j17 = jMin - j16;
                        if (j17 > 3 && j17 < 8 && j16 >= this.f61259t && j16 <= this.f61257r) {
                            jMin = j16;
                        }
                        long j18 = j12 - jMin;
                        this.f61261v = jMin;
                        j12 = jMin;
                        jB = j18;
                    }
                }
                this.f61264y = jB;
                this.f61247h.a(j12);
                d dVar3 = this.f61246g;
                if (dVar3 != null) {
                    dVar3.d(this.f61247h);
                }
                jB = j12;
            }
            this.f61265z = false;
        }
        return jB;
    }

    public final void W() {
        if (this.A) {
            V(lp.b.b());
        }
    }

    @TargetApi(16)
    public final void X() {
        if (this.f61243d) {
            return;
        }
        Choreographer.getInstance().postFrameCallback(this.f61241b);
        if (V(lp.b.b()) < 0) {
            removeMessages(2);
            return;
        }
        long jC = this.f61250k.c();
        removeMessages(2);
        if (jC > this.f61258s) {
            this.f61247h.a(jC);
            this.f61254o.clear();
        }
        if (!this.f61251l) {
            a0(10000000L);
            return;
        }
        a.b bVar = this.f61253n;
        if (bVar.f72527p && this.B) {
            long j10 = bVar.f72526o - this.f61247h.f61800a;
            if (j10 > 500) {
                a0(j10 - 10);
            }
        }
    }

    public final void Y() {
        if (this.f61243d) {
            return;
        }
        long jV = V(lp.b.b());
        if (jV < 0 && !this.C) {
            removeMessages(2);
            sendEmptyMessageDelayed(2, 60 - jV);
            return;
        }
        long jC = this.f61250k.c();
        removeMessages(2);
        if (jC > this.f61258s) {
            this.f61247h.a(jC);
            this.f61254o.clear();
        }
        if (!this.f61251l) {
            a0(10000000L);
            return;
        }
        a.b bVar = this.f61253n;
        if (bVar.f72527p && this.B) {
            long j10 = bVar.f72526o - this.f61247h.f61800a;
            if (j10 > 500) {
                a0(j10 - 10);
                return;
            }
        }
        long j11 = this.f61259t;
        if (jC < j11) {
            sendEmptyMessageDelayed(2, j11 - jC);
        } else {
            sendEmptyMessage(2);
        }
    }

    public final void Z() {
        if (this.f61255p != null) {
            return;
        }
        b bVar = new b("DFM Update");
        this.f61255p = bVar;
        bVar.start();
    }

    public final void a0(long j10) {
        if (F() || !E() || this.f61262w) {
            return;
        }
        this.f61253n.f72528q = lp.b.b();
        this.A = true;
        if (!this.f61256q) {
            if (j10 == 10000000) {
                removeMessages(11);
                removeMessages(2);
                return;
            } else {
                removeMessages(11);
                removeMessages(2);
                sendEmptyMessageDelayed(11, j10);
                return;
            }
        }
        if (this.f61255p == null) {
            return;
        }
        try {
            synchronized (this.f61249j) {
                if (j10 == 10000000) {
                    this.f61249j.wait();
                } else {
                    this.f61249j.wait(j10);
                }
                sendEmptyMessage(11);
            }
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01bf  */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handleMessage(android.os.Message r12) {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ep.c.handleMessage(android.os.Message):void");
    }

    public void u(fp.c cVar) {
        if (this.f61249j != null) {
            cVar.H = this.f61240a.f74047x;
            cVar.B(this.f61247h);
            this.f61249j.a(cVar);
            obtainMessage(11).sendToTarget();
        }
    }

    public final void v(g gVar) {
        this.f61250k = gVar;
    }

    public final h w(boolean z10, fp.e eVar, Context context, int i10, int i11, boolean z11, h.a aVar) {
        fp.a aVarB = this.f61240a.b();
        this.f61252m = aVarB;
        aVarB.o(i10, i11);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f61252m.c(displayMetrics.density, displayMetrics.densityDpi, displayMetrics.scaledDensity);
        this.f61252m.a(this.f61240a.f74027d);
        this.f61252m.j(z11);
        h aVar2 = z10 ? new ep.a(eVar, this.f61240a, aVar) : new ep.e(eVar, this.f61240a, aVar);
        aVar2.e(this.f61248i);
        aVar2.prepare();
        obtainMessage(10, Boolean.FALSE).sendToTarget();
        return aVar2;
    }

    public a.b x(Canvas canvas) {
        if (this.f61249j == null) {
            return this.f61253n;
        }
        if (!this.A) {
            this.f61240a.getClass();
        }
        this.f61252m.u(canvas);
        this.f61253n.e(this.f61249j.c(this.f61252m));
        N();
        return this.f61253n;
    }

    public final synchronized long y() {
        int size = this.f61254o.size();
        if (size <= 0) {
            return 0L;
        }
        Long lPeekFirst = this.f61254o.peekFirst();
        Long lPeekLast = this.f61254o.peekLast();
        if (lPeekFirst != null && lPeekLast != null) {
            return (lPeekLast.longValue() - lPeekFirst.longValue()) / ((long) size);
        }
        return 0L;
    }

    public DanmakuContext z() {
        return this.f61240a;
    }
}
