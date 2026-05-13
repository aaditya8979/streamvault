package com.google.android.exoplayer.ui;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: TimeBar.java */
/* JADX INFO: loaded from: classes.dex */
public interface a {

    /* JADX INFO: renamed from: com.google.android.exoplayer.ui.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TimeBar.java */
    public interface InterfaceC0295a {
        void c(a aVar, long j10);

        void d(a aVar, long j10);

        void f(a aVar, long j10, boolean z10);
    }

    void a(InterfaceC0295a interfaceC0295a);

    boolean b();

    void setAdGroupTimesMs(@Nullable long[] jArr, @Nullable boolean[] zArr, int i10);

    void setBufferedPosition(long j10);

    void setDuration(long j10);

    void setEnabled(boolean z10);

    void setPosition(long j10);
}
