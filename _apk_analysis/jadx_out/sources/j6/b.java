package j6;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.m;
import i6.b0;
import i6.d;
import i6.k;
import i6.l;
import i6.m;
import i6.p;
import i6.y;
import i6.z;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import s7.m0;

/* JADX INFO: compiled from: AmrExtractor.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements k {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f72317r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f72320u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f72321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f72322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f72323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f72324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f72325e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f72326f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f72327g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f72328h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f72329i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f72330j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f72331k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public m f72332l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b0 f72333m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public z f72334n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f72335o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final p f72315p = new p() { // from class: j6.a
        @Override // i6.p
        public final k[] createExtractors() {
            return b.l();
        }
    };

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f72316q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final byte[] f72318s = m0.h0("#!AMR\n");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final byte[] f72319t = m0.h0("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f72317r = iArr;
        f72320u = iArr[8];
    }

    public b() {
        this(0);
    }

    public b(int i10) {
        this.f72322b = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f72321a = new byte[1];
        this.f72329i = -1;
    }

    public static int f(int i10, long j10) {
        return (int) (((((long) i10) * 8) * 1000000) / j10);
    }

    public static /* synthetic */ k[] l() {
        return new k[]{new b()};
    }

    public static boolean o(l lVar, byte[] bArr) throws IOException {
        lVar.resetPeekPosition();
        byte[] bArr2 = new byte[bArr.length];
        lVar.peekFully(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // i6.k
    public void a(m mVar) {
        this.f72332l = mVar;
        this.f72333m = mVar.track(0, 1);
        mVar.endTracks();
    }

    @Override // i6.k
    public int b(l lVar, y yVar) throws IOException {
        e();
        if (lVar.getPosition() == 0 && !q(lVar)) {
            throw ParserException.createForMalformedContainer("Could not find AMR header.", null);
        }
        m();
        int iR = r(lVar);
        n(lVar.getLength(), iR);
        return iR;
    }

    @Override // i6.k
    public boolean c(l lVar) throws IOException {
        return q(lVar);
    }

    public final void e() {
        s7.a.i(this.f72333m);
        m0.j(this.f72332l);
    }

    public final z g(long j10, boolean z10) {
        return new d(j10, this.f72328h, f(this.f72329i, 20000L), this.f72329i, z10);
    }

    public final int h(int i10) throws ParserException {
        if (j(i10)) {
            return this.f72323c ? f72317r[i10] : f72316q[i10];
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Illegal AMR ");
        sb2.append(this.f72323c ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i10);
        throw ParserException.createForMalformedContainer(sb2.toString(), null);
    }

    public final boolean i(int i10) {
        return !this.f72323c && (i10 < 12 || i10 > 14);
    }

    public final boolean j(int i10) {
        return i10 >= 0 && i10 <= 15 && (k(i10) || i(i10));
    }

    public final boolean k(int i10) {
        return this.f72323c && (i10 < 10 || i10 > 13);
    }

    public final void m() {
        if (this.f72335o) {
            return;
        }
        this.f72335o = true;
        boolean z10 = this.f72323c;
        this.f72333m.b(new m.b().e0(z10 ? "audio/amr-wb" : "audio/3gpp").W(f72320u).H(1).f0(z10 ? 16000 : 8000).E());
    }

    public final void n(long j10, int i10) {
        int i11;
        if (this.f72327g) {
            return;
        }
        int i12 = this.f72322b;
        if ((i12 & 1) == 0 || j10 == -1 || !((i11 = this.f72329i) == -1 || i11 == this.f72325e)) {
            z.b bVar = new z.b(-9223372036854775807L);
            this.f72334n = bVar;
            this.f72332l.h(bVar);
            this.f72327g = true;
            return;
        }
        if (this.f72330j >= 20 || i10 == -1) {
            z zVarG = g(j10, (i12 & 2) != 0);
            this.f72334n = zVarG;
            this.f72332l.h(zVarG);
            this.f72327g = true;
        }
    }

    public final int p(l lVar) throws IOException {
        lVar.resetPeekPosition();
        lVar.peekFully(this.f72321a, 0, 1);
        byte b10 = this.f72321a[0];
        if ((b10 & 131) <= 0) {
            return h((b10 >> 3) & 15);
        }
        throw ParserException.createForMalformedContainer("Invalid padding bits for frame header " + ((int) b10), null);
    }

    public final boolean q(l lVar) throws IOException {
        byte[] bArr = f72318s;
        if (o(lVar, bArr)) {
            this.f72323c = false;
            lVar.skipFully(bArr.length);
            return true;
        }
        byte[] bArr2 = f72319t;
        if (!o(lVar, bArr2)) {
            return false;
        }
        this.f72323c = true;
        lVar.skipFully(bArr2.length);
        return true;
    }

    public final int r(l lVar) throws IOException {
        if (this.f72326f == 0) {
            try {
                int iP = p(lVar);
                this.f72325e = iP;
                this.f72326f = iP;
                if (this.f72329i == -1) {
                    this.f72328h = lVar.getPosition();
                    this.f72329i = this.f72325e;
                }
                if (this.f72329i == this.f72325e) {
                    this.f72330j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iF = this.f72333m.f(lVar, this.f72326f, true);
        if (iF == -1) {
            return -1;
        }
        int i10 = this.f72326f - iF;
        this.f72326f = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f72333m.c(this.f72331k + this.f72324d, 1, this.f72325e, 0, null);
        this.f72324d += 20000;
        return 0;
    }

    @Override // i6.k
    public void release() {
    }

    @Override // i6.k
    public void seek(long j10, long j11) {
        this.f72324d = 0L;
        this.f72325e = 0;
        this.f72326f = 0;
        if (j10 != 0) {
            z zVar = this.f72334n;
            if (zVar instanceof d) {
                this.f72331k = ((d) zVar).b(j10);
                return;
            }
        }
        this.f72331k = 0L;
    }
}
