package com.google.android.exoplayer.upstream.cache;

import com.google.android.exoplayer.upstream.cache.Cache;

/* JADX INFO: compiled from: CacheEvictor.java */
/* JADX INFO: loaded from: classes12.dex */
public interface c extends Cache.a {
    void a(Cache cache, String str, long j10, long j11);

    void onCacheInitialized();

    boolean requiresCacheSpanTouches();
}
