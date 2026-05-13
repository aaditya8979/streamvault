package yads;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zj2 implements bg1, l21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f97624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r33 f97625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cr f97626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pq0 f97627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vy f97628e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f97630g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f97632i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public u30 f97633j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ms2 f97634k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f97635l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ek2 f97636m;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final gg2 f97629f = new gg2();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f97631h = true;

    public zj2(ek2 ek2Var, Uri uri, p30 p30Var, cr crVar, pq0 pq0Var, vy vyVar) {
        this.f97636m = ek2Var;
        this.f97624a = uri;
        this.f97625b = new r33(p30Var);
        this.f97626c = crVar;
        this.f97627d = pq0Var;
        this.f97628e = vyVar;
        vf1.a();
        this.f97633j = a(0L);
    }

    public final u30 a(long j10) {
        Collections.emptyMap();
        Uri uri = this.f97624a;
        String str = this.f97636m.f89293j;
        Map map = ek2.N;
        ni.a(uri, "The uri must be set.");
        return new u30(uri, 0L, 1, null, map, j10, -1L, str, 6, null);
    }

    @Override // yads.bg1
    public final void a() {
        p30 m21Var;
        long j10;
        long j11;
        int i10;
        int iA = 0;
        while (iA == 0 && !this.f97630g) {
            try {
                long j12 = this.f97629f.f89980a;
                u30 u30VarA = a(j12);
                this.f97633j = u30VarA;
                long jA = this.f97625b.a(u30VarA);
                if (jA != -1) {
                    jA += j12;
                    this.f97636m.h();
                }
                long j13 = jA;
                this.f97636m.f89302s = p21.a(this.f97625b.f94277a.getResponseHeaders());
                r33 r33Var = this.f97625b;
                p21 p21Var = this.f97636m.f89302s;
                if (p21Var == null || (i10 = p21Var.f93392g) == -1) {
                    m21Var = r33Var;
                } else {
                    m21Var = new m21(r33Var, i10, this);
                    ek2 ek2Var = this.f97636m;
                    ek2Var.getClass();
                    ms2 ms2VarA = ek2Var.a(new ck2(true, 0));
                    this.f97634k = ms2VarA;
                    ms2VarA.a(ek2.O);
                }
                long j14 = j12;
                this.f97626c.a(m21Var, this.f97624a, this.f97625b.f94277a.getResponseHeaders(), j12, j13, this.f97627d);
                if (this.f97636m.f89302s != null) {
                    mq0 mq0Var = this.f97626c.f88591b;
                    if (mq0Var instanceof iv1) {
                        ((iv1) mq0Var).f91017q = true;
                    }
                }
                if (this.f97631h) {
                    cr crVar = this.f97626c;
                    long j15 = this.f97632i;
                    mq0 mq0Var2 = crVar.f88591b;
                    mq0Var2.getClass();
                    mq0Var2.seek(j14, j15);
                    this.f97631h = false;
                }
                while (true) {
                    long j16 = j14;
                    while (iA == 0 && !this.f97630g) {
                        try {
                            this.f97628e.a();
                            cr crVar2 = this.f97626c;
                            gg2 gg2Var = this.f97629f;
                            mq0 mq0Var3 = crVar2.f88591b;
                            mq0Var3.getClass();
                            ld0 ld0Var = crVar2.f88592c;
                            ld0Var.getClass();
                            iA = mq0Var3.a(ld0Var, gg2Var);
                            ld0 ld0Var2 = this.f97626c.f88592c;
                            j14 = ld0Var2 != null ? ld0Var2.f91938d : -1L;
                            if (j14 > this.f97636m.f89294k + j16) {
                                vy vyVar = this.f97628e;
                                synchronized (vyVar) {
                                    vyVar.f96222a = false;
                                }
                                ek2 ek2Var2 = this.f97636m;
                                ek2Var2.f89300q.post(ek2Var2.f89299p);
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    break;
                }
                if (iA == 1) {
                    iA = 0;
                } else {
                    ld0 ld0Var3 = this.f97626c.f88592c;
                    if (ld0Var3 != null) {
                        j11 = ld0Var3.f91938d;
                        j10 = -1;
                    } else {
                        j10 = -1;
                        j11 = -1;
                    }
                    if (j11 != j10) {
                        this.f97629f.f89980a = ld0Var3 != null ? ld0Var3.f91938d : -1L;
                    }
                }
                s30.a(this.f97625b);
            } catch (Throwable th2) {
                if (iA != 1) {
                    ld0 ld0Var4 = this.f97626c.f88592c;
                    if ((ld0Var4 != null ? ld0Var4.f91938d : -1L) != -1) {
                        this.f97629f.f89980a = ld0Var4 != null ? ld0Var4.f91938d : -1L;
                    }
                }
                s30.a(this.f97625b);
                throw th2;
            }
        }
    }

    @Override // yads.bg1
    public final void b() {
        this.f97630g = true;
    }
}
