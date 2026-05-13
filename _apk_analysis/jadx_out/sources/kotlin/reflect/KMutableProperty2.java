package kotlin.reflect;

import bn.r;
import kotlin.reflect.KMutableProperty;
import org.jetbrains.annotations.NotNull;
import sn.q;

/* JADX INFO: compiled from: KProperty.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface KMutableProperty2<D, E, V> extends KProperty2<D, E, V>, KMutableProperty<V> {

    /* JADX INFO: compiled from: KProperty.kt */
    public interface Setter<D, E, V> extends KMutableProperty.Setter<V>, q<D, E, V, r> {
        @Override // sn.q
        /* synthetic */ r invoke(Object obj, Object obj2, Object obj3);
    }

    @Override // kotlin.reflect.KMutableProperty
    @NotNull
    Setter<D, E, V> getSetter();

    @Override // kotlin.reflect.KProperty2, sn.p
    /* JADX INFO: renamed from: invoke */
    /* synthetic */ Object mo2invoke(Object obj, Object obj2);

    void set(D d10, E e10, V v10);
}
