package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyLayoutItemProvider.kt */
/* JADX INFO: loaded from: classes11.dex */
@Stable
@ExperimentalFoundationApi
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u000b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "", "", "index", "Lbn/r;", "Item", "(ILandroidx/compose/runtime/Composer;I)V", "getContentType", "getKey", "getItemCount", "()I", "itemCount", "", "getKeyToIndexMap", "()Ljava/util/Map;", "keyToIndexMap", "foundation_release"}, k = 1, mv = {1, 6, 0})
public interface LazyLayoutItemProvider {
    @Composable
    void Item(int i10, @Nullable Composer composer, int i11);

    @Nullable
    default Object getContentType(int index) {
        return null;
    }

    int getItemCount();

    @NotNull
    default Object getKey(int index) {
        return Lazy_androidKt.getDefaultLazyLayoutKey(index);
    }

    @NotNull
    default Map<Object, Integer> getKeyToIndexMap() {
        return a.j();
    }
}
