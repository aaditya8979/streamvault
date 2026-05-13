package coil.memory;

import android.graphics.Bitmap;
import androidx.collection.LruCache;
import coil.memory.MemoryCache;
import coil.memory.RealStrongMemoryCache;
import com.applovin.sdk.AppLovinEventTypes;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import h0.f;
import h0.g;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StrongMemoryCache.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000G\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u000b*\u0001\u0015\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0005B\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J,\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcoil/memory/RealStrongMemoryCache;", "Lh0/f;", "Lcoil/memory/MemoryCache$Key;", "key", "Lcoil/memory/MemoryCache$b;", "a", "Landroid/graphics/Bitmap;", "bitmap", "", "", "", "extras", "Lbn/r;", "b", "d", "", AppLovinEventTypes.USER_COMPLETED_LEVEL, "trimMemory", "Lh0/g;", "Lh0/g;", "weakMemoryCache", "coil/memory/RealStrongMemoryCache$cache$1", "Lcoil/memory/RealStrongMemoryCache$cache$1;", "cache", InneractiveMediationDefs.GENDER_FEMALE, "()I", "size", "e", "maxSize", "<init>", "(ILh0/g;)V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class RealStrongMemoryCache implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g weakMemoryCache;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final RealStrongMemoryCache$cache$1 cache;

    /* JADX INFO: compiled from: StrongMemoryCache.kt */
    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcoil/memory/RealStrongMemoryCache$a;", "", "Landroid/graphics/Bitmap;", "a", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "bitmap", "", "", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "extras", "", "c", "I", "()I", "size", "<init>", "(Landroid/graphics/Bitmap;Ljava/util/Map;I)V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Bitmap bitmap;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Map<String, Object> extras;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final int size;

        public a(@NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> map, int i10) {
            this.bitmap = bitmap;
            this.extras = map;
            this.size = i10;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        @NotNull
        public final Map<String, Object> b() {
            return this.extras;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getSize() {
            return this.size;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [coil.memory.RealStrongMemoryCache$cache$1] */
    public RealStrongMemoryCache(final int i10, @NotNull g gVar) {
        this.weakMemoryCache = gVar;
        this.cache = new LruCache<MemoryCache.Key, a>(i10) { // from class: coil.memory.RealStrongMemoryCache$cache$1
            @Override // androidx.collection.LruCache
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void entryRemoved(boolean z10, @NotNull MemoryCache.Key key, @NotNull RealStrongMemoryCache.a aVar, @Nullable RealStrongMemoryCache.a aVar2) {
                this.weakMemoryCache.b(key, aVar.getBitmap(), aVar.b(), aVar.getSize());
            }

            @Override // androidx.collection.LruCache
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public int sizeOf(@NotNull MemoryCache.Key key, @NotNull RealStrongMemoryCache.a value) {
                return value.getSize();
            }
        };
    }

    @Override // h0.f
    @Nullable
    public MemoryCache.Value a(@NotNull MemoryCache.Key key) {
        a aVar = get(key);
        if (aVar != null) {
            return new MemoryCache.Value(aVar.getBitmap(), aVar.b());
        }
        return null;
    }

    @Override // h0.f
    public void b(@NotNull MemoryCache.Key key, @NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> map) {
        int iA = o0.a.a(bitmap);
        if (iA <= e()) {
            put(key, new a(bitmap, map, iA));
        } else {
            remove(key);
            this.weakMemoryCache.b(key, bitmap, map, iA);
        }
    }

    public void d() {
        evictAll();
    }

    public int e() {
        return maxSize();
    }

    public int f() {
        return size();
    }

    @Override // h0.f
    public void trimMemory(int i10) {
        if (i10 >= 40) {
            d();
            return;
        }
        boolean z10 = false;
        if (10 <= i10 && i10 < 20) {
            z10 = true;
        }
        if (z10) {
            trimToSize(f() / 2);
        }
    }
}
