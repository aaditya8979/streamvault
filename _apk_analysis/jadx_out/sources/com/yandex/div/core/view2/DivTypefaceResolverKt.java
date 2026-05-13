package com.yandex.div.core.view2;

import android.graphics.Typeface;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div2.DivFontWeight;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivTypefaceResolver.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivTypefaceResolverKt {

    /* JADX INFO: compiled from: DivTypefaceResolver.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivFontWeight.values().length];
            try {
                iArr[DivFontWeight.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivFontWeight.REGULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivFontWeight.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DivFontWeight.BOLD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Typeface getTypeface(int i10, @NotNull DivTypefaceProvider divTypefaceProvider) {
        Typeface typefaceFor = divTypefaceProvider.getTypefaceFor(i10);
        return typefaceFor == null ? Typeface.DEFAULT : typefaceFor;
    }

    public static final Typeface getTypeface(@Nullable DivFontWeight divFontWeight, @Nullable Integer num, @NotNull DivTypefaceProvider divTypefaceProvider) {
        return getTypeface(getTypefaceValue(divFontWeight, num), divTypefaceProvider);
    }

    public static final int getTypefaceValue(@Nullable DivFontWeight divFontWeight, @Nullable Integer num) {
        if (num != null) {
            return num.intValue();
        }
        int i10 = divFontWeight == null ? -1 : WhenMappings.$EnumSwitchMapping$0[divFontWeight.ordinal()];
        if (i10 == 1) {
            return 300;
        }
        if (i10 == 2) {
            return 400;
        }
        if (i10 != 3) {
            return i10 != 4 ? 400 : 700;
        }
        return 500;
    }
}
