package j5;

import com.google.android.exoplayer.source.hls.SampleQueueMappingException;
import e4.f0;
import e5.i0;
import java.io.IOException;

/* JADX INFO: compiled from: HlsSampleStream.java */
/* JADX INFO: loaded from: classes8.dex */
public final class j implements i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f72267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f72268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f72269d = -1;

    public j(n nVar, int i10) {
        this.f72268c = nVar;
        this.f72267b = i10;
    }

    public void a() {
        a6.a.a(this.f72269d == -1);
        this.f72269d = this.f72268c.k(this.f72267b);
    }

    @Override // e5.i0
    public int b(f0 f0Var, i4.e eVar, boolean z10) {
        if (this.f72269d == -3) {
            eVar.addFlag(4);
            return -4;
        }
        if (c()) {
            return this.f72268c.M(this.f72269d, f0Var, eVar, z10);
        }
        return -3;
    }

    public final boolean c() {
        int i10 = this.f72269d;
        return (i10 == -1 || i10 == -3 || i10 == -2) ? false : true;
    }

    public void d() {
        if (this.f72269d != -1) {
            this.f72268c.X(this.f72267b);
            this.f72269d = -1;
        }
    }

    @Override // e5.i0
    public boolean isReady() {
        return this.f72269d == -3 || (c() && this.f72268c.A(this.f72269d));
    }

    @Override // e5.i0
    public void maybeThrowError() throws IOException {
        int i10 = this.f72269d;
        if (i10 == -2) {
            throw new SampleQueueMappingException(this.f72268c.getTrackGroups().b(this.f72267b).b(0).f19927j);
        }
        if (i10 == -1) {
            this.f72268c.D();
        } else if (i10 != -3) {
            this.f72268c.E(i10);
        }
    }

    @Override // e5.i0
    public int skipData(long j10) {
        if (c()) {
            return this.f72268c.W(this.f72269d, j10);
        }
        return 0;
    }
}
