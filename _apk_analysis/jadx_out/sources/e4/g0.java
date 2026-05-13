package e4;

import com.google.android.exoplayer.source.TrackGroupArray;

/* JADX INFO: compiled from: LoadControl.java */
/* JADX INFO: loaded from: classes12.dex */
public interface g0 {
    void a(p0[] p0VarArr, TrackGroupArray trackGroupArray, w5.c cVar);

    y5.b getAllocator();

    long getBackBufferDurationUs();

    void onPrepared();

    void onReleased();

    void onStopped();

    boolean retainBackBufferFromKeyframe();

    boolean shouldContinueLoading(long j10, float f10);

    boolean shouldStartPlayback(long j10, float f10, boolean z10);
}
