package t4;

import java.io.IOException;
import k4.s;
import t4.h0;

/* JADX INFO: compiled from: Ac4Extractor.java */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements k4.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k4.k f84677d = new k4.k() { // from class: t4.d
        @Override // k4.k
        public final k4.g[] createExtractors() {
            return e.e();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f84678a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a6.t f84679b = new a6.t(16384);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f84680c;

    public static /* synthetic */ k4.g[] e() {
        return new k4.g[]{new e()};
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
            hVar.peekFully(tVar.f3620a, 0, 7);
            tVar.L(0);
            int iE = tVar.E();
            if (iE == 44096 || iE == 44097) {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int iE2 = g4.b.e(tVar.f3620a, iE);
                if (iE2 == -1) {
                    return false;
                }
                hVar.advancePeekPosition(iE2 - 7);
            } else {
                hVar.resetPeekPosition();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                hVar.advancePeekPosition(i12);
                i11 = 0;
            }
        }
    }

    @Override // k4.g
    public void b(k4.i iVar) {
        this.f84678a.b(iVar, new h0.d(0, 1));
        iVar.endTracks();
        iVar.c(new s.b(-9223372036854775807L));
    }

    @Override // k4.g
    public int c(k4.h hVar, k4.r rVar) throws InterruptedException, IOException {
        int i10 = hVar.read(this.f84679b.f3620a, 0, 16384);
        if (i10 == -1) {
            return -1;
        }
        this.f84679b.L(0);
        this.f84679b.K(i10);
        if (!this.f84680c) {
            this.f84678a.packetStarted(0L, 4);
            this.f84680c = true;
        }
        this.f84678a.a(this.f84679b);
        return 0;
    }

    @Override // k4.g
    public void release() {
    }

    @Override // k4.g
    public void seek(long j10, long j11) {
        this.f84680c = false;
        this.f84678a.seek();
    }
}
