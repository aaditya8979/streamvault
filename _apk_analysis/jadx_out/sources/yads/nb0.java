package yads;

import android.media.AudioTrack;

/* JADX INFO: loaded from: classes7.dex */
public final class nb0 extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AudioTrack f92798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zb0 f92799c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb0(zb0 zb0Var, AudioTrack audioTrack) {
        super("ExoPlayer:AudioTrackReleaseThread");
        this.f92799c = zb0Var;
        this.f92798b = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.f92798b.flush();
            this.f92798b.release();
        } finally {
            this.f92799c.f97461h.d();
        }
    }
}
