package androidx.compose.ui.text.platform;

import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.selection.WordBoundary;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import bn.g;
import cn.w;
import com.ironsource.C3978d4;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: AndroidParagraph.android.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {}, d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B,\u0012\u0006\u0010T\u001a\u00020S\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010[\u001a\u000209\u0012\u0006\u0010`\u001a\u00020_ø\u0001\u0000¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001B|\b\u0016\u0012\b\u0010\u0094\u0001\u001a\u00030\u0093\u0001\u0012\b\u0010\u0096\u0001\u001a\u00030\u0095\u0001\u0012\u0015\u0010\u0099\u0001\u001a\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u0098\u00010\u0097\u00010f\u0012\u0015\u0010\u009b\u0001\u001a\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u009a\u00010\u0097\u00010f\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010[\u001a\u000209\u0012\u0006\u0010`\u001a\u00020_\u0012\b\u0010\u009d\u0001\u001a\u00030\u009c\u0001\u0012\b\u0010\u009f\u0001\u001a\u00030\u009e\u0001ø\u0001\u0000¢\u0006\u0006\b\u0091\u0001\u0010 \u0001J\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u0007H\u0002J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u001d\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0007H\u0016J+\u0010!\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0007H\u0016J\u0010\u0010&\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0007H\u0016J \u0010)\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010+\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u0007H\u0016J\u0010\u0010,\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u0007H\u0016J\u0010\u0010-\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u0007H\u0016J\u0017\u00100\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u0007H\u0000¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u0007H\u0000¢\u0006\u0004\b1\u0010/J\u0017\u00104\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u0007H\u0000¢\u0006\u0004\b3\u0010/J\u0010\u00105\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u0007H\u0016J\u0010\u00106\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u0007H\u0016J\u0010\u00107\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u0007H\u0016J\u0010\u00108\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0007H\u0016J\u0018\u0010;\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00072\u0006\u0010:\u001a\u000209H\u0016J\u0010\u0010<\u001a\u0002092\u0006\u0010*\u001a\u00020\u0007H\u0016J\u0010\u0010=\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\u0016J\u0018\u0010?\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010>\u001a\u000209H\u0016J\u0010\u0010A\u001a\u00020@2\u0006\u0010\u0016\u001a\u00020\u0007H\u0016J\u0010\u0010B\u001a\u00020@2\u0006\u0010\u0016\u001a\u00020\u0007H\u0016J\u0017\u0010E\u001a\u0002092\u0006\u0010*\u001a\u00020\u0007H\u0001¢\u0006\u0004\bC\u0010DJ9\u0010P\u001a\u00020\u001e2\u0006\u0010G\u001a\u00020F2\u0006\u0010I\u001a\u00020H2\b\u0010K\u001a\u0004\u0018\u00010J2\b\u0010M\u001a\u0004\u0018\u00010LH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bN\u0010OJ,\u0010P\u001a\u00020\u001e2\u0006\u0010G\u001a\u00020F2\u0006\u0010R\u001a\u00020Q2\b\u0010K\u001a\u0004\u0018\u00010J2\b\u0010M\u001a\u0004\u0018\u00010LH\u0016R\u0017\u0010T\u001a\u00020S8\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010X\u001a\u0004\bY\u0010ZR\u0017\u0010[\u001a\u0002098\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R \u0010`\u001a\u00020_8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u0014\u0010d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\"\u0010g\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u001b\u0010o\u001a\u00020k8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\b)\u0010nR\u0014\u0010r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0014\u0010t\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bs\u0010qR\u0014\u0010v\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bu\u0010qR\u0014\u0010x\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bw\u0010qR\u0014\u0010z\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\by\u0010qR\u0014\u0010|\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b{\u0010qR\u0014\u0010~\u001a\u0002098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b}\u0010^R\u001f\u0010\u0084\u0001\u001a\u00020\u007f8@X\u0081\u0004¢\u0006\u0010\u0012\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0016\u0010\u0086\u0001\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010ZR \u0010\u008b\u0001\u001a\u00030\u0087\u00018@X\u0081\u0004¢\u0006\u0010\u0012\u0006\b\u008a\u0001\u0010\u0083\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R \u0010\u0090\u0001\u001a\u00030\u008c\u00018@X\u0081\u0004¢\u0006\u0010\u0012\u0006\b\u008f\u0001\u0010\u0083\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¡\u0001"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidParagraph;", "Landroidx/compose/ui/text/Paragraph;", "Landroidx/compose/ui/text/android/TextLayout;", "", "Landroidx/compose/ui/text/platform/style/ShaderBrushSpan;", "getShaderBrushSpans", "(Landroidx/compose/ui/text/android/TextLayout;)[Landroidx/compose/ui/text/platform/style/ShaderBrushSpan;", "", "alignment", "justificationMode", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "maxLines", "constructTextLayout", "", "vertical", "getLineForVerticalPosition", "Landroidx/compose/ui/geometry/Offset;", C3978d4.i.L, "getOffsetForPosition-k-4lQ0M", "(J)I", "getOffsetForPosition", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/geometry/Rect;", "getBoundingBox", "Landroidx/compose/ui/text/TextRange;", "range", "", "array", "arrayStart", "Lbn/r;", "fillBoundingBoxes-8ffj60Q", "(J[FI)V", "fillBoundingBoxes", "start", "end", "Landroidx/compose/ui/graphics/Path;", "getPathForRange", "getCursorRect", "getWordBoundary--jx7JFs", "(I)J", "getWordBoundary", "lineIndex", "getLineLeft", "getLineRight", "getLineTop", "getLineAscent$ui_text_release", "(I)F", "getLineAscent", "getLineBaseline$ui_text_release", "getLineBaseline", "getLineDescent$ui_text_release", "getLineDescent", "getLineBottom", "getLineHeight", "getLineWidth", "getLineStart", "", "visibleEnd", "getLineEnd", "isLineEllipsized", "getLineForOffset", "usePrimaryDirection", "getHorizontalPosition", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getParagraphDirection", "getBidiRunDirection", "isEllipsisApplied$ui_text_release", "(I)Z", "isEllipsisApplied", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "paint-RPmYEkk", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V", "paint", "Landroidx/compose/ui/graphics/Brush;", "brush", "Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "paragraphIntrinsics", "Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "getParagraphIntrinsics", "()Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "I", "getMaxLines", "()I", "ellipsis", "Z", "getEllipsis", "()Z", "Landroidx/compose/ui/unit/Constraints;", "constraints", "J", "getConstraints-msEJaDk", "()J", "layout", "Landroidx/compose/ui/text/android/TextLayout;", "", "placeholderRects", "Ljava/util/List;", "getPlaceholderRects", "()Ljava/util/List;", "Landroidx/compose/ui/text/android/selection/WordBoundary;", "wordBoundary$delegate", "Lbn/g;", "()Landroidx/compose/ui/text/android/selection/WordBoundary;", "wordBoundary", "getWidth", "()F", "width", "getHeight", "height", "getMaxIntrinsicWidth", "maxIntrinsicWidth", "getMinIntrinsicWidth", "minIntrinsicWidth", "getFirstBaseline", "firstBaseline", "getLastBaseline", "lastBaseline", "getDidExceedMaxLines", "didExceedMaxLines", "Ljava/util/Locale;", "getTextLocale$ui_text_release", "()Ljava/util/Locale;", "getTextLocale$ui_text_release$annotations", "()V", "textLocale", "getLineCount", "lineCount", "", "getCharSequence$ui_text_release", "()Ljava/lang/CharSequence;", "getCharSequence$ui_text_release$annotations", "charSequence", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "getTextPaint$ui_text_release", "()Landroidx/compose/ui/text/platform/AndroidTextPaint;", "getTextPaint$ui_text_release$annotations", "textPaint", "<init>", "(Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;IZJLtn/i;)V", "", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "spanStyles", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/unit/Density;", "density", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Ljava/util/List;IZJLandroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/unit/Density;Ltn/i;)V", "ui-text_release"}, k = 1, mv = {1, 6, 0})
public final class AndroidParagraph implements Paragraph {
    private final long constraints;
    private final boolean ellipsis;

    @NotNull
    private final TextLayout layout;
    private final int maxLines;

    @NotNull
    private final AndroidParagraphIntrinsics paragraphIntrinsics;

    @NotNull
    private final List<Rect> placeholderRects;

    /* JADX INFO: renamed from: wordBoundary$delegate, reason: from kotlin metadata */
    @NotNull
    private final g wordBoundary;

    /* JADX INFO: compiled from: AndroidParagraph.android.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ResolvedTextDirection.values().length];
            iArr[ResolvedTextDirection.Ltr.ordinal()] = 1;
            iArr[ResolvedTextDirection.Rtl.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [androidx.compose.ui.text.platform.AndroidParagraph] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v3, types: [int] */
    private AndroidParagraph(AndroidParagraphIntrinsics androidParagraphIntrinsics, int i10, boolean z10, long j10) {
        List<Rect> listM;
        Rect rect;
        float horizontalPosition;
        float lineBaseline;
        int heightPx;
        float lineTop;
        float heightPx2;
        float lineBaseline2;
        this.paragraphIntrinsics = androidParagraphIntrinsics;
        this.maxLines = i10;
        this.ellipsis = z10;
        this.constraints = j10;
        boolean z11 = false;
        if (!(Constraints.m3783getMinHeightimpl(j10) == 0 && Constraints.m3784getMinWidthimpl(j10) == 0)) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
        }
        if (!(i10 >= 1)) {
            throw new IllegalArgumentException("maxLines should be greater than 0".toString());
        }
        TextStyle style = androidParagraphIntrinsics.getStyle();
        int iM3665toLayoutAlignAMY3VfE = AndroidParagraph_androidKt.m3665toLayoutAlignAMY3VfE(style.m3496getTextAlignbuA522U());
        TextAlign textAlignM3496getTextAlignbuA522U = style.m3496getTextAlignbuA522U();
        ?? M3730equalsimpl0 = textAlignM3496getTextAlignbuA522U == null ? 0 : TextAlign.m3730equalsimpl0(textAlignM3496getTextAlignbuA522U.getValue(), TextAlign.INSTANCE.m3736getJustifye0LSkKk());
        TextUtils.TruncateAt truncateAt = z10 ? TextUtils.TruncateAt.END : null;
        TextLayout textLayoutConstructTextLayout = constructTextLayout(iM3665toLayoutAlignAMY3VfE, M3730equalsimpl0, truncateAt, i10);
        if (!z10 || textLayoutConstructTextLayout.getHeight() <= Constraints.m3781getMaxHeightimpl(j10) || i10 <= 1) {
            this.layout = textLayoutConstructTextLayout;
        } else {
            int iNumberOfLinesThatFitMaxHeight = AndroidParagraph_androidKt.numberOfLinesThatFitMaxHeight(textLayoutConstructTextLayout, Constraints.m3781getMaxHeightimpl(j10));
            if (iNumberOfLinesThatFitMaxHeight > 0 && iNumberOfLinesThatFitMaxHeight != i10) {
                textLayoutConstructTextLayout = constructTextLayout(iM3665toLayoutAlignAMY3VfE, M3730equalsimpl0, truncateAt, iNumberOfLinesThatFitMaxHeight);
            }
            this.layout = textLayoutConstructTextLayout;
        }
        getTextPaint$ui_text_release().m3666setBrushd16Qtg0(style.getBrush(), SizeKt.Size(getWidth(), getHeight()));
        for (ShaderBrushSpan shaderBrushSpan : getShaderBrushSpans(this.layout)) {
            shaderBrushSpan.m3682setSizeiaC8Vc4(Size.m1440boximpl(SizeKt.Size(getWidth(), getHeight())));
        }
        CharSequence charSequence = this.paragraphIntrinsics.getCharSequence();
        if (charSequence instanceof Spanned) {
            Object[] spans = ((Spanned) charSequence).getSpans(0, charSequence.length(), PlaceholderSpan.class);
            p.j(spans, "getSpans(0, length, PlaceholderSpan::class.java)");
            ArrayList arrayList = new ArrayList(spans.length);
            int length = spans.length;
            int i11 = 0;
            while (i11 < length) {
                PlaceholderSpan placeholderSpan = (PlaceholderSpan) spans[i11];
                Spanned spanned = (Spanned) charSequence;
                int spanStart = spanned.getSpanStart(placeholderSpan);
                int spanEnd = spanned.getSpanEnd(placeholderSpan);
                int lineForOffset = this.layout.getLineForOffset(spanStart);
                boolean z12 = (this.layout.getLineEllipsisCount(lineForOffset) <= 0 || spanEnd <= this.layout.getLineEllipsisOffset(lineForOffset)) ? z11 : true;
                boolean z13 = spanEnd > this.layout.getLineEnd(lineForOffset) ? true : z11;
                if (z12 || z13) {
                    rect = null;
                } else {
                    int i12 = WhenMappings.$EnumSwitchMapping$0[getBidiRunDirection(spanStart).ordinal()];
                    if (i12 == 1) {
                        horizontalPosition = getHorizontalPosition(spanStart, true);
                    } else {
                        if (i12 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        horizontalPosition = getHorizontalPosition(spanStart, true) - placeholderSpan.getWidthPx();
                    }
                    float widthPx = placeholderSpan.getWidthPx() + horizontalPosition;
                    TextLayout textLayout = this.layout;
                    switch (placeholderSpan.getVerticalAlign()) {
                        case 0:
                            lineBaseline = textLayout.getLineBaseline(lineForOffset);
                            heightPx = placeholderSpan.getHeightPx();
                            lineTop = lineBaseline - heightPx;
                            rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                            break;
                        case 1:
                            lineTop = textLayout.getLineTop(lineForOffset);
                            rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                            break;
                        case 2:
                            lineBaseline = textLayout.getLineBottom(lineForOffset);
                            heightPx = placeholderSpan.getHeightPx();
                            lineTop = lineBaseline - heightPx;
                            rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                            break;
                        case 3:
                            lineTop = ((textLayout.getLineTop(lineForOffset) + textLayout.getLineBottom(lineForOffset)) - placeholderSpan.getHeightPx()) / 2;
                            rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                            break;
                        case 4:
                            heightPx2 = placeholderSpan.getFontMetrics().ascent;
                            lineBaseline2 = textLayout.getLineBaseline(lineForOffset);
                            lineTop = heightPx2 + lineBaseline2;
                            rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                            break;
                        case 5:
                            lineBaseline = placeholderSpan.getFontMetrics().descent + textLayout.getLineBaseline(lineForOffset);
                            heightPx = placeholderSpan.getHeightPx();
                            lineTop = lineBaseline - heightPx;
                            rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                            break;
                        case 6:
                            Paint.FontMetricsInt fontMetrics = placeholderSpan.getFontMetrics();
                            heightPx2 = ((fontMetrics.ascent + fontMetrics.descent) - placeholderSpan.getHeightPx()) / 2;
                            lineBaseline2 = textLayout.getLineBaseline(lineForOffset);
                            lineTop = heightPx2 + lineBaseline2;
                            rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                            break;
                        default:
                            throw new IllegalStateException("unexpected verticalAlignment");
                    }
                }
                arrayList.add(rect);
                i11++;
                z11 = false;
            }
            listM = arrayList;
        } else {
            listM = w.m();
        }
        this.placeholderRects = listM;
        this.wordBoundary = b.a(LazyThreadSafetyMode.NONE, new a<WordBoundary>() { // from class: androidx.compose.ui.text.platform.AndroidParagraph$wordBoundary$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final WordBoundary invoke() {
                return new WordBoundary(this.this$0.getTextLocale$ui_text_release(), this.this$0.layout.getText());
            }
        });
    }

    public /* synthetic */ AndroidParagraph(AndroidParagraphIntrinsics androidParagraphIntrinsics, int i10, boolean z10, long j10, i iVar) {
        this(androidParagraphIntrinsics, i10, z10, j10);
    }

    private AndroidParagraph(String str, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, int i10, boolean z10, long j10, FontFamily.Resolver resolver, Density density) {
        this(new AndroidParagraphIntrinsics(str, textStyle, list, list2, resolver, density), i10, z10, j10, null);
    }

    public /* synthetic */ AndroidParagraph(String str, TextStyle textStyle, List list, List list2, int i10, boolean z10, long j10, FontFamily.Resolver resolver, Density density, i iVar) {
        this(str, textStyle, list, list2, i10, z10, j10, resolver, density);
    }

    private final TextLayout constructTextLayout(int alignment, int justificationMode, TextUtils.TruncateAt ellipsize, int maxLines) {
        return new TextLayout(this.paragraphIntrinsics.getCharSequence(), getWidth(), getTextPaint$ui_text_release(), alignment, ellipsize, this.paragraphIntrinsics.getTextDirectionHeuristic(), 1.0f, 0.0f, AndroidParagraphHelper_androidKt.isIncludeFontPaddingEnabled(this.paragraphIntrinsics.getStyle()), true, maxLines, 0, 0, justificationMode, null, null, this.paragraphIntrinsics.getLayoutIntrinsics(), 55424, null);
    }

    @VisibleForTesting
    public static /* synthetic */ void getCharSequence$ui_text_release$annotations() {
    }

    private final ShaderBrushSpan[] getShaderBrushSpans(TextLayout textLayout) {
        if (!(textLayout.getText() instanceof Spanned)) {
            return new ShaderBrushSpan[0];
        }
        ShaderBrushSpan[] shaderBrushSpanArr = (ShaderBrushSpan[]) ((Spanned) textLayout.getText()).getSpans(0, textLayout.getText().length(), ShaderBrushSpan.class);
        p.j(shaderBrushSpanArr, "brushSpans");
        return shaderBrushSpanArr.length == 0 ? new ShaderBrushSpan[0] : shaderBrushSpanArr;
    }

    @VisibleForTesting
    public static /* synthetic */ void getTextLocale$ui_text_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTextPaint$ui_text_release$annotations() {
    }

    private final WordBoundary getWordBoundary() {
        return (WordBoundary) this.wordBoundary.getValue();
    }

    /* JADX INFO: renamed from: fillBoundingBoxes-8ffj60Q, reason: not valid java name */
    public final void m3657fillBoundingBoxes8ffj60Q(long range, @NotNull float[] array, int arrayStart) {
        p.k(array, "array");
        this.layout.fillBoundingBoxes(TextRange.m3472getMinimpl(range), TextRange.m3471getMaximpl(range), array, arrayStart);
    }

    @Override // androidx.compose.ui.text.Paragraph
    @NotNull
    public ResolvedTextDirection getBidiRunDirection(int offset) {
        return this.layout.isRtlCharAt(offset) ? ResolvedTextDirection.Rtl : ResolvedTextDirection.Ltr;
    }

    @Override // androidx.compose.ui.text.Paragraph
    @NotNull
    public Rect getBoundingBox(int offset) {
        float primaryHorizontal$default = TextLayout.getPrimaryHorizontal$default(this.layout, offset, false, 2, null);
        float primaryHorizontal$default2 = TextLayout.getPrimaryHorizontal$default(this.layout, offset + 1, false, 2, null);
        int lineForOffset = this.layout.getLineForOffset(offset);
        return new Rect(primaryHorizontal$default, this.layout.getLineTop(lineForOffset), primaryHorizontal$default2, this.layout.getLineBottom(lineForOffset));
    }

    @NotNull
    public final CharSequence getCharSequence$ui_text_release() {
        return this.paragraphIntrinsics.getCharSequence();
    }

    /* JADX INFO: renamed from: getConstraints-msEJaDk, reason: not valid java name and from getter */
    public final long getConstraints() {
        return this.constraints;
    }

    @Override // androidx.compose.ui.text.Paragraph
    @NotNull
    public Rect getCursorRect(int offset) {
        if (offset >= 0 && offset <= getCharSequence$ui_text_release().length()) {
            float primaryHorizontal$default = TextLayout.getPrimaryHorizontal$default(this.layout, offset, false, 2, null);
            int lineForOffset = this.layout.getLineForOffset(offset);
            return new Rect(primaryHorizontal$default, this.layout.getLineTop(lineForOffset), primaryHorizontal$default, this.layout.getLineBottom(lineForOffset));
        }
        throw new AssertionError("offset(" + offset + ") is out of bounds (0," + getCharSequence$ui_text_release().length());
    }

    @Override // androidx.compose.ui.text.Paragraph
    public boolean getDidExceedMaxLines() {
        return this.layout.getDidExceedMaxLines();
    }

    public final boolean getEllipsis() {
        return this.ellipsis;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getFirstBaseline() {
        return getLineBaseline$ui_text_release(0);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getHeight() {
        return this.layout.getHeight();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getHorizontalPosition(int offset, boolean usePrimaryDirection) {
        return usePrimaryDirection ? TextLayout.getPrimaryHorizontal$default(this.layout, offset, false, 2, null) : TextLayout.getSecondaryHorizontal$default(this.layout, offset, false, 2, null);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLastBaseline() {
        return this.maxLines < getLineCount() ? getLineBaseline$ui_text_release(this.maxLines - 1) : getLineBaseline$ui_text_release(getLineCount() - 1);
    }

    public final float getLineAscent$ui_text_release(int lineIndex) {
        return this.layout.getLineAscent(lineIndex);
    }

    public final float getLineBaseline$ui_text_release(int lineIndex) {
        return this.layout.getLineBaseline(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineBottom(int lineIndex) {
        return this.layout.getLineBottom(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineCount() {
        return this.layout.getLineCount();
    }

    public final float getLineDescent$ui_text_release(int lineIndex) {
        return this.layout.getLineDescent(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineEnd(int lineIndex, boolean visibleEnd) {
        return visibleEnd ? this.layout.getLineVisibleEnd(lineIndex) : this.layout.getLineEnd(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineForOffset(int offset) {
        return this.layout.getLineForOffset(offset);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineForVerticalPosition(float vertical) {
        return this.layout.getLineForVertical((int) vertical);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineHeight(int lineIndex) {
        return this.layout.getLineHeight(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineLeft(int lineIndex) {
        return this.layout.getLineLeft(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineRight(int lineIndex) {
        return this.layout.getLineRight(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineStart(int lineIndex) {
        return this.layout.getLineStart(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineTop(int lineIndex) {
        return this.layout.getLineTop(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineWidth(int lineIndex) {
        return this.layout.getLineWidth(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getMaxIntrinsicWidth() {
        return this.paragraphIntrinsics.getMaxIntrinsicWidth();
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getMinIntrinsicWidth() {
        return this.paragraphIntrinsics.getMinIntrinsicWidth();
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* JADX INFO: renamed from: getOffsetForPosition-k-4lQ0M */
    public int mo3393getOffsetForPositionk4lQ0M(long position) {
        return this.layout.getOffsetForHorizontal(this.layout.getLineForVertical((int) Offset.m1384getYimpl(position)), Offset.m1383getXimpl(position));
    }

    @Override // androidx.compose.ui.text.Paragraph
    @NotNull
    public ResolvedTextDirection getParagraphDirection(int offset) {
        return this.layout.getParagraphDirection(this.layout.getLineForOffset(offset)) == 1 ? ResolvedTextDirection.Ltr : ResolvedTextDirection.Rtl;
    }

    @NotNull
    public final AndroidParagraphIntrinsics getParagraphIntrinsics() {
        return this.paragraphIntrinsics;
    }

    @Override // androidx.compose.ui.text.Paragraph
    @NotNull
    public Path getPathForRange(int start, int end) {
        boolean z10 = false;
        if (start >= 0 && start <= end) {
            z10 = true;
        }
        if (z10 && end <= getCharSequence$ui_text_release().length()) {
            android.graphics.Path path = new android.graphics.Path();
            this.layout.getSelectionPath(start, end, path);
            return AndroidPath_androidKt.asComposePath(path);
        }
        throw new AssertionError("Start(" + start + ") or End(" + end + ") is out of Range(0.." + getCharSequence$ui_text_release().length() + "), or start > end!");
    }

    @Override // androidx.compose.ui.text.Paragraph
    @NotNull
    public List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    @NotNull
    public final Locale getTextLocale$ui_text_release() {
        Locale textLocale = this.paragraphIntrinsics.getTextPaint().getTextLocale();
        p.j(textLocale, "paragraphIntrinsics.textPaint.textLocale");
        return textLocale;
    }

    @NotNull
    public final AndroidTextPaint getTextPaint$ui_text_release() {
        return this.paragraphIntrinsics.getTextPaint();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getWidth() {
        return Constraints.m3782getMaxWidthimpl(this.constraints);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* JADX INFO: renamed from: getWordBoundary--jx7JFs */
    public long mo3394getWordBoundaryjx7JFs(int offset) {
        return TextRangeKt.TextRange(getWordBoundary().getWordStart(offset), getWordBoundary().getWordEnd(offset));
    }

    @VisibleForTesting
    public final boolean isEllipsisApplied$ui_text_release(int lineIndex) {
        return this.layout.isEllipsisApplied(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public boolean isLineEllipsized(int lineIndex) {
        return this.layout.isLineEllipsized(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public void paint(@NotNull Canvas canvas, @NotNull Brush brush, @Nullable Shadow shadow, @Nullable TextDecoration textDecoration) {
        p.k(canvas, "canvas");
        p.k(brush, "brush");
        AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        textPaint$ui_text_release.m3666setBrushd16Qtg0(brush, SizeKt.Size(getWidth(), getHeight()));
        textPaint$ui_text_release.setShadow(shadow);
        textPaint$ui_text_release.setTextDecoration(textDecoration);
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.save();
            nativeCanvas.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.layout.paint(nativeCanvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.restore();
        }
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* JADX INFO: renamed from: paint-RPmYEkk */
    public void mo3395paintRPmYEkk(@NotNull Canvas canvas, long color, @Nullable Shadow shadow, @Nullable TextDecoration textDecoration) {
        p.k(canvas, "canvas");
        AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        textPaint$ui_text_release.m3667setColor8_81llA(color);
        textPaint$ui_text_release.setShadow(shadow);
        textPaint$ui_text_release.setTextDecoration(textDecoration);
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.save();
            nativeCanvas.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.layout.paint(nativeCanvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.restore();
        }
    }
}
