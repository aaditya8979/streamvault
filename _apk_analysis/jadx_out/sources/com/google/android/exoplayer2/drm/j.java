package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.g;
import java.util.UUID;

/* JADX INFO: compiled from: MediaDrmCallback.java */
/* JADX INFO: loaded from: classes8.dex */
public interface j {
    byte[] a(UUID uuid, g.a aVar) throws MediaDrmCallbackException;

    byte[] b(UUID uuid, g.d dVar) throws MediaDrmCallbackException;
}
