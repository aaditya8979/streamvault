package gq;

import org.eclipse.jetty.io.Buffers;

/* JADX INFO: compiled from: HttpBuffersImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class e extends uq.a implements d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f62774k = 16384;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f62775l = 6144;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f62776m = 32768;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f62777n = 6144;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f62778o = 1024;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Buffers.Type f62779p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Buffers.Type f62780q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Buffers.Type f62781r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Buffers.Type f62782s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Buffers f62783t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Buffers f62784u;

    public e() {
        Buffers.Type type = Buffers.Type.BYTE_ARRAY;
        this.f62779p = type;
        this.f62780q = type;
        this.f62781r = type;
        this.f62782s = type;
    }

    @Override // gq.d
    public Buffers L() {
        return this.f62783t;
    }

    @Override // gq.d
    public Buffers W() {
        return this.f62784u;
    }

    @Override // uq.a
    public void d0() throws Exception {
        Buffers.Type type = this.f62780q;
        int i10 = this.f62775l;
        Buffers.Type type2 = this.f62779p;
        this.f62783t = org.eclipse.jetty.io.b.a(type, i10, type2, this.f62774k, type2, m0());
        Buffers.Type type3 = this.f62782s;
        int i11 = this.f62777n;
        Buffers.Type type4 = this.f62781r;
        this.f62784u = org.eclipse.jetty.io.b.a(type3, i11, type4, this.f62776m, type4, m0());
        super.d0();
    }

    @Override // uq.a
    public void e0() throws Exception {
        this.f62783t = null;
        this.f62784u = null;
    }

    public int m0() {
        return this.f62778o;
    }

    public void n0(Buffers.Type type) {
        this.f62779p = type;
    }

    public void o0(Buffers.Type type) {
        this.f62780q = type;
    }

    public void p0(Buffers.Type type) {
        this.f62781r = type;
    }

    public void q0(Buffers.Type type) {
        this.f62782s = type;
    }

    public String toString() {
        return this.f62783t + "/" + this.f62784u;
    }
}
