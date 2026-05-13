package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;

/* JADX INFO: compiled from: LazyGridState.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a!\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"rememberLazyGridState", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "initialFirstVisibleItemIndex", "", "initialFirstVisibleItemScrollOffset", "(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/grid/LazyGridState;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class LazyGridStateKt {
    @Composable
    @NotNull
    public static final LazyGridState rememberLazyGridState(final int i10, final int i11, @Nullable Composer composer, int i12, int i13) {
        composer.startReplaceableGroup(29186956);
        if ((i13 & 1) != 0) {
            i10 = 0;
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        LazyGridState lazyGridState = (LazyGridState) RememberSaveableKt.m1287rememberSaveable(new Object[0], (Saver) LazyGridState.INSTANCE.getSaver(), (String) null, (a) new a<LazyGridState>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridStateKt.rememberLazyGridState.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final LazyGridState invoke() {
                return new LazyGridState(i10, i11);
            }
        }, composer, 72, 4);
        composer.endReplaceableGroup();
        return lazyGridState;
    }
}
