package t4;

import java.io.IOException;
import k4.s;
import t4.h0;

/* JADX INFO: compiled from: Ac3Extractor.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements k4.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k4.k f84653d = new k4.k() { // from class: t4.a
        @Override // k4.k
        public final k4.g[] createExtractors() {
            return b.e();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f84654a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a6.t f84655b = new a6.t(2786);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f84656c;

    public static /* synthetic */ k4.g[] e() {
        return new k4.g[]{new b()};
    }

    @Override // k4.g
    public boolean a(k4.h hVar) throws InterruptedException, IOException {
        a6.t tVar = new a6.t(10);
        int i10 = 0;
        while (true) {
            hVar.peekFully(tVar.f3620a, 0, 10);
            tVar.L(0);
            if (tVar.B() != 4801587) {
                break;
            }
            tVar.M(3);
            int iX = tVar.x();
            i10 += iX + 10;
            hVar.advancePeekPosition(iX);
        }
        hVar.resetPeekPosition();
        hVar.advancePeekPosition(i10);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            hVar.peekFully(tVar.f3620a, 0, 6);
            tVar.L(0);
            if (tVar.E() != 2935) {
                hVar.resetPeekPosition();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                hVar.advancePeekPosition(i12);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int iF = g4.a.f(tVar.f3620a);
                if (iF == -1) {
                    return false;
                }
                hVar.advancePeekPosition(iF - 6);
            }
        }
    }

    @Override // k4.g
    public void b(k4.i iVar) {
        this.f84654a.b(iVar, new h0.d(0, 1));
        iVar.endTracks();
        iVar.c(new s.b(-9223372036854775807L));
    }

    @Override // k4.g
    public int c(k4.h hVar, k4.r rVar) throws InterruptedException, IOException {
        int i10 = hVar.read(this.f84655b.f3620a, 0, 2786);
        if (i10 == -1) {
            return -1;
        }
        this.f84655b.L(0);
        this.f84655b.K(i10);
        if (!this.f84656c) {
            this.f84654a.packetStarted(0L, 4);
            this.f84656c = true;
        }
        this.f84654a.a(this.f84655b);
        return 0;
    }

    @Override // k4.g
    public void release() {
    }

    @Override // k4.g
    public void seek(long j10, long j11) {
        this.f84656c = false;
        this.f84654a.seek();
    }
}
