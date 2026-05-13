package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.viewmodel.R;
import ao.r;
import com.mbridge.msdk.MBridgeConstans;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: ViewTreeViewModelStoreOwner.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewTreeViewModelStoreOwner {
    @Nullable
    public static final ViewModelStoreOwner get(@NotNull View view) {
        p.k(view, "<this>");
        return (ViewModelStoreOwner) SequencesKt___SequencesKt.D(SequencesKt___SequencesKt.L(r.n(view, new l<View, View>() { // from class: androidx.lifecycle.ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1
            @Override // sn.l
            @Nullable
            public final View invoke(@NotNull View view2) {
                p.k(view2, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
                Object parent = view2.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            }
        }), new l<View, ViewModelStoreOwner>() { // from class: androidx.lifecycle.ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2
            @Override // sn.l
            @Nullable
            public final ViewModelStoreOwner invoke(@NotNull View view2) {
                p.k(view2, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
                Object tag = view2.getTag(R.id.view_tree_view_model_store_owner);
                if (tag instanceof ViewModelStoreOwner) {
                    return (ViewModelStoreOwner) tag;
                }
                return null;
            }
        }));
    }

    public static final void set(@NotNull View view, @Nullable ViewModelStoreOwner viewModelStoreOwner) {
        p.k(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, viewModelStoreOwner);
    }
}
