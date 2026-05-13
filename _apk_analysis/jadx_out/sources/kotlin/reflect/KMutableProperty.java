package kotlin.reflect;

import bn.r;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: KProperty.kt */
/* JADX INFO: loaded from: classes9.dex */
public interface KMutableProperty<V> extends KProperty<V> {

    /* JADX INFO: compiled from: KProperty.kt */
    public interface Setter<V> extends KProperty.Accessor<V>, KFunction<r> {
    }

    @NotNull
    Setter<V> getSetter();
}
