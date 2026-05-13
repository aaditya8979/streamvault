package ep;

import ep.h;
import fp.k;
import ip.a;
import jp.a;
import master.flame.danmaku.danmaku.model.android.DanmakuContext;

/* JADX INFO: compiled from: DrawTask.java */
/* JADX INFO: loaded from: classes7.dex */
public class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DanmakuContext f61276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fp.a f61277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f61278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ip.a f61279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h.a f61280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final jp.a f61281f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public fp.e f61282g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f61284i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f61287l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f61288m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f61289n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f61290o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f61291p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public fp.c f61292q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public k f61294s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f61295t;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k f61283h = new gp.e(4);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f61285j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a.b f61286k = new a.b();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public gp.e f61293r = new gp.e(4);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public DanmakuContext.a f61296u = new a();

    /* JADX INFO: compiled from: DrawTask.java */
    public class a implements DanmakuContext.a {
        public a() {
        }

        @Override // master.flame.danmaku.danmaku.model.android.DanmakuContext.a
        public boolean a(DanmakuContext danmakuContext, DanmakuContext.DanmakuConfigTag danmakuConfigTag, Object... objArr) {
            return e.this.q(danmakuContext, danmakuConfigTag, objArr);
        }
    }

    /* JADX INFO: compiled from: DrawTask.java */
    public class b implements a.InterfaceC0855a {
        public b() {
        }

        @Override // jp.a.InterfaceC0855a
        public void a(fp.c cVar) {
            h.a aVar = e.this.f61280e;
            if (aVar != null) {
                aVar.a(cVar);
            }
        }
    }

    /* JADX INFO: compiled from: DrawTask.java */
    public class c extends k.c<fp.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f61299a = lp.b.b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f61300b;

        public c(int i10) {
            this.f61300b = i10;
        }

        @Override // fp.k.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int a(fp.c cVar) {
            boolean zV = cVar.v();
            if (lp.b.b() - this.f61299a > this.f61300b || !zV) {
                return 1;
            }
            e.this.f61278c.a(cVar);
            e.this.r(cVar);
            return 2;
        }
    }

    /* JADX INFO: compiled from: DrawTask.java */
    public class d extends k.c<fp.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f61302a;

        public d(k kVar) {
            this.f61302a = kVar;
        }

        @Override // fp.k.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int a(fp.c cVar) {
            if (!cVar.u() || cVar.r()) {
                return 0;
            }
            this.f61302a.c(cVar);
            return 0;
        }
    }

    /* JADX INFO: renamed from: ep.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DrawTask.java */
    public class C0756e implements a.InterfaceC0849a {
        public C0756e() {
        }
    }

    public e(fp.e eVar, DanmakuContext danmakuContext, h.a aVar) {
        if (danmakuContext == null) {
            throw new IllegalArgumentException("context is null");
        }
        this.f61276a = danmakuContext;
        this.f61277b = danmakuContext.b();
        this.f61280e = aVar;
        kp.a aVar2 = new kp.a(danmakuContext);
        this.f61281f = aVar2;
        aVar2.c(new b());
        aVar2.a(danmakuContext.g() || danmakuContext.f());
        o(eVar);
        Boolean boolValueOf = Boolean.valueOf(danmakuContext.e());
        if (boolValueOf != null) {
            if (boolValueOf.booleanValue()) {
                danmakuContext.f74048y.e("1017_Filter");
            } else {
                danmakuContext.f74048y.h("1017_Filter");
            }
        }
    }

    @Override // ep.h
    public synchronized void a(fp.c cVar) {
        boolean zC;
        h.a aVar;
        boolean zC2;
        if (this.f61278c == null) {
            return;
        }
        if (cVar.f61798y) {
            this.f61293r.c(cVar);
            s(10);
        }
        cVar.f61791r = this.f61278c.size();
        boolean z10 = true;
        if (this.f61288m <= cVar.b() && cVar.b() <= this.f61289n) {
            synchronized (this.f61283h) {
                zC2 = this.f61283h.c(cVar);
            }
            z10 = zC2;
        } else if (cVar.f61798y) {
            z10 = false;
        }
        synchronized (this.f61278c) {
            zC = this.f61278c.c(cVar);
        }
        if (!z10 || !zC) {
            this.f61289n = 0L;
            this.f61288m = 0L;
        }
        if (zC && (aVar = this.f61280e) != null) {
            aVar.c(cVar);
        }
        fp.c cVar2 = this.f61292q;
        if (cVar2 == null || (cVar2 != null && cVar.b() > this.f61292q.b())) {
            this.f61292q = cVar;
        }
    }

    @Override // ep.h
    public k b(long j10) {
        k kVarE;
        long j11 = this.f61276a.f74049z.f62722f;
        long j12 = (j10 - j11) - 100;
        long j13 = j10 + j11;
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (i10 >= 3) {
                kVarE = null;
                break;
            }
            try {
                kVarE = this.f61278c.e(j12, j13);
                break;
            } catch (Exception unused) {
                i10 = i11;
            }
        }
        gp.e eVar = new gp.e();
        if (kVarE != null && !kVarE.isEmpty()) {
            kVarE.d(new d(eVar));
        }
        return eVar;
    }

    @Override // ep.h
    public synchronized a.b c(fp.a aVar) {
        return l(aVar, this.f61282g);
    }

    @Override // ep.h
    public void d() {
        this.f61295t = true;
    }

    @Override // ep.h
    public void e(ip.a aVar) {
        this.f61279d = aVar;
        this.f61287l = false;
    }

    @Override // ep.h
    public void f(long j10) {
        t();
        this.f61276a.f74047x.g();
        this.f61276a.f74047x.c();
        this.f61285j = j10;
    }

    @Override // ep.h
    public void g() {
        this.f61289n = 0L;
        this.f61288m = 0L;
        this.f61291p = false;
    }

    @Override // ep.h
    public void h() {
        this.f61284i = true;
    }

    @Override // ep.h
    public void i() {
        this.f61276a.r();
        jp.a aVar = this.f61281f;
        if (aVar != null) {
            aVar.release();
        }
    }

    @Override // ep.h
    public void j() {
        this.f61291p = true;
    }

    public final void k(a.b bVar, k kVar, k kVar2) {
        bVar.d();
        bVar.f72513b.update(lp.b.b());
        bVar.f72514c = 0;
        bVar.f72515d = (kVar != null ? kVar.size() : 0) + (kVar2 != null ? kVar2.size() : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jp.a.b l(fp.a r22, fp.e r23) {
        /*
            r21 = this;
            r0 = r21
            boolean r1 = r0.f61284i
            r2 = 0
            if (r1 == 0) goto Le
            jp.a r1 = r0.f61281f
            r1.e()
            r0.f61284i = r2
        Le:
            fp.k r1 = r0.f61278c
            r3 = 0
            if (r1 == 0) goto Lc6
            java.lang.Object r1 = r22.t()
            android.graphics.Canvas r1 = (android.graphics.Canvas) r1
            ep.d.a(r1)
            boolean r1 = r0.f61291p
            if (r1 == 0) goto L27
            boolean r1 = r0.f61295t
            if (r1 != 0) goto L27
            jp.a$b r1 = r0.f61286k
            return r1
        L27:
            r0.f61295t = r2
            jp.a$b r1 = r0.f61286k
            r4 = r23
            long r4 = r4.f61800a
            master.flame.danmaku.danmaku.model.android.DanmakuContext r6 = r0.f61276a
            gp.d r6 = r6.f74049z
            long r6 = r6.f62722f
            long r8 = r4 - r6
            r10 = 100
            long r8 = r8 - r10
            long r6 = r6 + r4
            fp.k r10 = r0.f61283h
            long r11 = r0.f61288m
            int r13 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r13 > 0) goto L4c
            long r13 = r0.f61289n
            int r4 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r4 <= 0) goto L4a
            goto L4c
        L4a:
            r6 = r10
            goto L5d
        L4c:
            fp.k r4 = r0.f61278c
            fp.k r4 = r4.b(r8, r6)
            if (r4 == 0) goto L56
            r0.f61283h = r4
        L56:
            r0.f61288m = r8
            r0.f61289n = r6
            r13 = r6
            r11 = r8
            r6 = r4
        L5d:
            fp.k r4 = r0.f61294s
            r0.k(r1, r4, r6)
            r5 = 1
            if (r4 == 0) goto L7c
            boolean r7 = r4.isEmpty()
            if (r7 != 0) goto L7c
            jp.a$b r7 = r0.f61286k
            r7.f72512a = r5
            jp.a r15 = r0.f61281f
            r18 = 0
            r16 = r22
            r17 = r4
            r20 = r7
            r15.b(r16, r17, r18, r20)
        L7c:
            jp.a$b r4 = r0.f61286k
            r4.f72512a = r2
            if (r6 == 0) goto Lbf
            boolean r2 = r6.isEmpty()
            if (r2 != 0) goto Lbf
            jp.a r4 = r0.f61281f
            fp.a r5 = r0.f61277b
            long r7 = r0.f61285j
            r9 = r1
            r4.b(r5, r6, r7, r9)
            r0.m(r1)
            boolean r2 = r1.f72527p
            if (r2 == 0) goto Lbe
            fp.c r2 = r0.f61292q
            if (r2 == 0) goto Lac
            boolean r2 = r2.v()
            if (r2 == 0) goto Lac
            r0.f61292q = r3
            ep.h$a r2 = r0.f61280e
            if (r2 == 0) goto Lac
            r2.d()
        Lac:
            long r2 = r1.f72525n
            r4 = -1
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto Lb6
            r1.f72525n = r11
        Lb6:
            long r2 = r1.f72526o
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto Lbe
            r1.f72526o = r13
        Lbe:
            return r1
        Lbf:
            r1.f72527p = r5
            r1.f72525n = r11
            r1.f72526o = r13
            return r1
        Lc6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ep.e.l(fp.a, fp.e):jp.a$b");
    }

    public final void m(a.b bVar) {
        boolean z10 = bVar.f72522k == 0;
        bVar.f72527p = z10;
        if (z10) {
            bVar.f72525n = -1L;
        }
        fp.c cVar = bVar.f72516e;
        bVar.f72516e = null;
        bVar.f72526o = cVar != null ? cVar.b() : -1L;
        bVar.f72524m = bVar.f72513b.update(lp.b.b());
    }

    public boolean n(DanmakuContext danmakuContext, DanmakuContext.DanmakuConfigTag danmakuConfigTag, Object[] objArr) {
        Boolean bool;
        if (danmakuConfigTag == null || DanmakuContext.DanmakuConfigTag.MAXIMUM_NUMS_IN_SCREEN.equals(danmakuConfigTag)) {
            return true;
        }
        if (DanmakuContext.DanmakuConfigTag.DUPLICATE_MERGING_ENABLED.equals(danmakuConfigTag)) {
            Boolean bool2 = (Boolean) objArr[0];
            if (bool2 != null) {
                if (bool2.booleanValue()) {
                    this.f61276a.f74048y.e("1017_Filter");
                    return true;
                }
                this.f61276a.f74048y.h("1017_Filter");
                return true;
            }
        } else if (DanmakuContext.DanmakuConfigTag.SCALE_TEXTSIZE.equals(danmakuConfigTag) || DanmakuContext.DanmakuConfigTag.SCROLL_SPEED_FACTOR.equals(danmakuConfigTag) || DanmakuContext.DanmakuConfigTag.DANMAKU_MARGIN.equals(danmakuConfigTag)) {
            h();
        } else {
            if (DanmakuContext.DanmakuConfigTag.MAXIMUN_LINES.equals(danmakuConfigTag) || DanmakuContext.DanmakuConfigTag.OVERLAPPING_ENABLE.equals(danmakuConfigTag)) {
                jp.a aVar = this.f61281f;
                if (aVar == null) {
                    return true;
                }
                aVar.a(this.f61276a.g() || this.f61276a.f());
                return true;
            }
            if (DanmakuContext.DanmakuConfigTag.ALIGN_BOTTOM.equals(danmakuConfigTag) && (bool = (Boolean) objArr[0]) != null) {
                jp.a aVar2 = this.f61281f;
                if (aVar2 == null) {
                    return true;
                }
                aVar2.d(bool.booleanValue());
                return true;
            }
        }
        return false;
    }

    public void o(fp.e eVar) {
        this.f61282g = eVar;
    }

    @Override // ep.h
    public void onPlayStateChanged(int i10) {
        this.f61290o = i10;
    }

    public void p(ip.a aVar) {
        this.f61278c = aVar.h(this.f61276a).i(this.f61277b).k(this.f61282g).j(new C0756e()).a();
        this.f61276a.f74047x.a();
        k kVar = this.f61278c;
        if (kVar != null) {
            this.f61292q = kVar.last();
        }
    }

    @Override // ep.h
    public void prepare() {
        ip.a aVar = this.f61279d;
        if (aVar == null) {
            return;
        }
        p(aVar);
        this.f61289n = 0L;
        this.f61288m = 0L;
        h.a aVar2 = this.f61280e;
        if (aVar2 != null) {
            aVar2.b();
            this.f61287l = true;
        }
    }

    public boolean q(DanmakuContext danmakuContext, DanmakuContext.DanmakuConfigTag danmakuConfigTag, Object... objArr) {
        boolean zN = n(danmakuContext, danmakuConfigTag, objArr);
        h.a aVar = this.f61280e;
        if (aVar != null) {
            aVar.e();
        }
        return zN;
    }

    public void r(fp.c cVar) {
    }

    public synchronized void s(int i10) {
        k kVar = this.f61278c;
        if (kVar != null && !kVar.isEmpty() && !this.f61293r.isEmpty()) {
            this.f61293r.d(new c(i10));
        }
    }

    @Override // ep.h
    public void seek(long j10) {
        fp.c cVarLast;
        t();
        this.f61276a.f74047x.g();
        this.f61276a.f74047x.c();
        this.f61276a.f74047x.f();
        this.f61276a.f74047x.e();
        this.f61294s = new gp.e(4);
        if (j10 < 1000) {
            j10 = 0;
        }
        this.f61285j = j10;
        this.f61286k.d();
        this.f61286k.f72526o = this.f61285j;
        this.f61289n = 0L;
        this.f61288m = 0L;
        k kVar = this.f61278c;
        if (kVar == null || (cVarLast = kVar.last()) == null || cVarLast.v()) {
            return;
        }
        this.f61292q = cVarLast;
    }

    @Override // ep.h
    public void start() {
        this.f61276a.j(this.f61296u);
    }

    public void t() {
        if (this.f61283h != null) {
            this.f61283h = new gp.e();
        }
        jp.a aVar = this.f61281f;
        if (aVar != null) {
            aVar.clear();
        }
    }
}
