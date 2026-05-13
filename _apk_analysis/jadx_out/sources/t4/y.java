package t4;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import androidx.core.view.InputDeviceCompat;
import com.google.android.exoplayer.ParserException;
import java.io.IOException;
import k4.s;
import t4.h0;

/* JADX INFO: compiled from: PsExtractor.java */
/* JADX INFO: loaded from: classes7.dex */
public final class y implements k4.g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final k4.k f84959l = new k4.k() { // from class: t4.x
        @Override // k4.k
        public final k4.g[] createExtractors() {
            return y.e();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a6.g0 f84960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray<a> f84961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a6.t f84962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f84963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f84964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f84965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f84966g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f84967h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public v f84968i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k4.i f84969j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f84970k;

    /* JADX INFO: compiled from: PsExtractor.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f84971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a6.g0 f84972b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a6.s f84973c = new a6.s(new byte[64]);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f84974d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f84975e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f84976f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f84977g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f84978h;

        public a(m mVar, a6.g0 g0Var) {
            this.f84971a = mVar;
            this.f84972b = g0Var;
        }

        public void a(a6.t tVar) throws ParserException {
            tVar.h(this.f84973c.f3616a, 0, 3);
            this.f84973c.o(0);
            b();
            tVar.h(this.f84973c.f3616a, 0, this.f84977g);
            this.f84973c.o(0);
            c();
            this.f84971a.packetStarted(this.f84978h, 4);
            this.f84971a.a(tVar);
            this.f84971a.packetFinished();
        }

        public final void b() {
            this.f84973c.q(8);
            this.f84974d = this.f84973c.g();
            this.f84975e = this.f84973c.g();
            this.f84973c.q(6);
            this.f84977g = this.f84973c.h(8);
        }

        public final void c() {
            this.f84978h = 0L;
            if (this.f84974d) {
                this.f84973c.q(4);
                long jH = ((long) this.f84973c.h(3)) << 30;
                this.f84973c.q(1);
                long jH2 = jH | ((long) (this.f84973c.h(15) << 15));
                this.f84973c.q(1);
                long jH3 = jH2 | ((long) this.f84973c.h(15));
                this.f84973c.q(1);
                if (!this.f84976f && this.f84975e) {
                    this.f84973c.q(4);
                    long jH4 = ((long) this.f84973c.h(3)) << 30;
                    this.f84973c.q(1);
                    long jH5 = jH4 | ((long) (this.f84973c.h(15) << 15));
                    this.f84973c.q(1);
                    long jH6 = jH5 | ((long) this.f84973c.h(15));
                    this.f84973c.q(1);
                    this.f84972b.b(jH6);
                    this.f84976f = true;
                }
                this.f84978h = this.f84972b.b(jH3);
            }
        }

        public void d() {
            this.f84976f = false;
            this.f84971a.seek();
        }
    }

    public y() {
        this(new a6.g0(0L));
    }

    public y(a6.g0 g0Var) {
        this.f84960a = g0Var;
        this.f84962c = new a6.t(4096);
        this.f84961b = new SparseArray<>();
        this.f84963d = new w();
    }

    public static /* synthetic */ k4.g[] e() {
        return new k4.g[]{new y()};
    }

    @Override // k4.g
    public boolean a(k4.h hVar) throws InterruptedException, IOException {
        byte[] bArr = new byte[14];
        hVar.peekFully(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        hVar.advancePeekPosition(bArr[13] & 7);
        hVar.peekFully(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // k4.g
    public void b(k4.i iVar) {
        this.f84969j = iVar;
    }

    @Override // k4.g
    public int c(k4.h hVar, k4.r rVar) throws InterruptedException, IOException {
        long length = hVar.getLength();
        if ((length != -1) && !this.f84963d.e()) {
            return this.f84963d.g(hVar, rVar);
        }
        f(length);
        v vVar = this.f84968i;
        if (vVar != null && vVar.d()) {
            return this.f84968i.c(hVar, rVar);
        }
        hVar.resetPeekPosition();
        long peekPosition = length != -1 ? length - hVar.getPeekPosition() : -1L;
        if ((peekPosition != -1 && peekPosition < 4) || !hVar.peekFully(this.f84962c.f3620a, 0, 4, true)) {
            return -1;
        }
        this.f84962c.L(0);
        int iJ = this.f84962c.j();
        if (iJ == 441) {
            return -1;
        }
        if (iJ == 442) {
            hVar.peekFully(this.f84962c.f3620a, 0, 10);
            this.f84962c.L(9);
            hVar.skipFully((this.f84962c.y() & 7) + 14);
            return 0;
        }
        if (iJ == 443) {
            hVar.peekFully(this.f84962c.f3620a, 0, 2);
            this.f84962c.L(0);
            hVar.skipFully(this.f84962c.E() + 6);
            return 0;
        }
        if (((iJ & InputDeviceCompat.SOURCE_ANY) >> 8) != 1) {
            hVar.skipFully(1);
            return 0;
        }
        int i10 = iJ & 255;
        a aVar = this.f84961b.get(i10);
        if (!this.f84964e) {
            if (aVar == null) {
                m nVar = null;
                if (i10 == 189) {
                    nVar = new c();
                    this.f84965f = true;
                    this.f84967h = hVar.getPosition();
                } else if ((i10 & 224) == 192) {
                    nVar = new s();
                    this.f84965f = true;
                    this.f84967h = hVar.getPosition();
                } else if ((i10 & 240) == 224) {
                    nVar = new n();
                    this.f84966g = true;
                    this.f84967h = hVar.getPosition();
                }
                if (nVar != null) {
                    nVar.b(this.f84969j, new h0.d(i10, 256));
                    aVar = new a(nVar, this.f84960a);
                    this.f84961b.put(i10, aVar);
                }
            }
            if (hVar.getPosition() > ((this.f84965f && this.f84966g) ? this.f84967h + PlaybackStateCompat.ACTION_PLAY_FROM_URI : PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                this.f84964e = true;
                this.f84969j.endTracks();
            }
        }
        hVar.peekFully(this.f84962c.f3620a, 0, 2);
        this.f84962c.L(0);
        int iE = this.f84962c.E() + 6;
        if (aVar == null) {
            hVar.skipFully(iE);
        } else {
            this.f84962c.H(iE);
            hVar.readFully(this.f84962c.f3620a, 0, iE);
            this.f84962c.L(6);
            aVar.a(this.f84962c);
            a6.t tVar = this.f84962c;
            tVar.K(tVar.b());
        }
        return 0;
    }

    public final void f(long j10) {
        if (this.f84970k) {
            return;
        }
        this.f84970k = true;
        if (this.f84963d.c() == -9223372036854775807L) {
            this.f84969j.c(new s.b(this.f84963d.c()));
            return;
        }
        v vVar = new v(this.f84963d.d(), this.f84963d.c(), j10);
        this.f84968i = vVar;
        this.f84969j.c(vVar.b());
    }

    @Override // k4.g
    public void release() {
    }

    @Override // k4.g
    public void seek(long j10, long j11) {
        if ((this.f84960a.e() == -9223372036854775807L) || (this.f84960a.c() != 0 && this.f84960a.c() != j11)) {
            this.f84960a.g();
            this.f84960a.h(j11);
        }
        v vVar = this.f84968i;
        if (vVar != null) {
            vVar.h(j11);
        }
        for (int i10 = 0; i10 < this.f84961b.size(); i10++) {
            this.f84961b.valueAt(i10).d();
        }
    }
}
