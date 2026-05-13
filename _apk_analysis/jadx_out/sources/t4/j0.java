package t4;

import com.google.android.exoplayer.Format;
import java.util.List;
import t4.h0;

/* JADX INFO: compiled from: UserDataReader.java */
/* JADX INFO: loaded from: classes12.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Format> f84777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k4.u[] f84778b;

    public j0(List<Format> list) {
        this.f84777a = list;
        this.f84778b = new k4.u[list.size()];
    }

    public void a(long j10, a6.t tVar) {
        if (tVar.a() < 9) {
            return;
        }
        int iJ = tVar.j();
        int iJ2 = tVar.j();
        int iY = tVar.y();
        if (iJ == 434 && iJ2 == 1195456820 && iY == 3) {
            o5.g.b(j10, tVar, this.f84778b);
        }
    }

    public void b(k4.i iVar, h0.d dVar) {
        for (int i10 = 0; i10 < this.f84778b.length; i10++) {
            dVar.a();
            k4.u uVarTrack = iVar.track(dVar.c(), 3);
            Format format = this.f84777a.get(i10);
            String str = format.f19927j;
            a6.a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            uVarTrack.d(Format.z(dVar.b(), str, null, -1, format.f19921d, format.B, format.C, null, Long.MAX_VALUE, format.f19929l));
            this.f84778b[i10] = uVarTrack;
        }
    }
}
