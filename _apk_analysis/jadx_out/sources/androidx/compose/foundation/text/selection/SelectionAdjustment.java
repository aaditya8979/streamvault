package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import bo.d0;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;
import zn.n;

/* JADX INFO: compiled from: SelectionAdjustment.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b`\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ?\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rø\u0001\u0002\u0082\u0002\u0011\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "", "adjust", "Landroidx/compose/ui/text/TextRange;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "newRawSelectionRange", "previousHandleOffset", "", "isStartHandle", "", "previousSelectionRange", "adjust-ZXO7KMw", "(Landroidx/compose/ui/text/TextLayoutResult;JIZLandroidx/compose/ui/text/TextRange;)J", VastTagName.COMPANION, "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface SelectionAdjustment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: SelectionAdjustment.kt */
    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ9\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0013\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;", "", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Landroidx/compose/ui/text/TextRange;", "newRawSelection", "Lkotlin/Function1;", "", "boundaryFun", "adjustByBoundary--Dv-ylE", "(Landroidx/compose/ui/text/TextLayoutResult;JLsn/l;)J", "adjustByBoundary", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "None", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "getNone", "()Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "Character", "getCharacter", "Word", "getWord", "Paragraph", "getParagraph", "CharacterWithWordAccelerate", "getCharacterWithWordAccelerate", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final SelectionAdjustment None = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$None$1
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            /* JADX INFO: renamed from: adjust-ZXO7KMw */
            public long mo784adjustZXO7KMw(@NotNull TextLayoutResult textLayoutResult, long newRawSelectionRange, int previousHandleOffset, boolean isStartHandle, @Nullable TextRange previousSelectionRange) {
                p.k(textLayoutResult, "textLayoutResult");
                return newRawSelectionRange;
            }
        };

        @NotNull
        private static final SelectionAdjustment Character = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$Character$1
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            /* JADX INFO: renamed from: adjust-ZXO7KMw */
            public long mo784adjustZXO7KMw(@NotNull TextLayoutResult textLayoutResult, long newRawSelectionRange, int previousHandleOffset, boolean isStartHandle, @Nullable TextRange previousSelectionRange) {
                p.k(textLayoutResult, "textLayoutResult");
                if (TextRange.m3468getCollapsedimpl(newRawSelectionRange)) {
                    return SelectionAdjustmentKt.ensureAtLeastOneChar(TextRange.m3474getStartimpl(newRawSelectionRange), d0.l0(textLayoutResult.getLayoutInput().getText()), isStartHandle, previousSelectionRange != null ? TextRange.m3473getReversedimpl(previousSelectionRange.getPackedValue()) : false);
                }
                return newRawSelectionRange;
            }
        };

        @NotNull
        private static final SelectionAdjustment Word = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$Word$1
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            /* JADX INFO: renamed from: adjust-ZXO7KMw */
            public long mo784adjustZXO7KMw(@NotNull TextLayoutResult textLayoutResult, long newRawSelectionRange, int previousHandleOffset, boolean isStartHandle, @Nullable TextRange previousSelectionRange) {
                p.k(textLayoutResult, "textLayoutResult");
                return SelectionAdjustment.Companion.$$INSTANCE.m786adjustByBoundaryDvylE(textLayoutResult, newRawSelectionRange, new SelectionAdjustment$Companion$Word$1$adjust$1(textLayoutResult));
            }
        };

        @NotNull
        private static final SelectionAdjustment Paragraph = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$Paragraph$1
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            /* JADX INFO: renamed from: adjust-ZXO7KMw */
            public long mo784adjustZXO7KMw(@NotNull TextLayoutResult textLayoutResult, long newRawSelectionRange, int previousHandleOffset, boolean isStartHandle, @Nullable TextRange previousSelectionRange) {
                p.k(textLayoutResult, "textLayoutResult");
                return SelectionAdjustment.Companion.$$INSTANCE.m786adjustByBoundaryDvylE(textLayoutResult, newRawSelectionRange, new SelectionAdjustment$Companion$Paragraph$1$adjust$boundaryFun$1(textLayoutResult.getLayoutInput().getText()));
            }
        };

        @NotNull
        private static final SelectionAdjustment CharacterWithWordAccelerate = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$CharacterWithWordAccelerate$1
            private final boolean isAtWordBoundary(TextLayoutResult textLayoutResult, int i10) {
                long jM3461getWordBoundaryjx7JFs = textLayoutResult.m3461getWordBoundaryjx7JFs(i10);
                return i10 == TextRange.m3474getStartimpl(jM3461getWordBoundaryjx7JFs) || i10 == TextRange.m3469getEndimpl(jM3461getWordBoundaryjx7JFs);
            }

            private final boolean isExpanding(int newRawOffset, int previousRawOffset, boolean isStart, boolean previousReversed) {
                if (previousRawOffset == -1) {
                    return true;
                }
                if (newRawOffset == previousRawOffset) {
                    return false;
                }
                if (isStart ^ previousReversed) {
                    if (newRawOffset < previousRawOffset) {
                        return true;
                    }
                } else if (newRawOffset > previousRawOffset) {
                    return true;
                }
                return false;
            }

            private final int snapToWordBoundary(TextLayoutResult textLayoutResult, int newRawOffset, int currentLine, int otherBoundaryOffset, boolean isStart, boolean isReversed) {
                long jM3461getWordBoundaryjx7JFs = textLayoutResult.m3461getWordBoundaryjx7JFs(newRawOffset);
                int iM3474getStartimpl = textLayoutResult.getLineForOffset(TextRange.m3474getStartimpl(jM3461getWordBoundaryjx7JFs)) == currentLine ? TextRange.m3474getStartimpl(jM3461getWordBoundaryjx7JFs) : textLayoutResult.getLineStart(currentLine);
                int iM3469getEndimpl = textLayoutResult.getLineForOffset(TextRange.m3469getEndimpl(jM3461getWordBoundaryjx7JFs)) == currentLine ? TextRange.m3469getEndimpl(jM3461getWordBoundaryjx7JFs) : TextLayoutResult.getLineEnd$default(textLayoutResult, currentLine, false, 2, null);
                if (iM3474getStartimpl == otherBoundaryOffset) {
                    return iM3469getEndimpl;
                }
                if (iM3469getEndimpl == otherBoundaryOffset) {
                    return iM3474getStartimpl;
                }
                int i10 = (iM3474getStartimpl + iM3469getEndimpl) / 2;
                if (isStart ^ isReversed) {
                    if (newRawOffset <= i10) {
                        return iM3474getStartimpl;
                    }
                } else if (newRawOffset < i10) {
                    return iM3474getStartimpl;
                }
                return iM3469getEndimpl;
            }

            private final int updateSelectionBoundary(TextLayoutResult textLayoutResult, int newRawOffset, int previousRawOffset, int previousAdjustedOffset, int otherBoundaryOffset, boolean isStart, boolean isReversed) {
                if (newRawOffset == previousRawOffset) {
                    return previousAdjustedOffset;
                }
                int lineForOffset = textLayoutResult.getLineForOffset(newRawOffset);
                return lineForOffset != textLayoutResult.getLineForOffset(previousAdjustedOffset) ? snapToWordBoundary(textLayoutResult, newRawOffset, lineForOffset, otherBoundaryOffset, isStart, isReversed) : (isExpanding(newRawOffset, previousRawOffset, isStart, isReversed) && isAtWordBoundary(textLayoutResult, previousAdjustedOffset)) ? snapToWordBoundary(textLayoutResult, newRawOffset, lineForOffset, otherBoundaryOffset, isStart, isReversed) : newRawOffset;
            }

            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            /* JADX INFO: renamed from: adjust-ZXO7KMw */
            public long mo784adjustZXO7KMw(@NotNull TextLayoutResult textLayoutResult, long newRawSelectionRange, int previousHandleOffset, boolean isStartHandle, @Nullable TextRange previousSelectionRange) {
                int iUpdateSelectionBoundary;
                int iUpdateSelectionBoundary2;
                p.k(textLayoutResult, "textLayoutResult");
                if (previousSelectionRange == null) {
                    return SelectionAdjustment.Companion.$$INSTANCE.getWord().mo784adjustZXO7KMw(textLayoutResult, newRawSelectionRange, previousHandleOffset, isStartHandle, previousSelectionRange);
                }
                if (TextRange.m3468getCollapsedimpl(newRawSelectionRange)) {
                    return SelectionAdjustmentKt.ensureAtLeastOneChar(TextRange.m3474getStartimpl(newRawSelectionRange), d0.l0(textLayoutResult.getLayoutInput().getText()), isStartHandle, TextRange.m3473getReversedimpl(previousSelectionRange.getPackedValue()));
                }
                if (isStartHandle) {
                    iUpdateSelectionBoundary2 = updateSelectionBoundary(textLayoutResult, TextRange.m3474getStartimpl(newRawSelectionRange), previousHandleOffset, TextRange.m3474getStartimpl(previousSelectionRange.getPackedValue()), TextRange.m3469getEndimpl(newRawSelectionRange), true, TextRange.m3473getReversedimpl(newRawSelectionRange));
                    iUpdateSelectionBoundary = TextRange.m3469getEndimpl(newRawSelectionRange);
                } else {
                    int iM3474getStartimpl = TextRange.m3474getStartimpl(newRawSelectionRange);
                    iUpdateSelectionBoundary = updateSelectionBoundary(textLayoutResult, TextRange.m3469getEndimpl(newRawSelectionRange), previousHandleOffset, TextRange.m3469getEndimpl(previousSelectionRange.getPackedValue()), TextRange.m3474getStartimpl(newRawSelectionRange), false, TextRange.m3473getReversedimpl(newRawSelectionRange));
                    iUpdateSelectionBoundary2 = iM3474getStartimpl;
                }
                return TextRangeKt.TextRange(iUpdateSelectionBoundary2, iUpdateSelectionBoundary);
            }
        };

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: adjustByBoundary--Dv-ylE, reason: not valid java name */
        public final long m786adjustByBoundaryDvylE(TextLayoutResult textLayoutResult, long newRawSelection, l<? super Integer, TextRange> boundaryFun) {
            if (textLayoutResult.getLayoutInput().getText().length() == 0) {
                return TextRange.INSTANCE.m3479getZerod9O1mEE();
            }
            int iL0 = d0.l0(textLayoutResult.getLayoutInput().getText());
            long packedValue = boundaryFun.invoke(Integer.valueOf(n.n(TextRange.m3474getStartimpl(newRawSelection), 0, iL0))).getPackedValue();
            long packedValue2 = boundaryFun.invoke(Integer.valueOf(n.n(TextRange.m3469getEndimpl(newRawSelection), 0, iL0))).getPackedValue();
            return TextRangeKt.TextRange(TextRange.m3473getReversedimpl(newRawSelection) ? TextRange.m3469getEndimpl(packedValue) : TextRange.m3474getStartimpl(packedValue), TextRange.m3473getReversedimpl(newRawSelection) ? TextRange.m3474getStartimpl(packedValue2) : TextRange.m3469getEndimpl(packedValue2));
        }

        @NotNull
        public final SelectionAdjustment getCharacter() {
            return Character;
        }

        @NotNull
        public final SelectionAdjustment getCharacterWithWordAccelerate() {
            return CharacterWithWordAccelerate;
        }

        @NotNull
        public final SelectionAdjustment getNone() {
            return None;
        }

        @NotNull
        public final SelectionAdjustment getParagraph() {
            return Paragraph;
        }

        @NotNull
        public final SelectionAdjustment getWord() {
            return Word;
        }
    }

    /* JADX INFO: renamed from: adjust-ZXO7KMw, reason: not valid java name */
    long mo784adjustZXO7KMw(@NotNull TextLayoutResult textLayoutResult, long newRawSelectionRange, int previousHandleOffset, boolean isStartHandle, @Nullable TextRange previousSelectionRange);
}
