package androidx.compose.ui.node;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import bn.r;
import com.ironsource.C3978d4;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: ModifiedLayoutNode.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 A2\u00020\u0001:\u0001AB\u0017\u0012\u0006\u0010%\u001a\u00020\u0001\u0012\u0006\u0010+\u001a\u00020\u0002¢\u0006\u0004\b?\u0010@J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u001d\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0016J;\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0017H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u001d\u001a\u00020\u0004H\u0016J\u0010\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H\u0016R*\u0010%\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00018\u0010@VX\u0090\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010+\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00102\u001a\u0002018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001e\u00109\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010>\u001a\u00020;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006B"}, d2 = {"Landroidx/compose/ui/node/ModifiedLayoutNode;", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "Landroidx/compose/ui/layout/LayoutModifier;", "modifierFromState", "Lbn/r;", "onInitialize", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/Placeable;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measure", "", "height", "minIntrinsicWidth", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "Landroidx/compose/ui/unit/IntOffset;", C3978d4.i.L, "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "layerBlock", "placeAt-f8xVGno", "(JFLsn/l;)V", "placeAt", "onModifierChanged", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "calculateAlignmentLine", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "performDraw", "<set-?>", "wrapped", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "getWrapped$ui_release", "()Landroidx/compose/ui/node/LayoutNodeWrapper;", "setWrapped", "(Landroidx/compose/ui/node/LayoutNodeWrapper;)V", "modifier", "Landroidx/compose/ui/layout/LayoutModifier;", "getModifier", "()Landroidx/compose/ui/layout/LayoutModifier;", "setModifier", "(Landroidx/compose/ui/layout/LayoutModifier;)V", "", "toBeReusedForSameModifier", "Z", "getToBeReusedForSameModifier", "()Z", "setToBeReusedForSameModifier", "(Z)V", "Landroidx/compose/runtime/MutableState;", "modifierState", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/layout/MeasureScope;", "getMeasureScope", "()Landroidx/compose/ui/layout/MeasureScope;", "measureScope", "<init>", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/layout/LayoutModifier;)V", VastTagName.COMPANION, "ui_release"}, k = 1, mv = {1, 6, 0})
public final class ModifiedLayoutNode extends LayoutNodeWrapper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Paint modifierBoundsPaint;

    @NotNull
    private LayoutModifier modifier;

    @Nullable
    private MutableState<LayoutModifier> modifierState;
    private boolean toBeReusedForSameModifier;

    @NotNull
    private LayoutNodeWrapper wrapped;

    /* JADX INFO: compiled from: ModifiedLayoutNode.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/ModifiedLayoutNode$Companion;", "", "()V", "modifierBoundsPaint", "Landroidx/compose/ui/graphics/Paint;", "getModifierBoundsPaint", "()Landroidx/compose/ui/graphics/Paint;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final Paint getModifierBoundsPaint() {
            return ModifiedLayoutNode.modifierBoundsPaint;
        }
    }

    static {
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo1503setColor8_81llA(Color.INSTANCE.m1646getBlue0d7_KjU());
        Paint.setStrokeWidth(1.0f);
        Paint.mo1507setStylek9PVt8s(PaintingStyle.INSTANCE.m1850getStrokeTiuSbCo());
        modifierBoundsPaint = Paint;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModifiedLayoutNode(@NotNull LayoutNodeWrapper layoutNodeWrapper, @NotNull LayoutModifier layoutModifier) {
        super(layoutNodeWrapper.getLayoutNode());
        p.k(layoutNodeWrapper, "wrapped");
        p.k(layoutModifier, "modifier");
        this.wrapped = layoutNodeWrapper;
        this.modifier = layoutModifier;
    }

    private final LayoutModifier modifierFromState() {
        MutableState<LayoutModifier> mutableStateMutableStateOf$default = this.modifierState;
        if (mutableStateMutableStateOf$default == null) {
            mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(this.modifier, null, 2, null);
        }
        this.modifierState = mutableStateMutableStateOf$default;
        return mutableStateMutableStateOf$default.getValue();
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public int calculateAlignmentLine(@NotNull AlignmentLine alignmentLine) {
        p.k(alignmentLine, "alignmentLine");
        if (getMeasureResult().getAlignmentLines().containsKey(alignmentLine)) {
            Integer num = getMeasureResult().getAlignmentLines().get(alignmentLine);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int i10 = getWrapped().get(alignmentLine);
        if (i10 == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        setShallowPlacing(true);
        mo3113placeAtf8xVGno(getPosition(), getZIndex(), getLayerBlock());
        setShallowPlacing(false);
        return i10 + (alignmentLine instanceof HorizontalAlignmentLine ? IntOffset.m3945getYimpl(getWrapped().getPosition()) : IntOffset.m3944getXimpl(getWrapped().getPosition()));
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @NotNull
    public MeasureScope getMeasureScope() {
        return getWrapped().getMeasureScope();
    }

    @NotNull
    public final LayoutModifier getModifier() {
        return this.modifier;
    }

    public final boolean getToBeReusedForSameModifier() {
        return this.toBeReusedForSameModifier;
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @NotNull
    /* JADX INFO: renamed from: getWrapped$ui_release, reason: from getter */
    public LayoutNodeWrapper getWrapped() {
        return this.wrapped;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int width) {
        return modifierFromState().maxIntrinsicHeight(getMeasureScope(), getWrapped(), width);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int height) {
        return modifierFromState().maxIntrinsicWidth(getMeasureScope(), getWrapped(), height);
    }

    @Override // androidx.compose.ui.layout.Measurable
    @NotNull
    /* JADX INFO: renamed from: measure-BRTryo0 */
    public Placeable mo3112measureBRTryo0(long constraints) {
        m3153setMeasurementConstraintsBRTryo0(constraints);
        setMeasureResult$ui_release(this.modifier.mo21measure3p2s80s(getMeasureScope(), getWrapped(), constraints));
        OwnedLayer layer = getLayer();
        if (layer != null) {
            layer.mo3282resizeozmzZPI(getMeasuredSize());
        }
        onMeasured();
        return this;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int width) {
        return modifierFromState().minIntrinsicHeight(getMeasureScope(), getWrapped(), width);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int height) {
        return modifierFromState().minIntrinsicWidth(getMeasureScope(), getWrapped(), height);
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public void onInitialize() {
        super.onInitialize();
        getWrapped().setWrappedBy$ui_release(this);
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public void onModifierChanged() {
        super.onModifierChanged();
        MutableState<LayoutModifier> mutableState = this.modifierState;
        if (mutableState == null) {
            return;
        }
        mutableState.setValue(this.modifier);
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public void performDraw(@NotNull Canvas canvas) {
        p.k(canvas, "canvas");
        getWrapped().draw(canvas);
        if (LayoutNodeKt.requireOwner(getLayoutNode()).getShowLayoutBounds()) {
            drawBorder(canvas, modifierBoundsPaint);
        }
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper, androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public void mo3113placeAtf8xVGno(long position, float zIndex, @Nullable l<? super GraphicsLayerScope, r> layerBlock) {
        super.mo3113placeAtf8xVGno(position, zIndex, layerBlock);
        LayoutNodeWrapper wrappedBy = getWrappedBy();
        if (wrappedBy != null && wrappedBy.getIsShallowPlacing()) {
            return;
        }
        onPlaced();
        Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.INSTANCE;
        int iM3986getWidthimpl = IntSize.m3986getWidthimpl(getMeasuredSize());
        LayoutDirection layoutDirection = getMeasureScope().getLayoutDirection();
        int parentWidth = companion.getParentWidth();
        LayoutDirection parentLayoutDirection = companion.getParentLayoutDirection();
        Placeable.PlacementScope.parentWidth = iM3986getWidthimpl;
        Placeable.PlacementScope.parentLayoutDirection = layoutDirection;
        getMeasureResult().placeChildren();
        Placeable.PlacementScope.parentWidth = parentWidth;
        Placeable.PlacementScope.parentLayoutDirection = parentLayoutDirection;
    }

    public final void setModifier(@NotNull LayoutModifier layoutModifier) {
        p.k(layoutModifier, "<set-?>");
        this.modifier = layoutModifier;
    }

    public final void setToBeReusedForSameModifier(boolean z10) {
        this.toBeReusedForSameModifier = z10;
    }

    public void setWrapped(@NotNull LayoutNodeWrapper layoutNodeWrapper) {
        p.k(layoutNodeWrapper, "<set-?>");
        this.wrapped = layoutNodeWrapper;
    }
}
