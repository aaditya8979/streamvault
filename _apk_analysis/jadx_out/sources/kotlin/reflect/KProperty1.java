package kotlin.reflect;

import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;

/* JADX INFO: compiled from: KProperty.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface KProperty1<T, V> extends KProperty<V>, l<T, V> {

    /* JADX INFO: compiled from: KProperty.kt */
    public interface Getter<T, V> extends KProperty.Getter<V>, l<T, V> {
        @Override // sn.l
        /* synthetic */ Object invoke(Object obj);
    }

    V get(T t10);

    @Nullable
    Object getDelegate(T t10);

    @Override // kotlin.reflect.KProperty
    @NotNull
    Getter<T, V> getGetter();

    @Override // sn.l
    /* synthetic */ Object invoke(Object obj);
}
