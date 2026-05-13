package androidx.compose.ui.graphics.colorspace;

import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;
import tn.t;

/* JADX INFO: compiled from: ColorSpace.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\b&\u0018\u0000 ,2\u00020\u0001:\u0001,B$\b\u0000\u0012\u0006\u0010\u0017\u001a\u00020\u0011\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010 \u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b)\u0010*B\u001c\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0011\u0012\u0006\u0010\u001c\u001a\u00020\u001bø\u0001\u0000¢\u0006\u0004\b)\u0010+J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&J\u001e\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0017\u0010\u0017\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\u00020\u001b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0011\u0010%\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b$\u0010#R\u0014\u0010&\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010'\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006-"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "", "component", "", "getMinValue", "getMaxValue", "r", "g", "b", "", "toXyz", "v", VastAttributes.HORIZONTAL_POSITION, VastAttributes.VERTICAL_POSITION, "z", "fromXyz", "", "toString", "other", "", "equals", "hashCode", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Landroidx/compose/ui/graphics/colorspace/ColorModel;", "model", "J", "getModel-xdoWZVw", "()J", "id", "I", "getId$ui_graphics_release", "()I", "getComponentCount", "componentCount", "isWideGamut", "()Z", "isSrgb", "<init>", "(Ljava/lang/String;JILtn/i;)V", "(Ljava/lang/String;JLtn/i;)V", VastTagName.COMPANION, "ui-graphics_release"}, k = 1, mv = {1, 6, 0})
public abstract class ColorSpace {
    public static final int MaxId = 63;
    public static final int MinId = -1;
    private final int id;
    private final long model;

    @NotNull
    private final String name;

    private ColorSpace(String str, long j10) {
        this(str, j10, -1, null);
    }

    private ColorSpace(String str, long j10, int i10) {
        this.name = str;
        this.model = j10;
        this.id = i10;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i10 < -1 || i10 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public /* synthetic */ ColorSpace(String str, long j10, int i10, i iVar) {
        this(str, j10, i10);
    }

    public /* synthetic */ ColorSpace(String str, long j10, i iVar) {
        this(str, j10);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !p.f(t.b(getClass()), t.b(other.getClass()))) {
            return false;
        }
        ColorSpace colorSpace = (ColorSpace) other;
        if (this.id == colorSpace.id && p.f(this.name, colorSpace.name)) {
            return ColorModel.m1977equalsimpl0(this.model, colorSpace.model);
        }
        return false;
    }

    @NotNull
    public final float[] fromXyz(float x10, float y10, float z10) {
        float[] fArr = new float[ColorModel.m1978getComponentCountimpl(this.model)];
        fArr[0] = x10;
        fArr[1] = y10;
        fArr[2] = z10;
        return fromXyz(fArr);
    }

    @NotNull
    public abstract float[] fromXyz(@NotNull float[] v10);

    public final int getComponentCount() {
        return ColorModel.m1978getComponentCountimpl(this.model);
    }

    /* JADX INFO: renamed from: getId$ui_graphics_release, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public abstract float getMaxValue(int component);

    public abstract float getMinValue(int component);

    /* JADX INFO: renamed from: getModel-xdoWZVw, reason: not valid java name and from getter */
    public final long getModel() {
        return this.model;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + ColorModel.m1979hashCodeimpl(this.model)) * 31) + this.id;
    }

    public boolean isSrgb() {
        return false;
    }

    public abstract boolean isWideGamut();

    @NotNull
    public String toString() {
        return this.name + " (id=" + this.id + ", model=" + ((Object) ColorModel.m1980toStringimpl(this.model)) + ')';
    }

    @NotNull
    public final float[] toXyz(float r10, float g10, float b10) {
        return toXyz(new float[]{r10, g10, b10});
    }

    @NotNull
    public abstract float[] toXyz(@NotNull float[] v10);
}
