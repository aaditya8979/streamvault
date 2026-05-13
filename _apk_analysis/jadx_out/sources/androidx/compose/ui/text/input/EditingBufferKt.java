package androidx.compose.ui.text.input;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;

/* JADX INFO: compiled from: EditingBuffer.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, d2 = {"updateRangeAfterDelete", "Landroidx/compose/ui/text/TextRange;", TypedValues.AttributesType.S_TARGET, "deleted", "updateRangeAfterDelete-pWDy79M", "(JJ)J", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class EditingBufferKt {
    /* JADX INFO: renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m3596updateRangeAfterDeletepWDy79M(long j10, long j11) {
        int iM3470getLengthimpl;
        int iM3472getMinimpl = TextRange.m3472getMinimpl(j10);
        int iM3471getMaximpl = TextRange.m3471getMaximpl(j10);
        if (TextRange.m3476intersects5zctL8(j11, j10)) {
            if (TextRange.m3464contains5zctL8(j11, j10)) {
                iM3472getMinimpl = TextRange.m3472getMinimpl(j11);
                iM3471getMaximpl = iM3472getMinimpl;
            } else {
                if (TextRange.m3464contains5zctL8(j10, j11)) {
                    iM3470getLengthimpl = TextRange.m3470getLengthimpl(j11);
                } else if (TextRange.m3465containsimpl(j11, iM3472getMinimpl)) {
                    iM3472getMinimpl = TextRange.m3472getMinimpl(j11);
                    iM3470getLengthimpl = TextRange.m3470getLengthimpl(j11);
                } else {
                    iM3471getMaximpl = TextRange.m3472getMinimpl(j11);
                }
                iM3471getMaximpl -= iM3470getLengthimpl;
            }
        } else if (iM3471getMaximpl > TextRange.m3472getMinimpl(j11)) {
            iM3472getMinimpl -= TextRange.m3470getLengthimpl(j11);
            iM3470getLengthimpl = TextRange.m3470getLengthimpl(j11);
            iM3471getMaximpl -= iM3470getLengthimpl;
        }
        return TextRangeKt.TextRange(iM3472getMinimpl, iM3471getMaximpl);
    }
}
