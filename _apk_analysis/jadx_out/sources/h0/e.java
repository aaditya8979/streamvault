package h0;

import android.graphics.Bitmap;
import androidx.annotation.VisibleForTesting;
import cn.f0;
import coil.memory.MemoryCache;
import com.applovin.sdk.AppLovinEventTypes;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WeakMemoryCache.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0002\u0005\u000fB\u0007¢\u0006\u0004\b!\u0010\u0013J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J4\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u000f\u0010\u0012\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u000eH\u0002R\\\u0010\u001e\u001a>\u0012\u0004\u0012\u00020\u0002\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u00180\u0015j\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u0018`\u00198\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001a\u0012\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001f¨\u0006\""}, d2 = {"Lh0/e;", "Lh0/g;", "Lcoil/memory/MemoryCache$Key;", "key", "Lcoil/memory/MemoryCache$b;", "a", "Landroid/graphics/Bitmap;", "bitmap", "", "", "", "extras", "", "size", "Lbn/r;", "b", AppLovinEventTypes.USER_COMPLETED_LEVEL, "trimMemory", "c", "()V", "d", "Ljava/util/LinkedHashMap;", "Ljava/util/ArrayList;", "Lh0/e$b;", "Lkotlin/collections/ArrayList;", "Lkotlin/collections/LinkedHashMap;", "Ljava/util/LinkedHashMap;", "getCache$coil_base_release", "()Ljava/util/LinkedHashMap;", "getCache$coil_base_release$annotations", "cache", "I", "operationsSinceCleanUp", "<init>", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LinkedHashMap<MemoryCache.Key, ArrayList<b>> cache = new LinkedHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public int operationsSinceCleanUp;

    /* JADX INFO: compiled from: WeakMemoryCache.kt */
    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0003\u0010\fR#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\n\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006¨\u0006\u0017"}, d2 = {"Lh0/e$b;", "", "", "a", "I", "c", "()I", "identityHashCode", "Ljava/lang/ref/WeakReference;", "Landroid/graphics/Bitmap;", "b", "Ljava/lang/ref/WeakReference;", "()Ljava/lang/ref/WeakReference;", "bitmap", "", "", "Ljava/util/Map;", "()Ljava/util/Map;", "extras", "d", "size", "<init>", "(ILjava/lang/ref/WeakReference;Ljava/util/Map;I)V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
    @VisibleForTesting
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final int identityHashCode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final WeakReference<Bitmap> bitmap;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Map<String, Object> extras;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final int size;

        public b(int i10, @NotNull WeakReference<Bitmap> weakReference, @NotNull Map<String, ? extends Object> map, int i11) {
            this.identityHashCode = i10;
            this.bitmap = weakReference;
            this.extras = map;
            this.size = i11;
        }

        @NotNull
        public final WeakReference<Bitmap> a() {
            return this.bitmap;
        }

        @NotNull
        public final Map<String, Object> b() {
            return this.extras;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getIdentityHashCode() {
            return this.identityHashCode;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getSize() {
            return this.size;
        }
    }

    @Override // h0.g
    @Nullable
    public synchronized MemoryCache.Value a(@NotNull MemoryCache.Key key) {
        ArrayList<b> arrayList = this.cache.get(key);
        MemoryCache.Value bVar = null;
        if (arrayList == null) {
            return null;
        }
        int i10 = 0;
        int size = arrayList.size();
        while (true) {
            if (i10 >= size) {
                break;
            }
            b bVar2 = arrayList.get(i10);
            Bitmap bitmap = bVar2.a().get();
            MemoryCache.Value bVar3 = bitmap != null ? new MemoryCache.Value(bitmap, bVar2.b()) : null;
            if (bVar3 != null) {
                bVar = bVar3;
                break;
            }
            i10++;
        }
        d();
        return bVar;
    }

    @Override // h0.g
    public synchronized void b(@NotNull MemoryCache.Key key, @NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> map, int i10) {
        LinkedHashMap<MemoryCache.Key, ArrayList<b>> linkedHashMap = this.cache;
        ArrayList<b> arrayList = linkedHashMap.get(key);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            linkedHashMap.put(key, arrayList);
        }
        ArrayList<b> arrayList2 = arrayList;
        int iIdentityHashCode = System.identityHashCode(bitmap);
        b bVar = new b(iIdentityHashCode, new WeakReference(bitmap), map, i10);
        int i11 = 0;
        int size = arrayList2.size();
        while (true) {
            if (i11 >= size) {
                arrayList2.add(bVar);
                break;
            }
            b bVar2 = arrayList2.get(i11);
            if (i10 < bVar2.getSize()) {
                i11++;
            } else if (bVar2.getIdentityHashCode() == iIdentityHashCode && bVar2.a().get() == bitmap) {
                arrayList2.set(i11, bVar);
            } else {
                arrayList2.add(i11, bVar);
            }
        }
        d();
    }

    @VisibleForTesting
    public final void c() {
        WeakReference<Bitmap> weakReferenceA;
        this.operationsSinceCleanUp = 0;
        Iterator<ArrayList<b>> it = this.cache.values().iterator();
        while (it.hasNext()) {
            ArrayList<b> next = it.next();
            if (next.size() <= 1) {
                b bVar = (b) f0.v0(next);
                if (((bVar == null || (weakReferenceA = bVar.a()) == null) ? null : weakReferenceA.get()) == null) {
                    it.remove();
                }
            } else {
                int size = next.size();
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    int i12 = i11 - i10;
                    if (next.get(i12).a().get() == null) {
                        next.remove(i12);
                        i10++;
                    }
                }
                if (next.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    public final void d() {
        int i10 = this.operationsSinceCleanUp;
        this.operationsSinceCleanUp = i10 + 1;
        if (i10 >= 10) {
            c();
        }
    }

    @Override // h0.g
    public synchronized void trimMemory(int i10) {
        if (i10 >= 10 && i10 != 20) {
            c();
        }
    }
}
