package s6;

import com.google.android.exoplayer2.m;
import java.util.List;
import s6.i0;

/* JADX INFO: compiled from: SeiReader.java */
/* JADX INFO: loaded from: classes11.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<com.google.android.exoplayer2.m> f79118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i6.b0[] f79119b;

    public d0(List<com.google.android.exoplayer2.m> list) {
        this.f79118a = list;
        this.f79119b = new i6.b0[list.size()];
    }

    public void a(long j10, s7.a0 a0Var) {
        i6.b.a(j10, a0Var, this.f79119b);
    }

    public void b(i6.m mVar, i0.d dVar) {
        for (int i10 = 0; i10 < this.f79119b.length; i10++) {
            dVar.a();
            i6.b0 b0VarTrack = mVar.track(dVar.c(), 3);
            com.google.android.exoplayer2.m mVar2 = this.f79118a.get(i10);
            String str = mVar2.f21751m;
            s7.a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            String strB = mVar2.f21740b;
            if (strB == null) {
                strB = dVar.b();
            }
            b0VarTrack.b(new m.b().S(strB).e0(str).g0(mVar2.f21743e).V(mVar2.f21742d).F(mVar2.E).T(mVar2.f21753o).E());
            this.f79119b[i10] = b0VarTrack;
        }
    }
}
