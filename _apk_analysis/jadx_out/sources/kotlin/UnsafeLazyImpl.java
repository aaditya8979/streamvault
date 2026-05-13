package kotlin;

import bn.g;
import bn.o;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: Lazy.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class UnsafeLazyImpl<T> implements g<T>, Serializable {

    @Nullable
    private Object _value;

    @Nullable
    private sn.a<? extends T> initializer;

    public UnsafeLazyImpl(@NotNull sn.a<? extends T> aVar) {
        p.k(aVar, "initializer");
        this.initializer = aVar;
        this._value = o.f5629a;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // bn.g
    public T getValue() {
        if (this._value == o.f5629a) {
            sn.a<? extends T> aVar = this.initializer;
            p.h(aVar);
            this._value = aVar.invoke();
            this.initializer = null;
        }
        return (T) this._value;
    }

    @Override // bn.g
    public boolean isInitialized() {
        return this._value != o.f5629a;
    }

    @NotNull
    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
