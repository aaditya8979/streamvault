package s6;

import com.google.android.exoplayer2.m;
import java.util.List;
import s6.i0;

/* JADX INFO: compiled from: UserDataReader.java */
/* JADX INFO: loaded from: classes11.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<com.google.android.exoplayer2.m> f79237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i6.b0[] f79238b;

    public k0(List<com.google.android.exoplayer2.m> list) {
        this.f79237a = list;
        this.f79238b = new i6.b0[list.size()];
    }

    public void a(long j10, s7.a0 a0Var) {
        if (a0Var.a() < 9) {
            return;
        }
        int iN = a0Var.n();
        int iN2 = a0Var.n();
        int iD = a0Var.D();
        if (iN == 434 && iN2 == 1195456820 && iD == 3) {
            i6.b.b(j10, a0Var, this.f79238b);
        }
    }

    public void b(i6.m mVar, i0.d dVar) {
        for (int i10 = 0; i10 < this.f79238b.length; i10++) {
            dVar.a();
            i6.b0 b0VarTrack = mVar.track(dVar.c(), 3);
            com.google.android.exoplayer2.m mVar2 = this.f79237a.get(i10);
            String str = mVar2.f21751m;
            s7.a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            b0VarTrack.b(new m.b().S(dVar.b()).e0(str).g0(mVar2.f21743e).V(mVar2.f21742d).F(mVar2.E).T(mVar2.f21753o).E());
            this.f79238b[i10] = b0VarTrack;
        }
    }
}
