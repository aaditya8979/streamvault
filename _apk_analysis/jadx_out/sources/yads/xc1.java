package yads;

import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public abstract class xc1 {
    public static uc1 a(View view, km kmVar) {
        return view.isInEditMode() ? new wc1() : new vc1(kmVar);
    }
}
