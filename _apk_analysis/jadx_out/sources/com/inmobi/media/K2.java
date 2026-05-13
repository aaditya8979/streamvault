package com.inmobi.media;

import android.content.Context;
import android.os.storage.StorageManager;
import androidx.media3.common.MediaItem;
import androidx.media3.database.StandaloneDatabaseProvider;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.cache.CacheDataSink;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.datasource.cache.ContentMetadata;
import androidx.media3.datasource.cache.LeastRecentlyUsedCacheEvictor;
import androidx.media3.datasource.cache.SimpleCache;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.MediaSource;
import com.inmobi.media.K2;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C3978d4;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes8.dex */
public final class K2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final bn.g f25774h = kotlin.b.a(LazyThreadSafetyMode.SYNCHRONIZED, new sn.a() { // from class: n9.f2
        @Override // sn.a
        public final Object invoke() {
            return K2.b();
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f25775a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f25776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdConfig.VideoCacheConfig f25777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LeastRecentlyUsedCacheEvictor f25778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final StandaloneDatabaseProvider f25779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicInteger f25780f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile SimpleCache f25781g;

    public K2() {
        Context context = Ji.f25747a;
        tn.p.h(context);
        this.f25776b = context;
        C3476i4 c3476i4 = Y3.f26611a;
        tn.p.k(AdConfig.class, "clazz");
        this.f25777c = ((AdConfig) Y3.f26611a.a(AdConfig.class)).getHybridNative().getVideoCache();
        this.f25779e = new StandaloneDatabaseProvider(context);
        this.f25780f = new AtomicInteger(0);
        this.f25778d = new LeastRecentlyUsedCacheEvictor(a(context));
    }

    public static final K2 b() {
        return new K2();
    }

    public final int a(String str) {
        SimpleCache simpleCache;
        tn.p.k(str, "url");
        try {
            synchronized (this.f25775a) {
                simpleCache = this.f25781g;
            }
            if (simpleCache == null) {
                return 0;
            }
            ContentMetadata contentMetadata = simpleCache.getContentMetadata(str);
            tn.p.j(contentMetadata, "getContentMetadata(...)");
            long contentLength = ContentMetadata.getContentLength(contentMetadata);
            if (contentLength <= 0) {
                return 0;
            }
            return (int) ((simpleCache.getCachedLength(str, 0L, contentLength) * ((long) 100)) / contentLength);
        } catch (Exception e10) {
            e10.getMessage();
            return 0;
        }
    }

    public final long a(Context context) {
        long j10 = 1024;
        long maxSize = this.f25777c.getMaxSize() * j10 * j10;
        C3850x5.f28483a.getClass();
        if (C3850x5.y()) {
            try {
                Object systemService = context.getSystemService(C3978d4.a.f31215k);
                tn.p.i(systemService, "null cannot be cast to non-null type android.os.storage.StorageManager");
                StorageManager storageManager = (StorageManager) systemService;
                UUID uuidForPath = storageManager.getUuidForPath(context.getCacheDir());
                tn.p.j(uuidForPath, "getUuidForPath(...)");
                return Math.min(maxSize, storageManager.getCacheQuotaBytes(uuidForPath));
            } catch (Exception e10) {
                e10.getMessage();
            }
        }
        return maxSize;
    }

    public final SimpleCache a() throws IOException {
        File file = new File(this.f25776b.getCacheDir(), "im_exoplayer_video_cache");
        if (file.exists() || file.mkdirs()) {
            return new SimpleCache(file, this.f25778d, this.f25779e);
        }
        throw new IOException("Could not create cache directory: " + file);
    }

    public final MediaSource a(String str, boolean z10) {
        DataSource.Factory factory;
        SimpleCache simpleCacheA;
        tn.p.k(str, "url");
        MediaItem mediaItemBuild = new MediaItem.Builder().setUri(str).setCustomCacheKey(str).build();
        tn.p.j(mediaItemBuild, "build(...)");
        if (this.f25777c.isEnabled() && z10) {
            DefaultDataSource.Factory factory2 = new DefaultDataSource.Factory(this.f25776b);
            synchronized (this.f25775a) {
                simpleCacheA = this.f25781g;
                if (simpleCacheA == null) {
                    simpleCacheA = a();
                    this.f25781g = simpleCacheA;
                }
            }
            factory = new CacheDataSource.Factory().setCache(simpleCacheA).setUpstreamDataSourceFactory(factory2).setCacheWriteDataSinkFactory(new CacheDataSink.Factory().setCache(simpleCacheA)).setCacheReadDataSourceFactory(new FileDataSource.Factory()).setFlags(2);
            tn.p.j(factory, "setFlags(...)");
        } else {
            factory = new DefaultDataSource.Factory(this.f25776b);
        }
        MediaSource mediaSourceCreateMediaSource = new DefaultMediaSourceFactory(factory).createMediaSource(mediaItemBuild);
        tn.p.j(mediaSourceCreateMediaSource, "createMediaSource(...)");
        return mediaSourceCreateMediaSource;
    }
}
