package p6;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import f6.u;
import i6.b0;
import i6.j;
import i6.k;
import i6.l;
import i6.m;
import i6.p;
import i6.v;
import i6.w;
import i6.y;
import java.io.EOFException;
import java.io.IOException;
import p6.g;
import s7.a0;
import s7.m0;
import z6.b;

/* JADX INFO: compiled from: Mp3Extractor.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements k {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final p f77059u = new p() { // from class: p6.d
        @Override // i6.p
        public final k[] createExtractors() {
            return f.n();
        }
    };

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b.a f77060v = new b.a() { // from class: p6.e
        @Override // z6.b.a
        public final boolean evaluate(int i10, int i11, int i12, int i13, int i14) {
            return f.o(i10, i11, i12, i13, i14);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f77061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f77062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f77063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u.a f77064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v f77065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w f77066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b0 f77067g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m f77068h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b0 f77069i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b0 f77070j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f77071k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public Metadata f77072l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f77073m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f77074n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f77075o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f77076p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public g f77077q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f77078r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f77079s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f77080t;

    public f() {
        this(0);
    }

    public f(int i10) {
        this(i10, -9223372036854775807L);
    }

    public f(int i10, long j10) {
        this.f77061a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f77062b = j10;
        this.f77063c = new a0(10);
        this.f77064d = new u.a();
        this.f77065e = new v();
        this.f77073m = -9223372036854775807L;
        this.f77066f = new w();
        j jVar = new j();
        this.f77067g = jVar;
        this.f77070j = jVar;
    }

    public static long k(@Nullable Metadata metadata) {
        if (metadata == null) {
            return -9223372036854775807L;
        }
        int iF = metadata.f();
        for (int i10 = 0; i10 < iF; i10++) {
            Metadata.Entry entryE = metadata.e(i10);
            if (entryE instanceof TextInformationFrame) {
                TextInformationFrame textInformationFrame = (TextInformationFrame) entryE;
                if (textInformationFrame.f21934b.equals("TLEN")) {
                    return m0.w0(Long.parseLong(textInformationFrame.f21946d));
                }
            }
        }
        return -9223372036854775807L;
    }

    public static int l(a0 a0Var, int i10) {
        if (a0Var.f() >= i10 + 4) {
            a0Var.P(i10);
            int iN = a0Var.n();
            if (iN == 1483304551 || iN == 1231971951) {
                return iN;
            }
        }
        if (a0Var.f() < 40) {
            return 0;
        }
        a0Var.P(36);
        return a0Var.n() == 1447187017 ? 1447187017 : 0;
    }

    public static boolean m(int i10, long j10) {
        return ((long) (i10 & (-128000))) == (j10 & (-128000));
    }

    public static /* synthetic */ k[] n() {
        return new k[]{new f()};
    }

    public static /* synthetic */ boolean o(int i10, int i11, int i12, int i13, int i14) {
        return (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) || (i11 == 77 && i12 == 76 && i13 == 76 && (i14 == 84 || i10 == 2));
    }

    @Nullable
    public static c p(@Nullable Metadata metadata, long j10) {
        if (metadata == null) {
            return null;
        }
        int iF = metadata.f();
        for (int i10 = 0; i10 < iF; i10++) {
            Metadata.Entry entryE = metadata.e(i10);
            if (entryE instanceof MlltFrame) {
                return c.a(j10, (MlltFrame) entryE, k(metadata));
            }
        }
        return null;
    }

    @Override // i6.k
    public void a(m mVar) {
        this.f77068h = mVar;
        b0 b0VarTrack = mVar.track(0, 1);
        this.f77069i = b0VarTrack;
        this.f77070j = b0VarTrack;
        this.f77068h.endTracks();
    }

    @Override // i6.k
    public int b(l lVar, y yVar) throws IOException {
        f();
        int iS = s(lVar);
        if (iS == -1 && (this.f77077q instanceof b)) {
            long jH = h(this.f77074n);
            if (this.f77077q.getDurationUs() != jH) {
                ((b) this.f77077q).c(jH);
                this.f77068h.h(this.f77077q);
            }
        }
        return iS;
    }

    @Override // i6.k
    public boolean c(l lVar) throws IOException {
        return u(lVar, true);
    }

    public final void f() {
        s7.a.i(this.f77069i);
        m0.j(this.f77068h);
    }

    public final g g(l lVar) throws IOException {
        long jK;
        long j10;
        long durationUs;
        long dataEndPosition;
        g gVarQ = q(lVar);
        c cVarP = p(this.f77072l, lVar.getPosition());
        if (this.f77078r) {
            return new g.a();
        }
        if ((this.f77061a & 4) != 0) {
            if (cVarP != null) {
                durationUs = cVarP.getDurationUs();
                dataEndPosition = cVarP.getDataEndPosition();
            } else if (gVarQ != null) {
                durationUs = gVarQ.getDurationUs();
                dataEndPosition = gVarQ.getDataEndPosition();
            } else {
                jK = k(this.f77072l);
                j10 = -1;
                gVarQ = new b(jK, lVar.getPosition(), j10);
            }
            j10 = dataEndPosition;
            jK = durationUs;
            gVarQ = new b(jK, lVar.getPosition(), j10);
        } else if (cVarP != null) {
            gVarQ = cVarP;
        } else if (gVarQ == null) {
            gVarQ = null;
        }
        if (gVarQ == null || !(gVarQ.isSeekable() || (this.f77061a & 1) == 0)) {
            return j(lVar, (this.f77061a & 2) != 0);
        }
        return gVarQ;
    }

    public final long h(long j10) {
        return this.f77073m + ((j10 * 1000000) / ((long) this.f77064d.f61552d));
    }

    public void i() {
        this.f77078r = true;
    }

    public final g j(l lVar, boolean z10) throws IOException {
        lVar.peekFully(this.f77063c.d(), 0, 4);
        this.f77063c.P(0);
        this.f77064d.a(this.f77063c.n());
        return new a(lVar.getLength(), lVar.getPosition(), this.f77064d, z10);
    }

    @Nullable
    public final g q(l lVar) throws IOException {
        a0 a0Var = new a0(this.f77064d.f61551c);
        lVar.peekFully(a0Var.d(), 0, this.f77064d.f61551c);
        u.a aVar = this.f77064d;
        int i10 = 21;
        if ((aVar.f61549a & 1) != 0) {
            if (aVar.f61553e != 1) {
                i10 = 36;
            }
        } else if (aVar.f61553e == 1) {
            i10 = 13;
        }
        int i11 = i10;
        int iL = l(a0Var, i11);
        if (iL != 1483304551 && iL != 1231971951) {
            if (iL != 1447187017) {
                lVar.resetPeekPosition();
                return null;
            }
            h hVarA = h.a(lVar.getLength(), lVar.getPosition(), this.f77064d, a0Var);
            lVar.skipFully(this.f77064d.f61551c);
            return hVarA;
        }
        i iVarA = i.a(lVar.getLength(), lVar.getPosition(), this.f77064d, a0Var);
        if (iVarA != null && !this.f77065e.a()) {
            lVar.resetPeekPosition();
            lVar.advancePeekPosition(i11 + 141);
            lVar.peekFully(this.f77063c.d(), 0, 3);
            this.f77063c.P(0);
            this.f77065e.d(this.f77063c.G());
        }
        lVar.skipFully(this.f77064d.f61551c);
        return (iVarA == null || iVarA.isSeekable() || iL != 1231971951) ? iVarA : j(lVar, false);
    }

    public final boolean r(l lVar) throws IOException {
        g gVar = this.f77077q;
        if (gVar != null) {
            long dataEndPosition = gVar.getDataEndPosition();
            if (dataEndPosition != -1 && lVar.getPeekPosition() > dataEndPosition - 4) {
                return true;
            }
        }
        try {
            return !lVar.peekFully(this.f77063c.d(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @Override // i6.k
    public void release() {
    }

    public final int s(l lVar) throws IOException {
        if (this.f77071k == 0) {
            try {
                u(lVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f77077q == null) {
            g gVarG = g(lVar);
            this.f77077q = gVarG;
            this.f77068h.h(gVarG);
            this.f77070j.b(new m.b().e0(this.f77064d.f61550b).W(4096).H(this.f77064d.f61553e).f0(this.f77064d.f61552d).N(this.f77065e.f63937a).O(this.f77065e.f63938b).X((this.f77061a & 8) != 0 ? null : this.f77072l).E());
            this.f77075o = lVar.getPosition();
        } else if (this.f77075o != 0) {
            long position = lVar.getPosition();
            long j10 = this.f77075o;
            if (position < j10) {
                lVar.skipFully((int) (j10 - position));
            }
        }
        return t(lVar);
    }

    @Override // i6.k
    public void seek(long j10, long j11) {
        this.f77071k = 0;
        this.f77073m = -9223372036854775807L;
        this.f77074n = 0L;
        this.f77076p = 0;
        this.f77080t = j11;
        g gVar = this.f77077q;
        if (!(gVar instanceof b) || ((b) gVar).a(j11)) {
            return;
        }
        this.f77079s = true;
        this.f77070j = this.f77067g;
    }

    public final int t(l lVar) throws IOException {
        if (this.f77076p == 0) {
            lVar.resetPeekPosition();
            if (r(lVar)) {
                return -1;
            }
            this.f77063c.P(0);
            int iN = this.f77063c.n();
            if (!m(iN, this.f77071k) || u.j(iN) == -1) {
                lVar.skipFully(1);
                this.f77071k = 0;
                return 0;
            }
            this.f77064d.a(iN);
            if (this.f77073m == -9223372036854775807L) {
                this.f77073m = this.f77077q.getTimeUs(lVar.getPosition());
                if (this.f77062b != -9223372036854775807L) {
                    this.f77073m += this.f77062b - this.f77077q.getTimeUs(0L);
                }
            }
            u.a aVar = this.f77064d;
            this.f77076p = aVar.f61551c;
            g gVar = this.f77077q;
            if (gVar instanceof b) {
                b bVar = (b) gVar;
                bVar.b(h(this.f77074n + ((long) aVar.f61555g)), lVar.getPosition() + ((long) this.f77064d.f61551c));
                if (this.f77079s && bVar.a(this.f77080t)) {
                    this.f77079s = false;
                    this.f77070j = this.f77069i;
                }
            }
        }
        int iF = this.f77070j.f(lVar, this.f77076p, true);
        if (iF == -1) {
            return -1;
        }
        int i10 = this.f77076p - iF;
        this.f77076p = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f77070j.c(h(this.f77074n), 1, this.f77064d.f61551c, 0, null);
        this.f77074n += (long) this.f77064d.f61555g;
        this.f77076p = 0;
        return 0;
    }

    public final boolean u(l lVar, boolean z10) throws IOException {
        int peekPosition;
        int i10;
        int iJ;
        int i11 = z10 ? 32768 : 131072;
        lVar.resetPeekPosition();
        if (lVar.getPosition() == 0) {
            Metadata metadataA = this.f77066f.a(lVar, (this.f77061a & 8) == 0 ? null : f77060v);
            this.f77072l = metadataA;
            if (metadataA != null) {
                this.f77065e.c(metadataA);
            }
            peekPosition = (int) lVar.getPeekPosition();
            if (!z10) {
                lVar.skipFully(peekPosition);
            }
            i10 = 0;
        } else {
            peekPosition = 0;
            i10 = 0;
        }
        int i12 = i10;
        int i13 = i12;
        while (true) {
            if (!r(lVar)) {
                this.f77063c.P(0);
                int iN = this.f77063c.n();
                if ((i10 == 0 || m(iN, i10)) && (iJ = u.j(iN)) != -1) {
                    i12++;
                    if (i12 != 1) {
                        if (i12 == 4) {
                            break;
                        }
                    } else {
                        this.f77064d.a(iN);
                        i10 = iN;
                    }
                    lVar.advancePeekPosition(iJ - 4);
                } else {
                    int i14 = i13 + 1;
                    if (i13 == i11) {
                        if (z10) {
                            return false;
                        }
                        throw ParserException.createForMalformedContainer("Searched too many bytes.", null);
                    }
                    if (z10) {
                        lVar.resetPeekPosition();
                        lVar.advancePeekPosition(peekPosition + i14);
                    } else {
                        lVar.skipFully(1);
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
            lVar.skipFully(peekPosition + i13);
        } else {
            lVar.resetPeekPosition();
        }
        this.f77071k = i10;
        return true;
    }
}
