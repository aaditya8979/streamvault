package com.yandex.div.internal.graphics;

import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.view2.Div2View;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: Colormap.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class ColormapKt {
    @NotNull
    public static final Colormap checkIsNotEmpty(@NotNull Colormap colormap, @NotNull Div2View div2View) {
        if (p.f(colormap, Colormap.EMPTY)) {
            DivActionTypedUtilsKt.logError(div2View, new IllegalStateException("Colors for linear gradient are not provided. Please check if 'colors' or 'color_map' properties are defined"));
        }
        return colormap;
    }
}
