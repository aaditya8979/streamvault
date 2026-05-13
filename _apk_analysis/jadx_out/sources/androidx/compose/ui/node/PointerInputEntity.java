package androidx.compose.ui.node;

import androidx.compose.ui.input.pointer.PointerInputModifier;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: PointerInputEntity.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\r"}, d2 = {"Landroidx/compose/ui/node/PointerInputEntity;", "Landroidx/compose/ui/node/LayoutNodeEntity;", "Landroidx/compose/ui/input/pointer/PointerInputModifier;", "Lbn/r;", "onAttach", "onDetach", "", "shouldSharePointerInputWithSiblings", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "layoutNodeWrapper", "modifier", "<init>", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/input/pointer/PointerInputModifier;)V", "ui_release"}, k = 1, mv = {1, 6, 0})
public final class PointerInputEntity extends LayoutNodeEntity<PointerInputEntity, PointerInputModifier> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerInputEntity(@NotNull LayoutNodeWrapper layoutNodeWrapper, @NotNull PointerInputModifier pointerInputModifier) {
        super(layoutNodeWrapper, pointerInputModifier);
        p.k(layoutNodeWrapper, "layoutNodeWrapper");
        p.k(pointerInputModifier, "modifier");
    }

    @Override // androidx.compose.ui.node.LayoutNodeEntity
    public void onAttach() {
        super.onAttach();
        getModifier().getPointerInputFilter().setLayoutCoordinates$ui_release(getLayoutNodeWrapper());
        getModifier().getPointerInputFilter().setAttached$ui_release(true);
    }

    @Override // androidx.compose.ui.node.LayoutNodeEntity
    public void onDetach() {
        super.onDetach();
        getModifier().getPointerInputFilter().setAttached$ui_release(false);
    }

    public final boolean shouldSharePointerInputWithSiblings() {
        if (!getModifier().getPointerInputFilter().getShareWithSiblings()) {
            PointerInputEntity next = getNext();
            if (!(next != null ? next.shouldSharePointerInputWithSiblings() : false)) {
                return false;
            }
        }
        return true;
    }
}
