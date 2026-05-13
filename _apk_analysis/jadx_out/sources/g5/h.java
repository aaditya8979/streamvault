package g5;

import e4.t0;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: ChunkSource.java */
/* JADX INFO: loaded from: classes6.dex */
public interface h {
    long a(long j10, t0 t0Var);

    void d(d dVar);

    void e(long j10, long j11, List<? extends l> list, f fVar);

    boolean f(d dVar, boolean z10, Exception exc, long j10);

    int getPreferredQueueSize(long j10, List<? extends l> list);

    void maybeThrowError() throws IOException;
}
