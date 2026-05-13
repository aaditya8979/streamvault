package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;

/* JADX INFO: compiled from: TextDrawStyle.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0006\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u0005\u001a\u00020\u0002HÂ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u001d\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u001d\u0010\u0014\u001a\u00020\u00028VX\u0096\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0004R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/text/style/ColorStyle;", "Landroidx/compose/ui/text/style/TextDrawStyle;", "Landroidx/compose/ui/graphics/Color;", "component1-0d7_KjU", "()J", "component1", "value", "copy-8_81llA", "(J)Landroidx/compose/ui/text/style/ColorStyle;", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "J", "getColor-0d7_KjU", "color", "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "brush", "<init>", "(JLtn/i;)V", "ui-text_release"}, k = 1, mv = {1, 6, 0})
final /* data */ class ColorStyle implements TextDrawStyle {
    private final long value;

    private ColorStyle(long j10) {
        this.value = j10;
        if (!(j10 != Color.INSTANCE.m1655getUnspecified0d7_KjU())) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextDrawStyle.Unspecified instead.".toString());
        }
    }

    public /* synthetic */ ColorStyle(long j10, i iVar) {
        this(j10);
    }

    /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    private final long getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: copy-8_81llA$default, reason: not valid java name */
    public static /* synthetic */ ColorStyle m3699copy8_81llA$default(ColorStyle colorStyle, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = colorStyle.value;
        }
        return colorStyle.m3700copy8_81llA(j10);
    }

    @NotNull
    /* JADX INFO: renamed from: copy-8_81llA, reason: not valid java name */
    public final ColorStyle m3700copy8_81llA(long value) {
        return new ColorStyle(value, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ColorStyle) && Color.m1620equalsimpl0(this.value, ((ColorStyle) other).value);
    }

    @Override // androidx.compose.ui.text.style.TextDrawStyle
    @Nullable
    public Brush getBrush() {
        return null;
    }

    @Override // androidx.compose.ui.text.style.TextDrawStyle
    /* JADX INFO: renamed from: getColor-0d7_KjU */
    public long mo3697getColor0d7_KjU() {
        return this.value;
    }

    public int hashCode() {
        return Color.m1626hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return "ColorStyle(value=" + ((Object) Color.m1627toStringimpl(this.value)) + ')';
    }
}
