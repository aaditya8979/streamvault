package androidx.compose.ui.layout;

import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import bn.r;
import com.ironsource.C3996e4;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: OnPlacedModifier.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\r\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\r¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/layout/OnPlacedModifierImpl;", "Landroidx/compose/ui/layout/OnPlacedModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/layout/LayoutCoordinates;", C3996e4.f31528f, "Lbn/r;", "onPlaced", "", "other", "", "equals", "", "hashCode", "Lkotlin/Function1;", "callback", "Lsn/l;", "getCallback", "()Lsn/l;", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectorInfo", "<init>", "(Lsn/l;Lsn/l;)V", "ui_release"}, k = 1, mv = {1, 6, 0})
final class OnPlacedModifierImpl extends InspectorValueInfo implements OnPlacedModifier {

    @NotNull
    private final l<LayoutCoordinates, r> callback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnPlacedModifierImpl(@NotNull l<? super LayoutCoordinates, r> lVar, @NotNull l<? super InspectorInfo, r> lVar2) {
        super(lVar2);
        p.k(lVar, "callback");
        p.k(lVar2, "inspectorInfo");
        this.callback = lVar;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof OnPlacedModifierImpl) {
            return p.f(this.callback, ((OnPlacedModifierImpl) other).callback);
        }
        return false;
    }

    @NotNull
    public final l<LayoutCoordinates, r> getCallback() {
        return this.callback;
    }

    public int hashCode() {
        return this.callback.hashCode();
    }

    @Override // androidx.compose.ui.layout.OnPlacedModifier
    public void onPlaced(@NotNull LayoutCoordinates layoutCoordinates) {
        p.k(layoutCoordinates, C3996e4.f31528f);
        this.callback.invoke(layoutCoordinates);
    }
}
