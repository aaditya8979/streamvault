package p4;

import a6.t;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.metadata.Metadata;
import com.google.android.exoplayer.metadata.id3.MlltFrame;
import java.io.EOFException;
import java.io.IOException;
import k4.i;
import k4.k;
import k4.o;
import k4.p;
import k4.q;
import k4.r;
import k4.u;
import p4.f;
import z4.b;

/* JADX INFO: compiled from: Mp3Extractor.java */
/* JADX INFO: loaded from: classes9.dex */
public final class e implements k4.g {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final k f76966q = new k() { // from class: p4.c
        @Override // k4.k
        public final k4.g[] createExtractors() {
            return e.j();
        }
    };

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b.a f76967r = new b.a() { // from class: p4.d
        @Override // z4.b.a
        public final boolean evaluate(int i10, int i11, int i12, int i13, int i14) {
            return e.k(i10, i11, i12, i13, i14);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f76968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f76969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f76970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f76971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o f76972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p f76973f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i f76974g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public u f76975h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f76976i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Metadata f76977j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public f f76978k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f76979l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f76980m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f76981n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f76982o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f76983p;

    public e() {
        this(0);
    }

    public e(int i10) {
        this(i10, -9223372036854775807L);
    }

    public e(int i10, long j10) {
        this.f76968a = i10;
        this.f76969b = j10;
        this.f76970c = new t(10);
        this.f76971d = new q();
        this.f76972e = new o();
        this.f76980m = -9223372036854775807L;
        this.f76973f = new p();
    }

    public static int h(t tVar, int i10) {
        if (tVar.d() >= i10 + 4) {
            tVar.L(i10);
            int iJ = tVar.j();
            if (iJ == 1483304551 || iJ == 1231971951) {
                return iJ;
            }
        }
        if (tVar.d() < 40) {
            return 0;
        }
        tVar.L(36);
        return tVar.j() == 1447187017 ? 1447187017 : 0;
    }

    public static boolean i(int i10, long j10) {
        return ((long) (i10 & (-128000))) == (j10 & (-128000));
    }

    public static /* synthetic */ k4.g[] j() {
        return new k4.g[]{new e()};
    }

    public static /* synthetic */ boolean k(int i10, int i11, int i12, int i13, int i14) {
        return (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) || (i11 == 77 && i12 == 76 && i13 == 76 && (i14 == 84 || i10 == 2));
    }

    @Nullable
    public static b l(Metadata metadata, long j10) {
        if (metadata == null) {
            return null;
        }
        int iE = metadata.e();
        for (int i10 = 0; i10 < iE; i10++) {
            Metadata.Entry entryD = metadata.d(i10);
            if (entryD instanceof MlltFrame) {
                return b.a(j10, (MlltFrame) entryD);
            }
        }
        return null;
    }

    @Override // k4.g
    public boolean a(k4.h hVar) throws InterruptedException, IOException {
        return p(hVar, true);
    }

    @Override // k4.g
    public void b(i iVar) {
        this.f76974g = iVar;
        this.f76975h = iVar.track(0, 1);
        this.f76974g.endTracks();
    }

    @Override // k4.g
    public int c(k4.h hVar, r rVar) throws InterruptedException, IOException {
        if (this.f76976i == 0) {
            try {
                p(hVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f76978k == null) {
            f fVarM = m(hVar);
            b bVarL = l(this.f76977j, hVar.getPosition());
            if (this.f76979l) {
                this.f76978k = new f.a();
            } else {
                if (bVarL != null) {
                    this.f76978k = bVarL;
                } else if (fVarM != null) {
                    this.f76978k = fVarM;
                }
                f fVar = this.f76978k;
                if (fVar == null || (!fVar.isSeekable() && (this.f76968a & 1) != 0)) {
                    this.f76978k = g(hVar);
                }
            }
            this.f76974g.c(this.f76978k);
            u uVar = this.f76975h;
            q qVar = this.f76971d;
            String str = qVar.f72912b;
            int i10 = qVar.f72915e;
            int i11 = qVar.f72914d;
            o oVar = this.f76972e;
            uVar.d(Format.o(null, str, null, -1, 4096, i10, i11, -1, oVar.f72901a, oVar.f72902b, null, null, 0, null, (this.f76968a & 2) != 0 ? null : this.f76977j));
            this.f76982o = hVar.getPosition();
        } else if (this.f76982o != 0) {
            long position = hVar.getPosition();
            long j10 = this.f76982o;
            if (position < j10) {
                hVar.skipFully((int) (j10 - position));
            }
        }
        return o(hVar);
    }

    public void f() {
        this.f76979l = true;
    }

    public final f g(k4.h hVar) throws InterruptedException, IOException {
        hVar.peekFully(this.f76970c.f3620a, 0, 4);
        this.f76970c.L(0);
        q.e(this.f76970c.j(), this.f76971d);
        return new a(hVar.getLength(), hVar.getPosition(), this.f76971d);
    }

    public final f m(k4.h hVar) throws InterruptedException, IOException {
        t tVar = new t(this.f76971d.f72913c);
        hVar.peekFully(tVar.f3620a, 0, this.f76971d.f72913c);
        q qVar = this.f76971d;
        int i10 = 21;
        if ((qVar.f72911a & 1) != 0) {
            if (qVar.f72915e != 1) {
                i10 = 36;
            }
        } else if (qVar.f72915e == 1) {
            i10 = 13;
        }
        int i11 = i10;
        int iH = h(tVar, i11);
        if (iH != 1483304551 && iH != 1231971951) {
            if (iH != 1447187017) {
                hVar.resetPeekPosition();
                return null;
            }
            g gVarA = g.a(hVar.getLength(), hVar.getPosition(), this.f76971d, tVar);
            hVar.skipFully(this.f76971d.f72913c);
            return gVarA;
        }
        h hVarA = h.a(hVar.getLength(), hVar.getPosition(), this.f76971d, tVar);
        if (hVarA != null && !this.f76972e.a()) {
            hVar.resetPeekPosition();
            hVar.advancePeekPosition(i11 + 141);
            hVar.peekFully(this.f76970c.f3620a, 0, 3);
            this.f76970c.L(0);
            this.f76972e.d(this.f76970c.B());
        }
        hVar.skipFully(this.f76971d.f72913c);
        return (hVarA == null || hVarA.isSeekable() || iH != 1231971951) ? hVarA : g(hVar);
    }

    public final boolean n(k4.h hVar) throws InterruptedException, IOException {
        f fVar = this.f76978k;
        if (fVar != null) {
            long dataEndPosition = fVar.getDataEndPosition();
            if (dataEndPosition != -1 && hVar.getPeekPosition() > dataEndPosition - 4) {
                return true;
            }
        }
        try {
            return !hVar.peekFully(this.f76970c.f3620a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    public final int o(k4.h hVar) throws InterruptedException, IOException {
        if (this.f76983p == 0) {
            hVar.resetPeekPosition();
            if (n(hVar)) {
                return -1;
            }
            this.f76970c.L(0);
            int iJ = this.f76970c.j();
            if (!i(iJ, this.f76976i) || q.b(iJ) == -1) {
                hVar.skipFully(1);
                this.f76976i = 0;
                return 0;
            }
            q.e(iJ, this.f76971d);
            if (this.f76980m == -9223372036854775807L) {
                this.f76980m = this.f76978k.getTimeUs(hVar.getPosition());
                if (this.f76969b != -9223372036854775807L) {
                    this.f76980m += this.f76969b - this.f76978k.getTimeUs(0L);
                }
            }
            this.f76983p = this.f76971d.f72913c;
        }
        int iB = this.f76975h.b(hVar, this.f76983p, true);
        if (iB == -1) {
            return -1;
        }
        int i10 = this.f76983p - iB;
        this.f76983p = i10;
        if (i10 > 0) {
            return 0;
        }
        long j10 = this.f76980m;
        long j11 = this.f76981n * 1000000;
        q qVar = this.f76971d;
        this.f76975h.c(j10 + (j11 / ((long) qVar.f72914d)), 1, qVar.f72913c, 0, null);
        this.f76981n += (long) this.f76971d.f72917g;
        this.f76983p = 0;
        return 0;
    }

    public final boolean p(k4.h hVar, boolean z10) throws InterruptedException, IOException {
        int peekPosition;
        int i10;
        int iB;
        int i11 = z10 ? 16384 : 131072;
        hVar.resetPeekPosition();
        if (hVar.getPosition() == 0) {
            Metadata metadataA = this.f76973f.a(hVar, (this.f76968a & 2) == 0 ? null : f76967r);
            this.f76977j = metadataA;
            if (metadataA != null) {
                this.f76972e.c(metadataA);
            }
            peekPosition = (int) hVar.getPeekPosition();
            if (!z10) {
                hVar.skipFully(peekPosition);
            }
            i10 = 0;
        } else {
            peekPosition = 0;
            i10 = 0;
        }
        int i12 = i10;
        int i13 = i12;
        while (true) {
            if (!n(hVar)) {
                this.f76970c.L(0);
                int iJ = this.f76970c.j();
                if ((i10 == 0 || i(iJ, i10)) && (iB = q.b(iJ)) != -1) {
                    i12++;
                    if (i12 != 1) {
                        if (i12 == 4) {
                            break;
                        }
                    } else {
                        q.e(iJ, this.f76971d);
                        i10 = iJ;
                    }
                    hVar.advancePeekPosition(iB - 4);
                } else {
                    int i14 = i13 + 1;
                    if (i13 == i11) {
                        if (z10) {
                            return false;
                        }
                        throw new ParserException("Searched too many bytes.");
                    }
                    if (z10) {
                        hVar.resetPeekPosition();
                        hVar.advancePeekPosition(peekPosition + i14);
                    } else {
                        hVar.skipFully(1);
                    }
                    i12 = 0;
                    i13 = i14;
                    i10 = 0;
                }
            } else if (i12 <= 0) {
                throw new EOFException();
            }
        }
        if (z10) {
            hVar.skipFully(peekPosition + i13);
        } else {
            hVar.resetPeekPosition();
        }
        this.f76976i = i10;
        return true;
    }

    @Override // k4.g
    public void release() {
    }

    @Override // k4.g
    public void seek(long j10, long j11) {
        this.f76976i = 0;
        this.f76980m = -9223372036854775807L;
        this.f76981n = 0L;
        this.f76983p = 0;
    }
}
