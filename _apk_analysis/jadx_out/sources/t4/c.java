package t4;

import com.google.android.exoplayer.Format;
import g4.a;
import t4.h0;

/* JADX INFO: compiled from: Ac3Reader.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a6.s f84659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a6.t f84660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f84661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f84662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k4.u f84663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f84664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f84665g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f84666h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f84667i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Format f84668j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f84669k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f84670l;

    public c() {
        this(null);
    }

    public c(String str) {
        a6.s sVar = new a6.s(new byte[128]);
        this.f84659a = sVar;
        this.f84660b = new a6.t(sVar.f3616a);
        this.f84664f = 0;
        this.f84661c = str;
    }

    @Override // t4.m
    public void a(a6.t tVar) {
        while (tVar.a() > 0) {
            int i10 = this.f84664f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int iMin = Math.min(tVar.a(), this.f84669k - this.f84665g);
                        this.f84663e.a(tVar, iMin);
                        int i11 = this.f84665g + iMin;
                        this.f84665g = i11;
                        int i12 = this.f84669k;
                        if (i11 == i12) {
                            this.f84663e.c(this.f84670l, 1, i12, 0, null);
                            this.f84670l += this.f84667i;
                            this.f84664f = 0;
                        }
                    }
                } else if (c(tVar, this.f84660b.f3620a, 128)) {
                    d();
                    this.f84660b.L(0);
                    this.f84663e.a(this.f84660b, 128);
                    this.f84664f = 2;
                }
            } else if (e(tVar)) {
                this.f84664f = 1;
                byte[] bArr = this.f84660b.f3620a;
                bArr[0] = 11;
                bArr[1] = 119;
                this.f84665g = 2;
            }
        }
    }

    @Override // t4.m
    public void b(k4.i iVar, h0.d dVar) {
        dVar.a();
        this.f84662d = dVar.b();
        this.f84663e = iVar.track(dVar.c(), 1);
    }

    public final boolean c(a6.t tVar, byte[] bArr, int i10) {
        int iMin = Math.min(tVar.a(), i10 - this.f84665g);
        tVar.h(bArr, this.f84665g, iMin);
        int i11 = this.f84665g + iMin;
        this.f84665g = i11;
        return i11 == i10;
    }

    public final void d() {
        this.f84659a.o(0);
        a.b bVarE = g4.a.e(this.f84659a);
        Format format = this.f84668j;
        if (format == null || bVarE.f61924d != format.f19940w || bVarE.f61923c != format.f19941x || bVarE.f61921a != format.f19927j) {
            Format formatQ = Format.q(this.f84662d, bVarE.f61921a, null, -1, -1, bVarE.f61924d, bVarE.f61923c, null, null, 0, this.f84661c);
            this.f84668j = formatQ;
            this.f84663e.d(formatQ);
        }
        this.f84669k = bVarE.f61925e;
        this.f84667i = (((long) bVarE.f61926f) * 1000000) / ((long) this.f84668j.f19941x);
    }

    public final boolean e(a6.t tVar) {
        while (true) {
            if (tVar.a() <= 0) {
                return false;
            }
            if (this.f84666h) {
                int iY = tVar.y();
                if (iY == 119) {
                    this.f84666h = false;
                    return true;
                }
                this.f84666h = iY == 11;
            } else {
                this.f84666h = tVar.y() == 11;
            }
        }
    }

    @Override // t4.m
    public void packetFinished() {
    }

    @Override // t4.m
    public void packetStarted(long j10, int i10) {
        this.f84670l = j10;
    }

    @Override // t4.m
    public void seek() {
        this.f84664f = 0;
        this.f84665g = 0;
        this.f84666h = false;
    }
}
