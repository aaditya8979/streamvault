package l4;

import a6.k0;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.ParserException;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import k4.c;
import k4.g;
import k4.h;
import k4.i;
import k4.k;
import k4.r;
import k4.s;
import k4.u;

/* JADX INFO: compiled from: AmrExtractor.java */
/* JADX INFO: loaded from: classes6.dex */
public final class b implements g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f73668r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f73671u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f73672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f73673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f73674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f73675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f73676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f73677f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f73678g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f73679h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f73680i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f73681j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f73682k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public i f73683l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public u f73684m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public s f73685n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f73686o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final k f73666p = new k() { // from class: l4.a
        @Override // k4.k
        public final g[] createExtractors() {
            return b.k();
        }
    };

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f73667q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final byte[] f73669s = k0.c0("#!AMR\n");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final byte[] f73670t = k0.c0("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f73668r = iArr;
        f73671u = iArr[8];
    }

    public b() {
        this(0);
    }

    public b(int i10) {
        this.f73673b = i10;
        this.f73672a = new byte[1];
        this.f73680i = -1;
    }

    public static int e(int i10, long j10) {
        return (int) ((((long) (i10 * 8)) * 1000000) / j10);
    }

    public static /* synthetic */ g[] k() {
        return new g[]{new b()};
    }

    @Override // k4.g
    public boolean a(h hVar) throws InterruptedException, IOException {
        return p(hVar);
    }

    @Override // k4.g
    public void b(i iVar) {
        this.f73683l = iVar;
        this.f73684m = iVar.track(0, 1);
        iVar.endTracks();
    }

    @Override // k4.g
    public int c(h hVar, r rVar) throws InterruptedException, IOException {
        if (hVar.getPosition() == 0 && !p(hVar)) {
            throw new ParserException("Could not find AMR header.");
        }
        l();
        int iQ = q(hVar);
        m(hVar.getLength(), iQ);
        return iQ;
    }

    public final s f(long j10) {
        return new c(j10, this.f73679h, e(this.f73680i, 20000L), this.f73680i);
    }

    public final int g(int i10) throws ParserException {
        if (i(i10)) {
            return this.f73674c ? f73668r[i10] : f73667q[i10];
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Illegal AMR ");
        sb2.append(this.f73674c ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i10);
        throw new ParserException(sb2.toString());
    }

    public final boolean h(int i10) {
        return !this.f73674c && (i10 < 12 || i10 > 14);
    }

    public final boolean i(int i10) {
        return i10 >= 0 && i10 <= 15 && (j(i10) || h(i10));
    }

    public final boolean j(int i10) {
        return this.f73674c && (i10 < 10 || i10 > 13);
    }

    public final void l() {
        if (this.f73686o) {
            return;
        }
        this.f73686o = true;
        boolean z10 = this.f73674c;
        this.f73684m.d(Format.p(null, z10 ? "audio/amr-wb" : "audio/3gpp", null, -1, f73671u, 1, z10 ? 16000 : 8000, -1, null, null, 0, null));
    }

    public final void m(long j10, int i10) {
        int i11;
        if (this.f73678g) {
            return;
        }
        if ((this.f73673b & 1) == 0 || j10 == -1 || !((i11 = this.f73680i) == -1 || i11 == this.f73676e)) {
            s.b bVar = new s.b(-9223372036854775807L);
            this.f73685n = bVar;
            this.f73683l.c(bVar);
            this.f73678g = true;
            return;
        }
        if (this.f73681j >= 20 || i10 == -1) {
            s sVarF = f(j10);
            this.f73685n = sVarF;
            this.f73683l.c(sVarF);
            this.f73678g = true;
        }
    }

    public final boolean n(h hVar, byte[] bArr) throws InterruptedException, IOException {
        hVar.resetPeekPosition();
        byte[] bArr2 = new byte[bArr.length];
        hVar.peekFully(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    public final int o(h hVar) throws InterruptedException, IOException {
        hVar.resetPeekPosition();
        hVar.peekFully(this.f73672a, 0, 1);
        byte b10 = this.f73672a[0];
        if ((b10 & 131) <= 0) {
            return g((b10 >> 3) & 15);
        }
        throw new ParserException("Invalid padding bits for frame header " + ((int) b10));
    }

    public final boolean p(h hVar) throws InterruptedException, IOException {
        byte[] bArr = f73669s;
        if (n(hVar, bArr)) {
            this.f73674c = false;
            hVar.skipFully(bArr.length);
            return true;
        }
        byte[] bArr2 = f73670t;
        if (!n(hVar, bArr2)) {
            return false;
        }
        this.f73674c = true;
        hVar.skipFully(bArr2.length);
        return true;
    }

    public final int q(h hVar) throws InterruptedException, IOException {
        if (this.f73677f == 0) {
            try {
                int iO = o(hVar);
                this.f73676e = iO;
                this.f73677f = iO;
                if (this.f73680i == -1) {
                    this.f73679h = hVar.getPosition();
                    this.f73680i = this.f73676e;
                }
                if (this.f73680i == this.f73676e) {
                    this.f73681j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iB = this.f73684m.b(hVar, this.f73677f, true);
        if (iB == -1) {
            return -1;
        }
        int i10 = this.f73677f - iB;
        this.f73677f = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f73684m.c(this.f73682k + this.f73675d, 1, this.f73676e, 0, null);
        this.f73675d += 20000;
        return 0;
    }

    @Override // k4.g
    public void release() {
    }

    @Override // k4.g
    public void seek(long j10, long j11) {
        this.f73675d = 0L;
        this.f73676e = 0;
        this.f73677f = 0;
        if (j10 != 0) {
            s sVar = this.f73685n;
            if (sVar instanceof c) {
                this.f73682k = ((c) sVar).b(j10);
                return;
            }
        }
        this.f73682k = 0L;
    }
}
