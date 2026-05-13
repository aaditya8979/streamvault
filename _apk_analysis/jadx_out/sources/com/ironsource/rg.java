package com.ironsource;

import android.graphics.Rect;
import android.view.View;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class rg {
    public static final boolean a(@NotNull View view, @NotNull Rect rect) {
        tn.p.k(view, "<this>");
        tn.p.k(rect, "rect");
        return view.isShown() && view.hasWindowFocus() && view.getGlobalVisibleRect(rect);
    }
}
