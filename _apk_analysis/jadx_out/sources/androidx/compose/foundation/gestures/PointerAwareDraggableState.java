package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import bn.r;
import hn.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.p;

/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JA\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH&ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/gestures/PointerAwareDraggableState;", "", "Landroidx/compose/foundation/MutatePriority;", "dragPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/PointerAwareDragScope;", "Lhn/c;", "Lbn/r;", "block", "drag", "(Landroidx/compose/foundation/MutatePriority;Lsn/p;Lhn/c;)Ljava/lang/Object;", "", "delta", "dispatchRawDelta", "foundation_release"}, k = 1, mv = {1, 6, 0})
public interface PointerAwareDraggableState {
    static /* synthetic */ Object drag$default(PointerAwareDraggableState pointerAwareDraggableState, MutatePriority mutatePriority, p pVar, c cVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drag");
        }
        if ((i10 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return pointerAwareDraggableState.drag(mutatePriority, pVar, cVar);
    }

    void dispatchRawDelta(float f10);

    @Nullable
    Object drag(@NotNull MutatePriority mutatePriority, @NotNull p<? super PointerAwareDragScope, ? super c<? super r>, ? extends Object> pVar, @NotNull c<? super r> cVar);
}
