package kp;

import fp.c;
import fp.e;
import fp.j;
import fp.k;
import fp.l;
import fp.m;
import jp.a;
import kp.b;
import master.flame.danmaku.danmaku.model.android.DanmakuContext;

/* JADX INFO: compiled from: DanmakuRenderer.java */
/* JADX INFO: loaded from: classes2.dex */
public class a extends jp.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f73482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DanmakuContext f73483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b.g f73484c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kp.b f73486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j f73487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a.InterfaceC0855a f73488g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b.g f73485d = new C0864a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f73489h = new b(this, null);

    /* JADX INFO: renamed from: kp.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DanmakuRenderer.java */
    public class C0864a implements b.g {
        public C0864a() {
        }

        @Override // kp.b.g
        public boolean a(c cVar, float f10, int i10, boolean z10) {
            if (cVar.f61787n != 0 || !a.this.f73483b.f74048y.c(cVar, i10, 0, a.this.f73482a, z10, a.this.f73483b)) {
                return false;
            }
            cVar.C(false);
            return true;
        }
    }

    /* JADX INFO: compiled from: DanmakuRenderer.java */
    public class b extends k.c<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f73491a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public l f73492b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a.b f73493c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f73494d;

        public b() {
        }

        public /* synthetic */ b(a aVar, C0864a c0864a) {
            this();
        }

        @Override // fp.k.b
        public void b() {
            this.f73493c.f72516e = this.f73491a;
            super.b();
        }

        @Override // fp.k.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int a(c cVar) {
            this.f73491a = cVar;
            if (cVar.v()) {
                this.f73492b.p(cVar);
                return this.f73493c.f72512a ? 2 : 0;
            }
            if (!this.f73493c.f72512a && cVar.q()) {
                return 0;
            }
            if (!cVar.m()) {
                ep.b bVar = a.this.f73483b.f74048y;
                a.b bVar2 = this.f73493c;
                bVar.b(cVar, bVar2.f72514c, bVar2.f72515d, bVar2.f72513b, false, a.this.f73483b);
            }
            if (cVar.b() >= this.f73494d && (cVar.f61787n != 0 || !cVar.n())) {
                if (cVar.o()) {
                    m<?> mVarE = cVar.e();
                    if (a.this.f73487f != null && (mVarE == null || mVarE.get() == null)) {
                        a.this.f73487f.a(cVar);
                    }
                    return 1;
                }
                if (cVar.getType() == 1) {
                    this.f73493c.f72514c++;
                }
                if (!cVar.p()) {
                    cVar.y(this.f73492b, false);
                }
                if (!cVar.t()) {
                    cVar.z(this.f73492b, false);
                }
                a.this.f73486e.c(cVar, this.f73492b, a.this.f73484c);
                if (!cVar.u() || (cVar.f61777d == null && cVar.d() > this.f73492b.getHeight())) {
                    return 0;
                }
                int iA = cVar.a(this.f73492b);
                if (iA == 1) {
                    this.f73493c.f72529r++;
                } else if (iA == 2) {
                    this.f73493c.f72530s++;
                    if (a.this.f73487f != null) {
                        a.this.f73487f.a(cVar);
                    }
                }
                this.f73493c.a(cVar.getType(), 1);
                this.f73493c.b(1);
                this.f73493c.c(cVar);
                if (a.this.f73488g != null && cVar.J != a.this.f73483b.f74047x.f61808d) {
                    cVar.J = a.this.f73483b.f74047x.f61808d;
                    a.this.f73488g.a(cVar);
                }
            }
            return 0;
        }
    }

    public a(DanmakuContext danmakuContext) {
        this.f73483b = danmakuContext;
        this.f73486e = new kp.b(danmakuContext.c());
    }

    @Override // jp.a
    public void a(boolean z10) {
        this.f73484c = z10 ? this.f73485d : null;
    }

    @Override // jp.a
    public void b(l lVar, k kVar, long j10, a.b bVar) {
        this.f73482a = bVar.f72513b;
        b bVar2 = this.f73489h;
        bVar2.f73492b = lVar;
        bVar2.f73493c = bVar;
        bVar2.f73494d = j10;
        kVar.d(bVar2);
    }

    @Override // jp.a
    public void c(a.InterfaceC0855a interfaceC0855a) {
        this.f73488g = interfaceC0855a;
    }

    @Override // jp.a
    public void clear() {
        e();
        this.f73483b.f74048y.a();
    }

    @Override // jp.a
    public void d(boolean z10) {
        kp.b bVar = this.f73486e;
        if (bVar != null) {
            bVar.a(z10);
        }
    }

    @Override // jp.a
    public void e() {
        this.f73486e.b();
    }

    @Override // jp.a
    public void f(j jVar) {
        this.f73487f = jVar;
    }

    @Override // jp.a
    public void release() {
        this.f73486e.d();
        this.f73483b.f74048y.a();
    }
}
