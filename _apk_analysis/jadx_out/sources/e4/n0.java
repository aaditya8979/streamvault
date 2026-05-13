package e4;

import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.ExoPlaybackException;
import com.google.android.exoplayer.source.TrackGroupArray;
import e4.v0;

/* JADX INFO: compiled from: Player.java */
/* JADX INFO: loaded from: classes11.dex */
public interface n0 {

    /* JADX INFO: compiled from: Player.java */
    @Deprecated
    public static abstract class a implements b {
        @Deprecated
        public void g(v0 v0Var, @Nullable Object obj) {
        }

        @Override // e4.n0.b
        public void j(v0 v0Var, int i10) {
            w(v0Var, v0Var.p() == 1 ? v0Var.n(0, new v0.c()).f60313c : null, i10);
        }

        @Override // e4.n0.b
        public void w(v0 v0Var, @Nullable Object obj, int i10) {
            g(v0Var, obj);
        }
    }

    /* JADX INFO: compiled from: Player.java */
    public interface b {
        default void a(l0 l0Var) {
        }

        default void b(ExoPlaybackException exoPlaybackException) {
        }

        default void e(TrackGroupArray trackGroupArray, w5.c cVar) {
        }

        default void j(v0 v0Var, int i10) {
            w(v0Var, v0Var.p() == 1 ? v0Var.n(0, new v0.c()).f60313c : null, i10);
        }

        default void onIsPlayingChanged(boolean z10) {
        }

        default void onLoadingChanged(boolean z10) {
        }

        default void onPlaybackSuppressionReasonChanged(int i10) {
        }

        default void onPlayerStateChanged(boolean z10, int i10) {
        }

        default void onPositionDiscontinuity(int i10) {
        }

        default void onRepeatModeChanged(int i10) {
        }

        default void onSeekProcessed() {
        }

        default void onShuffleModeEnabledChanged(boolean z10) {
        }

        @Deprecated
        default void w(v0 v0Var, @Nullable Object obj, int i10) {
        }
    }

    /* JADX INFO: compiled from: Player.java */
    public interface c {
        void b(n5.j jVar);

        void d(n5.j jVar);
    }

    /* JADX INFO: compiled from: Player.java */
    public interface d {
        void a(b6.i iVar);

        void clearVideoSurfaceView(@Nullable SurfaceView surfaceView);

        void clearVideoTextureView(@Nullable TextureView textureView);

        void f(b6.i iVar);

        void setVideoSurfaceView(@Nullable SurfaceView surfaceView);

        void setVideoTextureView(@Nullable TextureView textureView);
    }

    void c(b bVar);

    void e(b bVar);

    long getBufferedPosition();

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    long getCurrentPosition();

    v0 getCurrentTimeline();

    TrackGroupArray getCurrentTrackGroups();

    w5.c getCurrentTrackSelections();

    int getCurrentWindowIndex();

    long getDuration();

    int getNextWindowIndex();

    boolean getPlayWhenReady();

    int getPlaybackState();

    int getPlaybackSuppressionReason();

    int getPreviousWindowIndex();

    int getRendererType(int i10);

    int getRepeatMode();

    boolean getShuffleModeEnabled();

    @Nullable
    c getTextComponent();

    long getTotalBufferedDuration();

    @Nullable
    d getVideoComponent();

    boolean isPlayingAd();

    void next();

    void previous();

    void seekTo(int i10, long j10);

    void setPlayWhenReady(boolean z10);

    void setRepeatMode(int i10);

    void setShuffleModeEnabled(boolean z10);

    void stop(boolean z10);
}
