package wn;

import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Interfaces.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface d<T, V> extends c<T, V> {
    V getValue(T t10, @NotNull KProperty<?> kProperty);

    void setValue(T t10, @NotNull KProperty<?> kProperty, V v10);
}
