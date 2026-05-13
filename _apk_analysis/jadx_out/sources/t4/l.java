package t4;

import com.google.android.exoplayer.Format;
import java.util.Collections;
import java.util.List;
import t4.h0;

/* JADX INFO: compiled from: DvbSubtitleReader.java */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<h0.a> f84790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k4.u[] f84791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f84792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f84793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f84794e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f84795f;

    public l(List<h0.a> list) {
        this.f84790a = list;
        this.f84791b = new k4.u[list.size()];
    }

    @Override // t4.m
    public void a(a6.t tVar) {
        if (this.f84792c) {
            if (this.f84793d != 2 || c(tVar, 32)) {
                if (this.f84793d != 1 || c(tVar, 0)) {
                    int iC = tVar.c();
                    int iA = tVar.a();
                    for (k4.u uVar : this.f84791b) {
                        tVar.L(iC);
                        uVar.a(tVar, iA);
                    }
                    this.f84794e += iA;
                }
            }
        }
    }

    @Override // t4.m
    public void b(k4.i iVar, h0.d dVar) {
        for (int i10 = 0; i10 < this.f84791b.length; i10++) {
            h0.a aVar = this.f84790a.get(i10);
            dVar.a();
            k4.u uVarTrack = iVar.track(dVar.c(), 3);
            uVarTrack.d(Format.s(dVar.b(), "application/dvbsubs", null, -1, 0, Collections.singletonList(aVar.f84743c), aVar.f84741a, null));
            this.f84791b[i10] = uVarTrack;
        }
    }

    public final boolean c(a6.t tVar, int i10) {
        if (tVar.a() == 0) {
            return false;
        }
        if (tVar.y() != i10) {
            this.f84792c = false;
        }
        this.f84793d--;
        return this.f84792c;
    }

    @Override // t4.m
    public void packetFinished() {
        if (this.f84792c) {
            for (k4.u uVar : this.f84791b) {
                uVar.c(this.f84795f, 1, this.f84794e, 0, null);
            }
            this.f84792c = false;
        }
    }

    @Override // t4.m
    public void packetStarted(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f84792c = true;
        this.f84795f = j10;
        this.f84794e = 0;
        this.f84793d = 2;
    }

    @Override // t4.m
    public void seek() {
        this.f84792c = false;
    }
}
