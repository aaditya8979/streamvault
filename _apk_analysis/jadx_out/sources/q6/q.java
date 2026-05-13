package q6;

import androidx.annotation.Nullable;
import java.io.IOException;
import s7.a0;

/* JADX INFO: compiled from: TrackFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f77974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f77975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f77976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f77977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f77978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f77979f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f77985l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public p f77987n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f77989p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f77990q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f77991r;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long[] f77980g = new long[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f77981h = new int[0];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f77982i = new int[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long[] f77983j = new long[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean[] f77984k = new boolean[0];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean[] f77986m = new boolean[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a0 f77988o = new a0();

    public void a(i6.l lVar) throws IOException {
        lVar.readFully(this.f77988o.d(), 0, this.f77988o.f());
        this.f77988o.P(0);
        this.f77989p = false;
    }

    public void b(a0 a0Var) {
        a0Var.j(this.f77988o.d(), 0, this.f77988o.f());
        this.f77988o.P(0);
        this.f77989p = false;
    }

    public long c(int i10) {
        return this.f77983j[i10];
    }

    public void d(int i10) {
        this.f77988o.L(i10);
        this.f77985l = true;
        this.f77989p = true;
    }

    public void e(int i10, int i11) {
        this.f77978e = i10;
        this.f77979f = i11;
        if (this.f77981h.length < i10) {
            this.f77980g = new long[i10];
            this.f77981h = new int[i10];
        }
        if (this.f77982i.length < i11) {
            int i12 = (i11 * 125) / 100;
            this.f77982i = new int[i12];
            this.f77983j = new long[i12];
            this.f77984k = new boolean[i12];
            this.f77986m = new boolean[i12];
        }
    }

    public void f() {
        this.f77978e = 0;
        this.f77990q = 0L;
        this.f77991r = false;
        this.f77985l = false;
        this.f77989p = false;
        this.f77987n = null;
    }

    public boolean g(int i10) {
        return this.f77985l && this.f77986m[i10];
    }
}
