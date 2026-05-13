package r4;

import a6.t;
import com.google.android.exoplayer.ParserException;
import java.io.IOException;
import k4.k;
import k4.r;
import k4.u;

/* JADX INFO: compiled from: OggExtractor.java */
/* JADX INFO: loaded from: classes3.dex */
public class d implements k4.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f78593d = new k() { // from class: r4.c
        @Override // k4.k
        public final k4.g[] createExtractors() {
            return d.e();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k4.i f78594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f78595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f78596c;

    public static /* synthetic */ k4.g[] e() {
        return new k4.g[]{new d()};
    }

    public static t f(t tVar) {
        tVar.L(0);
        return tVar;
    }

    @Override // k4.g
    public boolean a(k4.h hVar) throws InterruptedException, IOException {
        try {
            return g(hVar);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // k4.g
    public void b(k4.i iVar) {
        this.f78594a = iVar;
    }

    @Override // k4.g
    public int c(k4.h hVar, r rVar) throws InterruptedException, IOException {
        if (this.f78595b == null) {
            if (!g(hVar)) {
                throw new ParserException("Failed to determine bitstream type");
            }
            hVar.resetPeekPosition();
        }
        if (!this.f78596c) {
            u uVarTrack = this.f78594a.track(0, 1);
            this.f78594a.endTracks();
            this.f78595b.c(this.f78594a, uVarTrack);
            this.f78596c = true;
        }
        return this.f78595b.f(hVar, rVar);
    }

    public final boolean g(k4.h hVar) throws InterruptedException, IOException {
        f fVar = new f();
        if (fVar.a(hVar, true) && (fVar.f78603b & 2) == 2) {
            int iMin = Math.min(fVar.f78610i, 8);
            t tVar = new t(iMin);
            hVar.peekFully(tVar.f3620a, 0, iMin);
            if (b.o(f(tVar))) {
                this.f78595b = new b();
            } else if (j.p(f(tVar))) {
                this.f78595b = new j();
            } else if (h.n(f(tVar))) {
                this.f78595b = new h();
            }
            return true;
        }
        return false;
    }

    @Override // k4.g
    public void release() {
    }

    @Override // k4.g
    public void seek(long j10, long j11) {
        i iVar = this.f78595b;
        if (iVar != null) {
            iVar.k(j10, j11);
        }
    }
}
