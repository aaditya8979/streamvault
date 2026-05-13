package kotlin;

import bn.g;
import bn.o;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: LazyJVM.kt */
/* JADX INFO: loaded from: classes7.dex */
final class SynchronizedLazyImpl<T> implements g<T>, Serializable {

    @Nullable
    private volatile Object _value;

    @Nullable
    private sn.a<? extends T> initializer;

    @NotNull
    private final Object lock;

    public SynchronizedLazyImpl(@NotNull sn.a<? extends T> aVar, @Nullable Object obj) {
        p.k(aVar, "initializer");
        this.initializer = aVar;
        this._value = o.f5629a;
        this.lock = obj == null ? this : obj;
    }

    public /* synthetic */ SynchronizedLazyImpl(sn.a aVar, Object obj, int i10, i iVar) {
        this(aVar, (i10 & 2) != 0 ? null : obj);
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // bn.g
    public T getValue() {
        T tInvoke;
        T t10 = (T) this._value;
        o oVar = o.f5629a;
        if (t10 != oVar) {
            return t10;
        }
        synchronized (this.lock) {
            tInvoke = (T) this._value;
            if (tInvoke == oVar) {
                sn.a<? extends T> aVar = this.initializer;
                p.h(aVar);
                tInvoke = aVar.invoke();
                this._value = tInvoke;
                this.initializer = null;
            }
        }
        return tInvoke;
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
