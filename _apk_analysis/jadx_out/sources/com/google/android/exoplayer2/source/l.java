package com.google.android.exoplayer2.source;

import android.net.Uri;
import e6.s1;
import i6.y;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ProgressiveMediaExtractor.java */
/* JADX INFO: loaded from: classes8.dex */
public interface l {

    /* JADX INFO: compiled from: ProgressiveMediaExtractor.java */
    public interface a {
        l a(s1 s1Var);
    }

    void a(r7.f fVar, Uri uri, Map<String, List<String>> map, long j10, long j11, i6.m mVar) throws IOException;

    int b(y yVar) throws IOException;

    void disableSeekingOnMp3Streams();

    long getCurrentInputPosition();

    void release();

    void seek(long j10, long j11);
}
