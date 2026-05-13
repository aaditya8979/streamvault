package com.yandex.div.internal.widget.indicator.animations;

import com.yandex.div.internal.widget.indicator.IndicatorParams$Animation;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Style;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: IndicatorAnimator.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class IndicatorAnimatorKt {

    /* JADX INFO: compiled from: IndicatorAnimator.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IndicatorParams$Animation.values().length];
            try {
                iArr[IndicatorParams$Animation.SCALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IndicatorParams$Animation.WORM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IndicatorParams$Animation.SLIDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final IndicatorAnimator getIndicatorAnimator(@NotNull IndicatorParams$Style indicatorParams$Style) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[indicatorParams$Style.getAnimation().ordinal()];
        if (i10 == 1) {
            return new ScaleIndicatorAnimator(indicatorParams$Style);
        }
        if (i10 == 2) {
            return new WormIndicatorAnimator(indicatorParams$Style);
        }
        if (i10 == 3) {
            return new SliderIndicatorAnimator(indicatorParams$Style);
        }
        throw new NoWhenBranchMatchedException();
    }
}
