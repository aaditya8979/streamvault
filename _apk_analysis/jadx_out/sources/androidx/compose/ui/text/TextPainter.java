package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: TextPainter.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/TextPainter;", "", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Lbn/r;", "paint", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 6, 0})
public final class TextPainter {

    @NotNull
    public static final TextPainter INSTANCE = new TextPainter();

    private TextPainter() {
    }

    public final void paint(@NotNull Canvas canvas, @NotNull TextLayoutResult textLayoutResult) {
        p.k(canvas, "canvas");
        p.k(textLayoutResult, "textLayoutResult");
        boolean z10 = textLayoutResult.getHasVisualOverflow() && TextOverflow.m3760equalsimpl0(textLayoutResult.getLayoutInput().getOverflow(), TextOverflow.INSTANCE.m3767getClipgIe3tQ8());
        if (z10) {
            Rect rectM1423Recttz77jQw = RectKt.m1423Recttz77jQw(Offset.INSTANCE.m1399getZeroF1C5BW0(), SizeKt.Size(IntSize.m3986getWidthimpl(textLayoutResult.getSize()), IntSize.m3985getHeightimpl(textLayoutResult.getSize())));
            canvas.save();
            Canvas.m1592clipRectmtrdDE$default(canvas, rectM1423Recttz77jQw, 0, 2, null);
        }
        try {
            Brush brush = textLayoutResult.getLayoutInput().getStyle().getBrush();
            if (brush != null) {
                textLayoutResult.getMultiParagraph().paint(canvas, brush, textLayoutResult.getLayoutInput().getStyle().getShadow(), textLayoutResult.getLayoutInput().getStyle().getTextDecoration());
            } else {
                textLayoutResult.getMultiParagraph().m3391paintRPmYEkk(canvas, textLayoutResult.getLayoutInput().getStyle().m3490getColor0d7_KjU(), textLayoutResult.getLayoutInput().getStyle().getShadow(), textLayoutResult.getLayoutInput().getStyle().getTextDecoration());
            }
        } finally {
            if (z10) {
                canvas.restore();
            }
        }
    }
}
