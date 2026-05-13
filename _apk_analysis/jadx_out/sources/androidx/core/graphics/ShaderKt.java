package androidx.core.graphics;

import android.graphics.Matrix;
import android.graphics.Shader;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Shader.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class ShaderKt {
    public static final void transform(@NotNull Shader shader, @NotNull sn.l<? super Matrix, bn.r> lVar) {
        Matrix matrix = new Matrix();
        shader.getLocalMatrix(matrix);
        lVar.invoke(matrix);
        shader.setLocalMatrix(matrix);
    }
}
