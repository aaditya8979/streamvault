package s6;

import com.google.android.exoplayer2.m;
import s6.i0;

/* JADX INFO: compiled from: Id3Reader.java */
/* JADX INFO: loaded from: classes10.dex */
public final class r implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i6.b0 f79370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f79371c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f79373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f79374f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s7.a0 f79369a = new s7.a0(10);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f79372d = -9223372036854775807L;

    @Override // s6.m
    public void a(s7.a0 a0Var) {
        s7.a.i(this.f79370b);
        if (this.f79371c) {
            int iA = a0Var.a();
            int i10 = this.f79374f;
            if (i10 < 10) {
                int iMin = Math.min(iA, 10 - i10);
                System.arraycopy(a0Var.d(), a0Var.e(), this.f79369a.d(), this.f79374f, iMin);
                if (this.f79374f + iMin == 10) {
                    this.f79369a.P(0);
                    if (73 != this.f79369a.D() || 68 != this.f79369a.D() || 51 != this.f79369a.D()) {
                        s7.q.i("Id3Reader", "Discarding invalid ID3 tag");
                        this.f79371c = false;
                        return;
                    } else {
                        this.f79369a.Q(3);
                        this.f79373e = this.f79369a.C() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iA, this.f79373e - this.f79374f);
            this.f79370b.e(a0Var, iMin2);
            this.f79374f += iMin2;
        }
    }

    @Override // s6.m
    public void b(i6.m mVar, i0.d dVar) {
        dVar.a();
        i6.b0 b0VarTrack = mVar.track(dVar.c(), 5);
        this.f79370b = b0VarTrack;
        b0VarTrack.b(new m.b().S(dVar.b()).e0("application/id3").E());
    }

    @Override // s6.m
    public void packetFinished() {
        int i10;
        s7.a.i(this.f79370b);
        if (this.f79371c && (i10 = this.f79373e) != 0 && this.f79374f == i10) {
            long j10 = this.f79372d;
            if (j10 != -9223372036854775807L) {
                this.f79370b.c(j10, 1, i10, 0, null);
            }
            this.f79371c = false;
        }
    }

    @Override // s6.m
    public void packetStarted(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f79371c = true;
        if (j10 != -9223372036854775807L) {
            this.f79372d = j10;
        }
        this.f79373e = 0;
        this.f79374f = 0;
    }

    @Override // s6.m
    public void seek() {
        this.f79371c = false;
        this.f79372d = -9223372036854775807L;
    }
}
