package com.google.android.exoplayer.upstream.cache;

import com.google.android.exoplayer.upstream.cache.Cache;
import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: compiled from: LeastRecentlyUsedCacheEvictor.java */
/* JADX INFO: loaded from: classes12.dex */
public final class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TreeSet<z5.e> f21110b = new TreeSet<>(new Comparator() { // from class: z5.l
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return com.google.android.exoplayer.upstream.cache.e.f((e) obj, (e) obj2);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f21111c;

    public e(long j10) {
        this.f21109a = j10;
    }

    public static int f(z5.e eVar, z5.e eVar2) {
        long j10 = eVar.f98210g;
        long j11 = eVar2.f98210g;
        return j10 - j11 == 0 ? eVar.compareTo(eVar2) : j10 < j11 ? -1 : 1;
    }

    @Override // com.google.android.exoplayer.upstream.cache.c
    public void a(Cache cache, String str, long j10, long j11) {
        if (j11 != -1) {
            g(cache, j11);
        }
    }

    @Override // com.google.android.exoplayer.upstream.cache.Cache.a
    public void b(Cache cache, z5.e eVar) {
        this.f21110b.add(eVar);
        this.f21111c += eVar.f98207d;
        g(cache, 0L);
    }

    @Override // com.google.android.exoplayer.upstream.cache.Cache.a
    public void c(Cache cache, z5.e eVar, z5.e eVar2) {
        d(cache, eVar);
        b(cache, eVar2);
    }

    @Override // com.google.android.exoplayer.upstream.cache.Cache.a
    public void d(Cache cache, z5.e eVar) {
        this.f21110b.remove(eVar);
        this.f21111c -= eVar.f98207d;
    }

    public final void g(Cache cache, long j10) {
        while (this.f21111c + j10 > this.f21109a && !this.f21110b.isEmpty()) {
            try {
                cache.b(this.f21110b.first());
            } catch (Cache.CacheException unused) {
            }
        }
    }

    @Override // com.google.android.exoplayer.upstream.cache.c
    public void onCacheInitialized() {
    }

    @Override // com.google.android.exoplayer.upstream.cache.c
    public boolean requiresCacheSpanTouches() {
        return true;
    }
}
