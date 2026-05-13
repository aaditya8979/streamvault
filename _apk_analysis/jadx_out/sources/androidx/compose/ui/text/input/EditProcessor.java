package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.TextRange;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: EditProcessor.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0014\u0010\u000b\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0006\u0010\f\u001a\u00020\u0002R$\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00128\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/input/EditProcessor;", "", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Landroidx/compose/ui/text/input/TextInputSession;", "textInputSession", "Lbn/r;", "reset", "", "Landroidx/compose/ui/text/input/EditCommand;", "editCommands", "apply", "toTextFieldValue", "<set-?>", "mBufferState", "Landroidx/compose/ui/text/input/TextFieldValue;", "getMBufferState$ui_text_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "Landroidx/compose/ui/text/input/EditingBuffer;", "mBuffer", "Landroidx/compose/ui/text/input/EditingBuffer;", "getMBuffer$ui_text_release", "()Landroidx/compose/ui/text/input/EditingBuffer;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 6, 0})
public final class EditProcessor {

    @NotNull
    private TextFieldValue mBufferState = new TextFieldValue(AnnotatedStringKt.emptyAnnotatedString(), TextRange.INSTANCE.m3479getZerod9O1mEE(), (TextRange) null, (i) null);

    @NotNull
    private EditingBuffer mBuffer = new EditingBuffer(this.mBufferState.getText(), this.mBufferState.getSelection(), (i) null);

    @NotNull
    public final TextFieldValue apply(@NotNull List<? extends EditCommand> editCommands) {
        p.k(editCommands, "editCommands");
        int size = editCommands.size();
        for (int i10 = 0; i10 < size; i10++) {
            editCommands.get(i10).applyTo(this.mBuffer);
        }
        TextFieldValue textFieldValue = new TextFieldValue(this.mBuffer.toAnnotatedString$ui_text_release(), this.mBuffer.m3595getSelectiond9O1mEE$ui_text_release(), this.mBuffer.m3594getCompositionMzsxiRA$ui_text_release(), (i) null);
        this.mBufferState = textFieldValue;
        return textFieldValue;
    }

    @NotNull
    /* JADX INFO: renamed from: getMBuffer$ui_text_release, reason: from getter */
    public final EditingBuffer getMBuffer() {
        return this.mBuffer;
    }

    @NotNull
    /* JADX INFO: renamed from: getMBufferState$ui_text_release, reason: from getter */
    public final TextFieldValue getMBufferState() {
        return this.mBufferState;
    }

    public final void reset(@NotNull TextFieldValue textFieldValue, @Nullable TextInputSession textInputSession) {
        p.k(textFieldValue, "value");
        boolean z10 = true;
        boolean z11 = !p.f(textFieldValue.getComposition(), this.mBuffer.m3594getCompositionMzsxiRA$ui_text_release());
        boolean z12 = false;
        if (!p.f(this.mBufferState.getText(), textFieldValue.getText())) {
            this.mBuffer = new EditingBuffer(textFieldValue.getText(), textFieldValue.getSelection(), (i) null);
        } else if (TextRange.m3467equalsimpl0(this.mBufferState.getSelection(), textFieldValue.getSelection())) {
            z10 = false;
        } else {
            this.mBuffer.setSelection$ui_text_release(TextRange.m3472getMinimpl(textFieldValue.getSelection()), TextRange.m3471getMaximpl(textFieldValue.getSelection()));
            z12 = true;
            z10 = false;
        }
        if (textFieldValue.getComposition() == null) {
            this.mBuffer.commitComposition$ui_text_release();
        } else if (!TextRange.m3468getCollapsedimpl(textFieldValue.getComposition().getPackedValue())) {
            this.mBuffer.setComposition$ui_text_release(TextRange.m3472getMinimpl(textFieldValue.getComposition().getPackedValue()), TextRange.m3471getMaximpl(textFieldValue.getComposition().getPackedValue()));
        }
        if (z10 || (!z12 && z11)) {
            this.mBuffer.commitComposition$ui_text_release();
            textFieldValue = TextFieldValue.m3646copy3r_uNRQ$default(textFieldValue, (AnnotatedString) null, 0L, (TextRange) null, 3, (Object) null);
        }
        TextFieldValue textFieldValue2 = this.mBufferState;
        this.mBufferState = textFieldValue;
        if (textInputSession != null) {
            textInputSession.updateState(textFieldValue2, textFieldValue);
        }
    }

    @NotNull
    public final TextFieldValue toTextFieldValue() {
        return this.mBufferState;
    }
}
