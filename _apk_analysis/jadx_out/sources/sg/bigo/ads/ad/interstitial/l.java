package sg.bigo.ads.ad.interstitial;

import android.os.SystemClock;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes10.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f81103a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f81104b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f81105c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f81106d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f81107e = 5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f81108f = 6;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f81109g = 7;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f81110h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f81111i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f81112j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f81113k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f81114l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f81115m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f81116n = new int[10];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long[] f81117o = new long[10];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long[] f81118p = new long[10];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean[][] f81119q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean[][] f81120r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f81121s;

    public l() {
        Class cls = Boolean.TYPE;
        this.f81119q = (boolean[][]) Array.newInstance((Class<?>) cls, 10, 10);
        this.f81120r = (boolean[][]) Array.newInstance((Class<?>) cls, 10, 10);
        this.f81121s = false;
    }

    private int a() {
        return (this.f81113k == 0 || SystemClock.elapsedRealtime() - this.f81113k > 5000) ? this.f81112j : this.f81111i;
    }

    private void a(sg.bigo.ads.api.core.b bVar, int i10, int i11) {
        try {
            if (this.f81121s) {
                return;
            }
            boolean[] zArr = this.f81119q[i11];
            if (zArr[i10]) {
                return;
            }
            zArr[i10] = true;
            sg.bigo.ads.core.d.b.a(bVar, i10, i11, SystemClock.elapsedRealtime() - this.f81117o[i10], i10 == this.f81103a ? SystemClock.elapsedRealtime() - this.f81117o[i10] : SystemClock.elapsedRealtime() - this.f81114l);
        } catch (Exception unused) {
        }
    }

    private void b(sg.bigo.ads.api.core.b bVar, int i10, int i11) {
        try {
            boolean[] zArr = this.f81120r[i11];
            if (zArr[i10]) {
                return;
            }
            zArr[i10] = true;
            sg.bigo.ads.core.d.b.a(bVar, i10, i11, SystemClock.elapsedRealtime() - this.f81118p[i10]);
        } catch (Exception unused) {
        }
    }

    public final void a(int i10) {
        try {
            long[] jArr = this.f81117o;
            if (jArr[i10] == 0) {
                jArr[i10] = SystemClock.elapsedRealtime();
            }
        } catch (Exception unused) {
        }
    }

    public final void a(sg.bigo.ads.api.core.b bVar, int i10) {
        try {
            this.f81118p[i10] = SystemClock.elapsedRealtime();
            this.f81116n[i10] = a();
            a(bVar, i10, this.f81116n[i10]);
        } catch (Exception unused) {
        }
    }

    public final void b(sg.bigo.ads.api.core.b bVar, int i10) {
        try {
            long[] jArr = this.f81117o;
            if (jArr[i10] == 0) {
                jArr[i10] = SystemClock.elapsedRealtime();
            }
            if (this.f81118p[i10] != 0) {
                int[] iArr = this.f81116n;
                int i11 = iArr[i10];
                iArr[i10] = 0;
                b(bVar, i10, i11);
            }
        } catch (Exception unused) {
        }
    }
}
