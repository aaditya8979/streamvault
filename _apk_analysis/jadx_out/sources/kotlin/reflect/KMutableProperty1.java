package kotlin.reflect;

import bn.r;
import kotlin.reflect.KMutableProperty;
import org.jetbrains.annotations.NotNull;
import sn.p;

/* JADX INFO: compiled from: KProperty.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface KMutableProperty1<T, V> extends KProperty1<T, V>, KMutableProperty<V> {

    /* JADX INFO: compiled from: KProperty.kt */
    public interface Setter<T, V> extends KMutableProperty.Setter<V>, p<T, V, r> {
        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        /* synthetic */ r mo2invoke(Object obj, Object obj2);
    }

    @Override // kotlin.reflect.KMutableProperty
    @NotNull
    Setter<T, V> getSetter();

    @Override // kotlin.reflect.KProperty1, sn.l
    /* synthetic */ Object invoke(Object obj);

    void set(T t10, V v10);
}
