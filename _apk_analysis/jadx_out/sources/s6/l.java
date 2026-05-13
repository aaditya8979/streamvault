package s6;

import com.google.android.exoplayer2.m;
import java.util.Collections;
import java.util.List;
import s6.i0;

/* JADX INFO: compiled from: DvbSubtitleReader.java */
/* JADX INFO: loaded from: classes11.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<i0.a> f79239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i6.b0[] f79240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f79241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f79242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f79243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f79244f = -9223372036854775807L;

    public l(List<i0.a> list) {
        this.f79239a = list;
        this.f79240b = new i6.b0[list.size()];
    }

    @Override // s6.m
    public void a(s7.a0 a0Var) {
        if (this.f79241c) {
            if (this.f79242d != 2 || c(a0Var, 32)) {
                if (this.f79242d != 1 || c(a0Var, 0)) {
                    int iE = a0Var.e();
                    int iA = a0Var.a();
                    for (i6.b0 b0Var : this.f79240b) {
                        a0Var.P(iE);
                        b0Var.e(a0Var, iA);
                    }
                    this.f79243e += iA;
                }
            }
        }
    }

    @Override // s6.m
    public void b(i6.m mVar, i0.d dVar) {
        for (int i10 = 0; i10 < this.f79240b.length; i10++) {
            i0.a aVar = this.f79239a.get(i10);
            dVar.a();
            i6.b0 b0VarTrack = mVar.track(dVar.c(), 3);
            b0VarTrack.b(new m.b().S(dVar.b()).e0("application/dvbsubs").T(Collections.singletonList(aVar.f79214c)).V(aVar.f79212a).E());
            this.f79240b[i10] = b0VarTrack;
        }
    }

    public final boolean c(s7.a0 a0Var, int i10) {
        if (a0Var.a() == 0) {
            return false;
        }
        if (a0Var.D() != i10) {
            this.f79241c = false;
        }
        this.f79242d--;
        return this.f79241c;
    }

    @Override // s6.m
    public void packetFinished() {
        if (this.f79241c) {
            if (this.f79244f != -9223372036854775807L) {
                for (i6.b0 b0Var : this.f79240b) {
                    b0Var.c(this.f79244f, 1, this.f79243e, 0, null);
                }
            }
            this.f79241c = false;
        }
    }

    @Override // s6.m
    public void packetStarted(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f79241c = true;
        if (j10 != -9223372036854775807L) {
            this.f79244f = j10;
        }
        this.f79243e = 0;
        this.f79242d = 2;
    }

    @Override // s6.m
    public void seek() {
        this.f79241c = false;
        this.f79244f = -9223372036854775807L;
    }
}
