package t4;

import androidx.annotation.Nullable;
import com.google.android.exoplayer.ParserException;
import java.io.EOFException;
import java.io.IOException;
import k4.s;
import t4.h0;

/* JADX INFO: compiled from: AdtsExtractor.java */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements k4.g {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final k4.k f84728m = new k4.k() { // from class: t4.g
        @Override // k4.k
        public final k4.g[] createExtractors() {
            return h.h();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f84729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f84730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a6.t f84731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a6.t f84732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a6.s f84733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public k4.i f84734f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f84735g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f84736h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f84737i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f84738j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f84739k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f84740l;

    public h() {
        this(0);
    }

    public h(int i10) {
        this.f84729a = i10;
        this.f84730b = new i(true);
        this.f84731c = new a6.t(2048);
        this.f84737i = -1;
        this.f84736h = -1L;
        a6.t tVar = new a6.t(10);
        this.f84732d = tVar;
        this.f84733e = new a6.s(tVar.f3620a);
    }

    public static int f(int i10, long j10) {
        return (int) ((((long) (i10 * 8)) * 1000000) / j10);
    }

    public static /* synthetic */ k4.g[] h() {
        return new k4.g[]{new h()};
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        r9.resetPeekPosition();
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002a, code lost:
    
        if ((r3 - r0) < 8192) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        return false;
     */
    @Override // k4.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(k4.h r9) throws java.lang.InterruptedException, java.io.IOException {
        /*
            r8 = this;
            int r0 = r8.j(r9)
            r1 = 0
            r3 = r0
        L6:
            r2 = r1
            r4 = r2
        L8:
            a6.t r5 = r8.f84732d
            byte[] r5 = r5.f3620a
            r6 = 2
            r9.peekFully(r5, r1, r6)
            a6.t r5 = r8.f84732d
            r5.L(r1)
            a6.t r5 = r8.f84732d
            int r5 = r5.E()
            boolean r5 = t4.i.i(r5)
            if (r5 != 0) goto L31
            r9.resetPeekPosition()
            int r3 = r3 + 1
            int r2 = r3 - r0
            r4 = 8192(0x2000, float:1.148E-41)
            if (r2 < r4) goto L2d
            return r1
        L2d:
            r9.advancePeekPosition(r3)
            goto L6
        L31:
            r5 = 1
            int r2 = r2 + r5
            r6 = 4
            if (r2 < r6) goto L3b
            r7 = 188(0xbc, float:2.63E-43)
            if (r4 <= r7) goto L3b
            return r5
        L3b:
            a6.t r5 = r8.f84732d
            byte[] r5 = r5.f3620a
            r9.peekFully(r5, r1, r6)
            a6.s r5 = r8.f84733e
            r6 = 14
            r5.o(r6)
            a6.s r5 = r8.f84733e
            r6 = 13
            int r5 = r5.h(r6)
            r6 = 6
            if (r5 > r6) goto L55
            return r1
        L55:
            int r6 = r5 + (-6)
            r9.advancePeekPosition(r6)
            int r4 = r4 + r5
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.h.a(k4.h):boolean");
    }

    @Override // k4.g
    public void b(k4.i iVar) {
        this.f84734f = iVar;
        this.f84730b.b(iVar, new h0.d(0, 1));
        iVar.endTracks();
    }

    @Override // k4.g
    public int c(k4.h hVar, k4.r rVar) throws InterruptedException, IOException {
        long length = hVar.getLength();
        boolean z10 = ((this.f84729a & 1) == 0 || length == -1) ? false : true;
        if (z10) {
            e(hVar);
        }
        int i10 = hVar.read(this.f84731c.f3620a, 0, 2048);
        boolean z11 = i10 == -1;
        i(length, z10, z11);
        if (z11) {
            return -1;
        }
        this.f84731c.L(0);
        this.f84731c.K(i10);
        if (!this.f84739k) {
            this.f84730b.packetStarted(this.f84735g, 4);
            this.f84739k = true;
        }
        this.f84730b.a(this.f84731c);
        return 0;
    }

    public final void e(k4.h hVar) throws InterruptedException, IOException {
        int iH;
        if (this.f84738j) {
            return;
        }
        this.f84737i = -1;
        hVar.resetPeekPosition();
        long j10 = 0;
        if (hVar.getPosition() == 0) {
            j(hVar);
        }
        int i10 = 0;
        int i11 = 0;
        do {
            try {
                if (!hVar.peekFully(this.f84732d.f3620a, 0, 2, true)) {
                    break;
                }
                this.f84732d.L(0);
                if (!i.i(this.f84732d.E())) {
                    break;
                }
                if (!hVar.peekFully(this.f84732d.f3620a, 0, 4, true)) {
                    break;
                }
                this.f84733e.o(14);
                iH = this.f84733e.h(13);
                if (iH <= 6) {
                    this.f84738j = true;
                    throw new ParserException("Malformed ADTS stream");
                }
                j10 += (long) iH;
                i11++;
                if (i11 == 1000) {
                    break;
                }
            } catch (EOFException unused) {
            }
        } while (hVar.advancePeekPosition(iH - 6, true));
        i10 = i11;
        hVar.resetPeekPosition();
        if (i10 > 0) {
            this.f84737i = (int) (j10 / ((long) i10));
        } else {
            this.f84737i = -1;
        }
        this.f84738j = true;
    }

    public final k4.s g(long j10) {
        return new k4.c(j10, this.f84736h, f(this.f84737i, this.f84730b.g()), this.f84737i);
    }

    public final void i(long j10, boolean z10, boolean z11) {
        if (this.f84740l) {
            return;
        }
        boolean z12 = z10 && this.f84737i > 0;
        if (z12 && this.f84730b.g() == -9223372036854775807L && !z11) {
            return;
        }
        k4.i iVar = (k4.i) a6.a.e(this.f84734f);
        if (!z12 || this.f84730b.g() == -9223372036854775807L) {
            iVar.c(new s.b(-9223372036854775807L));
        } else {
            iVar.c(g(j10));
        }
        this.f84740l = true;
    }

    public final int j(k4.h hVar) throws InterruptedException, IOException {
        int i10 = 0;
        while (true) {
            hVar.peekFully(this.f84732d.f3620a, 0, 10);
            this.f84732d.L(0);
            if (this.f84732d.B() != 4801587) {
                break;
            }
            this.f84732d.M(3);
            int iX = this.f84732d.x();
            i10 += iX + 10;
            hVar.advancePeekPosition(iX);
        }
        hVar.resetPeekPosition();
        hVar.advancePeekPosition(i10);
        if (this.f84736h == -1) {
            this.f84736h = i10;
        }
        return i10;
    }

    @Override // k4.g
    public void release() {
    }

    @Override // k4.g
    public void seek(long j10, long j11) {
        this.f84739k = false;
        this.f84730b.seek();
        this.f84735g = j11;
    }
}
