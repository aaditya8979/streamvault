package androidx.compose.ui.semantics;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.EntityList;
import androidx.compose.ui.node.LayoutNodeEntity;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.node.Owner;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: SemanticsEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0006\u0010\u000b\u001a\u00020\nJ)\u0010\u0011\u001a\u0004\u0018\u00010\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\r0\fH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsEntity;", "Landroidx/compose/ui/node/LayoutNodeEntity;", "Landroidx/compose/ui/semantics/SemanticsModifier;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "collapsedSemanticsConfiguration", "Lbn/r;", "onDetach", "onAttach", "", "toString", "Landroidx/compose/ui/geometry/Rect;", "touchBoundsInRoot", "Lkotlin/Function1;", "", "predicate", "nearestSemantics$ui_release", "(Lsn/l;)Landroidx/compose/ui/semantics/SemanticsEntity;", "nearestSemantics", "getUseMinimumTouchTarget", "()Z", "useMinimumTouchTarget", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "wrapped", "modifier", "<init>", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/semantics/SemanticsModifier;)V", "ui_release"}, k = 1, mv = {1, 6, 0})
public final class SemanticsEntity extends LayoutNodeEntity<SemanticsEntity, SemanticsModifier> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SemanticsEntity(@NotNull LayoutNodeWrapper layoutNodeWrapper, @NotNull SemanticsModifier semanticsModifier) {
        super(layoutNodeWrapper, semanticsModifier);
        p.k(layoutNodeWrapper, "wrapped");
        p.k(semanticsModifier, "modifier");
    }

    private final boolean getUseMinimumTouchTarget() {
        return SemanticsConfigurationKt.getOrNull(getModifier().getSemanticsConfiguration(), SemanticsActions.INSTANCE.getOnClick()) != null;
    }

    @NotNull
    public final SemanticsConfiguration collapsedSemanticsConfiguration() {
        SemanticsEntity next = getNext();
        SemanticsEntity semanticsEntity = null;
        if (next == null) {
            LayoutNodeWrapper wrapped$ui_release = getLayoutNodeWrapper().getWrapped();
            if (wrapped$ui_release != null) {
                while (wrapped$ui_release != null && !EntityList.m3212has0OSVbXo(wrapped$ui_release.m3262getEntitiesCHwCgZE(), EntityList.INSTANCE.m3223getSemanticsEntityTypeEEbPh1w())) {
                    wrapped$ui_release = wrapped$ui_release.getWrapped();
                }
                if (wrapped$ui_release != null && (next = (SemanticsEntity) EntityList.m3214head0OSVbXo(wrapped$ui_release.m3262getEntitiesCHwCgZE(), EntityList.INSTANCE.m3223getSemanticsEntityTypeEEbPh1w())) != null) {
                    LayoutNodeWrapper layoutNodeWrapper = next.getLayoutNodeWrapper();
                    while (layoutNodeWrapper != null) {
                        if (next != null) {
                            semanticsEntity = next;
                            break;
                        }
                        layoutNodeWrapper = layoutNodeWrapper.getWrapped();
                        next = layoutNodeWrapper != null ? (SemanticsEntity) EntityList.m3214head0OSVbXo(layoutNodeWrapper.m3262getEntitiesCHwCgZE(), EntityList.INSTANCE.m3223getSemanticsEntityTypeEEbPh1w()) : null;
                    }
                }
            }
        } else {
            LayoutNodeWrapper layoutNodeWrapper2 = next.getLayoutNodeWrapper();
            while (layoutNodeWrapper2 != null) {
                if (next != null) {
                    semanticsEntity = next;
                    break;
                }
                layoutNodeWrapper2 = layoutNodeWrapper2.getWrapped();
                next = layoutNodeWrapper2 != null ? (SemanticsEntity) EntityList.m3214head0OSVbXo(layoutNodeWrapper2.m3262getEntitiesCHwCgZE(), EntityList.INSTANCE.m3223getSemanticsEntityTypeEEbPh1w()) : null;
            }
        }
        if (semanticsEntity == null || getModifier().getSemanticsConfiguration().getIsClearingSemantics()) {
            return getModifier().getSemanticsConfiguration();
        }
        SemanticsConfiguration semanticsConfigurationCopy = getModifier().getSemanticsConfiguration().copy();
        semanticsConfigurationCopy.collapsePeer$ui_release(semanticsEntity.collapsedSemanticsConfiguration());
        return semanticsConfigurationCopy;
    }

    @Nullable
    public final SemanticsEntity nearestSemantics$ui_release(@NotNull l<? super SemanticsEntity, Boolean> predicate) {
        p.k(predicate, "predicate");
        LayoutNodeWrapper layoutNodeWrapper = getLayoutNodeWrapper();
        SemanticsEntity next = this;
        while (layoutNodeWrapper != null) {
            while (next != null) {
                if (predicate.invoke(next).booleanValue()) {
                    return next;
                }
                next = next.getNext();
            }
            layoutNodeWrapper = layoutNodeWrapper.getWrapped();
            next = layoutNodeWrapper != null ? (SemanticsEntity) EntityList.m3214head0OSVbXo(layoutNodeWrapper.m3262getEntitiesCHwCgZE(), EntityList.INSTANCE.m3223getSemanticsEntityTypeEEbPh1w()) : null;
        }
        return null;
    }

    @Override // androidx.compose.ui.node.LayoutNodeEntity
    public void onAttach() {
        super.onAttach();
        Owner owner = getLayoutNode().getOwner();
        if (owner != null) {
            owner.onSemanticsChange();
        }
    }

    @Override // androidx.compose.ui.node.LayoutNodeEntity
    public void onDetach() {
        super.onDetach();
        Owner owner = getLayoutNode().getOwner();
        if (owner != null) {
            owner.onSemanticsChange();
        }
    }

    @NotNull
    public String toString() {
        return super.toString() + " id: " + getModifier().getId() + " config: " + getModifier().getSemanticsConfiguration();
    }

    @NotNull
    public final Rect touchBoundsInRoot() {
        return !getIsAttached() ? Rect.INSTANCE.getZero() : !getUseMinimumTouchTarget() ? LayoutCoordinatesKt.boundsInRoot(getLayoutNodeWrapper()) : getLayoutNodeWrapper().touchBoundsInRoot();
    }
}
