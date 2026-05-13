package com.yandex.div.core.widget;

import android.view.View;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;
import wn.d;

/* JADX INFO: compiled from: Views.kt */
/* JADX INFO: loaded from: classes11.dex */
final class DimensionAffectingViewProperty<T> implements d<View, T> {

    @Nullable
    private final l<T, T> modifier;
    private T propertyValue;

    /* JADX WARN: Multi-variable type inference failed */
    public DimensionAffectingViewProperty(T t10, @Nullable l<? super T, ? extends T> lVar) {
        this.propertyValue = t10;
        this.modifier = lVar;
    }

    /* JADX INFO: renamed from: getValue, reason: avoid collision after fix types in other method */
    public T getValue2(@NotNull View view, @NotNull KProperty<?> kProperty) {
        return this.propertyValue;
    }

    @Override // wn.d
    public /* bridge */ /* synthetic */ Object getValue(View view, KProperty kProperty) {
        return getValue2(view, (KProperty<?>) kProperty);
    }

    /* JADX INFO: renamed from: setValue, reason: avoid collision after fix types in other method */
    public void setValue2(@NotNull View view, @NotNull KProperty<?> kProperty, T t10) {
        T tInvoke;
        l<T, T> lVar = this.modifier;
        if (lVar != null && (tInvoke = lVar.invoke(t10)) != null) {
            t10 = tInvoke;
        }
        if (p.f(this.propertyValue, t10)) {
            return;
        }
        this.propertyValue = t10;
        view.requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // wn.d
    public /* bridge */ /* synthetic */ void setValue(View view, KProperty kProperty, Object obj) {
        setValue2(view, (KProperty<?>) kProperty, obj);
    }
}
