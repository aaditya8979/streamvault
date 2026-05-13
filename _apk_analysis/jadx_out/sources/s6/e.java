package s6;

import i6.z;
import java.io.IOException;
import s6.i0;

/* JADX INFO: compiled from: Ac4Extractor.java */
/* JADX INFO: loaded from: classes11.dex */
public final class e implements i6.k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i6.p f79120d = new i6.p() { // from class: s6.d
        @Override // i6.p
        public final i6.k[] createExtractors() {
            return e.e();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f79121a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s7.a0 f79122b = new s7.a0(16384);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f79123c;

    public static /* synthetic */ i6.k[] e() {
        return new i6.k[]{new e()};
    }

    @Override // i6.k
    public void a(i6.m mVar) {
        this.f79121a.b(mVar, new i0.d(0, 1));
        mVar.endTracks();
        mVar.h(new z.b(-9223372036854775807L));
    }

    @Override // i6.k
    public int b(i6.l lVar, i6.y yVar) throws IOException {
        int i10 = lVar.read(this.f79122b.d(), 0, 16384);
        if (i10 == -1) {
            return -1;
        }
        this.f79122b.P(0);
        this.f79122b.O(i10);
        if (!this.f79123c) {
            this.f79121a.packetStarted(0L, 4);
            this.f79123c = true;
        }
        this.f79121a.a(this.f79122b);
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
            lVar.peekFully(a0Var.d(), 0, 7);
            a0Var.P(0);
            int iJ = a0Var.J();
            if (iJ == 44096 || iJ == 44097) {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int iE = f6.c.e(a0Var.d(), iJ);
                if (iE == -1) {
                    return false;
                }
                lVar.advancePeekPosition(iE - 7);
            } else {
                lVar.resetPeekPosition();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                lVar.advancePeekPosition(i12);
                i11 = 0;
            }
        }
    }

    @Override // i6.k
    public void release() {
    }

    @Override // i6.k
    public void seek(long j10, long j11) {
        this.f79123c = false;
        this.f79121a.seek();
    }
}
