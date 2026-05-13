package s6;

import i6.z;
import java.io.IOException;
import s6.i0;

/* JADX INFO: compiled from: Ac3Extractor.java */
/* JADX INFO: loaded from: classes11.dex */
public final class b implements i6.k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i6.p f79096d = new i6.p() { // from class: s6.a
        @Override // i6.p
        public final i6.k[] createExtractors() {
            return b.e();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f79097a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s7.a0 f79098b = new s7.a0(2786);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f79099c;

    public static /* synthetic */ i6.k[] e() {
        return new i6.k[]{new b()};
    }

    @Override // i6.k
    public void a(i6.m mVar) {
        this.f79097a.b(mVar, new i0.d(0, 1));
        mVar.endTracks();
        mVar.h(new z.b(-9223372036854775807L));
    }

    @Override // i6.k
    public int b(i6.l lVar, i6.y yVar) throws IOException {
        int i10 = lVar.read(this.f79098b.d(), 0, 2786);
        if (i10 == -1) {
            return -1;
        }
        this.f79098b.P(0);
        this.f79098b.O(i10);
        if (!this.f79099c) {
            this.f79097a.packetStarted(0L, 4);
            this.f79099c = true;
        }
        this.f79097a.a(this.f79098b);
        return 0;
    }

    @Override // i6.k
    public boolean c(i6.l lVar) throws IOException {
        s7.a0 a0Var = new s7.a0(10);
        int i10 = 0;
        while (true) {
            lVar.peekFully(a0Var.d(), 0, 10);
            a0Var.P(0);
            if (a0Var.G() != 4801587) {
                break;
            }
            a0Var.Q(3);
            int iC = a0Var.C();
            i10 += iC + 10;
            lVar.advancePeekPosition(iC);
        }
        lVar.resetPeekPosition();
        lVar.advancePeekPosition(i10);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            lVar.peekFully(a0Var.d(), 0, 6);
            a0Var.P(0);
            if (a0Var.J() != 2935) {
                lVar.resetPeekPosition();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                lVar.advancePeekPosition(i12);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int iF = f6.b.f(a0Var.d());
                if (iF == -1) {
                    return false;
                }
                lVar.advancePeekPosition(iF - 6);
            }
        }
    }

    @Override // i6.k
    public void release() {
    }

    @Override // i6.k
    public void seek(long j10, long j11) {
        this.f79099c = false;
        this.f79097a.seek();
    }
}
