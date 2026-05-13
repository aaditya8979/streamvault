package androidx.lifecycle;

import android.view.View;
import tn.p;

/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewKt {
    public static final /* synthetic */ LifecycleOwner findViewTreeLifecycleOwner(View view) {
        p.k(view, "<this>");
        return ViewTreeLifecycleOwner.get(view);
    }
}
