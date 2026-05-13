package ip;

import fp.e;
import fp.k;
import fp.l;
import master.flame.danmaku.danmaku.model.android.DanmakuContext;

/* JADX INFO: compiled from: BaseDanmakuParser.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b<?> f71738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f71739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f71740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f71741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f71742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f71743f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k f71744g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l f71745h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DanmakuContext f71746i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public InterfaceC0849a f71747j;

    /* JADX INFO: renamed from: ip.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BaseDanmakuParser.java */
    public interface InterfaceC0849a {
    }

    public k a() {
        k kVar = this.f71744g;
        if (kVar != null) {
            return kVar;
        }
        this.f71746i.f74049z.g();
        this.f71744g = e();
        g();
        this.f71746i.f74049z.i();
        return this.f71744g;
    }

    public l b() {
        return this.f71745h;
    }

    public e c() {
        return this.f71739b;
    }

    public float d() {
        return 1.0f / (this.f71742e - 0.6f);
    }

    public abstract k e();

    public void f() {
        g();
    }

    public void g() {
        b<?> bVar = this.f71738a;
        if (bVar != null) {
            bVar.release();
        }
        this.f71738a = null;
    }

    public a h(DanmakuContext danmakuContext) {
        this.f71746i = danmakuContext;
        return this;
    }

    public a i(l lVar) {
        this.f71745h = lVar;
        this.f71740c = lVar.getWidth();
        this.f71741d = lVar.getHeight();
        this.f71742e = lVar.getDensity();
        this.f71743f = lVar.e();
        this.f71746i.f74049z.l(this.f71740c, this.f71741d, d());
        this.f71746i.f74049z.i();
        return this;
    }

    public a j(InterfaceC0849a interfaceC0849a) {
        this.f71747j = interfaceC0849a;
        return this;
    }

    public a k(e eVar) {
        this.f71739b = eVar;
        return this;
    }
}
