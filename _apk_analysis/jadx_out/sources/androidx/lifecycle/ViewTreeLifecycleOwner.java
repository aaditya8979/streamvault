package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.runtime.R;
import ao.r;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: ViewTreeLifecycleOwner.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewTreeLifecycleOwner {
    @Nullable
    public static final LifecycleOwner get(@NotNull View view) {
        p.k(view, "<this>");
        return (LifecycleOwner) SequencesKt___SequencesKt.D(SequencesKt___SequencesKt.L(r.n(view, new l<View, View>() { // from class: androidx.lifecycle.ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1
            @Override // sn.l
            @Nullable
            public final View invoke(@NotNull View view2) {
                p.k(view2, "currentView");
                Object parent = view2.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            }
        }), new l<View, LifecycleOwner>() { // from class: androidx.lifecycle.ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2
            @Override // sn.l
            @Nullable
            public final LifecycleOwner invoke(@NotNull View view2) {
                p.k(view2, "viewParent");
                Object tag = view2.getTag(R.id.view_tree_lifecycle_owner);
                if (tag instanceof LifecycleOwner) {
                    return (LifecycleOwner) tag;
                }
                return null;
            }
        }));
    }

    public static final void set(@NotNull View view, @Nullable LifecycleOwner lifecycleOwner) {
        p.k(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, lifecycleOwner);
    }
}
