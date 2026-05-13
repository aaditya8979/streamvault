package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.SpanStyleKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: TextDrawStyle.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"lerp", "Landroidx/compose/ui/text/style/TextDrawStyle;", "start", "stop", "fraction", "", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class TextDrawStyleKt {
    @NotNull
    public static final TextDrawStyle lerp(@NotNull TextDrawStyle textDrawStyle, @NotNull TextDrawStyle textDrawStyle2, float f10) {
        p.k(textDrawStyle, "start");
        p.k(textDrawStyle2, "stop");
        return ((textDrawStyle instanceof BrushStyle) || (textDrawStyle2 instanceof BrushStyle)) ? (TextDrawStyle) SpanStyleKt.lerpDiscrete(textDrawStyle, textDrawStyle2, f10) : TextDrawStyle.INSTANCE.m3752from8_81llA(ColorKt.m1671lerpjxsXWHM(textDrawStyle.mo3697getColor0d7_KjU(), textDrawStyle2.mo3697getColor0d7_KjU(), f10));
    }
}
