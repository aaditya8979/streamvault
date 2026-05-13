package com.yandex.div.internal.widget.indicator.forms;

import com.yandex.div.internal.widget.indicator.IndicatorParams$Shape;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Style;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SingleIndicatorDrawer.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class SingleIndicatorDrawerKt {
    @NotNull
    public static final SingleIndicatorDrawer getIndicatorDrawer(@NotNull IndicatorParams$Style indicatorParams$Style) {
        IndicatorParams$Shape activeShape = indicatorParams$Style.getActiveShape();
        if (activeShape instanceof IndicatorParams$Shape.RoundedRect) {
            return new RoundedRect(indicatorParams$Style);
        }
        if (activeShape instanceof IndicatorParams$Shape.Circle) {
            return new Circle(indicatorParams$Style);
        }
        throw new NoWhenBranchMatchedException();
    }
}
