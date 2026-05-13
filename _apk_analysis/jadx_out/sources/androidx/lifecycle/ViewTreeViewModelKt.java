package androidx.lifecycle;

import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import tn.p;

/* JADX INFO: compiled from: ViewTreeViewModel.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewTreeViewModelKt {
    public static final /* synthetic */ ViewModelStoreOwner findViewTreeViewModelStoreOwner(View view) {
        p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        return ViewTreeViewModelStoreOwner.get(view);
    }
}
