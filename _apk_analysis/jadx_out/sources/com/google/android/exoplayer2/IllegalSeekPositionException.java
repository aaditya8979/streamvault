package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes12.dex */
public final class IllegalSeekPositionException extends IllegalStateException {
    public final long positionMs;
    public final c0 timeline;
    public final int windowIndex;

    public IllegalSeekPositionException(c0 c0Var, int i10, long j10) {
        this.timeline = c0Var;
        this.windowIndex = i10;
        this.positionMs = j10;
    }
}
