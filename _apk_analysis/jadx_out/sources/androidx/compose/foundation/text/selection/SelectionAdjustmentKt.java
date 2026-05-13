package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.TextRangeKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;

/* JADX INFO: compiled from: SelectionAdjustment.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"ensureAtLeastOneChar", "Landroidx/compose/ui/text/TextRange;", TypedValues.CycleType.S_WAVE_OFFSET, "", "lastOffset", "isStartHandle", "", "previousHandlesCrossed", "(IIZZ)J", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class SelectionAdjustmentKt {
    public static final long ensureAtLeastOneChar(int i10, int i11, boolean z10, boolean z11) {
        return i11 == 0 ? TextRangeKt.TextRange(i10, i10) : i10 == 0 ? z10 ? TextRangeKt.TextRange(1, 0) : TextRangeKt.TextRange(0, 1) : i10 == i11 ? z10 ? TextRangeKt.TextRange(i11 - 1, i11) : TextRangeKt.TextRange(i11, i11 - 1) : z10 ? !z11 ? TextRangeKt.TextRange(i10 - 1, i10) : TextRangeKt.TextRange(i10 + 1, i10) : !z11 ? TextRangeKt.TextRange(i10, i10 + 1) : TextRangeKt.TextRange(i10, i10 - 1);
    }
}
