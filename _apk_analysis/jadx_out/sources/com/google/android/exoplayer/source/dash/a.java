package com.google.android.exoplayer.source.dash;

import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.source.dash.d;
import g5.h;
import java.util.List;
import y5.n;
import y5.q;

/* JADX INFO: compiled from: DashChunkSource.java */
/* JADX INFO: loaded from: classes2.dex */
public interface a extends h {

    /* JADX INFO: renamed from: com.google.android.exoplayer.source.dash.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DashChunkSource.java */
    public interface InterfaceC0288a {
        a a(n nVar, i5.b bVar, int i10, int[] iArr, com.google.android.exoplayer.trackselection.c cVar, int i11, long j10, boolean z10, List<Format> list, @Nullable d.c cVar2, @Nullable q qVar);
    }

    void b(com.google.android.exoplayer.trackselection.c cVar);

    void g(i5.b bVar, int i10);
}
