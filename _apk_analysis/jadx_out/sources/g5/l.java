package g5;

import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;

/* JADX INFO: compiled from: MediaChunk.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class l extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f62077i;

    public l(com.google.android.exoplayer.upstream.a aVar, y5.h hVar, Format format, int i10, @Nullable Object obj, long j10, long j11, long j12) {
        super(aVar, hVar, 1, format, i10, obj, j10, j11);
        a6.a.e(format);
        this.f62077i = j12;
    }

    public long e() {
        long j10 = this.f62077i;
        if (j10 != -1) {
            return 1 + j10;
        }
        return -1L;
    }

    public abstract boolean f();
}
