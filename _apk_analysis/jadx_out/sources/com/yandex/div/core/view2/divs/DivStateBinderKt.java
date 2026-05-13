package com.yandex.div.core.view2.divs;

import com.yandex.div2.DivAnimation;
import zn.n;

/* JADX INFO: compiled from: DivStateBinder.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivStateBinderKt {

    /* JADX INFO: compiled from: DivStateBinder.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivAnimation.Name.values().length];
            try {
                iArr[DivAnimation.Name.TRANSLATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivAnimation.Name.SCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivAnimation.Name.NO_ANIMATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final Float alphaValue(Double d10) {
        if (d10 != null) {
            return Float.valueOf(n.m((float) d10.doubleValue(), 0.0f, 1.0f));
        }
        return null;
    }

    private static final Float scaleValue(Double d10) {
        if (d10 != null) {
            return Float.valueOf(n.d((float) d10.doubleValue(), 0.0f));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.transition.Transition toTransition(com.yandex.div2.DivAnimation r10, boolean r11, com.yandex.div.json.expressions.ExpressionResolver r12) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivStateBinderKt.toTransition(com.yandex.div2.DivAnimation, boolean, com.yandex.div.json.expressions.ExpressionResolver):androidx.transition.Transition");
    }

    private static final Float translateValue(Double d10) {
        if (d10 != null) {
            return Float.valueOf(n.m((float) d10.doubleValue(), -1.0f, 1.0f));
        }
        return null;
    }
}
