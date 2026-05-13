package s6;

import com.google.android.exoplayer2.m;
import s6.i0;
import s7.m0;

/* JADX INFO: compiled from: PassthroughSectionPayloadReader.java */
/* JADX INFO: loaded from: classes10.dex */
public final class v implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.google.android.exoplayer2.m f79413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s7.j0 f79414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i6.b0 f79415c;

    public v(String str) {
        this.f79413a = new m.b().e0(str).E();
    }

    @Override // s6.b0
    public void a(s7.a0 a0Var) {
        c();
        long jD = this.f79414b.d();
        long jE = this.f79414b.e();
        if (jD == -9223372036854775807L || jE == -9223372036854775807L) {
            return;
        }
        com.google.android.exoplayer2.m mVar = this.f79413a;
        if (jE != mVar.f21755q) {
            com.google.android.exoplayer2.m mVarE = mVar.b().i0(jE).E();
            this.f79413a = mVarE;
            this.f79415c.b(mVarE);
        }
        int iA = a0Var.a();
        this.f79415c.e(a0Var, iA);
        this.f79415c.c(jD, 1, iA, 0, null);
    }

    @Override // s6.b0
    public void b(s7.j0 j0Var, i6.m mVar, i0.d dVar) {
        this.f79414b = j0Var;
        dVar.a();
        i6.b0 b0VarTrack = mVar.track(dVar.c(), 5);
        this.f79415c = b0VarTrack;
        b0VarTrack.b(this.f79413a);
    }

    public final void c() {
        s7.a.i(this.f79414b);
        m0.j(this.f79415c);
    }
}
