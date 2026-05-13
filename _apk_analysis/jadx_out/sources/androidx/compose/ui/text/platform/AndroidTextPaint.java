package androidx.compose.ui.text.platform;

import android.text.TextPaint;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.text.style.TextDecoration;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: AndroidTextPaint.android.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u001b\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0014\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R!\u0010\u0018\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/ui/text/platform/AndroidTextPaint;", "Landroid/text/TextPaint;", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "Lbn/r;", "setTextDecoration", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "setShadow", "Landroidx/compose/ui/graphics/Color;", "color", "setColor-8_81llA", "(J)V", "setColor", "Landroidx/compose/ui/graphics/Brush;", "brush", "Landroidx/compose/ui/geometry/Size;", "size", "setBrush-d16Qtg0", "(Landroidx/compose/ui/graphics/Brush;J)V", "setBrush", "Landroidx/compose/ui/text/style/TextDecoration;", "Landroidx/compose/ui/graphics/Shadow;", "Landroidx/compose/ui/graphics/Brush;", "brushSize", "Landroidx/compose/ui/geometry/Size;", "", "flags", "", "density", "<init>", "(IF)V", "ui-text_release"}, k = 1, mv = {1, 6, 0})
public final class AndroidTextPaint extends TextPaint {

    @Nullable
    private Brush brush;

    @Nullable
    private Size brushSize;

    @NotNull
    private Shadow shadow;

    @NotNull
    private TextDecoration textDecoration;

    public AndroidTextPaint(int i10, float f10) {
        super(i10);
        ((TextPaint) this).density = f10;
        this.textDecoration = TextDecoration.INSTANCE.getNone();
        this.shadow = Shadow.INSTANCE.getNone();
    }

    /* JADX INFO: renamed from: setBrush-d16Qtg0, reason: not valid java name */
    public final void m3666setBrushd16Qtg0(@Nullable Brush brush, long size) {
        if (brush == null) {
            setShader(null);
            return;
        }
        if (p.f(this.brush, brush)) {
            Size size2 = this.brushSize;
            if (size2 == null ? false : Size.m1448equalsimpl0(size2.getPackedValue(), size)) {
                return;
            }
        }
        this.brush = brush;
        this.brushSize = Size.m1440boximpl(size);
        if (brush instanceof SolidColor) {
            setShader(null);
            m3667setColor8_81llA(((SolidColor) brush).getValue());
        } else if (brush instanceof ShaderBrush) {
            if (size != Size.INSTANCE.m1460getUnspecifiedNHjbRc()) {
                setShader(((ShaderBrush) brush).mo1588createShaderuvyYCjk(size));
            }
        }
    }

    /* JADX INFO: renamed from: setColor-8_81llA, reason: not valid java name */
    public final void m3667setColor8_81llA(long color) {
        int iM1674toArgb8_81llA;
        if (!(color != Color.INSTANCE.m1655getUnspecified0d7_KjU()) || getColor() == (iM1674toArgb8_81llA = ColorKt.m1674toArgb8_81llA(color))) {
            return;
        }
        setColor(iM1674toArgb8_81llA);
    }

    public final void setShadow(@Nullable Shadow shadow) {
        if (shadow == null) {
            shadow = Shadow.INSTANCE.getNone();
        }
        if (p.f(this.shadow, shadow)) {
            return;
        }
        this.shadow = shadow;
        if (p.f(shadow, Shadow.INSTANCE.getNone())) {
            clearShadowLayer();
        } else {
            setShadowLayer(this.shadow.getBlurRadius(), Offset.m1383getXimpl(this.shadow.getOffset()), Offset.m1384getYimpl(this.shadow.getOffset()), ColorKt.m1674toArgb8_81llA(this.shadow.getColor()));
        }
    }

    public final void setTextDecoration(@Nullable TextDecoration textDecoration) {
        if (textDecoration == null) {
            textDecoration = TextDecoration.INSTANCE.getNone();
        }
        if (p.f(this.textDecoration, textDecoration)) {
            return;
        }
        this.textDecoration = textDecoration;
        TextDecoration.Companion companion = TextDecoration.INSTANCE;
        setUnderlineText(textDecoration.contains(companion.getUnderline()));
        setStrikeThruText(this.textDecoration.contains(companion.getLineThrough()));
    }
}
