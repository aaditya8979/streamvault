package com.yandex.div.core.view2.divs.tabs;

import android.view.View;
import com.yandex.div2.Div;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DivTabsAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
final class TabModel {

    @NotNull
    private final Div div;
    private final int index;

    @NotNull
    private final View view;

    public TabModel(int i10, @NotNull Div div, @NotNull View view) {
        this.index = i10;
        this.div = div;
        this.view = view;
    }

    @NotNull
    public final Div getDiv() {
        return this.div;
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }
}
