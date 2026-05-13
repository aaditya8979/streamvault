package s6;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.core.view.InputDeviceCompat;
import com.google.android.exoplayer2.ParserException;
import i6.z;
import java.io.IOException;
import s6.i0;

/* JADX INFO: compiled from: PsExtractor.java */
/* JADX INFO: loaded from: classes11.dex */
public final class a0 implements i6.k {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final i6.p f79076l = new i6.p() { // from class: s6.z
        @Override // i6.p
        public final i6.k[] createExtractors() {
            return a0.e();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s7.j0 f79077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray<a> f79078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s7.a0 f79079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y f79080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f79081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f79082f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f79083g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f79084h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public x f79085i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i6.m f79086j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f79087k;

    /* JADX INFO: compiled from: PsExtractor.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f79088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s7.j0 f79089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final s7.z f79090c = new s7.z(new byte[64]);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f79091d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f79092e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f79093f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f79094g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f79095h;

        public a(m mVar, s7.j0 j0Var) {
            this.f79088a = mVar;
            this.f79089b = j0Var;
        }

        public void a(s7.a0 a0Var) throws ParserException {
            a0Var.j(this.f79090c.f79571a, 0, 3);
            this.f79090c.p(0);
            b();
            a0Var.j(this.f79090c.f79571a, 0, this.f79094g);
            this.f79090c.p(0);
            c();
            this.f79088a.packetStarted(this.f79095h, 4);
            this.f79088a.a(a0Var);
            this.f79088a.packetFinished();
        }

        public final void b() {
            this.f79090c.r(8);
            this.f79091d = this.f79090c.g();
            this.f79092e = this.f79090c.g();
            this.f79090c.r(6);
            this.f79094g = this.f79090c.h(8);
        }

        public final void c() {
            this.f79095h = 0L;
            if (this.f79091d) {
                this.f79090c.r(4);
                long jH = ((long) this.f79090c.h(3)) << 30;
                this.f79090c.r(1);
                long jH2 = jH | ((long) (this.f79090c.h(15) << 15));
                this.f79090c.r(1);
                long jH3 = jH2 | ((long) this.f79090c.h(15));
                this.f79090c.r(1);
                if (!this.f79093f && this.f79092e) {
                    this.f79090c.r(4);
                    long jH4 = ((long) this.f79090c.h(3)) << 30;
                    this.f79090c.r(1);
                    long jH5 = jH4 | ((long) (this.f79090c.h(15) << 15));
                    this.f79090c.r(1);
                    long jH6 = jH5 | ((long) this.f79090c.h(15));
                    this.f79090c.r(1);
                    this.f79089b.b(jH6);
                    this.f79093f = true;
                }
                this.f79095h = this.f79089b.b(jH3);
            }
        }

        public void d() {
            this.f79093f = false;
            this.f79088a.seek();
        }
    }

    public a0() {
        this(new s7.j0(0L));
    }

    public a0(s7.j0 j0Var) {
        this.f79077a = j0Var;
        this.f79079c = new s7.a0(4096);
        this.f79078b = new SparseArray<>();
        this.f79080d = new y();
    }

    public static /* synthetic */ i6.k[] e() {
        return new i6.k[]{new a0()};
    }

    @Override // i6.k
    public void a(i6.m mVar) {
        this.f79086j = mVar;
    }

    @Override // i6.k
    public int b(i6.l lVar, i6.y yVar) throws IOException {
        s7.a.i(this.f79086j);
        long length = lVar.getLength();
        if ((length != -1) && !this.f79080d.e()) {
            return this.f79080d.g(lVar, yVar);
        }
        f(length);
        x xVar = this.f79085i;
        if (xVar != null && xVar.d()) {
            return this.f79085i.c(lVar, yVar);
        }
        lVar.resetPeekPosition();
        long peekPosition = length != -1 ? length - lVar.getPeekPosition() : -1L;
        if ((peekPosition != -1 && peekPosition < 4) || !lVar.peekFully(this.f79079c.d(), 0, 4, true)) {
            return -1;
        }
        this.f79079c.P(0);
        int iN = this.f79079c.n();
        if (iN == 441) {
            return -1;
        }
        if (iN == 442) {
            lVar.peekFully(this.f79079c.d(), 0, 10);
            this.f79079c.P(9);
            lVar.skipFully((this.f79079c.D() & 7) + 14);
            return 0;
        }
        if (iN == 443) {
            lVar.peekFully(this.f79079c.d(), 0, 2);
            this.f79079c.P(0);
            lVar.skipFully(this.f79079c.J() + 6);
            return 0;
        }
        if (((iN & InputDeviceCompat.SOURCE_ANY) >> 8) != 1) {
            lVar.skipFully(1);
            return 0;
        }
        int i10 = iN & 255;
        a aVar = this.f79078b.get(i10);
        if (!this.f79081e) {
            if (aVar == null) {
                m nVar = null;
                if (i10 == 189) {
                    nVar = new c();
                    this.f79082f = true;
                    this.f79084h = lVar.getPosition();
                } else if ((i10 & 224) == 192) {
                    nVar = new t();
                    this.f79082f = true;
                    this.f79084h = lVar.getPosition();
                } else if ((i10 & 240) == 224) {
                    nVar = new n();
                    this.f79083g = true;
                    this.f79084h = lVar.getPosition();
                }
                if (nVar != null) {
                    nVar.b(this.f79086j, new i0.d(i10, 256));
                    aVar = new a(nVar, this.f79077a);
                    this.f79078b.put(i10, aVar);
                }
            }
            if (lVar.getPosition() > ((this.f79082f && this.f79083g) ? this.f79084h + PlaybackStateCompat.ACTION_PLAY_FROM_URI : PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                this.f79081e = true;
                this.f79086j.endTracks();
            }
        }
        lVar.peekFully(this.f79079c.d(), 0, 2);
        this.f79079c.P(0);
        int iJ = this.f79079c.J() + 6;
        if (aVar == null) {
            lVar.skipFully(iJ);
        } else {
            this.f79079c.L(iJ);
            lVar.readFully(this.f79079c.d(), 0, iJ);
            this.f79079c.P(6);
            aVar.a(this.f79079c);
            s7.a0 a0Var = this.f79079c;
            a0Var.O(a0Var.b());
        }
        return 0;
    }

    @Override // i6.k
    public boolean c(i6.l lVar) throws IOException {
        byte[] bArr = new byte[14];
        lVar.peekFully(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        lVar.advancePeekPosition(bArr[13] & 7);
        lVar.peekFully(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    public final void f(long j10) {
        if (this.f79087k) {
            return;
        }
        this.f79087k = true;
        if (this.f79080d.c() == -9223372036854775807L) {
            this.f79086j.h(new z.b(this.f79080d.c()));
            return;
        }
        x xVar = new x(this.f79080d.d(), this.f79080d.c(), j10);
        this.f79085i = xVar;
        this.f79086j.h(xVar.b());
    }

    @Override // i6.k
    public void release() {
    }

    @Override // i6.k
    public void seek(long j10, long j11) {
        boolean z10 = this.f79077a.e() == -9223372036854775807L;
        if (!z10) {
            long jC = this.f79077a.c();
            z10 = (jC == -9223372036854775807L || jC == 0 || jC == j11) ? false : true;
        }
        if (z10) {
            this.f79077a.g(j11);
        }
        x xVar = this.f79085i;
        if (xVar != null) {
            xVar.h(j11);
        }
        for (int i10 = 0; i10 < this.f79078b.size(); i10++) {
            this.f79078b.valueAt(i10).d();
        }
    }
}
