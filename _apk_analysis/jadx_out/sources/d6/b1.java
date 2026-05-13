package d6;

/* JADX INFO: compiled from: LoadControl.java */
/* JADX INFO: loaded from: classes3.dex */
public interface b1 {
    void a(com.google.android.exoplayer2.y[] yVarArr, e7.i0 i0Var, q7.r[] rVarArr);

    r7.b getAllocator();

    long getBackBufferDurationUs();

    void onPrepared();

    void onReleased();

    void onStopped();

    boolean retainBackBufferFromKeyframe();

    boolean shouldContinueLoading(long j10, long j11, float f10);

    boolean shouldStartPlayback(long j10, float f10, boolean z10, long j11);
}
