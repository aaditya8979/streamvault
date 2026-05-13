package androidx.savedstate;

import android.view.View;
import ao.r;
import com.mbridge.msdk.MBridgeConstans;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: ViewTreeSavedStateRegistryOwner.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewTreeSavedStateRegistryOwner {
    @Nullable
    public static final SavedStateRegistryOwner get(@NotNull View view) {
        p.k(view, "<this>");
        return (SavedStateRegistryOwner) SequencesKt___SequencesKt.D(SequencesKt___SequencesKt.L(r.n(view, new l<View, View>() { // from class: androidx.savedstate.ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$1
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
        }), new l<View, SavedStateRegistryOwner>() { // from class: androidx.savedstate.ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2
            @Override // sn.l
            @Nullable
            public final SavedStateRegistryOwner invoke(@NotNull View view2) {
                p.k(view2, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
                Object tag = view2.getTag(R.id.view_tree_saved_state_registry_owner);
                if (tag instanceof SavedStateRegistryOwner) {
                    return (SavedStateRegistryOwner) tag;
                }
                return null;
            }
        }));
    }

    public static final void set(@NotNull View view, @Nullable SavedStateRegistryOwner savedStateRegistryOwner) {
        p.k(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, savedStateRegistryOwner);
    }
}
