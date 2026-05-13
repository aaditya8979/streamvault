package t4;

import com.google.android.exoplayer.Format;
import t4.h0;

/* JADX INFO: compiled from: Id3Reader.java */
/* JADX INFO: loaded from: classes4.dex */
public final class q implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a6.t f84894a = new a6.t(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k4.u f84895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f84896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f84897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f84898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f84899f;

    @Override // t4.m
    public void a(a6.t tVar) {
        if (this.f84896c) {
            int iA = tVar.a();
            int i10 = this.f84899f;
            if (i10 < 10) {
                int iMin = Math.min(iA, 10 - i10);
                System.arraycopy(tVar.f3620a, tVar.c(), this.f84894a.f3620a, this.f84899f, iMin);
                if (this.f84899f + iMin == 10) {
                    this.f84894a.L(0);
                    if (73 != this.f84894a.y() || 68 != this.f84894a.y() || 51 != this.f84894a.y()) {
                        a6.m.h("Id3Reader", "Discarding invalid ID3 tag");
                        this.f84896c = false;
                        return;
                    } else {
                        this.f84894a.M(3);
                        this.f84898e = this.f84894a.x() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iA, this.f84898e - this.f84899f);
            this.f84895b.a(tVar, iMin2);
            this.f84899f += iMin2;
        }
    }

    @Override // t4.m
    public void b(k4.i iVar, h0.d dVar) {
        dVar.a();
        k4.u uVarTrack = iVar.track(dVar.c(), 4);
        this.f84895b = uVarTrack;
        uVarTrack.d(Format.u(dVar.b(), "application/id3", null, -1, null));
    }

    @Override // t4.m
    public void packetFinished() {
        int i10;
        if (this.f84896c && (i10 = this.f84898e) != 0 && this.f84899f == i10) {
            this.f84895b.c(this.f84897d, 1, i10, 0, null);
            this.f84896c = false;
        }
    }

    @Override // t4.m
    public void packetStarted(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f84896c = true;
        this.f84897d = j10;
        this.f84898e = 0;
        this.f84899f = 0;
    }

    @Override // t4.m
    public void seek() {
        this.f84896c = false;
    }
}
