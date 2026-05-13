package androidx.compose.ui.platform;

import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bb\u0018\u00002\u00020\u0001J%\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0002\u0082\u0002\u0011\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/CalculateMatrixToWindow;", "", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroidx/compose/ui/graphics/Matrix;", "matrix", "Lbn/r;", "calculateMatrixToWindow-EL8BTi8", "(Landroid/view/View;[F)V", "calculateMatrixToWindow", "ui_release"}, k = 1, mv = {1, 6, 0})
interface CalculateMatrixToWindow {
    /* JADX INFO: renamed from: calculateMatrixToWindow-EL8BTi8, reason: not valid java name */
    void mo3307calculateMatrixToWindowEL8BTi8(@NotNull View view, @NotNull float[] matrix);
}
