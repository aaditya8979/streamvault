package sg.bigo.ads.common.p;

import android.content.Context;
import android.util.LruCache;
import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicInteger;
import sg.bigo.ads.common.utils.p;

/* JADX INFO: loaded from: classes11.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f82354a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final LruCache<String, sg.bigo.ads.common.c> f82355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final LruCache<String, sg.bigo.ads.common.c> f82356c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final c f82359a = new c(0);
    }

    private c() {
        AtomicInteger atomicInteger = f82354a;
        this.f82355b = new LruCache<String, sg.bigo.ads.common.c>(atomicInteger.get()) { // from class: sg.bigo.ads.common.p.c.1
            @Override // android.util.LruCache
            public final /* synthetic */ int sizeOf(@NonNull String str, @NonNull sg.bigo.ads.common.c cVar) {
                return cVar.f81978a.getByteCount();
            }
        };
        this.f82356c = new LruCache<String, sg.bigo.ads.common.c>(atomicInteger.get()) { // from class: sg.bigo.ads.common.p.c.2
            @Override // android.util.LruCache
            public final /* synthetic */ int sizeOf(@NonNull String str, @NonNull sg.bigo.ads.common.c cVar) {
                return cVar.f81978a.getByteCount();
            }
        };
    }

    public /* synthetic */ c(byte b10) {
        this();
    }

    public static c a(Context context) {
        AtomicInteger atomicInteger = f82354a;
        if (atomicInteger.get() == 0) {
            atomicInteger.set(p.c(context));
            sg.bigo.ads.common.t.a.a(0, 3, "BitmapCacheManager", "Total cache size: " + atomicInteger.get());
        }
        return a.f82359a;
    }
}
