package androidx.compose.ui.text.platform.style;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ShaderBrush;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: ShaderBrushSpan.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR-\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/platform/style/ShaderBrushSpan;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "Landroid/text/TextPaint;", "textPaint", "Lbn/r;", "updateDrawState", "Landroidx/compose/ui/graphics/ShaderBrush;", "shaderBrush", "Landroidx/compose/ui/graphics/ShaderBrush;", "getShaderBrush", "()Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/geometry/Size;", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-VsRJwc0", "()Landroidx/compose/ui/geometry/Size;", "setSize-iaC8Vc4", "(Landroidx/compose/ui/geometry/Size;)V", "<init>", "(Landroidx/compose/ui/graphics/ShaderBrush;)V", "ui-text_release"}, k = 1, mv = {1, 6, 0})
public final class ShaderBrushSpan extends CharacterStyle implements UpdateAppearance {

    @NotNull
    private final ShaderBrush shaderBrush;

    @Nullable
    private Size size;

    public ShaderBrushSpan(@NotNull ShaderBrush shaderBrush) {
        p.k(shaderBrush, "shaderBrush");
        this.shaderBrush = shaderBrush;
    }

    @NotNull
    public final ShaderBrush getShaderBrush() {
        return this.shaderBrush;
    }

    @Nullable
    /* JADX INFO: renamed from: getSize-VsRJwc0, reason: not valid java name and from getter */
    public final Size getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: setSize-iaC8Vc4, reason: not valid java name */
    public final void m3682setSizeiaC8Vc4(@Nullable Size size) {
        this.size = size;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@Nullable TextPaint textPaint) {
        Size size;
        if (textPaint == null || (size = this.size) == null) {
            return;
        }
        textPaint.setShader(this.shaderBrush.mo1588createShaderuvyYCjk(size.getPackedValue()));
    }
}
