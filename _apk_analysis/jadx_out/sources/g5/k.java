package g5;

import a6.k0;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;
import g5.e;
import java.io.IOException;
import k4.r;
import y5.o;

/* JADX INFO: compiled from: InitializationChunk.java */
/* JADX INFO: loaded from: classes6.dex */
public final class k extends d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final r f62072m = new r();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e f62073i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e.b f62074j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f62075k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile boolean f62076l;

    public k(com.google.android.exoplayer.upstream.a aVar, y5.h hVar, Format format, int i10, @Nullable Object obj, e eVar) {
        super(aVar, hVar, 2, format, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f62073i = eVar;
    }

    @Override // com.google.android.exoplayer.upstream.Loader.e
    public void cancelLoad() {
        this.f62076l = true;
    }

    public void e(e.b bVar) {
        this.f62074j = bVar;
    }

    @Override // com.google.android.exoplayer.upstream.Loader.e
    public void load() throws InterruptedException, IOException {
        if (this.f62075k == 0) {
            this.f62073i.d(this.f62074j, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            y5.h hVarE = this.f62010a.e(this.f62075k);
            o oVar = this.f62017h;
            k4.d dVar = new k4.d(oVar, hVarE.f87274e, oVar.a(hVarE));
            try {
                k4.g gVar = this.f62073i.f62018b;
                int iC = 0;
                while (iC == 0 && !this.f62076l) {
                    iC = gVar.c(dVar, f62072m);
                }
                a6.a.f(iC != 1);
            } finally {
                this.f62075k = dVar.getPosition() - this.f62010a.f87274e;
            }
        } finally {
            k0.m(this.f62017h);
        }
    }
}
