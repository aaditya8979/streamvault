package ep;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import ep.h;
import fp.j;
import fp.k;
import fp.m;
import jp.a;
import master.flame.danmaku.danmaku.model.android.DanmakuContext;
import tv.cjump.jni.NativeBitmapFactory;

/* JADX INFO: compiled from: CacheManagingDrawTask.java */
/* JADX INFO: loaded from: classes.dex */
public class a extends e {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f61175v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public b f61176w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public fp.e f61177x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f61178y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f61179z;

    /* JADX INFO: renamed from: ep.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CacheManagingDrawTask.java */
    public class RunnableC0749a implements Runnable {
        public RunnableC0749a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f61280e.e();
        }
    }

    /* JADX INFO: compiled from: CacheManagingDrawTask.java */
    public class b implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public HandlerThread f61181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public gp.e f61182b = new gp.e();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public gp.h f61183c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public hp.b<gp.f> f61184d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f61185e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f61186f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f61187g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public f f61188h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f61189i;

        /* JADX INFO: renamed from: ep.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CacheManagingDrawTask.java */
        public class C0750a extends k.c<fp.c> {
            public C0750a() {
            }

            @Override // fp.k.b
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int a(fp.c cVar) {
                b.this.t(true, cVar, null);
                return 0;
            }
        }

        /* JADX INFO: renamed from: ep.a$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CacheManagingDrawTask.java */
        public class C0751b extends k.c<fp.c> {
            public C0751b() {
            }

            @Override // fp.k.b
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int a(fp.c cVar) {
                if (!cVar.r()) {
                    return 0;
                }
                b.this.t(true, cVar, null);
                return 2;
            }
        }

        /* JADX INFO: compiled from: CacheManagingDrawTask.java */
        public class c extends k.c<fp.c> {
            public c() {
            }

            @Override // fp.k.b
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int a(fp.c cVar) {
                if (!cVar.v()) {
                    return 1;
                }
                m<?> mVar = cVar.f61797x;
                if (a.this.f61276a.A.f62712c == -1 && mVar != null && !mVar.hasReferences() && mVar.size() / a.this.f61175v < a.this.f61276a.A.f62713d) {
                    return 0;
                }
                if (!b.this.f61189i) {
                    synchronized (a.this.f61178y) {
                        try {
                            try {
                                a.this.f61178y.wait(30L);
                            } catch (InterruptedException e10) {
                                e10.printStackTrace();
                                return 1;
                            }
                        } finally {
                        }
                    }
                }
                b.this.t(false, cVar, null);
                return 2;
            }
        }

        /* JADX INFO: compiled from: CacheManagingDrawTask.java */
        public class d extends k.b<fp.c, fp.c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f61194a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public fp.c f61195b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f61196c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ fp.c f61197d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ boolean f61198e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ int f61199f;

            public d(int i10, fp.c cVar, boolean z10, int i11) {
                this.f61196c = i10;
                this.f61197d = cVar;
                this.f61198e = z10;
                this.f61199f = i11;
            }

            @Override // fp.k.b
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int a(fp.c cVar) {
                int i10 = this.f61194a;
                this.f61194a = i10 + 1;
                if (i10 >= this.f61196c) {
                    return 1;
                }
                m<?> mVarE = cVar.e();
                if (mVarE != null && mVarE.get() != null) {
                    float f10 = cVar.f61788o;
                    fp.c cVar2 = this.f61197d;
                    if (f10 == cVar2.f61788o && cVar.f61789p == cVar2.f61789p && cVar.f61783j == cVar2.f61783j && cVar.f61785l == cVar2.f61785l && cVar.f61779f == cVar2.f61779f && cVar.f61776c.equals(cVar2.f61776c) && cVar.f61778e == this.f61197d.f61778e) {
                        this.f61195b = cVar;
                        return 1;
                    }
                    if (this.f61198e) {
                        return 0;
                    }
                    if (!cVar.v()) {
                        return 1;
                    }
                    if (mVarE.hasReferences()) {
                        return 0;
                    }
                    float fWidth = mVarE.width() - this.f61197d.f61788o;
                    float fA = mVarE.a() - this.f61197d.f61789p;
                    if (fWidth >= 0.0f) {
                        int i11 = this.f61199f;
                        if (fWidth <= i11 && fA >= 0.0f && fA <= i11) {
                            this.f61195b = cVar;
                            return 1;
                        }
                    }
                }
                return 0;
            }

            @Override // fp.k.b
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public fp.c d() {
                return this.f61195b;
            }
        }

        /* JADX INFO: compiled from: CacheManagingDrawTask.java */
        public class e extends k.c<fp.c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f61201a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ boolean f61202b;

            public e(int i10, boolean z10) {
                this.f61201a = i10;
                this.f61202b = z10;
            }

            @Override // fp.k.b
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int a(fp.c cVar) {
                if (b.this.f61189i || b.this.f61186f + this.f61201a <= b.this.f61185e) {
                    return 1;
                }
                if (!cVar.v() && !cVar.n()) {
                    return this.f61202b ? 1 : 0;
                }
                b.this.t(false, cVar, null);
                return 2;
            }
        }

        /* JADX INFO: compiled from: CacheManagingDrawTask.java */
        public class f extends Handler {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f61204a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f61205b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f61206c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f61207d;

            /* JADX INFO: renamed from: ep.a$b$f$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: CacheManagingDrawTask.java */
            public class C0752a extends k.c<fp.c> {
                public C0752a() {
                }

                @Override // fp.k.b
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public int a(fp.c cVar) {
                    if (f.this.f61204a || f.this.f61207d) {
                        return 1;
                    }
                    if (!cVar.m()) {
                        DanmakuContext danmakuContext = a.this.f61276a;
                        danmakuContext.f74048y.b(cVar, 0, 0, null, true, danmakuContext);
                    }
                    if (cVar.n()) {
                        return 0;
                    }
                    if (!cVar.p()) {
                        cVar.y(a.this.f61277b, true);
                    }
                    if (!cVar.t()) {
                        cVar.z(a.this.f61277b, true);
                    }
                    return 0;
                }
            }

            /* JADX INFO: renamed from: ep.a$b$f$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: CacheManagingDrawTask.java */
            public class C0753b extends k.c<fp.c> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f61210a = 0;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f61211b = 0;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ fp.c f61212c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f61213d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ int f61214e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ long f61215f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ long f61216g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ long f61217h;

                public C0753b(fp.c cVar, boolean z10, int i10, long j10, long j11, long j12) {
                    this.f61212c = cVar;
                    this.f61213d = z10;
                    this.f61214e = i10;
                    this.f61215f = j10;
                    this.f61216g = j11;
                    this.f61217h = j12;
                }

                @Override // fp.k.b
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public int a(fp.c cVar) {
                    if (f.this.f61204a || f.this.f61207d || this.f61212c.b() < a.this.f61282g.f61800a) {
                        return 1;
                    }
                    m<?> mVarE = cVar.e();
                    if (mVarE != null && mVarE.get() != null) {
                        return 0;
                    }
                    if (!this.f61213d && (cVar.v() || !cVar.r())) {
                        return 0;
                    }
                    if (!cVar.m()) {
                        DanmakuContext danmakuContext = a.this.f61276a;
                        danmakuContext.f74048y.b(cVar, this.f61210a, this.f61214e, null, true, danmakuContext);
                    }
                    if (cVar.f61787n == 0 && cVar.n()) {
                        return 0;
                    }
                    if (cVar.getType() == 1) {
                        int iB = (int) ((cVar.b() - this.f61215f) / a.this.f61276a.f74049z.f62722f);
                        if (this.f61211b == iB) {
                            this.f61210a++;
                        } else {
                            this.f61210a = 0;
                            this.f61211b = iB;
                        }
                    }
                    if (!this.f61213d && !f.this.f61205b) {
                        try {
                            synchronized (a.this.f61178y) {
                                a.this.f61178y.wait(this.f61216g);
                            }
                        } catch (InterruptedException e10) {
                            e10.printStackTrace();
                            return 1;
                        }
                    }
                    f.this.g(cVar, false);
                    if (!this.f61213d) {
                        long jB = lp.b.b() - this.f61217h;
                        b bVar = b.this;
                        gp.d dVar = a.this.f61276a.f74049z;
                        if (jB >= ((long) bVar.f61187g) * 3800) {
                            return 1;
                        }
                    }
                    return 0;
                }
            }

            public f(Looper looper) {
                super(looper);
            }

            public final void e(fp.c cVar) {
                if (cVar.v()) {
                    return;
                }
                if (cVar.b() <= a.this.f61177x.f61800a + a.this.f61276a.f74049z.f62722f || cVar.f61798y) {
                    if (cVar.f61787n == 0 && cVar.n()) {
                        return;
                    }
                    m<?> mVarE = cVar.e();
                    if (mVarE == null || mVarE.get() == null) {
                        g(cVar, true);
                    }
                }
            }

            public void f() {
                sendEmptyMessage(1);
                sendEmptyMessageDelayed(4, a.this.f61276a.f74049z.f62722f);
            }

            public final byte g(fp.c cVar, boolean z10) {
                gp.f fVar;
                if (!cVar.p()) {
                    cVar.y(a.this.f61277b, true);
                }
                gp.f fVar2 = null;
                try {
                    b bVar = b.this;
                    fp.c cVarW = bVar.w(cVar, true, a.this.f61276a.A.f62715f);
                    fVar = cVarW != null ? (gp.f) cVarW.f61797x : null;
                } catch (Exception unused) {
                } catch (OutOfMemoryError unused2) {
                }
                try {
                    if (fVar != null) {
                        fVar.j();
                        cVar.f61797x = fVar;
                        a.this.f61176w.B(cVar, 0, z10);
                        return (byte) 0;
                    }
                    b bVar2 = b.this;
                    fp.c cVarW2 = bVar2.w(cVar, false, a.this.f61276a.A.f62716g);
                    if (cVarW2 != null) {
                        fVar = (gp.f) cVarW2.f61797x;
                    }
                    if (fVar != null) {
                        cVarW2.f61797x = null;
                        a aVar = a.this;
                        cVar.f61797x = lp.a.a(cVar, aVar.f61277b, fVar, aVar.f61276a.A.f62710a);
                        a.this.f61176w.B(cVar, 0, z10);
                        return (byte) 0;
                    }
                    int iF = lp.a.f((int) cVar.f61788o, (int) cVar.f61789p, a.this.f61276a.A.f62710a / 8);
                    if (iF * 2 > a.this.f61175v) {
                        return (byte) 1;
                    }
                    if (!z10 && b.this.f61186f + iF > b.this.f61185e) {
                        a.this.f61176w.q(iF, false);
                        return (byte) 1;
                    }
                    gp.f fVar3 = (gp.f) b.this.f61184d.acquire();
                    a aVar2 = a.this;
                    gp.f fVarA = lp.a.a(cVar, aVar2.f61277b, fVar3, aVar2.f61276a.A.f62710a);
                    cVar.f61797x = fVarA;
                    boolean zB = a.this.f61176w.B(cVar, b.this.I(cVar), z10);
                    if (!zB) {
                        n(cVar, fVarA);
                    }
                    return !zB ? (byte) 1 : (byte) 0;
                } catch (Exception unused3) {
                    fVar2 = fVar;
                    n(cVar, fVar2);
                    return (byte) 1;
                } catch (OutOfMemoryError unused4) {
                    fVar2 = fVar;
                    n(cVar, fVar2);
                    return (byte) 1;
                }
            }

            public boolean h(fp.c cVar) {
                gp.f fVarA;
                if (!cVar.p()) {
                    cVar.y(a.this.f61277b, true);
                }
                try {
                    fVarA = (gp.f) b.this.f61184d.acquire();
                    try {
                        a aVar = a.this;
                        fVarA = lp.a.a(cVar, aVar.f61277b, fVarA, aVar.f61276a.A.f62710a);
                        cVar.f61797x = fVarA;
                        return true;
                    } catch (Exception unused) {
                        if (fVarA != null) {
                            b.this.f61184d.a(fVarA);
                        }
                        cVar.f61797x = null;
                        return false;
                    } catch (OutOfMemoryError unused2) {
                        if (fVarA != null) {
                            b.this.f61184d.a(fVarA);
                        }
                        cVar.f61797x = null;
                        return false;
                    }
                } catch (Exception unused3) {
                    fVarA = null;
                } catch (OutOfMemoryError unused4) {
                    fVarA = null;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:41:0x0127  */
            @Override // android.os.Handler
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void handleMessage(android.os.Message r9) {
                /*
                    Method dump skipped, instruction units count: 460
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ep.a.b.f.handleMessage(android.os.Message):void");
            }

            public final long i() {
                long j10 = a.this.f61177x.f61800a;
                b bVar = b.this;
                a aVar = a.this;
                long j11 = aVar.f61282g.f61800a;
                DanmakuContext danmakuContext = aVar.f61276a;
                if (j10 <= j11 - danmakuContext.f74049z.f62722f) {
                    if (danmakuContext.A.f62712c != -1) {
                        bVar.v();
                    }
                    a.this.f61177x.update(a.this.f61282g.f61800a);
                    sendEmptyMessage(3);
                    return 0L;
                }
                float fY = bVar.y();
                fp.c cVarFirst = b.this.f61182b.first();
                long jB = cVarFirst != null ? cVarFirst.b() - a.this.f61282g.f61800a : 0L;
                a aVar2 = a.this;
                long j12 = aVar2.f61276a.f74049z.f62722f;
                long j13 = 2 * j12;
                if (fY < 0.6f && jB > j12) {
                    aVar2.f61177x.update(a.this.f61282g.f61800a);
                    removeMessages(3);
                    sendEmptyMessage(3);
                    return 0L;
                }
                if (fY > 0.4f && jB < (-j13)) {
                    removeMessages(4);
                    sendEmptyMessage(4);
                    return 0L;
                }
                if (fY >= 0.9f) {
                    return 0L;
                }
                long j14 = aVar2.f61177x.f61800a - a.this.f61282g.f61800a;
                if (cVarFirst != null && cVarFirst.v()) {
                    a aVar3 = a.this;
                    if (j14 < (-aVar3.f61276a.f74049z.f62722f)) {
                        aVar3.f61177x.update(a.this.f61282g.f61800a);
                        sendEmptyMessage(8);
                        sendEmptyMessage(3);
                        return 0L;
                    }
                }
                if (j14 > j13) {
                    return 0L;
                }
                removeMessages(3);
                sendEmptyMessage(3);
                return 0L;
            }

            public void j(boolean z10) {
                this.f61205b = !z10;
            }

            public void k() {
                this.f61204a = true;
                sendEmptyMessage(6);
            }

            public final void l() {
                k kVarE;
                try {
                    a aVar = a.this;
                    long j10 = aVar.f61282g.f61800a;
                    long j11 = aVar.f61276a.f74049z.f62722f;
                    kVarE = aVar.f61278c.e(j10 - j11, (2 * j11) + j10);
                } catch (Exception unused) {
                    kVarE = null;
                }
                if (kVarE == null || kVarE.isEmpty()) {
                    return;
                }
                kVarE.g(new C0752a());
            }

            public final long m(boolean z10) {
                k kVarE;
                boolean z11;
                l();
                long j10 = a.this.f61177x.f61800a - 30;
                b bVar = b.this;
                long j11 = j10 + (a.this.f61276a.f74049z.f62722f * ((long) bVar.f61187g));
                if (j11 < a.this.f61282g.f61800a) {
                    return 0L;
                }
                long jB = lp.b.b();
                k kVar = null;
                int i10 = 0;
                boolean z12 = false;
                while (true) {
                    try {
                        boolean z13 = z12;
                        kVarE = a.this.f61278c.e(j10, j11);
                        z11 = z13;
                    } catch (Exception unused) {
                        lp.b.a(10L);
                        kVarE = kVar;
                        z11 = true;
                    }
                    i10++;
                    if (i10 >= 3 || kVarE != null || !z11) {
                        break;
                    }
                    k kVar2 = kVarE;
                    z12 = z11;
                    kVar = kVar2;
                }
                if (kVarE == null) {
                    a.this.f61177x.update(j11);
                    return 0L;
                }
                fp.c cVarFirst = kVarE.first();
                fp.c cVarLast = kVarE.last();
                if (cVarFirst == null || cVarLast == null) {
                    a.this.f61177x.update(j11);
                    return 0L;
                }
                long jB2 = cVarFirst.b();
                a aVar = a.this;
                long j12 = jB2 - aVar.f61282g.f61800a;
                kVarE.g(new C0753b(cVarLast, z10, kVarE.size(), j10, z10 ? 0L : Math.min(100L, j12 < 0 ? 30L : ((j12 * 10) / aVar.f61276a.f74049z.f62722f) + 30), jB));
                long jB3 = lp.b.b() - jB;
                a.this.f61177x.update(j11);
                return jB3;
            }

            public final void n(fp.c cVar, gp.f fVar) {
                if (fVar == null) {
                    fVar = (gp.f) cVar.f61797x;
                }
                cVar.f61797x = null;
                if (fVar == null) {
                    return;
                }
                fVar.destroy();
                b.this.f61184d.a(fVar);
            }

            public void o(long j10) {
                removeMessages(3);
                this.f61206c = true;
                sendEmptyMessage(18);
                a.this.f61177x.update(a.this.f61282g.f61800a + j10);
                sendEmptyMessage(3);
            }

            public void p() {
                this.f61207d = true;
            }

            public void q() {
                sendEmptyMessage(18);
                this.f61204a = false;
                removeMessages(16);
                sendEmptyMessage(16);
                sendEmptyMessageDelayed(4, a.this.f61276a.f74049z.f62722f);
            }
        }

        public b(int i10, int i11) {
            gp.h hVar = new gp.h();
            this.f61183c = hVar;
            this.f61184d = hp.e.a(hVar, 800);
            this.f61189i = false;
            this.f61186f = 0;
            this.f61185e = i10;
            this.f61187g = i11;
        }

        public void A(Runnable runnable) {
            f fVar = this.f61188h;
            if (fVar == null) {
                return;
            }
            fVar.post(runnable);
        }

        public final boolean B(fp.c cVar, int i10, boolean z10) {
            if (i10 > 0) {
                q(i10, z10);
            }
            this.f61182b.c(cVar);
            this.f61186f += i10;
            return true;
        }

        public void C(long j10) {
            f fVar = this.f61188h;
            if (fVar != null) {
                fVar.o(j10);
            }
        }

        public void D() {
            f fVar = this.f61188h;
            if (fVar == null) {
                return;
            }
            fVar.removeMessages(3);
            this.f61188h.removeMessages(18);
            this.f61188h.p();
            this.f61188h.removeMessages(7);
            this.f61188h.sendEmptyMessage(7);
        }

        public void E() {
            f fVar = this.f61188h;
            if (fVar == null) {
                return;
            }
            fVar.removeMessages(4);
            this.f61188h.sendEmptyMessage(4);
        }

        public void F() {
            f fVar = this.f61188h;
            if (fVar == null) {
                return;
            }
            fVar.removeMessages(9);
            this.f61188h.sendEmptyMessage(9);
        }

        public void G() {
            f fVar = this.f61188h;
            if (fVar != null) {
                fVar.q();
            } else {
                n();
            }
        }

        public void H(long j10) {
            f fVar = this.f61188h;
            if (fVar == null) {
                return;
            }
            fVar.p();
            this.f61188h.removeMessages(3);
            this.f61188h.obtainMessage(5, Long.valueOf(j10)).sendToTarget();
        }

        public int I(fp.c cVar) {
            m<?> mVar = cVar.f61797x;
            if (mVar == null || mVar.hasReferences()) {
                return 0;
            }
            return cVar.f61797x.size();
        }

        @Override // fp.j
        public void a(fp.c cVar) {
            f fVar = this.f61188h;
            if (fVar != null) {
                if (!cVar.f61798y || !cVar.f61799z) {
                    fVar.obtainMessage(2, cVar).sendToTarget();
                } else {
                    if (cVar.v()) {
                        return;
                    }
                    this.f61188h.h(cVar);
                }
            }
        }

        public void n() {
            this.f61189i = false;
            if (this.f61181a == null) {
                HandlerThread handlerThread = new HandlerThread("DFM Cache-Building Thread");
                this.f61181a = handlerThread;
                handlerThread.start();
            }
            if (this.f61188h == null) {
                this.f61188h = new f(this.f61181a.getLooper());
            }
            this.f61188h.f();
        }

        public final long o(fp.c cVar) {
            m<?> mVar = cVar.f61797x;
            if (mVar == null) {
                return 0L;
            }
            if (mVar.hasReferences()) {
                mVar.c();
                cVar.f61797x = null;
                return 0L;
            }
            long jI = I(cVar);
            mVar.destroy();
            cVar.f61797x = null;
            return jI;
        }

        public final void p() {
            while (true) {
                gp.f fVar = (gp.f) this.f61184d.acquire();
                if (fVar == null) {
                    return;
                } else {
                    fVar.destroy();
                }
            }
        }

        public final void q(int i10, boolean z10) {
            this.f61182b.g(new e(i10, z10));
        }

        public final void r() {
            this.f61182b.g(new c());
        }

        public void s() {
            this.f61189i = true;
            synchronized (a.this.f61178y) {
                a.this.f61178y.notifyAll();
            }
            f fVar = this.f61188h;
            if (fVar != null) {
                fVar.removeCallbacksAndMessages(null);
                this.f61188h.k();
                this.f61188h = null;
            }
            HandlerThread handlerThread = this.f61181a;
            if (handlerThread != null) {
                try {
                    handlerThread.join();
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                }
                this.f61181a.quit();
                this.f61181a = null;
            }
        }

        public void t(boolean z10, fp.c cVar, fp.c cVar2) {
            m<?> mVarE = cVar.e();
            if (mVarE != null) {
                long jO = o(cVar);
                if (cVar.v()) {
                    a.this.f61276a.b().s().f(cVar);
                }
                if (jO <= 0) {
                    return;
                }
                this.f61186f = (int) (((long) this.f61186f) - jO);
                this.f61184d.a((gp.f) mVarE);
            }
        }

        public final void u() {
            gp.e eVar = this.f61182b;
            if (eVar != null) {
                eVar.g(new C0750a());
                this.f61182b.clear();
            }
            this.f61186f = 0;
        }

        public final void v() {
            gp.e eVar = this.f61182b;
            if (eVar != null) {
                eVar.g(new C0751b());
            }
        }

        public final fp.c w(fp.c cVar, boolean z10, int i10) {
            d dVar = new d(i10, cVar, z10, (!z10 ? a.this.f61277b.m() * 2 : 0) + a.this.f61276a.A.f62714e);
            this.f61182b.g(dVar);
            return dVar.d();
        }

        public long x() {
            fp.c cVarFirst;
            gp.e eVar = this.f61182b;
            if (eVar == null || eVar.size() <= 0 || (cVarFirst = this.f61182b.first()) == null) {
                return 0L;
            }
            return cVarFirst.b();
        }

        public float y() {
            int i10 = this.f61185e;
            if (i10 == 0) {
                return 0.0f;
            }
            return this.f61186f / i10;
        }

        public void z(int i10) {
            f fVar = this.f61188h;
            if (fVar != null) {
                fVar.j(i10 == 1);
            }
        }
    }

    public a(fp.e eVar, DanmakuContext danmakuContext, h.a aVar) {
        super(eVar, danmakuContext, aVar);
        this.f61175v = 2;
        this.f61178y = new Object();
        NativeBitmapFactory.f();
        int iMax = (int) Math.max(4194304.0f, Runtime.getRuntime().maxMemory() * danmakuContext.A.f62711b);
        this.f61175v = iMax;
        b bVar = new b(iMax, 3);
        this.f61176w = bVar;
        this.f61281f.f(bVar);
    }

    @Override // ep.e, ep.h
    public void a(fp.c cVar) {
        super.a(cVar);
        b bVar = this.f61176w;
        if (bVar == null) {
            return;
        }
        bVar.a(cVar);
    }

    @Override // ep.e, ep.h
    public a.b c(fp.a aVar) {
        b bVar;
        a.b bVarC = super.c(aVar);
        synchronized (this.f61178y) {
            this.f61178y.notify();
        }
        if (bVarC != null && (bVar = this.f61176w) != null && bVarC.f72522k - bVarC.f72523l < -20) {
            bVar.E();
            this.f61176w.C(-this.f61276a.f74049z.f62722f);
        }
        return bVarC;
    }

    @Override // ep.e, ep.h
    public void i() {
        super.i();
        t();
        this.f61281f.f(null);
        b bVar = this.f61176w;
        if (bVar != null) {
            bVar.s();
            this.f61176w = null;
        }
        NativeBitmapFactory.g();
    }

    @Override // ep.e
    public void o(fp.e eVar) {
        this.f61282g = eVar;
        fp.e eVar2 = new fp.e();
        this.f61177x = eVar2;
        eVar2.update(eVar.f61800a);
    }

    @Override // ep.e, ep.h
    public void onPlayStateChanged(int i10) {
        super.onPlayStateChanged(i10);
        b bVar = this.f61176w;
        if (bVar != null) {
            bVar.z(i10);
        }
    }

    @Override // ep.e, ep.h
    public void prepare() {
        ip.a aVar = this.f61279d;
        if (aVar == null) {
            return;
        }
        p(aVar);
        this.f61176w.n();
    }

    @Override // ep.e
    public boolean q(DanmakuContext danmakuContext, DanmakuContext.DanmakuConfigTag danmakuConfigTag, Object... objArr) {
        b bVar;
        Object obj;
        b bVar2;
        if (!super.n(danmakuContext, danmakuConfigTag, objArr)) {
            if (DanmakuContext.DanmakuConfigTag.SCROLL_SPEED_FACTOR.equals(danmakuConfigTag)) {
                this.f61277b.a(this.f61276a.f74027d);
                g();
            } else if (danmakuConfigTag.isVisibilityRelatedTag()) {
                if (objArr != null && objArr.length > 0 && (obj = objArr[0]) != null && ((!(obj instanceof Boolean) || ((Boolean) obj).booleanValue()) && (bVar2 = this.f61176w) != null)) {
                    bVar2.C(0L);
                }
                g();
            } else if (DanmakuContext.DanmakuConfigTag.TRANSPARENCY.equals(danmakuConfigTag) || DanmakuContext.DanmakuConfigTag.SCALE_TEXTSIZE.equals(danmakuConfigTag) || DanmakuContext.DanmakuConfigTag.DANMAKU_STYLE.equals(danmakuConfigTag)) {
                if (DanmakuContext.DanmakuConfigTag.SCALE_TEXTSIZE.equals(danmakuConfigTag)) {
                    this.f61277b.a(this.f61276a.f74027d);
                }
                b bVar3 = this.f61176w;
                if (bVar3 != null) {
                    bVar3.D();
                    this.f61176w.C(-this.f61276a.f74049z.f62722f);
                }
            } else {
                b bVar4 = this.f61176w;
                if (bVar4 != null) {
                    bVar4.F();
                    this.f61176w.C(0L);
                }
            }
        }
        if (this.f61280e == null || (bVar = this.f61176w) == null) {
            return true;
        }
        bVar.A(new RunnableC0749a());
        return true;
    }

    @Override // ep.e
    public void r(fp.c cVar) {
        super.r(cVar);
        b bVar = this.f61176w;
        if (bVar != null) {
            int i10 = this.f61179z + 1;
            this.f61179z = i10;
            if (i10 > 5) {
                bVar.E();
                this.f61179z = 0;
                return;
            }
            return;
        }
        m<?> mVarE = cVar.e();
        if (mVarE != null) {
            if (mVarE.hasReferences()) {
                mVarE.c();
            } else {
                mVarE.destroy();
            }
            cVar.f61797x = null;
        }
    }

    @Override // ep.e, ep.h
    public void seek(long j10) {
        super.seek(j10);
        if (this.f61176w == null) {
            start();
        }
        this.f61176w.H(j10);
    }

    @Override // ep.e, ep.h
    public void start() {
        super.start();
        NativeBitmapFactory.f();
        b bVar = this.f61176w;
        if (bVar != null) {
            bVar.G();
            return;
        }
        b bVar2 = new b(this.f61175v, 3);
        this.f61176w = bVar2;
        bVar2.n();
        this.f61281f.f(this.f61176w);
    }
}
