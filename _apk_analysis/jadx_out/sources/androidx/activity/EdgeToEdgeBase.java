package androidx.activity;

import android.view.View;
import android.view.Window;
import com.mbridge.msdk.MBridgeConstans;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EdgeToEdge.kt */
/* JADX INFO: loaded from: classes2.dex */
class EdgeToEdgeBase implements EdgeToEdgeImpl {
    @Override // androidx.activity.EdgeToEdgeImpl
    public void adjustLayoutInDisplayCutoutMode(@NotNull Window window) {
        tn.p.k(window, "window");
    }

    @Override // androidx.activity.EdgeToEdgeImpl
    public void setUp(@NotNull SystemBarStyle systemBarStyle, @NotNull SystemBarStyle systemBarStyle2, @NotNull Window window, @NotNull View view, boolean z10, boolean z11) {
        tn.p.k(systemBarStyle, "statusBarStyle");
        tn.p.k(systemBarStyle2, "navigationBarStyle");
        tn.p.k(window, "window");
        tn.p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
    }
}
