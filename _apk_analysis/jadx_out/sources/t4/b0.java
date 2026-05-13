package t4;

import com.google.android.exoplayer.Format;
import java.util.List;
import t4.h0;

/* JADX INFO: compiled from: SeiReader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Format> f84657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k4.u[] f84658b;

    public b0(List<Format> list) {
        this.f84657a = list;
        this.f84658b = new k4.u[list.size()];
    }

    public void a(long j10, a6.t tVar) {
        o5.g.a(j10, tVar, this.f84658b);
    }

    public void b(k4.i iVar, h0.d dVar) {
        for (int i10 = 0; i10 < this.f84658b.length; i10++) {
            dVar.a();
            k4.u uVarTrack = iVar.track(dVar.c(), 3);
            Format format = this.f84657a.get(i10);
            String str = format.f19927j;
            a6.a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            String strB = format.f19919b;
            if (strB == null) {
                strB = dVar.b();
            }
            uVarTrack.d(Format.z(strB, str, null, -1, format.f19921d, format.B, format.C, null, Long.MAX_VALUE, format.f19929l));
            this.f84658b[i10] = uVarTrack;
        }
    }
}
