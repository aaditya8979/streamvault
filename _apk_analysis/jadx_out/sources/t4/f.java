package t4;

import com.google.android.exoplayer.Format;
import g4.b;
import t4.h0;

/* JADX INFO: compiled from: Ac4Reader.java */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a6.s f84689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a6.t f84690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f84691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f84692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k4.u f84693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f84694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f84695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f84696h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f84697i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f84698j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Format f84699k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f84700l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f84701m;

    public f() {
        this(null);
    }

    public f(String str) {
        a6.s sVar = new a6.s(new byte[16]);
        this.f84689a = sVar;
        this.f84690b = new a6.t(sVar.f3616a);
        this.f84694f = 0;
        this.f84695g = 0;
        this.f84696h = false;
        this.f84697i = false;
        this.f84691c = str;
    }

    @Override // t4.m
    public void a(a6.t tVar) {
        while (tVar.a() > 0) {
            int i10 = this.f84694f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int iMin = Math.min(tVar.a(), this.f84700l - this.f84695g);
                        this.f84693e.a(tVar, iMin);
                        int i11 = this.f84695g + iMin;
                        this.f84695g = i11;
                        int i12 = this.f84700l;
                        if (i11 == i12) {
                            this.f84693e.c(this.f84701m, 1, i12, 0, null);
                            this.f84701m += this.f84698j;
                            this.f84694f = 0;
                        }
                    }
                } else if (c(tVar, this.f84690b.f3620a, 16)) {
                    d();
                    this.f84690b.L(0);
                    this.f84693e.a(this.f84690b, 16);
                    this.f84694f = 2;
                }
            } else if (e(tVar)) {
                this.f84694f = 1;
                byte[] bArr = this.f84690b.f3620a;
                bArr[0] = -84;
                bArr[1] = (byte) (this.f84697i ? 65 : 64);
                this.f84695g = 2;
            }
        }
    }

    @Override // t4.m
    public void b(k4.i iVar, h0.d dVar) {
        dVar.a();
        this.f84692d = dVar.b();
        this.f84693e = iVar.track(dVar.c(), 1);
    }

    public final boolean c(a6.t tVar, byte[] bArr, int i10) {
        int iMin = Math.min(tVar.a(), i10 - this.f84695g);
        tVar.h(bArr, this.f84695g, iMin);
        int i11 = this.f84695g + iMin;
        this.f84695g = i11;
        return i11 == i10;
    }

    public final void d() {
        this.f84689a.o(0);
        b.C0767b c0767bD = g4.b.d(this.f84689a);
        Format format = this.f84699k;
        if (format == null || c0767bD.f61930c != format.f19940w || c0767bD.f61929b != format.f19941x || !"audio/ac4".equals(format.f19927j)) {
            Format formatQ = Format.q(this.f84692d, "audio/ac4", null, -1, -1, c0767bD.f61930c, c0767bD.f61929b, null, null, 0, this.f84691c);
            this.f84699k = formatQ;
            this.f84693e.d(formatQ);
        }
        this.f84700l = c0767bD.f61931d;
        this.f84698j = (((long) c0767bD.f61932e) * 1000000) / ((long) this.f84699k.f19941x);
    }

    public final boolean e(a6.t tVar) {
        int iY;
        while (true) {
            if (tVar.a() <= 0) {
                return false;
            }
            if (this.f84696h) {
                iY = tVar.y();
                this.f84696h = iY == 172;
                if (iY == 64 || iY == 65) {
                    break;
                }
            } else {
                this.f84696h = tVar.y() == 172;
            }
        }
        this.f84697i = iY == 65;
        return true;
    }

    @Override // t4.m
    public void packetFinished() {
    }

    @Override // t4.m
    public void packetStarted(long j10, int i10) {
        this.f84701m = j10;
    }

    @Override // t4.m
    public void seek() {
        this.f84694f = 0;
        this.f84695g = 0;
        this.f84696h = false;
        this.f84697i = false;
    }
}
