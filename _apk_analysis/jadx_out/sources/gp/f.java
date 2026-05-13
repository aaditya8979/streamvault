package gp;

import fp.m;

/* JADX INFO: compiled from: DrawingCache.java */
/* JADX INFO: loaded from: classes4.dex */
public class f implements m<g>, hp.c<f> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f62741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f62742d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f62740b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f62743e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f62739a = new g();

    @Override // fp.m
    public int a() {
        return this.f62739a.f62749f;
    }

    @Override // fp.m
    public synchronized void c() {
        this.f62743e--;
    }

    @Override // fp.m
    public void destroy() {
        g gVar = this.f62739a;
        if (gVar != null) {
            gVar.c();
        }
        this.f62740b = 0;
        this.f62743e = 0;
    }

    @Override // hp.c
    public void e(boolean z10) {
        this.f62742d = z10;
    }

    @Override // hp.c
    public boolean f() {
        return this.f62742d;
    }

    public void g(int i10, int i11, int i12, boolean z10, int i13) {
        this.f62739a.a(i10, i11, i12, z10, i13);
        this.f62740b = this.f62739a.f62745b.getRowBytes() * this.f62739a.f62745b.getHeight();
    }

    @Override // fp.m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public g get() {
        g gVar = this.f62739a;
        if (gVar.f62745b == null) {
            return null;
        }
        return gVar;
    }

    @Override // fp.m
    public synchronized boolean hasReferences() {
        return this.f62743e > 0;
    }

    @Override // hp.c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public f b() {
        return this.f62741c;
    }

    public synchronized void j() {
        this.f62743e++;
    }

    @Override // hp.c
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void d(f fVar) {
        this.f62741c = fVar;
    }

    @Override // fp.m
    public int size() {
        return this.f62740b;
    }

    @Override // fp.m
    public int width() {
        return this.f62739a.f62748e;
    }
}
