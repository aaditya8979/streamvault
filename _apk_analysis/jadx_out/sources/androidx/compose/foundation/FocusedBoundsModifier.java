package androidx.compose.foundation;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import bn.r;
import com.ironsource.C3996e4;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: FocusedBounds.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016R&\u0010\f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/FocusedBoundsModifier;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/layout/OnGloballyPositionedModifier;", "Lbn/r;", "notifyObserverWhenAttached", "Landroidx/compose/ui/layout/LayoutCoordinates;", C3996e4.f31528f, "onGloballyPositioned", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "scope", "onModifierLocalsUpdated", "Lkotlin/Function1;", "observer", "Lsn/l;", "layoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 6, 0})
public final class FocusedBoundsModifier implements ModifierLocalConsumer, OnGloballyPositionedModifier {

    @Nullable
    private LayoutCoordinates layoutCoordinates;

    @Nullable
    private l<? super LayoutCoordinates, r> observer;

    private final void notifyObserverWhenAttached() {
        l<? super LayoutCoordinates, r> lVar;
        LayoutCoordinates layoutCoordinates = this.layoutCoordinates;
        if (layoutCoordinates != null) {
            p.h(layoutCoordinates);
            if (!layoutCoordinates.isAttached() || (lVar = this.observer) == null) {
                return;
            }
            lVar.invoke(this.layoutCoordinates);
        }
    }

    @Override // androidx.compose.ui.layout.OnGloballyPositionedModifier
    public void onGloballyPositioned(@NotNull LayoutCoordinates layoutCoordinates) {
        p.k(layoutCoordinates, C3996e4.f31528f);
        this.layoutCoordinates = layoutCoordinates;
        if (layoutCoordinates.isAttached()) {
            notifyObserverWhenAttached();
            return;
        }
        l<? super LayoutCoordinates, r> lVar = this.observer;
        if (lVar != null) {
            lVar.invoke(null);
        }
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(@NotNull ModifierLocalReadScope modifierLocalReadScope) {
        l<? super LayoutCoordinates, r> lVar;
        p.k(modifierLocalReadScope, "scope");
        l<? super LayoutCoordinates, r> lVar2 = (l) modifierLocalReadScope.getCurrent(FocusedBoundsKt.getModifierLocalFocusedBoundsObserver());
        if (lVar2 == null && (lVar = this.observer) != null) {
            lVar.invoke(null);
        }
        this.observer = lVar2;
    }
}
