package com.yandex.div.core.widget;

import android.view.View;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import wn.d;

/* JADX INFO: compiled from: Views.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class ViewsKt {
    @NotNull
    public static final <T> d<View, T> appearanceAffecting(T t10, @Nullable l<? super T, ? extends T> lVar) {
        return new AppearanceAffectingViewProperty(t10, lVar);
    }

    public static /* synthetic */ d appearanceAffecting$default(Object obj, l lVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        return appearanceAffecting(obj, lVar);
    }

    @NotNull
    public static final <T> d<View, T> dimensionAffecting(T t10, @Nullable l<? super T, ? extends T> lVar) {
        return new DimensionAffectingViewProperty(t10, lVar);
    }

    public static /* synthetic */ d dimensionAffecting$default(Object obj, l lVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        return dimensionAffecting(obj, lVar);
    }

    public static final boolean isExact(int i10) {
        return View.MeasureSpec.getMode(i10) == 1073741824;
    }

    public static final boolean isUnspecified(int i10) {
        return View.MeasureSpec.getMode(i10) == 0;
    }

    public static final int makeAtMostSpec(int i10) {
        return View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE);
    }

    public static final int makeExactSpec(int i10) {
        return View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
    }

    public static final int makeUnspecifiedSpec() {
        return View.MeasureSpec.makeMeasureSpec(0, 0);
    }
}
