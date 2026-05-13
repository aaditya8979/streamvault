package com.google.android.exoplayer2;

import com.google.android.exoplayer2.c0;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: compiled from: BasePlayer.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0.d f21419a = new c0.d();

    @Override // com.google.android.exoplayer2.v
    public final void e(p pVar) {
        q(ImmutableList.of(pVar));
    }

    public final long g() {
        c0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.u()) {
            return -9223372036854775807L;
        }
        return currentTimeline.r(getCurrentMediaItemIndex(), this.f21419a).g();
    }

    public final int h() {
        c0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.u()) {
            return -1;
        }
        return currentTimeline.i(getCurrentMediaItemIndex(), j(), getShuffleModeEnabled());
    }

    @Override // com.google.android.exoplayer2.v
    public final boolean hasNextMediaItem() {
        return h() != -1;
    }

    @Override // com.google.android.exoplayer2.v
    public final boolean hasPreviousMediaItem() {
        return i() != -1;
    }

    public final int i() {
        c0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.u()) {
            return -1;
        }
        return currentTimeline.p(getCurrentMediaItemIndex(), j(), getShuffleModeEnabled());
    }

    @Override // com.google.android.exoplayer2.v
    public final boolean isCommandAvailable(int i10) {
        return getAvailableCommands().c(i10);
    }

    @Override // com.google.android.exoplayer2.v
    public final boolean isCurrentMediaItemDynamic() {
        c0 currentTimeline = getCurrentTimeline();
        return !currentTimeline.u() && currentTimeline.r(getCurrentMediaItemIndex(), this.f21419a).f21410j;
    }

    @Override // com.google.android.exoplayer2.v
    public final boolean isCurrentMediaItemLive() {
        c0 currentTimeline = getCurrentTimeline();
        return !currentTimeline.u() && currentTimeline.r(getCurrentMediaItemIndex(), this.f21419a).i();
    }

    @Override // com.google.android.exoplayer2.v
    public final boolean isCurrentMediaItemSeekable() {
        c0 currentTimeline = getCurrentTimeline();
        return !currentTimeline.u() && currentTimeline.r(getCurrentMediaItemIndex(), this.f21419a).f21409i;
    }

    @Override // com.google.android.exoplayer2.v
    public final boolean isPlaying() {
        return getPlaybackState() == 3 && getPlayWhenReady() && getPlaybackSuppressionReason() == 0;
    }

    public final int j() {
        int repeatMode = getRepeatMode();
        if (repeatMode == 1) {
            return 0;
        }
        return repeatMode;
    }

    public abstract void k();

    public final void l() {
        m(getCurrentMediaItemIndex());
    }

    public final void m(int i10) {
        seekTo(i10, -9223372036854775807L);
    }

    public final void n() {
        int iH = h();
        if (iH == -1) {
            return;
        }
        if (iH == getCurrentMediaItemIndex()) {
            k();
        } else {
            m(iH);
        }
    }

    public final void o(long j10) {
        long currentPosition = getCurrentPosition() + j10;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        seekTo(Math.max(currentPosition, 0L));
    }

    public final void p() {
        int i10 = i();
        if (i10 == -1) {
            return;
        }
        if (i10 == getCurrentMediaItemIndex()) {
            k();
        } else {
            m(i10);
        }
    }

    @Override // com.google.android.exoplayer2.v
    public final void pause() {
        setPlayWhenReady(false);
    }

    @Override // com.google.android.exoplayer2.v
    public final void play() {
        setPlayWhenReady(true);
    }

    public final void q(List<p> list) {
        setMediaItems(list, true);
    }

    @Override // com.google.android.exoplayer2.v
    public final void seekBack() {
        o(-getSeekBackIncrement());
    }

    @Override // com.google.android.exoplayer2.v
    public final void seekForward() {
        o(getSeekForwardIncrement());
    }

    @Override // com.google.android.exoplayer2.v
    public final void seekTo(long j10) {
        seekTo(getCurrentMediaItemIndex(), j10);
    }

    @Override // com.google.android.exoplayer2.v
    public final void seekToNext() {
        if (getCurrentTimeline().u() || isPlayingAd()) {
            return;
        }
        if (hasNextMediaItem()) {
            n();
        } else if (isCurrentMediaItemLive() && isCurrentMediaItemDynamic()) {
            l();
        }
    }

    @Override // com.google.android.exoplayer2.v
    public final void seekToPrevious() {
        if (getCurrentTimeline().u() || isPlayingAd()) {
            return;
        }
        boolean zHasPreviousMediaItem = hasPreviousMediaItem();
        if (isCurrentMediaItemLive() && !isCurrentMediaItemSeekable()) {
            if (zHasPreviousMediaItem) {
                p();
            }
        } else if (!zHasPreviousMediaItem || getCurrentPosition() > getMaxSeekToPreviousPosition()) {
            seekTo(0L);
        } else {
            p();
        }
    }
}
