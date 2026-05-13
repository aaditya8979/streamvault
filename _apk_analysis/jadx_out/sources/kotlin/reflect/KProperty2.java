package kotlin.reflect;

import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.p;

/* JADX INFO: compiled from: KProperty.kt */
/* JADX INFO: loaded from: classes7.dex */
public interface KProperty2<D, E, V> extends KProperty<V>, p<D, E, V> {

    /* JADX INFO: compiled from: KProperty.kt */
    public interface Getter<D, E, V> extends KProperty.Getter<V>, p<D, E, V> {
        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        /* synthetic */ Object mo2invoke(Object obj, Object obj2);
    }

    V get(D d10, E e10);

    @Nullable
    Object getDelegate(D d10, E e10);

    @Override // kotlin.reflect.KProperty
    @NotNull
    Getter<D, E, V> getGetter();

    /* JADX INFO: renamed from: invoke */
    /* synthetic */ Object mo2invoke(Object obj, Object obj2);
}
