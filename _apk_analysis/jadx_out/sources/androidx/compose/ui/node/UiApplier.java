package androidx.compose.ui.node;

import androidx.compose.runtime.AbstractApplier;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.ironsource.C4157n2;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: UiApplier.android.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016J \u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0014J\b\u0010\u000f\u001a\u00020\u0006H\u0016¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/node/UiApplier;", "Landroidx/compose/runtime/AbstractApplier;", "Landroidx/compose/ui/node/LayoutNode;", "", "index", C4157n2.f33007p, "Lbn/r;", "insertTopDown", "insertBottomUp", "count", "remove", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "move", "onClear", "onEndChanges", "root", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "ui_release"}, k = 1, mv = {1, 6, 0})
public final class UiApplier extends AbstractApplier<LayoutNode> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiApplier(@NotNull LayoutNode layoutNode) {
        super(layoutNode);
        p.k(layoutNode, "root");
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int i10, @NotNull LayoutNode layoutNode) {
        p.k(layoutNode, C4157n2.f33007p);
        getCurrent().insertAt$ui_release(i10, layoutNode);
    }

    @Override // androidx.compose.runtime.Applier
    public void insertTopDown(int i10, @NotNull LayoutNode layoutNode) {
        p.k(layoutNode, C4157n2.f33007p);
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int i10, int i11, int i12) {
        getCurrent().move$ui_release(i10, i11, i12);
    }

    @Override // androidx.compose.runtime.AbstractApplier
    public void onClear() {
        getRoot().removeAll$ui_release();
    }

    @Override // androidx.compose.runtime.Applier
    public void onEndChanges() {
        super.onEndChanges();
        Owner owner = getRoot().getOwner();
        if (owner != null) {
            owner.onEndApplyChanges();
        }
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int i10, int i11) {
        getCurrent().removeAt$ui_release(i10, i11);
    }
}
