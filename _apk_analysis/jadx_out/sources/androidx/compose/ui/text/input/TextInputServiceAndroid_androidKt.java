package androidx.compose.ui.text.input;

import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: TextInputServiceAndroid.android.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002\"\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroid/view/inputmethod/EditorInfo;", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValue", "Lbn/r;", "update", "", "bits", "flag", "", "hasFlag", "", "DEBUG_CLASS", "Ljava/lang/String;", "ui_release"}, k = 2, mv = {1, 6, 0})
public final class TextInputServiceAndroid_androidKt {

    @NotNull
    private static final String DEBUG_CLASS = "TextInputServiceAndroid";

    private static final boolean hasFlag(int i10, int i11) {
        return (i10 & i11) == i11;
    }

    public static final void update(@NotNull EditorInfo editorInfo, @NotNull ImeOptions imeOptions, @NotNull TextFieldValue textFieldValue) {
        p.k(editorInfo, "<this>");
        p.k(imeOptions, "imeOptions");
        p.k(textFieldValue, "textFieldValue");
        int imeAction = imeOptions.getImeAction();
        ImeAction.Companion companion = ImeAction.INSTANCE;
        int i10 = 6;
        if (ImeAction.m3600equalsimpl0(imeAction, companion.m3604getDefaulteUduSuo())) {
            if (!imeOptions.getSingleLine()) {
                i10 = 0;
            }
        } else if (ImeAction.m3600equalsimpl0(imeAction, companion.m3608getNoneeUduSuo())) {
            i10 = 1;
        } else if (ImeAction.m3600equalsimpl0(imeAction, companion.m3606getGoeUduSuo())) {
            i10 = 2;
        } else if (ImeAction.m3600equalsimpl0(imeAction, companion.m3607getNexteUduSuo())) {
            i10 = 5;
        } else if (ImeAction.m3600equalsimpl0(imeAction, companion.m3609getPreviouseUduSuo())) {
            i10 = 7;
        } else if (ImeAction.m3600equalsimpl0(imeAction, companion.m3610getSearcheUduSuo())) {
            i10 = 3;
        } else if (ImeAction.m3600equalsimpl0(imeAction, companion.m3611getSendeUduSuo())) {
            i10 = 4;
        } else if (!ImeAction.m3600equalsimpl0(imeAction, companion.m3605getDoneeUduSuo())) {
            throw new IllegalStateException("invalid ImeAction".toString());
        }
        editorInfo.imeOptions = i10;
        int keyboardType = imeOptions.getKeyboardType();
        KeyboardType.Companion companion2 = KeyboardType.INSTANCE;
        if (KeyboardType.m3633equalsimpl0(keyboardType, companion2.m3644getTextPjHm6EE())) {
            editorInfo.inputType = 1;
        } else if (KeyboardType.m3633equalsimpl0(keyboardType, companion2.m3637getAsciiPjHm6EE())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (KeyboardType.m3633equalsimpl0(keyboardType, companion2.m3640getNumberPjHm6EE())) {
            editorInfo.inputType = 2;
        } else if (KeyboardType.m3633equalsimpl0(keyboardType, companion2.m3643getPhonePjHm6EE())) {
            editorInfo.inputType = 3;
        } else if (KeyboardType.m3633equalsimpl0(keyboardType, companion2.m3645getUriPjHm6EE())) {
            editorInfo.inputType = 17;
        } else if (KeyboardType.m3633equalsimpl0(keyboardType, companion2.m3639getEmailPjHm6EE())) {
            editorInfo.inputType = 33;
        } else if (KeyboardType.m3633equalsimpl0(keyboardType, companion2.m3642getPasswordPjHm6EE())) {
            editorInfo.inputType = 129;
        } else if (KeyboardType.m3633equalsimpl0(keyboardType, companion2.m3641getNumberPasswordPjHm6EE())) {
            editorInfo.inputType = 18;
        } else {
            if (!KeyboardType.m3633equalsimpl0(keyboardType, companion2.m3638getDecimalPjHm6EE())) {
                throw new IllegalStateException("Invalid Keyboard Type".toString());
            }
            editorInfo.inputType = 8194;
        }
        if (!imeOptions.getSingleLine() && hasFlag(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (ImeAction.m3600equalsimpl0(imeOptions.getImeAction(), companion.m3604getDefaulteUduSuo())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (hasFlag(editorInfo.inputType, 1)) {
            int capitalization = imeOptions.getCapitalization();
            KeyboardCapitalization.Companion companion3 = KeyboardCapitalization.INSTANCE;
            if (KeyboardCapitalization.m3622equalsimpl0(capitalization, companion3.m3626getCharactersIUNYP9k())) {
                editorInfo.inputType |= 4096;
            } else if (KeyboardCapitalization.m3622equalsimpl0(capitalization, companion3.m3629getWordsIUNYP9k())) {
                editorInfo.inputType |= 8192;
            } else if (KeyboardCapitalization.m3622equalsimpl0(capitalization, companion3.m3628getSentencesIUNYP9k())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = TextRange.m3474getStartimpl(textFieldValue.getSelection());
        editorInfo.initialSelEnd = TextRange.m3469getEndimpl(textFieldValue.getSelection());
        EditorInfoCompat.setInitialSurroundingText(editorInfo, textFieldValue.getText());
        editorInfo.imeOptions |= 33554432;
    }
}
