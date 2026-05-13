package g5;

import a6.t;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;
import java.io.IOException;
import k4.s;
import k4.u;

/* JADX INFO: compiled from: ChunkExtractorWrapper.java */
/* JADX INFO: loaded from: classes6.dex */
public final class e implements k4.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k4.g f62018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f62019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Format f62020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray<a> f62021e = new SparseArray<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f62022f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f62023g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f62024h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public s f62025i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Format[] f62026j;

    /* JADX INFO: compiled from: ChunkExtractorWrapper.java */
    public static final class a implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f62027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f62028b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Format f62029c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final k4.f f62030d = new k4.f();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Format f62031e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public u f62032f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f62033g;

        public a(int i10, int i11, Format format) {
            this.f62027a = i10;
            this.f62028b = i11;
            this.f62029c = format;
        }

        @Override // k4.u
        public void a(t tVar, int i10) {
            this.f62032f.a(tVar, i10);
        }

        @Override // k4.u
        public int b(k4.h hVar, int i10, boolean z10) throws InterruptedException, IOException {
            return this.f62032f.b(hVar, i10, z10);
        }

        @Override // k4.u
        public void c(long j10, int i10, int i11, int i12, u.a aVar) {
            long j11 = this.f62033g;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                this.f62032f = this.f62030d;
            }
            this.f62032f.c(j10, i10, i11, i12, aVar);
        }

        @Override // k4.u
        public void d(Format format) {
            Format format2 = this.f62029c;
            if (format2 != null) {
                format = format.j(format2);
            }
            this.f62031e = format;
            this.f62032f.d(format);
        }

        public void e(b bVar, long j10) {
            if (bVar == null) {
                this.f62032f = this.f62030d;
                return;
            }
            this.f62033g = j10;
            u uVarTrack = bVar.track(this.f62027a, this.f62028b);
            this.f62032f = uVarTrack;
            Format format = this.f62031e;
            if (format != null) {
                uVarTrack.d(format);
            }
        }
    }

    /* JADX INFO: compiled from: ChunkExtractorWrapper.java */
    public interface b {
        u track(int i10, int i11);
    }

    public e(k4.g gVar, int i10, Format format) {
        this.f62018b = gVar;
        this.f62019c = i10;
        this.f62020d = format;
    }

    public Format[] a() {
        return this.f62026j;
    }

    public s b() {
        return this.f62025i;
    }

    @Override // k4.i
    public void c(s sVar) {
        this.f62025i = sVar;
    }

    public void d(@Nullable b bVar, long j10, long j11) {
        this.f62023g = bVar;
        this.f62024h = j11;
        if (!this.f62022f) {
            this.f62018b.b(this);
            if (j10 != -9223372036854775807L) {
                this.f62018b.seek(0L, j10);
            }
            this.f62022f = true;
            return;
        }
        k4.g gVar = this.f62018b;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        gVar.seek(0L, j10);
        for (int i10 = 0; i10 < this.f62021e.size(); i10++) {
            this.f62021e.valueAt(i10).e(bVar, j11);
        }
    }

    @Override // k4.i
    public void endTracks() {
        Format[] formatArr = new Format[this.f62021e.size()];
        for (int i10 = 0; i10 < this.f62021e.size(); i10++) {
            formatArr[i10] = this.f62021e.valueAt(i10).f62031e;
        }
        this.f62026j = formatArr;
    }

    @Override // k4.i
    public u track(int i10, int i11) {
        a aVar = this.f62021e.get(i10);
        if (aVar == null) {
            a6.a.f(this.f62026j == null);
            aVar = new a(i10, i11, i11 == this.f62019c ? this.f62020d : null);
            aVar.e(this.f62023g, this.f62024h);
            this.f62021e.put(i10, aVar);
        }
        return aVar;
    }
}
