package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Density;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/layout/VerticalAlignModifier;", "Landroidx/compose/ui/layout/ParentDataModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/unit/Density;", "", "parentData", "Landroidx/compose/foundation/layout/RowColumnParentData;", "modifyParentData", "other", "", "equals", "", "hashCode", "", "toString", "Landroidx/compose/ui/Alignment$Vertical;", "vertical", "Landroidx/compose/ui/Alignment$Vertical;", "getVertical", "()Landroidx/compose/ui/Alignment$Vertical;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "Lbn/r;", "inspectorInfo", "<init>", "(Landroidx/compose/ui/Alignment$Vertical;Lsn/l;)V", "foundation-layout_release"}, k = 1, mv = {1, 6, 0})
public final class VerticalAlignModifier extends InspectorValueInfo implements ParentDataModifier {

    @NotNull
    private final Alignment.Vertical vertical;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalAlignModifier(@NotNull Alignment.Vertical vertical, @NotNull l<? super InspectorInfo, r> lVar) {
        super(lVar);
        p.k(vertical, "vertical");
        p.k(lVar, "inspectorInfo");
        this.vertical = vertical;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        VerticalAlignModifier verticalAlignModifier = other instanceof VerticalAlignModifier ? (VerticalAlignModifier) other : null;
        if (verticalAlignModifier == null) {
            return false;
        }
        return p.f(this.vertical, verticalAlignModifier.vertical);
    }

    @NotNull
    public final Alignment.Vertical getVertical() {
        return this.vertical;
    }

    public int hashCode() {
        return this.vertical.hashCode();
    }

    @Override // androidx.compose.ui.layout.ParentDataModifier
    @NotNull
    public RowColumnParentData modifyParentData(@NotNull Density density, @Nullable Object obj) {
        p.k(density, "<this>");
        RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
        if (rowColumnParentData == null) {
            rowColumnParentData = new RowColumnParentData(0.0f, false, null, 7, null);
        }
        rowColumnParentData.setCrossAxisAlignment(CrossAxisAlignment.INSTANCE.vertical$foundation_layout_release(this.vertical));
        return rowColumnParentData;
    }

    @NotNull
    public String toString() {
        return "VerticalAlignModifier(vertical=" + this.vertical + ')';
    }
}
