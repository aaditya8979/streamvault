package r6;

import com.google.android.exoplayer2.ParserException;
import i6.b0;
import i6.k;
import i6.l;
import i6.m;
import i6.p;
import i6.y;
import java.io.IOException;
import s7.a0;

/* JADX INFO: compiled from: OggExtractor.java */
/* JADX INFO: loaded from: classes10.dex */
public class d implements k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f78683d = new p() { // from class: r6.c
        @Override // i6.p
        public final k[] createExtractors() {
            return d.e();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f78684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f78685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f78686c;

    public static /* synthetic */ k[] e() {
        return new k[]{new d()};
    }

    public static a0 f(a0 a0Var) {
        a0Var.P(0);
        return a0Var;
    }

    @Override // i6.k
    public void a(m mVar) {
        this.f78684a = mVar;
    }

    @Override // i6.k
    public int b(l lVar, y yVar) throws IOException {
        s7.a.i(this.f78684a);
        if (this.f78685b == null) {
            if (!g(lVar)) {
                throw ParserException.createForMalformedContainer("Failed to determine bitstream type", null);
            }
            lVar.resetPeekPosition();
        }
        if (!this.f78686c) {
            b0 b0VarTrack = this.f78684a.track(0, 1);
            this.f78684a.endTracks();
            this.f78685b.d(this.f78684a, b0VarTrack);
            this.f78686c = true;
        }
        return this.f78685b.g(lVar, yVar);
    }

    @Override // i6.k
    public boolean c(l lVar) throws IOException {
        try {
            return g(lVar);
        } catch (ParserException unused) {
            return false;
        }
    }

    public final boolean g(l lVar) throws IOException {
        f fVar = new f();
        if (fVar.a(lVar, true) && (fVar.f78693b & 2) == 2) {
            int iMin = Math.min(fVar.f78700i, 8);
            a0 a0Var = new a0(iMin);
            lVar.peekFully(a0Var.d(), 0, iMin);
            if (b.p(f(a0Var))) {
                this.f78685b = new b();
            } else if (j.r(f(a0Var))) {
                this.f78685b = new j();
            } else if (h.p(f(a0Var))) {
                this.f78685b = new h();
            }
            return true;
        }
        return false;
    }

    @Override // i6.k
    public void release() {
    }

    @Override // i6.k
    public void seek(long j10, long j11) {
        i iVar = this.f78685b;
        if (iVar != null) {
            iVar.m(j10, j11);
        }
    }
}
