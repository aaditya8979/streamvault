package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Density;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: Box.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010\u0006\u001a\u00020\u0000*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006!"}, d2 = {"Landroidx/compose/foundation/layout/BoxChildData;", "Landroidx/compose/ui/layout/ParentDataModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/unit/Density;", "", "parentData", "modifyParentData", "other", "", "equals", "", "hashCode", "", "toString", "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/Alignment;", "getAlignment", "()Landroidx/compose/ui/Alignment;", "setAlignment", "(Landroidx/compose/ui/Alignment;)V", "matchParentSize", "Z", "getMatchParentSize", "()Z", "setMatchParentSize", "(Z)V", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "Lbn/r;", "inspectorInfo", "<init>", "(Landroidx/compose/ui/Alignment;ZLsn/l;)V", "foundation-layout_release"}, k = 1, mv = {1, 6, 0})
final class BoxChildData extends InspectorValueInfo implements ParentDataModifier {

    @NotNull
    private Alignment alignment;
    private boolean matchParentSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoxChildData(@NotNull Alignment alignment, boolean z10, @NotNull l<? super InspectorInfo, r> lVar) {
        super(lVar);
        p.k(alignment, "alignment");
        p.k(lVar, "inspectorInfo");
        this.alignment = alignment;
        this.matchParentSize = z10;
    }

    public /* synthetic */ BoxChildData(Alignment alignment, boolean z10, l lVar, int i10, i iVar) {
        this(alignment, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? InspectableValueKt.getNoInspectorInfo() : lVar);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        BoxChildData boxChildData = other instanceof BoxChildData ? (BoxChildData) other : null;
        if (boxChildData == null) {
            return false;
        }
        return p.f(this.alignment, boxChildData.alignment) && this.matchParentSize == boxChildData.matchParentSize;
    }

    @NotNull
    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final boolean getMatchParentSize() {
        return this.matchParentSize;
    }

    public int hashCode() {
        return (this.alignment.hashCode() * 31) + Boolean.hashCode(this.matchParentSize);
    }

    @Override // androidx.compose.ui.layout.ParentDataModifier
    @NotNull
    public BoxChildData modifyParentData(@NotNull Density density, @Nullable Object obj) {
        p.k(density, "<this>");
        return this;
    }

    public final void setAlignment(@NotNull Alignment alignment) {
        p.k(alignment, "<set-?>");
        this.alignment = alignment;
    }

    public final void setMatchParentSize(boolean z10) {
        this.matchParentSize = z10;
    }

    @NotNull
    public String toString() {
        return "BoxChildData(alignment=" + this.alignment + ", matchParentSize=" + this.matchParentSize + ')';
    }
}
