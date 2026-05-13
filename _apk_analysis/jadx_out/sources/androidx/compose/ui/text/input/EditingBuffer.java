package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: EditingBuffer.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 D2\u00020\u0001:\u0001DB\u001a\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010:\u001a\u000204ø\u0001\u0000¢\u0006\u0004\bA\u0010BB\u001c\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0014\u0012\u0006\u0010:\u001a\u000204ø\u0001\u0000¢\u0006\u0004\bA\u0010CJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0080\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0011\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0019\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001b\u0010\u0017J\u000f\u0010\u001f\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010!\u001a\u00020\u0010H\u0000¢\u0006\u0004\b \u0010\u001eJ\b\u0010\"\u001a\u00020\u0014H\u0016J\u000f\u0010%\u001a\u00020\u000eH\u0000¢\u0006\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R$\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R$\u0010.\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R$\u00100\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-R$\u00102\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b2\u0010+\u001a\u0004\b3\u0010-R\u001f\u00107\u001a\u0004\u0018\u0001048@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b5\u00106R\u001d\u0010:\u001a\u0002048@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b8\u00109R$\u0010;\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u00068@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b<\u0010-\"\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b?\u0010-\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006E"}, d2 = {"Landroidx/compose/ui/text/input/EditingBuffer;", "", "", "hasComposition$ui_text_release", "()Z", "hasComposition", "", "index", "", "get$ui_text_release", "(I)C", "get", "start", "end", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Lbn/r;", "replace$ui_text_release", "(IILandroidx/compose/ui/text/AnnotatedString;)V", "replace", "", "(IILjava/lang/String;)V", "delete$ui_text_release", "(II)V", "delete", "setSelection$ui_text_release", "setSelection", "setComposition$ui_text_release", "setComposition", "cancelComposition$ui_text_release", "()V", "cancelComposition", "commitComposition$ui_text_release", "commitComposition", "toString", "toAnnotatedString$ui_text_release", "()Landroidx/compose/ui/text/AnnotatedString;", "toAnnotatedString", "Landroidx/compose/ui/text/input/PartialGapBuffer;", "gapBuffer", "Landroidx/compose/ui/text/input/PartialGapBuffer;", "<set-?>", "selectionStart", "I", "getSelectionStart$ui_text_release", "()I", "selectionEnd", "getSelectionEnd$ui_text_release", "compositionStart", "getCompositionStart$ui_text_release", "compositionEnd", "getCompositionEnd$ui_text_release", "Landroidx/compose/ui/text/TextRange;", "getComposition-MzsxiRA$ui_text_release", "()Landroidx/compose/ui/text/TextRange;", "composition", "getSelection-d9O1mEE$ui_text_release", "()J", "selection", "cursor", "getCursor$ui_text_release", "setCursor$ui_text_release", "(I)V", "getLength$ui_text_release", "length", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;JLtn/i;)V", "(Ljava/lang/String;JLtn/i;)V", VastTagName.COMPANION, "ui-text_release"}, k = 1, mv = {1, 6, 0})
public final class EditingBuffer {
    public static final int NOWHERE = -1;
    private int compositionEnd;
    private int compositionStart;

    @NotNull
    private final PartialGapBuffer gapBuffer;
    private int selectionEnd;
    private int selectionStart;

    private EditingBuffer(AnnotatedString annotatedString, long j10) {
        this.gapBuffer = new PartialGapBuffer(annotatedString.getText());
        this.selectionStart = TextRange.m3472getMinimpl(j10);
        this.selectionEnd = TextRange.m3471getMaximpl(j10);
        this.compositionStart = -1;
        this.compositionEnd = -1;
        int iM3472getMinimpl = TextRange.m3472getMinimpl(j10);
        int iM3471getMaximpl = TextRange.m3471getMaximpl(j10);
        if (iM3472getMinimpl < 0 || iM3472getMinimpl > annotatedString.length()) {
            throw new IndexOutOfBoundsException("start (" + iM3472getMinimpl + ") offset is outside of text region " + annotatedString.length());
        }
        if (iM3471getMaximpl < 0 || iM3471getMaximpl > annotatedString.length()) {
            throw new IndexOutOfBoundsException("end (" + iM3471getMaximpl + ") offset is outside of text region " + annotatedString.length());
        }
        if (iM3472getMinimpl <= iM3471getMaximpl) {
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + iM3472getMinimpl + " > " + iM3471getMaximpl);
    }

    public /* synthetic */ EditingBuffer(AnnotatedString annotatedString, long j10, i iVar) {
        this(annotatedString, j10);
    }

    private EditingBuffer(String str, long j10) {
        this(new AnnotatedString(str, null, null, 6, null), j10, (i) null);
    }

    public /* synthetic */ EditingBuffer(String str, long j10, i iVar) {
        this(str, j10);
    }

    public final void cancelComposition$ui_text_release() {
        replace$ui_text_release(this.compositionStart, this.compositionEnd, "");
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void commitComposition$ui_text_release() {
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void delete$ui_text_release(int start, int end) {
        long jTextRange = TextRangeKt.TextRange(start, end);
        this.gapBuffer.replace(start, end, "");
        long jM3596updateRangeAfterDeletepWDy79M = EditingBufferKt.m3596updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.selectionStart, this.selectionEnd), jTextRange);
        this.selectionStart = TextRange.m3472getMinimpl(jM3596updateRangeAfterDeletepWDy79M);
        this.selectionEnd = TextRange.m3471getMaximpl(jM3596updateRangeAfterDeletepWDy79M);
        if (hasComposition$ui_text_release()) {
            long jM3596updateRangeAfterDeletepWDy79M2 = EditingBufferKt.m3596updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd), jTextRange);
            if (TextRange.m3468getCollapsedimpl(jM3596updateRangeAfterDeletepWDy79M2)) {
                commitComposition$ui_text_release();
            } else {
                this.compositionStart = TextRange.m3472getMinimpl(jM3596updateRangeAfterDeletepWDy79M2);
                this.compositionEnd = TextRange.m3471getMaximpl(jM3596updateRangeAfterDeletepWDy79M2);
            }
        }
    }

    public final char get$ui_text_release(int index) {
        return this.gapBuffer.get(index);
    }

    @Nullable
    /* JADX INFO: renamed from: getComposition-MzsxiRA$ui_text_release, reason: not valid java name */
    public final TextRange m3594getCompositionMzsxiRA$ui_text_release() {
        if (hasComposition$ui_text_release()) {
            return TextRange.m3462boximpl(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd));
        }
        return null;
    }

    /* JADX INFO: renamed from: getCompositionEnd$ui_text_release, reason: from getter */
    public final int getCompositionEnd() {
        return this.compositionEnd;
    }

    /* JADX INFO: renamed from: getCompositionStart$ui_text_release, reason: from getter */
    public final int getCompositionStart() {
        return this.compositionStart;
    }

    public final int getCursor$ui_text_release() {
        int i10 = this.selectionStart;
        int i11 = this.selectionEnd;
        if (i10 == i11) {
            return i11;
        }
        return -1;
    }

    public final int getLength$ui_text_release() {
        return this.gapBuffer.getLength();
    }

    /* JADX INFO: renamed from: getSelection-d9O1mEE$ui_text_release, reason: not valid java name */
    public final long m3595getSelectiond9O1mEE$ui_text_release() {
        return TextRangeKt.TextRange(this.selectionStart, this.selectionEnd);
    }

    /* JADX INFO: renamed from: getSelectionEnd$ui_text_release, reason: from getter */
    public final int getSelectionEnd() {
        return this.selectionEnd;
    }

    /* JADX INFO: renamed from: getSelectionStart$ui_text_release, reason: from getter */
    public final int getSelectionStart() {
        return this.selectionStart;
    }

    public final boolean hasComposition$ui_text_release() {
        return this.compositionStart != -1;
    }

    public final void replace$ui_text_release(int start, int end, @NotNull AnnotatedString text) {
        p.k(text, "text");
        replace$ui_text_release(start, end, text.getText());
    }

    public final void replace$ui_text_release(int start, int end, @NotNull String text) {
        p.k(text, "text");
        if (start < 0 || start > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("start (" + start + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        if (end < 0 || end > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("end (" + end + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        if (start <= end) {
            this.gapBuffer.replace(start, end, text);
            this.selectionStart = text.length() + start;
            this.selectionEnd = start + text.length();
            this.compositionStart = -1;
            this.compositionEnd = -1;
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + start + " > " + end);
    }

    public final void setComposition$ui_text_release(int start, int end) {
        if (start < 0 || start > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("start (" + start + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        if (end < 0 || end > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("end (" + end + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        if (start < end) {
            this.compositionStart = start;
            this.compositionEnd = end;
            return;
        }
        throw new IllegalArgumentException("Do not set reversed or empty range: " + start + " > " + end);
    }

    public final void setCursor$ui_text_release(int i10) {
        setSelection$ui_text_release(i10, i10);
    }

    public final void setSelection$ui_text_release(int start, int end) {
        if (start < 0 || start > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("start (" + start + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        if (end < 0 || end > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("end (" + end + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        if (start <= end) {
            this.selectionStart = start;
            this.selectionEnd = end;
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + start + " > " + end);
    }

    @NotNull
    public final AnnotatedString toAnnotatedString$ui_text_release() {
        return new AnnotatedString(toString(), null, null, 6, null);
    }

    @NotNull
    public String toString() {
        return this.gapBuffer.toString();
    }
}
