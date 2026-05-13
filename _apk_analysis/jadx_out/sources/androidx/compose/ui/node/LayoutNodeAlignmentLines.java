package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;
import vn.c;

/* JADX INFO: compiled from: LayoutNodeAlignmentLines.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010%\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b.\u0010/J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006J\u0006\u0010\n\u001a\u00020\u0002J\u000f\u0010\f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\"\u0010\u001a\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\"\u0010\u001d\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R\"\u0010 \u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010\u0012\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\"\u0010#\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0012\u001a\u0004\b$\u0010\u0014\"\u0004\b%\u0010\u0016R\u0018\u0010&\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u000fR \u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0014R\u0014\u0010-\u001a\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0014¨\u00060"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeAlignmentLines;", "", "Lbn/r;", "recalculateQueryOwner$ui_release", "()V", "recalculateQueryOwner", "", "Landroidx/compose/ui/layout/AlignmentLine;", "", "getLastCalculation", "recalculate", "reset$ui_release", "reset", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "", "dirty", "Z", "getDirty$ui_release", "()Z", "setDirty$ui_release", "(Z)V", "usedDuringParentMeasurement", "getUsedDuringParentMeasurement$ui_release", "setUsedDuringParentMeasurement$ui_release", "usedDuringParentLayout", "getUsedDuringParentLayout$ui_release", "setUsedDuringParentLayout$ui_release", "previousUsedDuringParentLayout", "getPreviousUsedDuringParentLayout$ui_release", "setPreviousUsedDuringParentLayout$ui_release", "usedByModifierMeasurement", "getUsedByModifierMeasurement$ui_release", "setUsedByModifierMeasurement$ui_release", "usedByModifierLayout", "getUsedByModifierLayout$ui_release", "setUsedByModifierLayout$ui_release", "queryOwner", "", "alignmentLines", "Ljava/util/Map;", "getQueried$ui_release", "queried", "getRequired$ui_release", VastAttributes.REQUIRED, "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "ui_release"}, k = 1, mv = {1, 6, 0})
public final class LayoutNodeAlignmentLines {

    @NotNull
    private final Map<AlignmentLine, Integer> alignmentLines;
    private boolean dirty;

    @NotNull
    private final LayoutNode layoutNode;
    private boolean previousUsedDuringParentLayout;

    @Nullable
    private LayoutNode queryOwner;
    private boolean usedByModifierLayout;
    private boolean usedByModifierMeasurement;
    private boolean usedDuringParentLayout;
    private boolean usedDuringParentMeasurement;

    public LayoutNodeAlignmentLines(@NotNull LayoutNode layoutNode) {
        p.k(layoutNode, "layoutNode");
        this.layoutNode = layoutNode;
        this.dirty = true;
        this.alignmentLines = new HashMap();
    }

    private static final void recalculate$addAlignmentLine(LayoutNodeAlignmentLines layoutNodeAlignmentLines, AlignmentLine alignmentLine, int i10, LayoutNodeWrapper layoutNodeWrapper) {
        float f10 = i10;
        long jOffset = OffsetKt.Offset(f10, f10);
        while (true) {
            jOffset = layoutNodeWrapper.m3268toParentPositionMKHz9U(jOffset);
            layoutNodeWrapper = layoutNodeWrapper.getWrappedBy();
            p.h(layoutNodeWrapper);
            if (p.f(layoutNodeWrapper, layoutNodeAlignmentLines.layoutNode.getInnerLayoutNodeWrapper())) {
                break;
            } else if (layoutNodeWrapper.getMeasureResult().getAlignmentLines().containsKey(alignmentLine)) {
                float f11 = layoutNodeWrapper.get(alignmentLine);
                jOffset = OffsetKt.Offset(f11, f11);
            }
        }
        int iD = alignmentLine instanceof HorizontalAlignmentLine ? c.d(Offset.m1384getYimpl(jOffset)) : c.d(Offset.m1383getXimpl(jOffset));
        Map<AlignmentLine, Integer> map = layoutNodeAlignmentLines.alignmentLines;
        if (map.containsKey(alignmentLine)) {
            iD = AlignmentLineKt.merge(alignmentLine, ((Number) kotlin.collections.a.k(layoutNodeAlignmentLines.alignmentLines, alignmentLine)).intValue(), iD);
        }
        map.put(alignmentLine, Integer.valueOf(iD));
    }

    /* JADX INFO: renamed from: getDirty$ui_release, reason: from getter */
    public final boolean getDirty() {
        return this.dirty;
    }

    @NotNull
    public final Map<AlignmentLine, Integer> getLastCalculation() {
        return this.alignmentLines;
    }

    /* JADX INFO: renamed from: getPreviousUsedDuringParentLayout$ui_release, reason: from getter */
    public final boolean getPreviousUsedDuringParentLayout() {
        return this.previousUsedDuringParentLayout;
    }

    public final boolean getQueried$ui_release() {
        return this.usedDuringParentMeasurement || this.previousUsedDuringParentLayout || this.usedByModifierMeasurement || this.usedByModifierLayout;
    }

    public final boolean getRequired$ui_release() {
        recalculateQueryOwner$ui_release();
        return this.queryOwner != null;
    }

    /* JADX INFO: renamed from: getUsedByModifierLayout$ui_release, reason: from getter */
    public final boolean getUsedByModifierLayout() {
        return this.usedByModifierLayout;
    }

    /* JADX INFO: renamed from: getUsedByModifierMeasurement$ui_release, reason: from getter */
    public final boolean getUsedByModifierMeasurement() {
        return this.usedByModifierMeasurement;
    }

    /* JADX INFO: renamed from: getUsedDuringParentLayout$ui_release, reason: from getter */
    public final boolean getUsedDuringParentLayout() {
        return this.usedDuringParentLayout;
    }

    /* JADX INFO: renamed from: getUsedDuringParentMeasurement$ui_release, reason: from getter */
    public final boolean getUsedDuringParentMeasurement() {
        return this.usedDuringParentMeasurement;
    }

    public final void recalculate() {
        this.alignmentLines.clear();
        MutableVector<LayoutNode> mutableVector = this.layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i10 = 0;
            do {
                LayoutNode layoutNode = content[i10];
                if (layoutNode.getIsPlaced()) {
                    if (layoutNode.getAlignmentLines().dirty) {
                        layoutNode.layoutChildren$ui_release();
                    }
                    for (Map.Entry<AlignmentLine, Integer> entry : layoutNode.getAlignmentLines().alignmentLines.entrySet()) {
                        recalculate$addAlignmentLine(this, entry.getKey(), entry.getValue().intValue(), layoutNode.getInnerLayoutNodeWrapper());
                    }
                    LayoutNodeWrapper wrappedBy = layoutNode.getInnerLayoutNodeWrapper().getWrappedBy();
                    p.h(wrappedBy);
                    while (!p.f(wrappedBy, this.layoutNode.getInnerLayoutNodeWrapper())) {
                        for (AlignmentLine alignmentLine : wrappedBy.getMeasureResult().getAlignmentLines().keySet()) {
                            recalculate$addAlignmentLine(this, alignmentLine, wrappedBy.get(alignmentLine), wrappedBy);
                        }
                        wrappedBy = wrappedBy.getWrappedBy();
                        p.h(wrappedBy);
                    }
                }
                i10++;
            } while (i10 < size);
        }
        this.alignmentLines.putAll(this.layoutNode.getInnerLayoutNodeWrapper().getMeasureResult().getAlignmentLines());
        this.dirty = false;
    }

    public final void recalculateQueryOwner$ui_release() {
        LayoutNode layoutNode;
        LayoutNodeAlignmentLines alignmentLines;
        LayoutNodeAlignmentLines alignmentLines2;
        if (getQueried$ui_release()) {
            layoutNode = this.layoutNode;
        } else {
            LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
            if (parent$ui_release == null) {
                return;
            }
            layoutNode = parent$ui_release.getAlignmentLines().queryOwner;
            if (layoutNode == null || !layoutNode.getAlignmentLines().getQueried$ui_release()) {
                LayoutNode layoutNode2 = this.queryOwner;
                if (layoutNode2 == null || layoutNode2.getAlignmentLines().getQueried$ui_release()) {
                    return;
                }
                LayoutNode parent$ui_release2 = layoutNode2.getParent$ui_release();
                if (parent$ui_release2 != null && (alignmentLines2 = parent$ui_release2.getAlignmentLines()) != null) {
                    alignmentLines2.recalculateQueryOwner$ui_release();
                }
                LayoutNode parent$ui_release3 = layoutNode2.getParent$ui_release();
                layoutNode = (parent$ui_release3 == null || (alignmentLines = parent$ui_release3.getAlignmentLines()) == null) ? null : alignmentLines.queryOwner;
            }
        }
        this.queryOwner = layoutNode;
    }

    public final void reset$ui_release() {
        this.dirty = true;
        this.usedDuringParentMeasurement = false;
        this.previousUsedDuringParentLayout = false;
        this.usedDuringParentLayout = false;
        this.usedByModifierMeasurement = false;
        this.usedByModifierLayout = false;
        this.queryOwner = null;
    }

    public final void setDirty$ui_release(boolean z10) {
        this.dirty = z10;
    }

    public final void setPreviousUsedDuringParentLayout$ui_release(boolean z10) {
        this.previousUsedDuringParentLayout = z10;
    }

    public final void setUsedByModifierLayout$ui_release(boolean z10) {
        this.usedByModifierLayout = z10;
    }

    public final void setUsedByModifierMeasurement$ui_release(boolean z10) {
        this.usedByModifierMeasurement = z10;
    }

    public final void setUsedDuringParentLayout$ui_release(boolean z10) {
        this.usedDuringParentLayout = z10;
    }

    public final void setUsedDuringParentMeasurement$ui_release(boolean z10) {
        this.usedDuringParentMeasurement = z10;
    }
}
