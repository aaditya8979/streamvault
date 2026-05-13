package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Path;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.Px;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import bn.g;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: TextLayout.kt */
/* JADX INFO: loaded from: classes12.dex */
@InternalPlatformTextApi
@Metadata(bv = {}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B³\u0001\u0012\u0006\u0010c\u001a\u00020]\u0012\b\b\u0002\u0010d\u001a\u00020\u0004\u0012\u0006\u0010f\u001a\u00020e\u0012\b\b\u0002\u0010g\u001a\u00020\u0002\u0012\n\b\u0002\u0010i\u001a\u0004\u0018\u00010h\u0012\b\b\u0002\u0010j\u001a\u00020\u0002\u0012\b\b\u0002\u0010k\u001a\u00020\u0004\u0012\b\b\u0003\u0010l\u001a\u00020\u0004\u0012\b\b\u0002\u00104\u001a\u00020\u0012\u0012\b\b\u0002\u00107\u001a\u00020\u0012\u0012\b\b\u0002\u0010m\u001a\u00020\u0002\u0012\b\b\u0002\u0010n\u001a\u00020\u0002\u0012\b\b\u0002\u0010o\u001a\u00020\u0002\u0012\b\b\u0002\u0010p\u001a\u00020\u0002\u0012\n\b\u0002\u0010r\u001a\u0004\u0018\u00010q\u0012\n\b\u0002\u0010s\u001a\u0004\u0018\u00010q\u0012\b\b\u0002\u0010:\u001a\u000209¢\u0006\u0004\bt\u0010uJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002J\u0016\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0004J\u0018\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u0012J\u0018\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u0012J\u000e\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002J\u000e\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0002J\u000e\u0010 \u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J\u001e\u0010&\u001a\u00020%2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#J\u000e\u0010'\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002J&\u0010-\u001a\u00020%2\u0006\u0010(\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u0002J\u000e\u00100\u001a\u00020%2\u0006\u0010/\u001a\u00020.J\u000f\u00103\u001a\u00020\u0012H\u0000¢\u0006\u0004\b1\u00102R\u0017\u00104\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00102R\u0017\u00107\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b7\u00105\u001a\u0004\b8\u00102R\u0017\u0010:\u001a\u0002098\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010>\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b>\u00105\u001a\u0004\b?\u00102R \u0010A\u001a\u00020@8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bA\u0010B\u0012\u0004\bE\u0010F\u001a\u0004\bC\u0010DR\u0017\u0010G\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR \u0010K\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bK\u0010H\u0012\u0004\bM\u0010F\u001a\u0004\bL\u0010JR \u0010N\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bN\u0010H\u0012\u0004\bP\u0010F\u001a\u0004\bO\u0010JR\u0014\u0010Q\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u00105R\u001b\u0010W\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0011\u0010Z\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0011\u0010\\\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b[\u0010YR\u0011\u0010`\u001a\u00020]8F¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0011\u0010b\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\ba\u0010J¨\u0006v"}, d2 = {"Landroidx/compose/ui/text/android/TextLayout;", "", "", "lineIndex", "", "getLineLeft", "getLineRight", "line", "getLineTop", "getLineBottom", "getLineAscent", "getLineBaseline", "getLineDescent", "getLineHeight", "getLineWidth", "getLineStart", "getLineEnd", "getLineVisibleEnd", "", "isLineEllipsized", "getLineEllipsisOffset", "getLineEllipsisCount", "vertical", "getLineForVertical", "horizontal", "getOffsetForHorizontal", TypedValues.CycleType.S_WAVE_OFFSET, "upstream", "getPrimaryHorizontal", "getSecondaryHorizontal", "getLineForOffset", "isRtlCharAt", "getParagraphDirection", "start", "end", "Landroid/graphics/Path;", "dest", "Lbn/r;", "getSelectionPath", "isEllipsisApplied", "startOffset", "endOffset", "", "array", "arrayStart", "fillBoundingBoxes", "Landroid/graphics/Canvas;", "canvas", "paint", "isFallbackLinespacingApplied$ui_text_release", "()Z", "isFallbackLinespacingApplied", "includePadding", "Z", "getIncludePadding", "fallbackLineSpacing", "getFallbackLineSpacing", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "layoutIntrinsics", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "getLayoutIntrinsics", "()Landroidx/compose/ui/text/android/LayoutIntrinsics;", "didExceedMaxLines", "getDidExceedMaxLines", "Landroid/text/Layout;", "layout", "Landroid/text/Layout;", "getLayout", "()Landroid/text/Layout;", "getLayout$annotations", "()V", "lineCount", "I", "getLineCount", "()I", "topPadding", "getTopPadding$ui_text_release", "getTopPadding$ui_text_release$annotations", "bottomPadding", "getBottomPadding$ui_text_release", "getBottomPadding$ui_text_release$annotations", "isBoringLayout", "Landroidx/compose/ui/text/android/LayoutHelper;", "layoutHelper$delegate", "Lbn/g;", "getLayoutHelper", "()Landroidx/compose/ui/text/android/LayoutHelper;", "layoutHelper", "getMaxIntrinsicWidth", "()F", "maxIntrinsicWidth", "getMinIntrinsicWidth", "minIntrinsicWidth", "", "getText", "()Ljava/lang/CharSequence;", "text", "getHeight", "height", "charSequence", "width", "Landroid/text/TextPaint;", "textPaint", "alignment", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "textDirectionHeuristic", "lineSpacingMultiplier", "lineSpacingExtra", "maxLines", "breakStrategy", "hyphenationFrequency", "justificationMode", "", "leftIndents", "rightIndents", "<init>", "(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IFFZZIIII[I[ILandroidx/compose/ui/text/android/LayoutIntrinsics;)V", "ui-text_release"}, k = 1, mv = {1, 6, 0})
public final class TextLayout {
    private final int bottomPadding;
    private final boolean didExceedMaxLines;
    private final boolean fallbackLineSpacing;
    private final boolean includePadding;
    private final boolean isBoringLayout;

    @NotNull
    private final Layout layout;

    /* JADX INFO: renamed from: layoutHelper$delegate, reason: from kotlin metadata */
    @NotNull
    private final g layoutHelper;

    @NotNull
    private final LayoutIntrinsics layoutIntrinsics;
    private final int lineCount;
    private final int topPadding;

    public TextLayout(@NotNull CharSequence charSequence, float f10, @NotNull TextPaint textPaint, int i10, @Nullable TextUtils.TruncateAt truncateAt, int i11, float f11, @Px float f12, boolean z10, boolean z11, int i12, int i13, int i14, int i15, @Nullable int[] iArr, @Nullable int[] iArr2, @NotNull LayoutIntrinsics layoutIntrinsics) {
        boolean z12;
        boolean z13;
        Layout layoutCreate;
        p.k(charSequence, "charSequence");
        p.k(textPaint, "textPaint");
        p.k(layoutIntrinsics, "layoutIntrinsics");
        this.includePadding = z10;
        this.fallbackLineSpacing = z11;
        this.layoutIntrinsics = layoutIntrinsics;
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristic = TextLayoutKt.getTextDirectionHeuristic(i11);
        Layout.Alignment alignment = TextAlignmentAdapter.INSTANCE.get(i10);
        boolean z14 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, BaselineShiftSpan.class) < length;
        BoringLayout.Metrics boringMetrics = layoutIntrinsics.getBoringMetrics();
        double d10 = f10;
        int iCeil = (int) Math.ceil(d10);
        if (boringMetrics == null || layoutIntrinsics.getMaxIntrinsicWidth() > f10 || z14) {
            this.isBoringLayout = false;
            z12 = false;
            z13 = true;
            layoutCreate = StaticLayoutFactory.INSTANCE.create(charSequence, 0, charSequence.length(), textPaint, iCeil, textDirectionHeuristic, alignment, i12, truncateAt, (int) Math.ceil(d10), f11, f12, i15, z10, z11, i13, i14, iArr, iArr2);
        } else {
            this.isBoringLayout = true;
            layoutCreate = BoringLayoutFactory.INSTANCE.create(charSequence, textPaint, iCeil, boringMetrics, alignment, z10, truncateAt, iCeil);
            z13 = true;
            z12 = false;
        }
        this.layout = layoutCreate;
        int iMin = Math.min(layoutCreate.getLineCount(), i12);
        this.lineCount = iMin;
        this.didExceedMaxLines = (iMin >= i12 && (layoutCreate.getEllipsisCount(iMin + (-1)) > 0 || layoutCreate.getLineEnd(iMin + (-1)) != charSequence.length())) ? z13 : z12;
        Pair verticalPaddings = TextLayoutKt.getVerticalPaddings(this);
        Pair lineHeightPaddings = TextLayoutKt.getLineHeightPaddings(this);
        this.topPadding = Math.max(((Number) verticalPaddings.getFirst()).intValue(), ((Number) lineHeightPaddings.getFirst()).intValue());
        this.bottomPadding = Math.max(((Number) verticalPaddings.getSecond()).intValue(), ((Number) lineHeightPaddings.getSecond()).intValue());
        this.layoutHelper = kotlin.b.a(LazyThreadSafetyMode.NONE, new sn.a<LayoutHelper>() { // from class: androidx.compose.ui.text.android.TextLayout$layoutHelper$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final LayoutHelper invoke() {
                return new LayoutHelper(this.this$0.getLayout());
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextLayout(CharSequence charSequence, float f10, TextPaint textPaint, int i10, TextUtils.TruncateAt truncateAt, int i11, float f11, float f12, boolean z10, boolean z11, int i12, int i13, int i14, int i15, int[] iArr, int[] iArr2, LayoutIntrinsics layoutIntrinsics, int i16, i iVar) {
        float f13 = (i16 & 2) != 0 ? 0.0f : f10;
        int i17 = (i16 & 8) != 0 ? 0 : i10;
        TextUtils.TruncateAt truncateAt2 = (i16 & 16) != 0 ? null : truncateAt;
        int i18 = (i16 & 32) != 0 ? 2 : i11;
        this(charSequence, f13, textPaint, i17, truncateAt2, i18, (i16 & 64) != 0 ? 1.0f : f11, (i16 & 128) != 0 ? 0.0f : f12, (i16 & 256) != 0 ? false : z10, (i16 & 512) != 0 ? true : z11, (i16 & 1024) != 0 ? Integer.MAX_VALUE : i12, (i16 & 2048) != 0 ? 0 : i13, (i16 & 4096) != 0 ? 0 : i14, (i16 & 8192) != 0 ? 0 : i15, (i16 & 16384) != 0 ? null : iArr, (32768 & i16) != 0 ? null : iArr2, (i16 & 65536) != 0 ? new LayoutIntrinsics(charSequence, textPaint, i18) : layoutIntrinsics);
    }

    @VisibleForTesting
    public static /* synthetic */ void getBottomPadding$ui_text_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getLayout$annotations() {
    }

    private final LayoutHelper getLayoutHelper() {
        return (LayoutHelper) this.layoutHelper.getValue();
    }

    public static /* synthetic */ float getPrimaryHorizontal$default(TextLayout textLayout, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return textLayout.getPrimaryHorizontal(i10, z10);
    }

    public static /* synthetic */ float getSecondaryHorizontal$default(TextLayout textLayout, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return textLayout.getSecondaryHorizontal(i10, z10);
    }

    @VisibleForTesting
    public static /* synthetic */ void getTopPadding$ui_text_release$annotations() {
    }

    public final void fillBoundingBoxes(int i10, int i11, @NotNull float[] fArr, int i12) {
        float secondaryDownstream;
        float secondaryUpstream;
        p.k(fArr, "array");
        int length = getText().length();
        int i13 = 1;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException("startOffset must be > 0".toString());
        }
        if (!(i10 < length)) {
            throw new IllegalArgumentException("startOffset must be less than text length".toString());
        }
        if (!(i11 > i10)) {
            throw new IllegalArgumentException("endOffset must be greater than startOffset".toString());
        }
        if (!(i11 <= length)) {
            throw new IllegalArgumentException("endOffset must be smaller or equal to text length".toString());
        }
        if (!(fArr.length - i12 >= (i11 - i10) * 4)) {
            throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4".toString());
        }
        int lineForOffset = getLineForOffset(i10);
        int lineForOffset2 = getLineForOffset(i11 - 1);
        HorizontalPositionCache horizontalPositionCache = new HorizontalPositionCache(this);
        if (lineForOffset > lineForOffset2) {
            return;
        }
        int i14 = lineForOffset;
        int i15 = i12;
        while (true) {
            int lineStart = getLineStart(i14);
            int lineEnd = getLineEnd(i14);
            int iMin = Math.min(i11, lineEnd);
            float lineTop = getLineTop(i14);
            float lineBottom = getLineBottom(i14);
            int i16 = getParagraphDirection(i14) == i13 ? i13 : 0;
            int i17 = i16 ^ 1;
            for (int iMax = Math.max(i10, lineStart); iMax < iMin; iMax++) {
                boolean zIsRtlCharAt = isRtlCharAt(iMax);
                if (i16 != 0 && !zIsRtlCharAt) {
                    secondaryDownstream = horizontalPositionCache.getPrimaryDownstream(iMax);
                    secondaryUpstream = horizontalPositionCache.getPrimaryUpstream(iMax + 1);
                } else if (i16 != 0 && zIsRtlCharAt) {
                    secondaryUpstream = horizontalPositionCache.getSecondaryDownstream(iMax);
                    secondaryDownstream = horizontalPositionCache.getSecondaryUpstream(iMax + 1);
                } else if (i17 == 0 || !zIsRtlCharAt) {
                    secondaryDownstream = horizontalPositionCache.getSecondaryDownstream(iMax);
                    secondaryUpstream = horizontalPositionCache.getSecondaryUpstream(iMax + 1);
                } else {
                    secondaryUpstream = horizontalPositionCache.getPrimaryDownstream(iMax);
                    secondaryDownstream = horizontalPositionCache.getPrimaryUpstream(iMax + 1);
                }
                fArr[i15] = secondaryDownstream;
                fArr[i15 + 1] = lineTop;
                fArr[i15 + 2] = secondaryUpstream;
                fArr[i15 + 3] = lineBottom;
                i15 += 4;
            }
            if (i14 == lineForOffset2) {
                return;
            }
            i14++;
            i13 = 1;
        }
    }

    /* JADX INFO: renamed from: getBottomPadding$ui_text_release, reason: from getter */
    public final int getBottomPadding() {
        return this.bottomPadding;
    }

    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final boolean getFallbackLineSpacing() {
        return this.fallbackLineSpacing;
    }

    public final int getHeight() {
        return (this.didExceedMaxLines ? this.layout.getLineBottom(this.lineCount - 1) : this.layout.getHeight()) + this.topPadding + this.bottomPadding;
    }

    public final boolean getIncludePadding() {
        return this.includePadding;
    }

    @NotNull
    public final Layout getLayout() {
        return this.layout;
    }

    @NotNull
    public final LayoutIntrinsics getLayoutIntrinsics() {
        return this.layoutIntrinsics;
    }

    public final float getLineAscent(int line) {
        return this.layout.getLineAscent(line);
    }

    public final float getLineBaseline(int line) {
        return this.topPadding + this.layout.getLineBaseline(line);
    }

    public final float getLineBottom(int line) {
        return this.topPadding + this.layout.getLineBottom(line) + (line == this.lineCount + (-1) ? this.bottomPadding : 0);
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    public final float getLineDescent(int line) {
        return this.layout.getLineDescent(line);
    }

    public final int getLineEllipsisCount(int lineIndex) {
        return this.layout.getEllipsisCount(lineIndex);
    }

    public final int getLineEllipsisOffset(int lineIndex) {
        return this.layout.getEllipsisStart(lineIndex);
    }

    public final int getLineEnd(int lineIndex) {
        return this.layout.getEllipsisStart(lineIndex) == 0 ? this.layout.getLineEnd(lineIndex) : this.layout.getText().length();
    }

    public final int getLineForOffset(int offset) {
        return this.layout.getLineForOffset(offset);
    }

    public final int getLineForVertical(int vertical) {
        return this.layout.getLineForVertical(this.topPadding + vertical);
    }

    public final float getLineHeight(int lineIndex) {
        return getLineBottom(lineIndex) - getLineTop(lineIndex);
    }

    public final float getLineLeft(int lineIndex) {
        return this.layout.getLineLeft(lineIndex);
    }

    public final float getLineRight(int lineIndex) {
        return this.layout.getLineRight(lineIndex);
    }

    public final int getLineStart(int lineIndex) {
        return this.layout.getLineStart(lineIndex);
    }

    public final float getLineTop(int line) {
        return this.layout.getLineTop(line) + (line == 0 ? 0 : this.topPadding);
    }

    public final int getLineVisibleEnd(int lineIndex) {
        if (this.layout.getEllipsisStart(lineIndex) == 0) {
            return this.layout.getLineVisibleEnd(lineIndex);
        }
        return this.layout.getEllipsisStart(lineIndex) + this.layout.getLineStart(lineIndex);
    }

    public final float getLineWidth(int lineIndex) {
        return this.layout.getLineWidth(lineIndex);
    }

    public final float getMaxIntrinsicWidth() {
        return this.layoutIntrinsics.getMaxIntrinsicWidth();
    }

    public final float getMinIntrinsicWidth() {
        return this.layoutIntrinsics.getMinIntrinsicWidth();
    }

    public final int getOffsetForHorizontal(int line, float horizontal) {
        return this.layout.getOffsetForHorizontal(line, horizontal);
    }

    public final int getParagraphDirection(int line) {
        return this.layout.getParagraphDirection(line);
    }

    public final float getPrimaryHorizontal(int offset, boolean upstream) {
        return getLayoutHelper().getHorizontalPosition(offset, true, upstream);
    }

    public final float getSecondaryHorizontal(int offset, boolean upstream) {
        return getLayoutHelper().getHorizontalPosition(offset, false, upstream);
    }

    public final void getSelectionPath(int i10, int i11, @NotNull Path path) {
        p.k(path, "dest");
        this.layout.getSelectionPath(i10, i11, path);
        if (this.topPadding == 0 || path.isEmpty()) {
            return;
        }
        path.offset(0.0f, this.topPadding);
    }

    @NotNull
    public final CharSequence getText() {
        CharSequence text = this.layout.getText();
        p.j(text, "layout.text");
        return text;
    }

    /* JADX INFO: renamed from: getTopPadding$ui_text_release, reason: from getter */
    public final int getTopPadding() {
        return this.topPadding;
    }

    public final boolean isEllipsisApplied(int lineIndex) {
        return this.layout.getEllipsisCount(lineIndex) > 0;
    }

    public final boolean isFallbackLinespacingApplied$ui_text_release() {
        return this.fallbackLineSpacing && !this.isBoringLayout && Build.VERSION.SDK_INT >= 28;
    }

    public final boolean isLineEllipsized(int lineIndex) {
        return this.layout.getEllipsisStart(lineIndex) != 0;
    }

    public final boolean isRtlCharAt(int offset) {
        return this.layout.isRtlCharAt(offset);
    }

    public final void paint(@NotNull Canvas canvas) {
        p.k(canvas, "canvas");
        int i10 = this.topPadding;
        if (i10 != 0) {
            canvas.translate(0.0f, i10);
        }
        this.layout.draw(canvas);
        int i11 = this.topPadding;
        if (i11 != 0) {
            canvas.translate(0.0f, (-1) * i11);
        }
    }
}
