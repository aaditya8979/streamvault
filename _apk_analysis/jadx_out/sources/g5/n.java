package g5;

import a6.k0;
import com.google.android.exoplayer.Format;
import java.io.IOException;
import k4.u;

/* JADX INFO: compiled from: SingleSampleMediaChunk.java */
/* JADX INFO: loaded from: classes6.dex */
public final class n extends a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f62079n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Format f62080o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f62081p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f62082q;

    public n(com.google.android.exoplayer.upstream.a aVar, y5.h hVar, Format format, int i10, Object obj, long j10, long j11, long j12, int i11, Format format2) {
        super(aVar, hVar, format, i10, obj, j10, j11, -9223372036854775807L, -9223372036854775807L, j12);
        this.f62079n = i11;
        this.f62080o = format2;
    }

    @Override // com.google.android.exoplayer.upstream.Loader.e
    public void cancelLoad() {
    }

    @Override // g5.l
    public boolean f() {
        return this.f62082q;
    }

    @Override // com.google.android.exoplayer.upstream.Loader.e
    public void load() throws InterruptedException, IOException {
        c cVarH = h();
        cVarH.b(0L);
        u uVarTrack = cVarH.track(0, this.f62079n);
        uVarTrack.d(this.f62080o);
        try {
            long jA = this.f62017h.a(this.f62010a.e(this.f62081p));
            if (jA != -1) {
                jA += this.f62081p;
            }
            k4.d dVar = new k4.d(this.f62017h, this.f62081p, jA);
            for (int iB = 0; iB != -1; iB = uVarTrack.b(dVar, Integer.MAX_VALUE, true)) {
                this.f62081p += (long) iB;
            }
            uVarTrack.c(this.f62015f, 1, (int) this.f62081p, 0, null);
            k0.m(this.f62017h);
            this.f62082q = true;
        } catch (Throwable th2) {
            k0.m(this.f62017h);
            throw th2;
        }
    }
}
