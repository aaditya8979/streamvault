package e5;

import com.google.android.exoplayer.source.TrackGroupArray;
import e4.t0;
import e5.j0;
import java.io.IOException;

/* JADX INFO: compiled from: MediaPeriod.java */
/* JADX INFO: loaded from: classes12.dex */
public interface q extends j0 {

    /* JADX INFO: compiled from: MediaPeriod.java */
    public interface a extends j0.a<q> {
        void d(q qVar);
    }

    long a(long j10, t0 t0Var);

    @Override // e5.j0
    boolean continueLoading(long j10);

    void discardBuffer(long j10, boolean z10);

    long e(com.google.android.exoplayer.trackselection.c[] cVarArr, boolean[] zArr, i0[] i0VarArr, boolean[] zArr2, long j10);

    void f(a aVar, long j10);

    @Override // e5.j0
    long getBufferedPositionUs();

    @Override // e5.j0
    long getNextLoadPositionUs();

    TrackGroupArray getTrackGroups();

    @Override // e5.j0
    boolean isLoading();

    void maybeThrowPrepareError() throws IOException;

    long readDiscontinuity();

    @Override // e5.j0
    void reevaluateBuffer(long j10);

    long seekToUs(long j10);
}
