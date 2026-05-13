package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.i;
import tn.p;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.AlignmentLineOffsetTextUnit, reason: from toString */
/* JADX INFO: compiled from: AlignmentLine.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B6\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 ø\u0001\u0000¢\u0006\u0004\b$\u0010%J)\u0010\u000b\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\b\u0010\r\u001a\u00020\fH\u0016J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u001a\u001a\u00020\u00198\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\u001e\u001a\u00020\u00198\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001d\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineOffsetTextUnit;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "", "hashCode", "", "other", "", "equals", "", "toString", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "getAlignmentLine", "()Landroidx/compose/ui/layout/AlignmentLine;", "Landroidx/compose/ui/unit/TextUnit;", "before", "J", "getBefore-XSAIIZE", "()J", "after", "getAfter-XSAIIZE", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "Lbn/r;", "inspectorInfo", "<init>", "(Landroidx/compose/ui/layout/AlignmentLine;JJLsn/l;Ltn/i;)V", "foundation-layout_release"}, k = 1, mv = {1, 6, 0})
final class AlignmentLineOffset extends InspectorValueInfo implements LayoutModifier {
    private final long after;

    @NotNull
    private final AlignmentLine alignmentLine;
    private final long before;

    private AlignmentLineOffset(AlignmentLine alignmentLine, long j10, long j11, l<? super InspectorInfo, r> lVar) {
        super(lVar);
        this.alignmentLine = alignmentLine;
        this.before = j10;
        this.after = j11;
    }

    public /* synthetic */ AlignmentLineOffset(AlignmentLine alignmentLine, long j10, long j11, l lVar, i iVar) {
        this(alignmentLine, j10, j11, lVar);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        AlignmentLineOffset alignmentLineOffset = other instanceof AlignmentLineOffset ? (AlignmentLineOffset) other : null;
        if (alignmentLineOffset == null) {
            return false;
        }
        return p.f(this.alignmentLine, alignmentLineOffset.alignmentLine) && TextUnit.m4004equalsimpl0(this.before, alignmentLineOffset.before) && TextUnit.m4004equalsimpl0(this.after, alignmentLineOffset.after);
    }

    /* JADX INFO: renamed from: getAfter-XSAIIZE, reason: not valid java name and from getter */
    public final long getAfter() {
        return this.after;
    }

    @NotNull
    public final AlignmentLine getAlignmentLine() {
        return this.alignmentLine;
    }

    /* JADX INFO: renamed from: getBefore-XSAIIZE, reason: not valid java name and from getter */
    public final long getBefore() {
        return this.before;
    }

    public int hashCode() {
        return (((this.alignmentLine.hashCode() * 31) + TextUnit.m4008hashCodeimpl(this.before)) * 31) + TextUnit.m4008hashCodeimpl(this.after);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo21measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j10) {
        p.k(measureScope, "$this$measure");
        p.k(measurable, "measurable");
        return AlignmentLineKt.m333alignmentLineOffsetMeasuretjqqzMA(measureScope, this.alignmentLine, !TextUnitKt.m4025isUnspecifiedR2X_6o(this.before) ? measureScope.mo301toDpGaN1DYA(this.before) : Dp.INSTANCE.m3846getUnspecifiedD9Ej5fM(), !TextUnitKt.m4025isUnspecifiedR2X_6o(this.after) ? measureScope.mo301toDpGaN1DYA(this.after) : Dp.INSTANCE.m3846getUnspecifiedD9Ej5fM(), measurable, j10);
    }

    @NotNull
    public String toString() {
        return "AlignmentLineOffset(alignmentLine=" + this.alignmentLine + ", before=" + ((Object) TextUnit.m4014toStringimpl(this.before)) + ", after=" + ((Object) TextUnit.m4014toStringimpl(this.after)) + ')';
    }
}
