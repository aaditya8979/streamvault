package com.yandex.div.core.util;

import android.view.View;
import android.widget.PopupWindow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SafePopupWindow.kt */
/* JADX INFO: loaded from: classes9.dex */
public class SafePopupWindow extends PopupWindow {
    public SafePopupWindow(@NotNull View view, int i10, int i11, boolean z10) {
        super(view, i10, i11, z10);
    }

    @Override // android.widget.PopupWindow
    public void setContentView(@Nullable View view) {
        if (view != null) {
            view.setFilterTouchesWhenObscured(true);
        }
        super.setContentView(view);
    }
}
