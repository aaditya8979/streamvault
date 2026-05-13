package androidx.compose.ui.text.android.selection;

import androidx.compose.ui.text.android.CharSequenceCharacterIterator;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: WordIterator.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B)\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006#"}, d2 = {"Landroidx/compose/ui/text/android/selection/WordIterator;", "", "", TypedValues.CycleType.S_WAVE_OFFSET, "", "getPrevWordBeginningOnTwoWordsBoundary", "getBeginning", "getNextWordEndOnTwoWordBoundary", "getEnd", "isPunctuationStartBoundary", "isPunctuationEndBoundary", "isAfterLetterOrDigit", "isOnLetterOrDigit", "Lbn/r;", "checkOffsetIsValid", "nextBoundary", "prevBoundary", "getPunctuationBeginning", "getPunctuationEnd", "isAfterPunctuation", "isOnPunctuation", "", "charSequence", "Ljava/lang/CharSequence;", "start", "I", "end", "Ljava/text/BreakIterator;", "iterator", "Ljava/text/BreakIterator;", "Ljava/util/Locale;", CommonUrlParts.LOCALE, "<init>", "(Ljava/lang/CharSequence;IILjava/util/Locale;)V", VastTagName.COMPANION, "ui-text_release"}, k = 1, mv = {1, 6, 0})
public final class WordIterator {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int WINDOW_WIDTH = 50;

    @NotNull
    private final CharSequence charSequence;
    private final int end;

    @NotNull
    private final BreakIterator iterator;
    private final int start;

    /* JADX INFO: compiled from: WordIterator.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/android/selection/WordIterator$Companion;", "", "()V", "WINDOW_WIDTH", "", "isPunctuation", "", "cp", "isPunctuation$ui_text_release", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final boolean isPunctuation$ui_text_release(int cp2) {
            int type = Character.getType(cp2);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }
    }

    public WordIterator(@NotNull CharSequence charSequence, int i10, int i11, @Nullable Locale locale) {
        p.k(charSequence, "charSequence");
        this.charSequence = charSequence;
        if (!(i10 >= 0 && i10 <= charSequence.length())) {
            throw new IllegalArgumentException("input start index is outside the CharSequence".toString());
        }
        if (!(i11 >= 0 && i11 <= charSequence.length())) {
            throw new IllegalArgumentException("input end index is outside the CharSequence".toString());
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        p.j(wordInstance, "getWordInstance(locale)");
        this.iterator = wordInstance;
        this.start = Math.max(0, i10 - 50);
        this.end = Math.min(charSequence.length(), i11 + 50);
        wordInstance.setText(new CharSequenceCharacterIterator(charSequence, i10, i11));
    }

    private final void checkOffsetIsValid(int i10) {
        int i11 = this.start;
        boolean z10 = false;
        if (i10 <= this.end && i11 <= i10) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(("Invalid offset: " + i10 + ". Valid range is [" + this.start + " , " + this.end + ']').toString());
    }

    private final int getBeginning(int offset, boolean getPrevWordBeginningOnTwoWordsBoundary) {
        checkOffsetIsValid(offset);
        if (isOnLetterOrDigit(offset)) {
            return (!this.iterator.isBoundary(offset) || (isAfterLetterOrDigit(offset) && getPrevWordBeginningOnTwoWordsBoundary)) ? this.iterator.preceding(offset) : offset;
        }
        if (isAfterLetterOrDigit(offset)) {
            return this.iterator.preceding(offset);
        }
        return -1;
    }

    private final int getEnd(int offset, boolean getNextWordEndOnTwoWordBoundary) {
        checkOffsetIsValid(offset);
        if (isAfterLetterOrDigit(offset)) {
            return (!this.iterator.isBoundary(offset) || (isOnLetterOrDigit(offset) && getNextWordEndOnTwoWordBoundary)) ? this.iterator.following(offset) : offset;
        }
        if (isOnLetterOrDigit(offset)) {
            return this.iterator.following(offset);
        }
        return -1;
    }

    private final boolean isAfterLetterOrDigit(int offset) {
        return (offset <= this.end && this.start + 1 <= offset) && Character.isLetterOrDigit(Character.codePointBefore(this.charSequence, offset));
    }

    private final boolean isOnLetterOrDigit(int offset) {
        return (offset < this.end && this.start <= offset) && Character.isLetterOrDigit(Character.codePointAt(this.charSequence, offset));
    }

    private final boolean isPunctuationEndBoundary(int offset) {
        return !isOnPunctuation(offset) && isAfterPunctuation(offset);
    }

    private final boolean isPunctuationStartBoundary(int offset) {
        return isOnPunctuation(offset) && !isAfterPunctuation(offset);
    }

    public final int getNextWordEndOnTwoWordBoundary(int offset) {
        return getEnd(offset, true);
    }

    public final int getPrevWordBeginningOnTwoWordsBoundary(int offset) {
        return getBeginning(offset, true);
    }

    public final int getPunctuationBeginning(int offset) {
        checkOffsetIsValid(offset);
        while (offset != -1 && !isPunctuationStartBoundary(offset)) {
            offset = prevBoundary(offset);
        }
        return offset;
    }

    public final int getPunctuationEnd(int offset) {
        checkOffsetIsValid(offset);
        while (offset != -1 && !isPunctuationEndBoundary(offset)) {
            offset = nextBoundary(offset);
        }
        return offset;
    }

    public final boolean isAfterPunctuation(int offset) {
        if (offset <= this.end && this.start + 1 <= offset) {
            return INSTANCE.isPunctuation$ui_text_release(Character.codePointBefore(this.charSequence, offset));
        }
        return false;
    }

    public final boolean isOnPunctuation(int offset) {
        if (offset < this.end && this.start <= offset) {
            return INSTANCE.isPunctuation$ui_text_release(Character.codePointAt(this.charSequence, offset));
        }
        return false;
    }

    public final int nextBoundary(int offset) {
        checkOffsetIsValid(offset);
        return this.iterator.following(offset);
    }

    public final int prevBoundary(int offset) {
        checkOffsetIsValid(offset);
        return this.iterator.preceding(offset);
    }
}
