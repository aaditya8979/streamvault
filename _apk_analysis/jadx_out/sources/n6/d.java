package n6;

import i6.a0;
import i6.b0;
import i6.m;
import i6.z;

/* JADX INFO: compiled from: StartOffsetExtractorOutput.java */
/* JADX INFO: loaded from: classes6.dex */
public final class d implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f75176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f75177c;

    /* JADX INFO: compiled from: StartOffsetExtractorOutput.java */
    public class a implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ z f75178a;

        public a(z zVar) {
            this.f75178a = zVar;
        }

        @Override // i6.z
        public long getDurationUs() {
            return this.f75178a.getDurationUs();
        }

        @Override // i6.z
        public z.a getSeekPoints(long j10) {
            z.a seekPoints = this.f75178a.getSeekPoints(j10);
            a0 a0Var = seekPoints.f63945a;
            a0 a0Var2 = new a0(a0Var.f63838a, a0Var.f63839b + d.this.f75176b);
            a0 a0Var3 = seekPoints.f63946b;
            return new z.a(a0Var2, new a0(a0Var3.f63838a, a0Var3.f63839b + d.this.f75176b));
        }

        @Override // i6.z
        public boolean isSeekable() {
            return this.f75178a.isSeekable();
        }
    }

    public d(long j10, m mVar) {
        this.f75176b = j10;
        this.f75177c = mVar;
    }

    @Override // i6.m
    public void endTracks() {
        this.f75177c.endTracks();
    }

    @Override // i6.m
    public void h(z zVar) {
        this.f75177c.h(new a(zVar));
    }

    @Override // i6.m
    public b0 track(int i10, int i11) {
        return this.f75177c.track(i10, i11);
    }
}
