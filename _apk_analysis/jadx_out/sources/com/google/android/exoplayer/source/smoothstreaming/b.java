package com.google.android.exoplayer.source.smoothstreaming;

import androidx.annotation.Nullable;
import g5.h;
import y5.n;
import y5.q;

/* JADX INFO: compiled from: SsChunkSource.java */
/* JADX INFO: loaded from: classes2.dex */
public interface b extends h {

    /* JADX INFO: compiled from: SsChunkSource.java */
    public interface a {
        b a(n nVar, com.google.android.exoplayer.source.smoothstreaming.manifest.a aVar, int i10, com.google.android.exoplayer.trackselection.c cVar, @Nullable q qVar);
    }

    void b(com.google.android.exoplayer.trackselection.c cVar);

    void c(com.google.android.exoplayer.source.smoothstreaming.manifest.a aVar);
}
