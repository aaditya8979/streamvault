package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import androidx.annotation.IntRange;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: LineHeightStyleSpan.kt */
/* JADX INFO: loaded from: classes4.dex */
@InternalPlatformTextApi
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\f\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\b\b\u0001\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J8\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0016\u0010\u001a\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0013R\u0016\u0010\u001b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013R\u0016\u0010\u001c\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0013R\u0016\u0010\u001d\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0013R$\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010!R$\u0010\"\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010!¨\u0006&"}, d2 = {"Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "Landroid/text/style/LineHeightSpan;", "Landroid/graphics/Paint$FontMetricsInt;", "fontMetricsInt", "Lbn/r;", "calculateTargetMetrics", "", "text", "", "start", "end", "spanStartVertical", "lineHeight", "chooseHeight", "", "F", "getLineHeight", "()F", "startIndex", "I", "endIndex", "", "trimFirstLineTop", "Z", "trimLastLineBottom", "topPercentage", "firstAscent", "ascent", "descent", "lastDescent", "<set-?>", "firstAscentDiff", "getFirstAscentDiff", "()I", "lastDescentDiff", "getLastDescentDiff", "<init>", "(FIIZZI)V", "ui-text_release"}, k = 1, mv = {1, 6, 0})
public final class LineHeightStyleSpan implements android.text.style.LineHeightSpan {
    private int ascent;
    private int descent;
    private final int endIndex;
    private int firstAscent;
    private int firstAscentDiff;
    private int lastDescent;
    private int lastDescentDiff;
    private final float lineHeight;
    private final int startIndex;
    private final int topPercentage;
    private final boolean trimFirstLineTop;
    private final boolean trimLastLineBottom;

    public LineHeightStyleSpan(float f10, int i10, int i11, boolean z10, boolean z11, @IntRange(from = 0, to = 100) int i12) {
        this.lineHeight = f10;
        this.startIndex = i10;
        this.endIndex = i11;
        this.trimFirstLineTop = z10;
        this.trimLastLineBottom = z11;
        this.topPercentage = i12;
        boolean z12 = true;
        if (!(i12 >= 0 && i12 < 101) && i12 != -1) {
            z12 = false;
        }
        if (!z12) {
            throw new IllegalStateException("topRatio should be in [0..100] range or -1".toString());
        }
    }

    private final void calculateTargetMetrics(Paint.FontMetricsInt fontMetricsInt) {
        int iCeil = (int) Math.ceil(this.lineHeight);
        int iLineHeight = iCeil - LineHeightStyleSpanKt.lineHeight(fontMetricsInt);
        int iAbs = this.topPercentage;
        if (iAbs == -1) {
            iAbs = (int) ((Math.abs(fontMetricsInt.ascent) / LineHeightStyleSpanKt.lineHeight(fontMetricsInt)) * 100.0f);
        }
        int iCeil2 = (int) (iLineHeight <= 0 ? Math.ceil((iLineHeight * iAbs) / 100.0f) : Math.ceil((iLineHeight * (100 - iAbs)) / 100.0f));
        int i10 = fontMetricsInt.descent;
        int i11 = iCeil2 + i10;
        this.descent = i11;
        int i12 = i11 - iCeil;
        this.ascent = i12;
        if (this.trimFirstLineTop) {
            i12 = fontMetricsInt.ascent;
        }
        this.firstAscent = i12;
        if (this.trimLastLineBottom) {
            i11 = i10;
        }
        this.lastDescent = i11;
        this.firstAscentDiff = fontMetricsInt.ascent - i12;
        this.lastDescentDiff = i11 - i10;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(@NotNull CharSequence charSequence, int i10, int i11, int i12, int i13, @NotNull Paint.FontMetricsInt fontMetricsInt) {
        p.k(charSequence, "text");
        p.k(fontMetricsInt, "fontMetricsInt");
        if (LineHeightStyleSpanKt.lineHeight(fontMetricsInt) <= 0) {
            return;
        }
        boolean z10 = i10 == this.startIndex;
        boolean z11 = i11 == this.endIndex;
        if (z10 && z11 && this.trimFirstLineTop && this.trimLastLineBottom) {
            return;
        }
        if (z10) {
            calculateTargetMetrics(fontMetricsInt);
        }
        fontMetricsInt.ascent = z10 ? this.firstAscent : this.ascent;
        fontMetricsInt.descent = z11 ? this.lastDescent : this.descent;
    }

    public final int getFirstAscentDiff() {
        return this.firstAscentDiff;
    }

    public final int getLastDescentDiff() {
        return this.lastDescentDiff;
    }

    public final float getLineHeight() {
        return this.lineHeight;
    }
}
