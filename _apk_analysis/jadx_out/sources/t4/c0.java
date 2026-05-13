package t4;

import com.google.android.exoplayer.Format;
import t4.h0;

/* JADX INFO: compiled from: SpliceInfoSectionReader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c0 implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a6.g0 f84671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k4.u f84672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f84673c;

    @Override // t4.z
    public void a(a6.t tVar) {
        if (!this.f84673c) {
            if (this.f84671a.e() == -9223372036854775807L) {
                return;
            }
            this.f84672b.d(Format.t(null, "application/x-scte35", this.f84671a.e()));
            this.f84673c = true;
        }
        int iA = tVar.a();
        this.f84672b.a(tVar, iA);
        this.f84672b.c(this.f84671a.d(), 1, iA, 0, null);
    }

    @Override // t4.z
    public void b(a6.g0 g0Var, k4.i iVar, h0.d dVar) {
        this.f84671a = g0Var;
        dVar.a();
        k4.u uVarTrack = iVar.track(dVar.c(), 4);
        this.f84672b = uVarTrack;
        uVarTrack.d(Format.u(dVar.b(), "application/x-scte35", null, -1, null));
    }
}
