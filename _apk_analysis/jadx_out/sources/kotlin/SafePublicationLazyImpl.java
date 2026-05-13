package kotlin;

import bn.g;
import bn.o;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: LazyJVM.kt */
/* JADX INFO: loaded from: classes3.dex */
final class SafePublicationLazyImpl<T> implements g<T>, Serializable {

    @NotNull
    public static final a Companion = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> f73202b = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "_value");

    @Nullable
    private volatile Object _value;

    /* JADX INFO: renamed from: final, reason: not valid java name */
    @NotNull
    private final Object f3414final;

    @Nullable
    private volatile sn.a<? extends T> initializer;

    /* JADX INFO: compiled from: LazyJVM.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public SafePublicationLazyImpl(@NotNull sn.a<? extends T> aVar) {
        p.k(aVar, "initializer");
        this.initializer = aVar;
        o oVar = o.f5629a;
        this._value = oVar;
        this.f3414final = oVar;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // bn.g
    public T getValue() {
        T t10 = (T) this._value;
        o oVar = o.f5629a;
        if (t10 != oVar) {
            return t10;
        }
        sn.a<? extends T> aVar = this.initializer;
        if (aVar != null) {
            T tInvoke = aVar.invoke();
            if (androidx.concurrent.futures.a.a(f73202b, this, oVar, tInvoke)) {
                this.initializer = null;
                return tInvoke;
            }
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
