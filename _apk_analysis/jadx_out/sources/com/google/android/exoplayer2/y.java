package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.w;
import d6.u1;
import d6.v1;
import e6.s1;
import java.io.IOException;

/* JADX INFO: compiled from: Renderer.java */
/* JADX INFO: loaded from: classes2.dex */
public interface y extends w.b {

    /* JADX INFO: compiled from: Renderer.java */
    public interface a {
        void onSleep();

        void onWakeup();
    }

    void c(v1 v1Var, m[] mVarArr, e7.b0 b0Var, long j10, boolean z10, boolean z11, long j11, long j12) throws ExoPlaybackException;

    void d(int i10, s1 s1Var);

    void disable();

    void e(m[] mVarArr, e7.b0 b0Var, long j10, long j11) throws ExoPlaybackException;

    u1 getCapabilities();

    @Nullable
    s7.s getMediaClock();

    String getName();

    long getReadingPositionUs();

    int getState();

    @Nullable
    e7.b0 getStream();

    int getTrackType();

    boolean hasReadStreamToEnd();

    boolean isCurrentStreamFinal();

    boolean isEnded();

    boolean isReady();

    void maybeThrowStreamError() throws IOException;

    void render(long j10, long j11) throws ExoPlaybackException;

    void reset();

    void resetPosition(long j10) throws ExoPlaybackException;

    void setCurrentStreamFinal();

    default void setPlaybackSpeed(float f10, float f11) throws ExoPlaybackException {
    }

    void start() throws ExoPlaybackException;

    void stop();
}
