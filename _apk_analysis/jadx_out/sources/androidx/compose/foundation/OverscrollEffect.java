package androidx.compose.foundation;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Overscroll.kt */
/* JADX INFO: loaded from: classes11.dex */
@Stable
@ExperimentalFoundationApi
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u000f\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H¦@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H¦@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0018\u001a\u00020\u00178&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0019R\u0014\u0010 \u001a\u00020\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fø\u0001\u0002\u0082\u0002\u0011\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/OverscrollEffect;", "", "Landroidx/compose/ui/geometry/Offset;", "scrollDelta", "pointerPosition", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "consumePreScroll-A0NYTsA", "(JLandroidx/compose/ui/geometry/Offset;I)J", "consumePreScroll", "initialDragDelta", "overscrollDelta", "Lbn/r;", "consumePostScroll-l7mfB5k", "(JJLandroidx/compose/ui/geometry/Offset;I)V", "consumePostScroll", "Landroidx/compose/ui/unit/Velocity;", "velocity", "consumePreFling-QWom1Mo", "(JLhn/c;)Ljava/lang/Object;", "consumePreFling", "consumePostFling-sF-c-tU", "consumePostFling", "", "isEnabled", "()Z", "setEnabled", "(Z)V", "isInProgress", "Landroidx/compose/ui/Modifier;", "getEffectModifier", "()Landroidx/compose/ui/Modifier;", "effectModifier", "foundation_release"}, k = 1, mv = {1, 6, 0})
public interface OverscrollEffect {
    @Nullable
    /* JADX INFO: renamed from: consumePostFling-sF-c-tU */
    Object mo156consumePostFlingsFctU(long j10, @NotNull hn.c<? super r> cVar);

    /* JADX INFO: renamed from: consumePostScroll-l7mfB5k */
    void mo157consumePostScrolll7mfB5k(long initialDragDelta, long overscrollDelta, @Nullable Offset pointerPosition, int source);

    @Nullable
    /* JADX INFO: renamed from: consumePreFling-QWom1Mo */
    Object mo158consumePreFlingQWom1Mo(long j10, @NotNull hn.c<? super Velocity> cVar);

    /* JADX INFO: renamed from: consumePreScroll-A0NYTsA */
    long mo159consumePreScrollA0NYTsA(long scrollDelta, @Nullable Offset pointerPosition, int source);

    @NotNull
    Modifier getEffectModifier();

    boolean isEnabled();

    boolean isInProgress();

    void setEnabled(boolean z10);
}
