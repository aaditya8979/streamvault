package androidx.compose.ui.window;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: Popup.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J5\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/window/AlignmentOffsetPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "Landroidx/compose/ui/unit/IntRect;", "anchorBounds", "Landroidx/compose/ui/unit/IntSize;", "windowSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "popupContentSize", "Landroidx/compose/ui/unit/IntOffset;", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "calculatePosition", "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/Alignment;", "getAlignment", "()Landroidx/compose/ui/Alignment;", TypedValues.CycleType.S_WAVE_OFFSET, "J", "getOffset-nOcc-ac", "()J", "<init>", "(Landroidx/compose/ui/Alignment;JLtn/i;)V", "ui_release"}, k = 1, mv = {1, 6, 0})
public final class AlignmentOffsetPositionProvider implements PopupPositionProvider {

    @NotNull
    private final Alignment alignment;
    private final long offset;

    private AlignmentOffsetPositionProvider(Alignment alignment, long j10) {
        this.alignment = alignment;
        this.offset = j10;
    }

    public /* synthetic */ AlignmentOffsetPositionProvider(Alignment alignment, long j10, i iVar) {
        this(alignment, j10);
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* JADX INFO: renamed from: calculatePosition-llwVHH4 */
    public long mo773calculatePositionllwVHH4(@NotNull IntRect anchorBounds, long windowSize, @NotNull LayoutDirection layoutDirection, long popupContentSize) {
        p.k(anchorBounds, "anchorBounds");
        p.k(layoutDirection, "layoutDirection");
        long jIntOffset = IntOffsetKt.IntOffset(0, 0);
        Alignment alignment = this.alignment;
        IntSize.Companion companion = IntSize.INSTANCE;
        long jMo1291alignKFBX0sM = alignment.mo1291alignKFBX0sM(companion.m3991getZeroYbymL2g(), IntSizeKt.IntSize(anchorBounds.getWidth(), anchorBounds.getHeight()), layoutDirection);
        long jMo1291alignKFBX0sM2 = this.alignment.mo1291alignKFBX0sM(companion.m3991getZeroYbymL2g(), IntSizeKt.IntSize(IntSize.m3986getWidthimpl(popupContentSize), IntSize.m3985getHeightimpl(popupContentSize)), layoutDirection);
        long jIntOffset2 = IntOffsetKt.IntOffset(anchorBounds.getLeft(), anchorBounds.getTop());
        long jIntOffset3 = IntOffsetKt.IntOffset(IntOffset.m3944getXimpl(jIntOffset) + IntOffset.m3944getXimpl(jIntOffset2), IntOffset.m3945getYimpl(jIntOffset) + IntOffset.m3945getYimpl(jIntOffset2));
        long jIntOffset4 = IntOffsetKt.IntOffset(IntOffset.m3944getXimpl(jIntOffset3) + IntOffset.m3944getXimpl(jMo1291alignKFBX0sM), IntOffset.m3945getYimpl(jIntOffset3) + IntOffset.m3945getYimpl(jMo1291alignKFBX0sM));
        long jIntOffset5 = IntOffsetKt.IntOffset(IntOffset.m3944getXimpl(jMo1291alignKFBX0sM2), IntOffset.m3945getYimpl(jMo1291alignKFBX0sM2));
        long jIntOffset6 = IntOffsetKt.IntOffset(IntOffset.m3944getXimpl(jIntOffset4) - IntOffset.m3944getXimpl(jIntOffset5), IntOffset.m3945getYimpl(jIntOffset4) - IntOffset.m3945getYimpl(jIntOffset5));
        long jIntOffset7 = IntOffsetKt.IntOffset(IntOffset.m3944getXimpl(this.offset) * (layoutDirection == LayoutDirection.Ltr ? 1 : -1), IntOffset.m3945getYimpl(this.offset));
        return IntOffsetKt.IntOffset(IntOffset.m3944getXimpl(jIntOffset6) + IntOffset.m3944getXimpl(jIntOffset7), IntOffset.m3945getYimpl(jIntOffset6) + IntOffset.m3945getYimpl(jIntOffset7));
    }

    @NotNull
    public final Alignment getAlignment() {
        return this.alignment;
    }

    /* JADX INFO: renamed from: getOffset-nOcc-ac, reason: not valid java name and from getter */
    public final long getOffset() {
        return this.offset;
    }
}
