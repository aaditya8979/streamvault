package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.mediacodec.a;
import com.google.android.exoplayer2.mediacodec.c;
import com.google.android.exoplayer2.mediacodec.f;
import java.io.IOException;
import s7.m0;
import s7.q;
import s7.u;

/* JADX INFO: compiled from: DefaultMediaCodecAdapterFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21846a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f21847b;

    @Override // com.google.android.exoplayer2.mediacodec.c.b
    public c a(c.a aVar) throws IOException {
        int i10;
        int i11 = m0.f79487a;
        if (i11 < 23 || ((i10 = this.f21846a) != 1 && (i10 != 0 || i11 < 31))) {
            return new f.b().a(aVar);
        }
        int i12 = u.i(aVar.f21850c.f21751m);
        q.f("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + m0.g0(i12));
        return new a.b(i12, this.f21847b).a(aVar);
    }
}
