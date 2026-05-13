package androidx.compose.ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: PaintExtensions.kt */
/* JADX INFO: loaded from: classes11.dex */
@RequiresApi(29)
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/android/Paint29;", "", "Landroid/graphics/Paint;", "paint", "", "text", "", "start", "end", "Landroid/graphics/Rect;", "rect", "Lbn/r;", "getTextBounds", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 6, 0})
final class Paint29 {

    @NotNull
    public static final Paint29 INSTANCE = new Paint29();

    private Paint29() {
    }

    @DoNotInline
    public static final void getTextBounds(@NotNull Paint paint, @NotNull CharSequence charSequence, int i10, int i11, @NotNull Rect rect) {
        p.k(paint, "paint");
        p.k(charSequence, "text");
        p.k(rect, "rect");
        paint.getTextBounds(charSequence, i10, i11, rect);
    }
}
