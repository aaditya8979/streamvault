package yads;

import android.content.Context;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.SimpleCache;

/* JADX INFO: loaded from: classes2.dex */
public final class cp0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f88559c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile cp0 f88560d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yo0 f88561a = new yo0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SimpleCache f88562b;

    public final Cache a(Context context) {
        SimpleCache simpleCacheA;
        synchronized (f88559c) {
            simpleCacheA = this.f88562b;
            if (simpleCacheA == null) {
                simpleCacheA = this.f88561a.a(context);
                this.f88562b = simpleCacheA;
            }
        }
        return simpleCacheA;
    }
}
