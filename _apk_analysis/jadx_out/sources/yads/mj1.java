package yads;

import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;

/* JADX INFO: loaded from: classes3.dex */
public final class mj1 implements Player.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final si3 f92375a;

    @Override // androidx.media3.common.Player.Listener
    public final void onIsPlayingChanged(boolean z10) {
        this.f92375a.getClass();
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackStateChanged(int i10) {
        ff2.f89560c.getClass();
        ff2 ff2Var = (ff2) ff2.f89561d.get(Integer.valueOf(i10));
        if (ff2Var != null) {
            this.f92375a.a(ff2Var);
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerError(PlaybackException playbackException) {
        this.f92375a.a(playbackException);
    }
}
