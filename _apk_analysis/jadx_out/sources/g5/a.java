package g5;

import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;

/* JADX INFO: compiled from: BaseMediaChunk.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a extends l {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f62001j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f62002k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f62003l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f62004m;

    public a(com.google.android.exoplayer.upstream.a aVar, y5.h hVar, Format format, int i10, @Nullable Object obj, long j10, long j11, long j12, long j13, long j14) {
        super(aVar, hVar, format, i10, obj, j10, j11, j14);
        this.f62001j = j12;
        this.f62002k = j13;
    }

    public final int g(int i10) {
        return this.f62004m[i10];
    }

    public final c h() {
        return this.f62003l;
    }

    public void i(c cVar) {
        this.f62003l = cVar;
        this.f62004m = cVar.a();
    }
}
