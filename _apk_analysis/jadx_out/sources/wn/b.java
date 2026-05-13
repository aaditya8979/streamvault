package wn;

import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: ObservableProperty.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b<V> implements d<Object, V> {
    private V value;

    public b(V v10) {
        this.value = v10;
    }

    public void afterChange(@NotNull KProperty<?> kProperty, V v10, V v11) {
        p.k(kProperty, "property");
    }

    public boolean beforeChange(@NotNull KProperty<?> kProperty, V v10, V v11) {
        p.k(kProperty, "property");
        return true;
    }

    @Override // wn.d
    public V getValue(@Nullable Object obj, @NotNull KProperty<?> kProperty) {
        p.k(kProperty, "property");
        return this.value;
    }

    @Override // wn.d
    public void setValue(@Nullable Object obj, @NotNull KProperty<?> kProperty, V v10) {
        p.k(kProperty, "property");
        V v11 = this.value;
        if (beforeChange(kProperty, v11, v10)) {
            this.value = v10;
            afterChange(kProperty, v11, v10);
        }
    }

    @NotNull
    public String toString() {
        return "ObservableProperty(value=" + this.value + ')';
    }
}
