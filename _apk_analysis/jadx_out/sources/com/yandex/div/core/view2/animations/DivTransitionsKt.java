package com.yandex.div.core.view2.animations;

import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivData;
import com.yandex.div2.DivState;
import com.yandex.div2.DivTransitionSelector;
import com.yandex.div2.DivTransitionTrigger;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DivTransitions.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivTransitionsKt {

    /* JADX INFO: compiled from: DivTransitions.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivTransitionSelector.values().length];
            try {
                iArr[DivTransitionSelector.DATA_CHANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivTransitionSelector.ANY_CHANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivTransitionSelector.STATE_CHANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean allowsTransitionsOnDataChange(@NotNull DivData divData, @NotNull ExpressionResolver expressionResolver) {
        return allowsTransitionsOnDataChange(divData.f55084e.evaluate(expressionResolver));
    }

    public static final boolean allowsTransitionsOnDataChange(@NotNull DivTransitionSelector divTransitionSelector) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[divTransitionSelector.ordinal()];
        return i10 == 1 || i10 == 2;
    }

    public static final boolean allowsTransitionsOnDataChange(@NotNull List<? extends DivTransitionTrigger> list) {
        return list.contains(DivTransitionTrigger.DATA_CHANGE);
    }

    public static final boolean allowsTransitionsOnStateChange(@NotNull DivState divState, @NotNull ExpressionResolver expressionResolver) {
        return allowsTransitionsOnStateChange(divState.L.evaluate(expressionResolver));
    }

    public static final boolean allowsTransitionsOnStateChange(@NotNull DivTransitionSelector divTransitionSelector) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[divTransitionSelector.ordinal()];
        return i10 == 2 || i10 == 3;
    }

    public static final boolean allowsTransitionsOnStateChange(@NotNull List<? extends DivTransitionTrigger> list) {
        return list.contains(DivTransitionTrigger.STATE_CHANGE);
    }

    public static final boolean allowsTransitionsOnVisibilityChange(@NotNull List<? extends DivTransitionTrigger> list) {
        return list.contains(DivTransitionTrigger.VISIBILITY_CHANGE);
    }
}
