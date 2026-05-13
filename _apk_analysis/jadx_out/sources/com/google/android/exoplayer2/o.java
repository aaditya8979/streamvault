package com.google.android.exoplayer2;

import com.google.android.exoplayer2.p;

/* JADX INFO: compiled from: LivePlaybackSpeedControl.java */
/* JADX INFO: loaded from: classes2.dex */
public interface o {
    void a(p.g gVar);

    float getAdjustedPlaybackSpeed(long j10, long j11);

    long getTargetLiveOffsetUs();

    void notifyRebuffer();

    void setTargetLiveOffsetOverrideUs(long j10);
}
