package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.source.q;
import d6.x1;
import e7.b0;
import e7.i0;
import java.io.IOException;

/* JADX INFO: compiled from: MediaPeriod.java */
/* JADX INFO: loaded from: classes9.dex */
public interface h extends q {

    /* JADX INFO: compiled from: MediaPeriod.java */
    public interface a extends q.a<h> {
        void c(h hVar);
    }

    long b(q7.r[] rVarArr, boolean[] zArr, b0[] b0VarArr, boolean[] zArr2, long j10);

    @Override // com.google.android.exoplayer2.source.q
    boolean continueLoading(long j10);

    void discardBuffer(long j10, boolean z10);

    long e(long j10, x1 x1Var);

    void f(a aVar, long j10);

    @Override // com.google.android.exoplayer2.source.q
    long getBufferedPositionUs();

    @Override // com.google.android.exoplayer2.source.q
    long getNextLoadPositionUs();

    i0 getTrackGroups();

    @Override // com.google.android.exoplayer2.source.q
    boolean isLoading();

    void maybeThrowPrepareError() throws IOException;

    long readDiscontinuity();

    @Override // com.google.android.exoplayer2.source.q
    void reevaluateBuffer(long j10);

    long seekToUs(long j10);
}
