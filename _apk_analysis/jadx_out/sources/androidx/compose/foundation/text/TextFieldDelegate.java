package androidx.compose.foundation.text;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextPainter;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import bn.r;
import com.ironsource.C3978d4;
import com.squareup.picasso.Utils;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: TextFieldDelegate.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/TextFieldDelegate;", "", "()V", VastTagName.COMPANION, "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class TextFieldDelegate {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: TextFieldDelegate.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bA\u0010BJ2\u0010\u000b\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0003JK\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J7\u0010#\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b!\u0010\"JI\u0010)\u001a\u00020\t2\u0006\u0010%\u001a\u00020$2\u0006\u0010\u001e\u001a\u00020&2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001c2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(JZ\u00103\u001a\u0002002\u0006\u0010+\u001a\u00020*2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010-\u001a\u00020,2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\t0\u0007H\u0001ø\u0001\u0000¢\u0006\u0004\b1\u00102JZ\u00105\u001a\u0002002\u0006\u0010+\u001a\u00020*2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010-\u001a\u00020,2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\t0\u0007H\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00102J3\u00109\u001a\u00020\t2\u0006\u00106\u001a\u0002002\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0001¢\u0006\u0004\b7\u00108J#\u0010@\u001a\u00020<2\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b>\u0010?\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006C"}, d2 = {"Landroidx/compose/foundation/text/TextFieldDelegate$Companion;", "", "", "Landroidx/compose/ui/text/input/EditCommand;", "ops", "Landroidx/compose/ui/text/input/EditProcessor;", "editProcessor", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/TextFieldValue;", "Lbn/r;", "onValueChange", "onEditCommand", "Landroidx/compose/foundation/text/TextDelegate;", "textDelegate", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/text/TextLayoutResult;", "prevResultText", "Lkotlin/Triple;", "", "layout-_EkL_-Y$foundation_release", "(Landroidx/compose/foundation/text/TextDelegate;JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/TextLayoutResult;)Lkotlin/Triple;", "layout", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "value", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "textLayoutResult", "Landroidx/compose/ui/graphics/Paint;", "selectionPaint", "draw$foundation_release", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/graphics/Paint;)V", "draw", "Landroidx/compose/ui/geometry/Offset;", C3978d4.i.L, "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "setCursorOffset-ULxng0E$foundation_release", "(JLandroidx/compose/foundation/text/TextLayoutResultProxy;Landroidx/compose/ui/text/input/EditProcessor;Landroidx/compose/ui/text/input/OffsetMapping;Lsn/l;)V", "setCursorOffset", "Landroidx/compose/ui/text/input/TextInputService;", "textInputService", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Landroidx/compose/ui/text/input/ImeAction;", "onImeActionPerformed", "Landroidx/compose/ui/text/input/TextInputSession;", "restartInput$foundation_release", "(Landroidx/compose/ui/text/input/TextInputService;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/EditProcessor;Landroidx/compose/ui/text/input/ImeOptions;Lsn/l;Lsn/l;)Landroidx/compose/ui/text/input/TextInputSession;", "restartInput", "onFocus$foundation_release", "onFocus", "textInputSession", "onBlur$foundation_release", "(Landroidx/compose/ui/text/input/TextInputSession;Landroidx/compose/ui/text/input/EditProcessor;Lsn/l;)V", "onBlur", "Landroidx/compose/ui/text/TextRange;", "compositionRange", "Landroidx/compose/ui/text/input/TransformedText;", Utils.VERB_TRANSFORMED, "applyCompositionDecoration-72CqOWE", "(JLandroidx/compose/ui/text/input/TransformedText;)Landroidx/compose/ui/text/input/TransformedText;", "applyCompositionDecoration", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        /* JADX INFO: renamed from: layout-_EkL_-Y$foundation_release$default, reason: not valid java name */
        public static /* synthetic */ Triple m737layout_EkL_Y$foundation_release$default(Companion companion, TextDelegate textDelegate, long j10, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult, int i10, Object obj) {
            if ((i10 & 8) != 0) {
                textLayoutResult = null;
            }
            return companion.m739layout_EkL_Y$foundation_release(textDelegate, j10, layoutDirection, textLayoutResult);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void onEditCommand(List<? extends EditCommand> list, EditProcessor editProcessor, l<? super TextFieldValue, r> lVar) {
            lVar.invoke(editProcessor.apply(list));
        }

        @NotNull
        /* JADX INFO: renamed from: applyCompositionDecoration-72CqOWE, reason: not valid java name */
        public final TransformedText m738applyCompositionDecoration72CqOWE(long compositionRange, @NotNull TransformedText transformed) {
            p.k(transformed, Utils.VERB_TRANSFORMED);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(transformed.getText());
            builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, 12287, (i) null), transformed.getOffsetMapping().originalToTransformed(TextRange.m3474getStartimpl(compositionRange)), transformed.getOffsetMapping().originalToTransformed(TextRange.m3469getEndimpl(compositionRange)));
            return new TransformedText(builder.toAnnotatedString(), transformed.getOffsetMapping());
        }

        public final void draw$foundation_release(@NotNull Canvas canvas, @NotNull TextFieldValue value, @NotNull OffsetMapping offsetMapping, @NotNull TextLayoutResult textLayoutResult, @NotNull Paint selectionPaint) {
            int iOriginalToTransformed;
            int iOriginalToTransformed2;
            p.k(canvas, "canvas");
            p.k(value, "value");
            p.k(offsetMapping, "offsetMapping");
            p.k(textLayoutResult, "textLayoutResult");
            p.k(selectionPaint, "selectionPaint");
            if (!TextRange.m3468getCollapsedimpl(value.getSelection()) && (iOriginalToTransformed = offsetMapping.originalToTransformed(TextRange.m3472getMinimpl(value.getSelection()))) != (iOriginalToTransformed2 = offsetMapping.originalToTransformed(TextRange.m3471getMaximpl(value.getSelection())))) {
                canvas.drawPath(textLayoutResult.getPathForRange(iOriginalToTransformed, iOriginalToTransformed2), selectionPaint);
            }
            TextPainter.INSTANCE.paint(canvas, textLayoutResult);
        }

        @NotNull
        /* JADX INFO: renamed from: layout-_EkL_-Y$foundation_release, reason: not valid java name */
        public final Triple<Integer, Integer, TextLayoutResult> m739layout_EkL_Y$foundation_release(@NotNull TextDelegate textDelegate, long constraints, @NotNull LayoutDirection layoutDirection, @Nullable TextLayoutResult prevResultText) {
            p.k(textDelegate, "textDelegate");
            p.k(layoutDirection, "layoutDirection");
            TextLayoutResult textLayoutResultM734layoutNN6EwU = textDelegate.m734layoutNN6EwU(constraints, layoutDirection, prevResultText);
            return new Triple<>(Integer.valueOf(IntSize.m3986getWidthimpl(textLayoutResultM734layoutNN6EwU.getSize())), Integer.valueOf(IntSize.m3985getHeightimpl(textLayoutResultM734layoutNN6EwU.getSize())), textLayoutResultM734layoutNN6EwU);
        }

        public final void onBlur$foundation_release(@NotNull TextInputSession textInputSession, @NotNull EditProcessor editProcessor, @NotNull l<? super TextFieldValue, r> onValueChange) {
            p.k(textInputSession, "textInputSession");
            p.k(editProcessor, "editProcessor");
            p.k(onValueChange, "onValueChange");
            onValueChange.invoke(TextFieldValue.m3646copy3r_uNRQ$default(editProcessor.toTextFieldValue(), (AnnotatedString) null, 0L, (TextRange) null, 3, (Object) null));
            textInputSession.dispose();
        }

        @NotNull
        public final TextInputSession onFocus$foundation_release(@NotNull TextInputService textInputService, @NotNull TextFieldValue value, @NotNull EditProcessor editProcessor, @NotNull ImeOptions imeOptions, @NotNull l<? super TextFieldValue, r> onValueChange, @NotNull l<? super ImeAction, r> onImeActionPerformed) {
            p.k(textInputService, "textInputService");
            p.k(value, "value");
            p.k(editProcessor, "editProcessor");
            p.k(imeOptions, "imeOptions");
            p.k(onValueChange, "onValueChange");
            p.k(onImeActionPerformed, "onImeActionPerformed");
            return restartInput$foundation_release(textInputService, value, editProcessor, imeOptions, onValueChange, onImeActionPerformed);
        }

        @NotNull
        public final TextInputSession restartInput$foundation_release(@NotNull TextInputService textInputService, @NotNull TextFieldValue value, @NotNull final EditProcessor editProcessor, @NotNull ImeOptions imeOptions, @NotNull final l<? super TextFieldValue, r> onValueChange, @NotNull l<? super ImeAction, r> onImeActionPerformed) {
            p.k(textInputService, "textInputService");
            p.k(value, "value");
            p.k(editProcessor, "editProcessor");
            p.k(imeOptions, "imeOptions");
            p.k(onValueChange, "onValueChange");
            p.k(onImeActionPerformed, "onImeActionPerformed");
            return textInputService.startInput(value, imeOptions, new l<List<? extends EditCommand>, r>() { // from class: androidx.compose.foundation.text.TextFieldDelegate$Companion$restartInput$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ r invoke(List<? extends EditCommand> list) {
                    invoke2(list);
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull List<? extends EditCommand> list) {
                    p.k(list, "it");
                    TextFieldDelegate.INSTANCE.onEditCommand(list, editProcessor, onValueChange);
                }
            }, onImeActionPerformed);
        }

        /* JADX INFO: renamed from: setCursorOffset-ULxng0E$foundation_release, reason: not valid java name */
        public final void m740setCursorOffsetULxng0E$foundation_release(long position, @NotNull TextLayoutResultProxy textLayoutResult, @NotNull EditProcessor editProcessor, @NotNull OffsetMapping offsetMapping, @NotNull l<? super TextFieldValue, r> onValueChange) {
            p.k(textLayoutResult, "textLayoutResult");
            p.k(editProcessor, "editProcessor");
            p.k(offsetMapping, "offsetMapping");
            p.k(onValueChange, "onValueChange");
            onValueChange.invoke(TextFieldValue.m3646copy3r_uNRQ$default(editProcessor.toTextFieldValue(), (AnnotatedString) null, TextRangeKt.TextRange(offsetMapping.transformedToOriginal(TextLayoutResultProxy.m758getOffsetForPosition3MmeM6k$default(textLayoutResult, position, false, 2, null))), (TextRange) null, 5, (Object) null));
        }
    }

    private static final void onEditCommand(List<? extends EditCommand> list, EditProcessor editProcessor, l<? super TextFieldValue, r> lVar) {
        INSTANCE.onEditCommand(list, editProcessor, lVar);
    }
}
