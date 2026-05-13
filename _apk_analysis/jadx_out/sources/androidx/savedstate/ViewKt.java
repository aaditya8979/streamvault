package androidx.savedstate;

import android.view.View;
import tn.p;

/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ViewKt {
    public static final /* synthetic */ SavedStateRegistryOwner findViewTreeSavedStateRegistryOwner(View view) {
        p.k(view, "<this>");
        return ViewTreeSavedStateRegistryOwner.get(view);
    }
}
