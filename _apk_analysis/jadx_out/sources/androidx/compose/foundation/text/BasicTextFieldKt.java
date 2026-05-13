package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;

/* JADX INFO: compiled from: BasicTextField.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000d\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aÕ\u0001\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192$\b\u0002\u0010\u001d\u001a\u001e\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u001b¢\u0006\u0002\b\u001c\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001aÕ\u0001\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020 2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192$\b\u0002\u0010\u001d\u001a\u001e\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u001b¢\u0006\u0002\b\u001c\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u001cH\u0007¢\u0006\u0004\b\u001e\u0010!¨\u0006\""}, d2 = {"", "value", "Lkotlin/Function1;", "Lbn/r;", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "readOnly", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "singleLine", "", "maxLines", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Landroidx/compose/ui/text/TextLayoutResult;", "onTextLayout", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Brush;", "cursorBrush", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "decorationBox", "BasicTextField", "(Ljava/lang/String;Lsn/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lsn/l;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lsn/q;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lsn/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lsn/l;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lsn/q;Landroidx/compose/runtime/Composer;III)V", "foundation_release"}, k = 2, mv = {1, 6, 0})
public final class BasicTextFieldKt {
    /* JADX WARN: Removed duplicated region for block: B:107:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:234:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0137  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BasicTextField(@org.jetbrains.annotations.NotNull final androidx.compose.ui.text.input.TextFieldValue r35, @org.jetbrains.annotations.NotNull final sn.l<? super androidx.compose.ui.text.input.TextFieldValue, bn.r> r36, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r37, boolean r38, boolean r39, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.TextStyle r40, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardOptions r41, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardActions r42, boolean r43, int r44, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.input.VisualTransformation r45, @org.jetbrains.annotations.Nullable sn.l<? super androidx.compose.ui.text.TextLayoutResult, bn.r> r46, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r47, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Brush r48, @org.jetbrains.annotations.Nullable sn.q<? super sn.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r49, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r50, final int r51, final int r52, final int r53) {
        /*
            Method dump skipped, instruction units count: 976
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(androidx.compose.ui.text.input.TextFieldValue, sn.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.ui.text.input.VisualTransformation, sn.l, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, sn.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:242:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0137  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BasicTextField(@org.jetbrains.annotations.NotNull final java.lang.String r38, @org.jetbrains.annotations.NotNull final sn.l<? super java.lang.String, bn.r> r39, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r40, boolean r41, boolean r42, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.TextStyle r43, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardOptions r44, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardActions r45, boolean r46, int r47, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.input.VisualTransformation r48, @org.jetbrains.annotations.Nullable sn.l<? super androidx.compose.ui.text.TextLayoutResult, bn.r> r49, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r50, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Brush r51, @org.jetbrains.annotations.Nullable sn.q<? super sn.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r52, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r53, final int r54, final int r55, final int r56) {
        /*
            Method dump skipped, instruction units count: 1103
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(java.lang.String, sn.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.ui.text.input.VisualTransformation, sn.l, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, sn.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: renamed from: BasicTextField$lambda-2, reason: not valid java name */
    private static final TextFieldValue m665BasicTextField$lambda2(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: BasicTextField$lambda-5, reason: not valid java name */
    public static final String m667BasicTextField$lambda5(MutableState<String> mutableState) {
        return mutableState.getValue();
    }
}
