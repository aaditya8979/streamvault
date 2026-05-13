package g5;

import a6.k0;
import com.google.android.exoplayer.Format;
import g5.e;
import java.io.IOException;
import k4.r;
import y5.o;

/* JADX INFO: compiled from: ContainerMediaChunk.java */
/* JADX INFO: loaded from: classes6.dex */
public class i extends a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final r f62063t = new r();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f62064n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f62065o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f62066p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f62067q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile boolean f62068r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f62069s;

    public i(com.google.android.exoplayer.upstream.a aVar, y5.h hVar, Format format, int i10, Object obj, long j10, long j11, long j12, long j13, long j14, int i11, long j15, e eVar) {
        super(aVar, hVar, format, i10, obj, j10, j11, j12, j13, j14);
        this.f62064n = i11;
        this.f62065o = j15;
        this.f62066p = eVar;
    }

    @Override // com.google.android.exoplayer.upstream.Loader.e
    public final void cancelLoad() {
        this.f62068r = true;
    }

    @Override // g5.l
    public long e() {
        return this.f62077i + ((long) this.f62064n);
    }

    @Override // g5.l
    public boolean f() {
        return this.f62069s;
    }

    public e.b j(c cVar) {
        return cVar;
    }

    @Override // com.google.android.exoplayer.upstream.Loader.e
    public final void load() throws InterruptedException, IOException {
        if (this.f62067q == 0) {
            c cVarH = h();
            cVarH.b(this.f62065o);
            e eVar = this.f62066p;
            e.b bVarJ = j(cVarH);
            long j10 = this.f62001j;
            long j11 = j10 == -9223372036854775807L ? -9223372036854775807L : j10 - this.f62065o;
            long j12 = this.f62002k;
            eVar.d(bVarJ, j11, j12 == -9223372036854775807L ? -9223372036854775807L : j12 - this.f62065o);
        }
        try {
            y5.h hVarE = this.f62010a.e(this.f62067q);
            o oVar = this.f62017h;
            k4.d dVar = new k4.d(oVar, hVarE.f87274e, oVar.a(hVarE));
            try {
                k4.g gVar = this.f62066p.f62018b;
                int iC = 0;
                while (iC == 0 && !this.f62068r) {
                    iC = gVar.c(dVar, f62063t);
                }
                a6.a.f(iC != 1);
                k0.m(this.f62017h);
                this.f62069s = true;
            } finally {
                this.f62067q = dVar.getPosition() - this.f62010a.f87274e;
            }
        } catch (Throwable th2) {
            k0.m(this.f62017h);
            throw th2;
        }
    }
}
