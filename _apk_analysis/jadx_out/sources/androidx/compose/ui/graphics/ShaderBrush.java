package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: Brush.kt */
/* JADX INFO: loaded from: classes10.dex */
@Immutable
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\b\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/graphics/Brush;", "Landroidx/compose/ui/geometry/Size;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "createShader", "Landroidx/compose/ui/graphics/Paint;", "p", "", "alpha", "Lbn/r;", "applyTo-Pq9zytI", "(JLandroidx/compose/ui/graphics/Paint;F)V", "applyTo", "internalShader", "Landroid/graphics/Shader;", "createdSize", "J", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 6, 0})
public abstract class ShaderBrush extends Brush {
    private long createdSize;

    @Nullable
    private Shader internalShader;

    public ShaderBrush() {
        super(null);
        this.createdSize = Size.INSTANCE.m1460getUnspecifiedNHjbRc();
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* JADX INFO: renamed from: applyTo-Pq9zytI */
    public final void mo1566applyToPq9zytI(long size, @NotNull Paint p10, float alpha) {
        p.k(p10, "p");
        Shader shaderMo1588createShaderuvyYCjk = this.internalShader;
        if (shaderMo1588createShaderuvyYCjk == null || !Size.m1448equalsimpl0(this.createdSize, size)) {
            shaderMo1588createShaderuvyYCjk = mo1588createShaderuvyYCjk(size);
            this.internalShader = shaderMo1588createShaderuvyYCjk;
            this.createdSize = size;
        }
        long jMo1497getColor0d7_KjU = p10.mo1497getColor0d7_KjU();
        Color.Companion companion = Color.INSTANCE;
        if (!Color.m1620equalsimpl0(jMo1497getColor0d7_KjU, companion.m1645getBlack0d7_KjU())) {
            p10.mo1503setColor8_81llA(companion.m1645getBlack0d7_KjU());
        }
        if (!p.f(p10.getShader(), shaderMo1588createShaderuvyYCjk)) {
            p10.setShader(shaderMo1588createShaderuvyYCjk);
        }
        if (p10.getAlpha() == alpha) {
            return;
        }
        p10.setAlpha(alpha);
    }

    @NotNull
    /* JADX INFO: renamed from: createShader-uvyYCjk */
    public abstract Shader mo1588createShaderuvyYCjk(long size);
}
