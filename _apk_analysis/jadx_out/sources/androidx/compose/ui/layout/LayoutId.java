package androidx.compose.ui.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Density;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: LayoutId.kt */
/* JADX INFO: loaded from: classes2.dex */
@Immutable
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B#\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016R\u001a\u0010\u000f\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/layout/LayoutId;", "Landroidx/compose/ui/layout/ParentDataModifier;", "Landroidx/compose/ui/layout/LayoutIdParentData;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/unit/Density;", "", "parentData", "modifyParentData", "", "hashCode", "other", "", "equals", "", "toString", "layoutId", "Ljava/lang/Object;", "getLayoutId", "()Ljava/lang/Object;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "Lbn/r;", "inspectorInfo", "<init>", "(Ljava/lang/Object;Lsn/l;)V", "ui_release"}, k = 1, mv = {1, 6, 0})
final class LayoutId extends InspectorValueInfo implements ParentDataModifier, LayoutIdParentData {

    @NotNull
    private final Object layoutId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutId(@NotNull Object obj, @NotNull l<? super InspectorInfo, r> lVar) {
        super(lVar);
        p.k(obj, "layoutId");
        p.k(lVar, "inspectorInfo");
        this.layoutId = obj;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        LayoutId layoutId = other instanceof LayoutId ? (LayoutId) other : null;
        if (layoutId == null) {
            return false;
        }
        return p.f(getLayoutId(), layoutId.getLayoutId());
    }

    @Override // androidx.compose.ui.layout.LayoutIdParentData
    @NotNull
    public Object getLayoutId() {
        return this.layoutId;
    }

    public int hashCode() {
        return getLayoutId().hashCode();
    }

    @Override // androidx.compose.ui.layout.ParentDataModifier
    @Nullable
    public Object modifyParentData(@NotNull Density density, @Nullable Object obj) {
        p.k(density, "<this>");
        return this;
    }

    @NotNull
    public String toString() {
        return "LayoutId(id=" + getLayoutId() + ')';
    }
}
