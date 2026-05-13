package com.google.android.exoplayer2.ui;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: TimeBar.java */
/* JADX INFO: loaded from: classes7.dex */
public interface l0 {

    /* JADX INFO: compiled from: TimeBar.java */
    public interface a {
        void o(l0 l0Var, long j10, boolean z10);

        void r(l0 l0Var, long j10);

        void t(l0 l0Var, long j10);
    }

    void a(a aVar);

    long getPreferredUpdateDelay();

    void setAdGroupTimesMs(@Nullable long[] jArr, @Nullable boolean[] zArr, int i10);

    void setBufferedPosition(long j10);

    void setDuration(long j10);

    void setEnabled(boolean z10);

    void setPosition(long j10);
}
