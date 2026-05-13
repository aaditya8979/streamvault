package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.Matrix;
import com.mbridge.msdk.MBridgeConstans;
import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000e\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0014\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\bR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/platform/CalculateMatrixToWindowApi21;", "Landroidx/compose/ui/platform/CalculateMatrixToWindow;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroidx/compose/ui/graphics/Matrix;", "matrix", "Lbn/r;", "transformMatrixToWindow-EL8BTi8", "(Landroid/view/View;[F)V", "transformMatrixToWindow", "Landroid/graphics/Matrix;", "other", "preConcat-tU-YjHk", "([FLandroid/graphics/Matrix;)V", "preConcat", "", VastAttributes.HORIZONTAL_POSITION, VastAttributes.VERTICAL_POSITION, "preTranslate-3XD1CNM", "([FFF)V", "preTranslate", "calculateMatrixToWindow-EL8BTi8", "calculateMatrixToWindow", "", "tmpLocation", "[I", "tmpMatrix", "[F", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 6, 0})
final class CalculateMatrixToWindowApi21 implements CalculateMatrixToWindow {

    @NotNull
    private final int[] tmpLocation = new int[2];

    @NotNull
    private final float[] tmpMatrix = Matrix.m1813constructorimpl$default(null, 1, null);

    /* JADX INFO: renamed from: preConcat-tU-YjHk, reason: not valid java name */
    private final void m3308preConcattUYjHk(float[] fArr, android.graphics.Matrix matrix) {
        AndroidMatrixConversions_androidKt.m1495setFromtUYjHk(this.tmpMatrix, matrix);
        AndroidComposeView_androidKt.m3303preTransformJiSxe2E(fArr, this.tmpMatrix);
    }

    /* JADX INFO: renamed from: preTranslate-3XD1CNM, reason: not valid java name */
    private final void m3309preTranslate3XD1CNM(float[] fArr, float f10, float f11) {
        Matrix.m1822resetimpl(this.tmpMatrix);
        Matrix.m1833translateimpl$default(this.tmpMatrix, f10, f11, 0.0f, 4, null);
        AndroidComposeView_androidKt.m3303preTransformJiSxe2E(fArr, this.tmpMatrix);
    }

    /* JADX INFO: renamed from: transformMatrixToWindow-EL8BTi8, reason: not valid java name */
    private final void m3310transformMatrixToWindowEL8BTi8(View view, float[] matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            m3310transformMatrixToWindowEL8BTi8((View) parent, matrix);
            m3309preTranslate3XD1CNM(matrix, -view.getScrollX(), -view.getScrollY());
            m3309preTranslate3XD1CNM(matrix, view.getLeft(), view.getTop());
        } else {
            view.getLocationInWindow(this.tmpLocation);
            m3309preTranslate3XD1CNM(matrix, -view.getScrollX(), -view.getScrollY());
            m3309preTranslate3XD1CNM(matrix, r0[0], r0[1]);
        }
        android.graphics.Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        tn.p.j(matrix2, "viewMatrix");
        m3308preConcattUYjHk(matrix, matrix2);
    }

    @Override // androidx.compose.ui.platform.CalculateMatrixToWindow
    /* JADX INFO: renamed from: calculateMatrixToWindow-EL8BTi8 */
    public void mo3307calculateMatrixToWindowEL8BTi8(@NotNull View view, @NotNull float[] matrix) {
        tn.p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        tn.p.k(matrix, "matrix");
        Matrix.m1822resetimpl(matrix);
        m3310transformMatrixToWindowEL8BTi8(view, matrix);
    }
}
