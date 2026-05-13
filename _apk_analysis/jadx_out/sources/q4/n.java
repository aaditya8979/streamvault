package q4;

import a6.t;
import java.io.IOException;

/* JADX INFO: compiled from: TrackFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f77788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f77789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f77790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f77791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f77792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f77793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long[] f77794g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f77795h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f77796i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f77797j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long[] f77798k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean[] f77799l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f77800m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean[] f77801n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public m f77802o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f77803p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public t f77804q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f77805r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f77806s;

    public void a(t tVar) {
        tVar.h(this.f77804q.f3620a, 0, this.f77803p);
        this.f77804q.L(0);
        this.f77805r = false;
    }

    public void b(k4.h hVar) throws InterruptedException, IOException {
        hVar.readFully(this.f77804q.f3620a, 0, this.f77803p);
        this.f77804q.L(0);
        this.f77805r = false;
    }

    public long c(int i10) {
        return this.f77798k[i10] + ((long) this.f77797j[i10]);
    }

    public void d(int i10) {
        t tVar = this.f77804q;
        if (tVar == null || tVar.d() < i10) {
            this.f77804q = new t(i10);
        }
        this.f77803p = i10;
        this.f77800m = true;
        this.f77805r = true;
    }

    public void e(int i10, int i11) {
        this.f77792e = i10;
        this.f77793f = i11;
        int[] iArr = this.f77795h;
        if (iArr == null || iArr.length < i10) {
            this.f77794g = new long[i10];
            this.f77795h = new int[i10];
        }
        int[] iArr2 = this.f77796i;
        if (iArr2 == null || iArr2.length < i11) {
            int i12 = (i11 * 125) / 100;
            this.f77796i = new int[i12];
            this.f77797j = new int[i12];
            this.f77798k = new long[i12];
            this.f77799l = new boolean[i12];
            this.f77801n = new boolean[i12];
        }
    }

    public void f() {
        this.f77792e = 0;
        this.f77806s = 0L;
        this.f77800m = false;
        this.f77805r = false;
        this.f77802o = null;
    }

    public boolean g(int i10) {
        return this.f77800m && this.f77801n[i10];
    }
}
