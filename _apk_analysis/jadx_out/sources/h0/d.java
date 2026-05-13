package h0;

import coil.memory.MemoryCache;
import com.applovin.sdk.AppLovinEventTypes;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RealMemoryCache.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0096\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0014"}, d2 = {"Lh0/d;", "Lcoil/memory/MemoryCache;", "Lcoil/memory/MemoryCache$Key;", "key", "Lcoil/memory/MemoryCache$b;", "a", "value", "Lbn/r;", "b", "", AppLovinEventTypes.USER_COMPLETED_LEVEL, "trimMemory", "Lh0/f;", "Lh0/f;", "strongMemoryCache", "Lh0/g;", "Lh0/g;", "weakMemoryCache", "<init>", "(Lh0/f;Lh0/g;)V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class d implements MemoryCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final f strongMemoryCache;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g weakMemoryCache;

    public d(@NotNull f fVar, @NotNull g gVar) {
        this.strongMemoryCache = fVar;
        this.weakMemoryCache = gVar;
    }

    @Override // coil.memory.MemoryCache
    @Nullable
    public MemoryCache.Value a(@NotNull MemoryCache.Key key) {
        MemoryCache.Value valueA = this.strongMemoryCache.a(key);
        return valueA == null ? this.weakMemoryCache.a(key) : valueA;
    }

    @Override // coil.memory.MemoryCache
    public void b(@NotNull MemoryCache.Key key, @NotNull MemoryCache.Value value) {
        this.strongMemoryCache.b(MemoryCache.Key.c(key, null, o0.c.b(key.d()), 1, null), value.getBitmap(), o0.c.b(value.b()));
    }

    @Override // coil.memory.MemoryCache
    public void trimMemory(int i10) {
        this.strongMemoryCache.trimMemory(i10);
        this.weakMemoryCache.trimMemory(i10);
    }
}
