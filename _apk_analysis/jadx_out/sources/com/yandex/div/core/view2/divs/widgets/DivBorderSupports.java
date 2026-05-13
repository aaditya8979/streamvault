package com.yandex.div.core.view2.divs.widgets;

import android.view.View;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div2.DivBorder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivBorderSupports.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface DivBorderSupports {
    @Nullable
    DivBorderDrawer getDivBorderDrawer();

    boolean getNeedClipping();

    default void invalidateBorder() {
        DivBorderDrawer divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer != null) {
            divBorderDrawer.invalidateBorder();
        }
    }

    default void onBoundsChanged(int i10, int i11) {
        DivBorderDrawer divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer != null) {
            divBorderDrawer.onBoundsChanged(i10, i11);
        }
    }

    default void releaseBorderDrawer() {
        DivBorderDrawer divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer != null) {
            divBorderDrawer.release();
        }
    }

    void setBorder(@NotNull BindingContext bindingContext, @Nullable DivBorder divBorder, @NotNull View view);

    void setNeedClipping(boolean z10);
}
