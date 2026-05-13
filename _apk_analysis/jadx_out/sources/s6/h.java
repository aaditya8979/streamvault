package s6;

import com.google.android.exoplayer2.ParserException;
import i6.z;
import java.io.EOFException;
import java.io.IOException;
import s6.i0;

/* JADX INFO: compiled from: AdtsExtractor.java */
/* JADX INFO: loaded from: classes11.dex */
public final class h implements i6.k {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final i6.p f79150m = new i6.p() { // from class: s6.g
        @Override // i6.p
        public final i6.k[] createExtractors() {
            return h.h();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f79151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f79152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s7.a0 f79153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s7.a0 f79154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s7.z f79155e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i6.m f79156f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f79157g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f79158h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f79159i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f79160j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f79161k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f79162l;

    public h() {
        this(0);
    }

    public h(int i10) {
        this.f79151a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f79152b = new i(true);
        this.f79153c = new s7.a0(2048);
        this.f79159i = -1;
        this.f79158h = -1L;
        s7.a0 a0Var = new s7.a0(10);
        this.f79154d = a0Var;
        this.f79155e = new s7.z(a0Var.d());
    }

    public static int f(int i10, long j10) {
        return (int) (((((long) i10) * 8) * 1000000) / j10);
    }

    public static /* synthetic */ i6.k[] h() {
        return new i6.k[]{new h()};
    }

    @Override // i6.k
    public void a(i6.m mVar) {
        this.f79156f = mVar;
        this.f79152b.b(mVar, new i0.d(0, 1));
        mVar.endTracks();
    }

    @Override // i6.k
    public int b(i6.l lVar, i6.y yVar) throws IOException {
        s7.a.i(this.f79156f);
        long length = lVar.getLength();
        int i10 = this.f79151a;
        if (((i10 & 2) == 0 && ((i10 & 1) == 0 || length == -1)) ? false : true) {
            e(lVar);
        }
        int i11 = lVar.read(this.f79153c.d(), 0, 2048);
        boolean z10 = i11 == -1;
        i(length, z10);
        if (z10) {
            return -1;
        }
        this.f79153c.P(0);
        this.f79153c.O(i11);
        if (!this.f79161k) {
            this.f79152b.packetStarted(this.f79157g, 4);
            this.f79161k = true;
        }
        this.f79152b.a(this.f79153c);
        return 0;
    }

    @Override // i6.k
    public boolean c(i6.l lVar) throws IOException {
        int iJ = j(lVar);
        int i10 = iJ;
        int i11 = 0;
        int i12 = 0;
        do {
            lVar.peekFully(this.f79154d.d(), 0, 2);
            this.f79154d.P(0);
            if (i.j(this.f79154d.J())) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                lVar.peekFully(this.f79154d.d(), 0, 4);
                this.f79155e.p(14);
                int iH = this.f79155e.h(13);
                if (iH <= 6) {
                    i10++;
                    lVar.resetPeekPosition();
                    lVar.advancePeekPosition(i10);
                } else {
                    lVar.advancePeekPosition(iH - 6);
                    i12 += iH;
                }
            } else {
                i10++;
                lVar.resetPeekPosition();
                lVar.advancePeekPosition(i10);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - iJ < 8192);
        return false;
    }

    public final void e(i6.l lVar) throws IOException {
        int iH;
        if (this.f79160j) {
            return;
        }
        this.f79159i = -1;
        lVar.resetPeekPosition();
        long j10 = 0;
        if (lVar.getPosition() == 0) {
            j(lVar);
        }
        int i10 = 0;
        int i11 = 0;
        do {
            try {
                if (!lVar.peekFully(this.f79154d.d(), 0, 2, true)) {
                    break;
                }
                this.f79154d.P(0);
                if (!i.j(this.f79154d.J())) {
                    break;
                }
                if (!lVar.peekFully(this.f79154d.d(), 0, 4, true)) {
                    break;
                }
                this.f79155e.p(14);
                iH = this.f79155e.h(13);
                if (iH <= 6) {
                    this.f79160j = true;
                    throw ParserException.createForMalformedContainer("Malformed ADTS stream", null);
                }
                j10 += (long) iH;
                i11++;
                if (i11 == 1000) {
                    break;
                }
            } catch (EOFException unused) {
            }
        } while (lVar.advancePeekPosition(iH - 6, true));
        i10 = i11;
        lVar.resetPeekPosition();
        if (i10 > 0) {
            this.f79159i = (int) (j10 / ((long) i10));
        } else {
            this.f79159i = -1;
        }
        this.f79160j = true;
    }

    public final i6.z g(long j10, boolean z10) {
        return new i6.d(j10, this.f79158h, f(this.f79159i, this.f79152b.h()), this.f79159i, z10);
    }

    public final void i(long j10, boolean z10) {
        if (this.f79162l) {
            return;
        }
        boolean z11 = (this.f79151a & 1) != 0 && this.f79159i > 0;
        if (z11 && this.f79152b.h() == -9223372036854775807L && !z10) {
            return;
        }
        if (!z11 || this.f79152b.h() == -9223372036854775807L) {
            this.f79156f.h(new z.b(-9223372036854775807L));
        } else {
            this.f79156f.h(g(j10, (this.f79151a & 2) != 0));
        }
        this.f79162l = true;
    }

    public final int j(i6.l lVar) throws IOException {
        int i10 = 0;
        while (true) {
            lVar.peekFully(this.f79154d.d(), 0, 10);
            this.f79154d.P(0);
            if (this.f79154d.G() != 4801587) {
                break;
            }
            this.f79154d.Q(3);
            int iC = this.f79154d.C();
            i10 += iC + 10;
            lVar.advancePeekPosition(iC);
        }
        lVar.resetPeekPosition();
        lVar.advancePeekPosition(i10);
        if (this.f79158h == -1) {
            this.f79158h = i10;
        }
        return i10;
    }

    @Override // i6.k
    public void release() {
    }

    @Override // i6.k
    public void seek(long j10, long j11) {
        this.f79161k = false;
        this.f79152b.seek();
        this.f79157g = j11;
    }
}
