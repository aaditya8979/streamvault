package h0;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import com.applovin.sdk.AppLovinEventTypes;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StrongMemoryCache.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J,\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0016J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0016"}, d2 = {"Lh0/a;", "Lh0/f;", "Lcoil/memory/MemoryCache$Key;", "key", "Lcoil/memory/MemoryCache$b;", "a", "Landroid/graphics/Bitmap;", "bitmap", "", "", "", "extras", "Lbn/r;", "b", "", AppLovinEventTypes.USER_COMPLETED_LEVEL, "trimMemory", "Lh0/g;", "Lh0/g;", "weakMemoryCache", "<init>", "(Lh0/g;)V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g weakMemoryCache;

    public a(@NotNull g gVar) {
        this.weakMemoryCache = gVar;
    }

    @Override // h0.f
    @Nullable
    public MemoryCache.Value a(@NotNull MemoryCache.Key key) {
        return null;
    }

    @Override // h0.f
    public void b(@NotNull MemoryCache.Key key, @NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> map) {
        this.weakMemoryCache.b(key, bitmap, map, o0.a.a(bitmap));
    }

    @Override // h0.f
    public void trimMemory(int i10) {
    }
}
