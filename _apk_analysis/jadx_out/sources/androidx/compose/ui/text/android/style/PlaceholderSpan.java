package androidx.compose.ui.text.android.style;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: PlaceholderSpan.kt */
/* JADX INFO: loaded from: classes5.dex */
@InternalPlatformTextApi
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-B7\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u000e\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\u0006\u0010\u001b\u001a\u00020\u000e\u0012\u0006\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b+\u0010,J4\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0017JR\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0015\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t8\u0006@BX\u0086.¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R$\u0010$\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00068F@BX\u0086\u000e¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010\u001eR$\u0010&\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00068F@BX\u0086\u000e¢\u0006\f\n\u0004\b&\u0010\u0018\u001a\u0004\b'\u0010\u001eR\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006."}, d2 = {"Landroidx/compose/ui/text/android/style/PlaceholderSpan;", "Landroid/text/style/ReplacementSpan;", "Landroid/graphics/Paint;", "paint", "", "text", "", "start", "end", "Landroid/graphics/Paint$FontMetricsInt;", "fm", "getSize", "Landroid/graphics/Canvas;", "canvas", "", VastAttributes.HORIZONTAL_POSITION, "top", VastAttributes.VERTICAL_POSITION, "bottom", "Lbn/r;", "draw", "width", "F", "widthUnit", "I", "height", "heightUnit", "pxPerSp", "verticalAlign", "getVerticalAlign", "()I", "<set-?>", "fontMetrics", "Landroid/graphics/Paint$FontMetricsInt;", "getFontMetrics", "()Landroid/graphics/Paint$FontMetricsInt;", "widthPx", "getWidthPx", "heightPx", "getHeightPx", "", "isLaidOut", "Z", "<init>", "(FIFIFI)V", VastTagName.COMPANION, "ui-text_release"}, k = 1, mv = {1, 6, 0})
public final class PlaceholderSpan extends ReplacementSpan {
    public static final int ALIGN_ABOVE_BASELINE = 0;
    public static final int ALIGN_BOTTOM = 2;
    public static final int ALIGN_CENTER = 3;
    public static final int ALIGN_TEXT_BOTTOM = 5;
    public static final int ALIGN_TEXT_CENTER = 6;
    public static final int ALIGN_TEXT_TOP = 4;
    public static final int ALIGN_TOP = 1;
    public static final int UNIT_EM = 1;
    public static final int UNIT_SP = 0;
    public static final int UNIT_UNSPECIFIED = 2;
    private Paint.FontMetricsInt fontMetrics;
    private final float height;
    private int heightPx;
    private final int heightUnit;
    private boolean isLaidOut;
    private final float pxPerSp;
    private final int verticalAlign;
    private final float width;
    private int widthPx;
    private final int widthUnit;

    public PlaceholderSpan(float f10, int i10, float f11, int i11, float f12, int i12) {
        this.width = f10;
        this.widthUnit = i10;
        this.height = f11;
        this.heightUnit = i11;
        this.pxPerSp = f12;
        this.verticalAlign = i12;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NotNull Canvas canvas, @Nullable CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, @NotNull Paint paint) {
        p.k(canvas, "canvas");
        p.k(paint, "paint");
    }

    @NotNull
    public final Paint.FontMetricsInt getFontMetrics() {
        Paint.FontMetricsInt fontMetricsInt = this.fontMetrics;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        p.C("fontMetrics");
        return null;
    }

    public final int getHeightPx() {
        if (this.isLaidOut) {
            return this.heightPx;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    @Override // android.text.style.ReplacementSpan
    @SuppressLint({"DocumentExceptions"})
    public int getSize(@NotNull Paint paint, @Nullable CharSequence text, int start, int end, @Nullable Paint.FontMetricsInt fm2) {
        float f10;
        int iCeilToInt;
        p.k(paint, "paint");
        this.isLaidOut = true;
        float textSize = paint.getTextSize();
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        p.j(fontMetricsInt, "paint.fontMetricsInt");
        this.fontMetrics = fontMetricsInt;
        if (!(getFontMetrics().descent > getFontMetrics().ascent)) {
            throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.".toString());
        }
        int i10 = this.widthUnit;
        if (i10 == 0) {
            f10 = this.width * this.pxPerSp;
        } else {
            if (i10 != 1) {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            f10 = this.width * textSize;
        }
        this.widthPx = PlaceholderSpanKt.ceilToInt(f10);
        int i11 = this.heightUnit;
        if (i11 == 0) {
            iCeilToInt = PlaceholderSpanKt.ceilToInt(this.height * this.pxPerSp);
        } else {
            if (i11 != 1) {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            iCeilToInt = PlaceholderSpanKt.ceilToInt(this.height * textSize);
        }
        this.heightPx = iCeilToInt;
        if (fm2 != null) {
            fm2.ascent = getFontMetrics().ascent;
            fm2.descent = getFontMetrics().descent;
            fm2.leading = getFontMetrics().leading;
            switch (this.verticalAlign) {
                case 0:
                    if (fm2.ascent > (-getHeightPx())) {
                        fm2.ascent = -getHeightPx();
                    }
                    break;
                case 1:
                case 4:
                    if (fm2.ascent + getHeightPx() > fm2.descent) {
                        fm2.descent = fm2.ascent + getHeightPx();
                    }
                    break;
                case 2:
                case 5:
                    if (fm2.ascent > fm2.descent - getHeightPx()) {
                        fm2.ascent = fm2.descent - getHeightPx();
                    }
                    break;
                case 3:
                case 6:
                    if (fm2.descent - fm2.ascent < getHeightPx()) {
                        int heightPx = fm2.ascent - ((getHeightPx() - (fm2.descent - fm2.ascent)) / 2);
                        fm2.ascent = heightPx;
                        fm2.descent = heightPx + getHeightPx();
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Unknown verticalAlign.");
            }
            fm2.top = Math.min(getFontMetrics().top, fm2.ascent);
            fm2.bottom = Math.max(getFontMetrics().bottom, fm2.descent);
        }
        return getWidthPx();
    }

    public final int getVerticalAlign() {
        return this.verticalAlign;
    }

    public final int getWidthPx() {
        if (this.isLaidOut) {
            return this.widthPx;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }
}
