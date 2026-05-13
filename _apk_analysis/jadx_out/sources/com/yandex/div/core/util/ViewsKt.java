package com.yandex.div.core.util;

import android.view.View;
import androidx.core.view.ViewCompat;
import org.jetbrains.annotations.NotNull;
import zn.g;
import zn.n;

/* JADX INFO: compiled from: Views.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final View farthestLayoutCaller(View view) {
        View view2 = null;
        while (view != null) {
            if (!isActuallyLaidOut(view) || view.isLayoutRequested()) {
                view2 = view;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return view2;
    }

    @NotNull
    public static final g getIndices(@NotNull View view, int i10, int i11) {
        int i12 = i11 + i10;
        return isLayoutRtl(view) ? n.r(i12 - 1, i10) : n.v(i10, i12);
    }

    public static final boolean isActuallyLaidOut(@NotNull View view) {
        return view.getWidth() > 0 || view.getHeight() > 0;
    }

    public static final boolean isHierarchyLaidOut(@NotNull View view) {
        return farthestLayoutCaller(view) == null;
    }

    public static final boolean isLayoutRtl(@NotNull View view) {
        return ViewCompat.getLayoutDirection(view) == 1;
    }
}
