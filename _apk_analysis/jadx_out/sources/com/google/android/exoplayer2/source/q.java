package com.google.android.exoplayer2.source;

/* JADX INFO: compiled from: SequenceableLoader.java */
/* JADX INFO: loaded from: classes9.dex */
public interface q {

    /* JADX INFO: compiled from: SequenceableLoader.java */
    public interface a<T extends q> {
        void a(T t10);
    }

    boolean continueLoading(long j10);

    long getBufferedPositionUs();

    long getNextLoadPositionUs();

    boolean isLoading();

    void reevaluateBuffer(long j10);
}
