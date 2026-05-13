package t4;

import com.google.android.exoplayer.Format;
import t4.h0;

/* JADX INFO: compiled from: DtsReader.java */
/* JADX INFO: loaded from: classes4.dex */
public final class k implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f84781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k4.u f84782d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f84784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f84785g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f84786h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Format f84787i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f84788j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f84789k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a6.t f84779a = new a6.t(new byte[18]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f84783e = 0;

    public k(String str) {
        this.f84780b = str;
    }

    @Override // t4.m
    public void a(a6.t tVar) {
        while (tVar.a() > 0) {
            int i10 = this.f84783e;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(tVar.a(), this.f84788j - this.f84784f);
                    this.f84782d.a(tVar, iMin);
                    int i11 = this.f84784f + iMin;
                    this.f84784f = i11;
                    int i12 = this.f84788j;
                    if (i11 == i12) {
                        this.f84782d.c(this.f84789k, 1, i12, 0, null);
                        this.f84789k += this.f84786h;
                        this.f84783e = 0;
                    }
                } else if (c(tVar, this.f84779a.f3620a, 18)) {
                    d();
                    this.f84779a.L(0);
                    this.f84782d.a(this.f84779a, 18);
                    this.f84783e = 2;
                }
            } else if (e(tVar)) {
                this.f84783e = 1;
            }
        }
    }

    @Override // t4.m
    public void b(k4.i iVar, h0.d dVar) {
        dVar.a();
        this.f84781c = dVar.b();
        this.f84782d = iVar.track(dVar.c(), 1);
    }

    public final boolean c(a6.t tVar, byte[] bArr, int i10) {
        int iMin = Math.min(tVar.a(), i10 - this.f84784f);
        tVar.h(bArr, this.f84784f, iMin);
        int i11 = this.f84784f + iMin;
        this.f84784f = i11;
        return i11 == i10;
    }

    public final void d() {
        byte[] bArr = this.f84779a.f3620a;
        if (this.f84787i == null) {
            Format formatG = g4.n.g(bArr, this.f84781c, this.f84780b, null);
            this.f84787i = formatG;
            this.f84782d.d(formatG);
        }
        this.f84788j = g4.n.a(bArr);
        this.f84786h = (int) ((((long) g4.n.f(bArr)) * 1000000) / ((long) this.f84787i.f19941x));
    }

    public final boolean e(a6.t tVar) {
        while (tVar.a() > 0) {
            int i10 = this.f84785g << 8;
            this.f84785g = i10;
            int iY = i10 | tVar.y();
            this.f84785g = iY;
            if (g4.n.d(iY)) {
                byte[] bArr = this.f84779a.f3620a;
                int i11 = this.f84785g;
                bArr[0] = (byte) ((i11 >> 24) & 255);
                bArr[1] = (byte) ((i11 >> 16) & 255);
                bArr[2] = (byte) ((i11 >> 8) & 255);
                bArr[3] = (byte) (i11 & 255);
                this.f84784f = 4;
                this.f84785g = 0;
                return true;
            }
        }
        return false;
    }

    @Override // t4.m
    public void packetFinished() {
    }

    @Override // t4.m
    public void packetStarted(long j10, int i10) {
        this.f84789k = j10;
    }

    @Override // t4.m
    public void seek() {
        this.f84783e = 0;
        this.f84784f = 0;
        this.f84785g = 0;
    }
}
