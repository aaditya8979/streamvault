package kotlin.reflect;

import bn.r;
import kotlin.reflect.KMutableProperty;
import org.jetbrains.annotations.NotNull;
import sn.l;

/* JADX INFO: compiled from: KProperty.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface KMutableProperty0<V> extends KProperty0<V>, KMutableProperty<V> {

    /* JADX INFO: compiled from: KProperty.kt */
    public interface Setter<V> extends KMutableProperty.Setter<V>, l<V, r> {
        @Override // sn.l
        /* synthetic */ r invoke(Object obj);
    }

    @Override // kotlin.reflect.KMutableProperty
    @NotNull
    Setter<V> getSetter();

    @Override // kotlin.reflect.KProperty0, sn.a
    /* synthetic */ Object invoke();

    void set(V v10);
}
