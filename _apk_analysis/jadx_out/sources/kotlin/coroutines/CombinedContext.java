package kotlin.coroutines;

import bn.r;
import java.io.Serializable;
import kotlin.coroutines.CombinedContext;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Ref$IntRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: CoroutineContextImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class CombinedContext implements d, Serializable {

    @NotNull
    private final d.b element;

    @NotNull
    private final d left;

    /* JADX INFO: compiled from: CoroutineContextImpl.kt */
    public static final class Serialized implements Serializable {

        @NotNull
        public static final a Companion = new a(null);
        private static final long serialVersionUID = 0;

        @NotNull
        private final d[] elements;

        /* JADX INFO: compiled from: CoroutineContextImpl.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(i iVar) {
                this();
            }
        }

        public Serialized(@NotNull d[] dVarArr) {
            p.k(dVarArr, "elements");
            this.elements = dVarArr;
        }

        private final Object readResolve() {
            d[] dVarArr = this.elements;
            d dVarPlus = EmptyCoroutineContext.INSTANCE;
            for (d dVar : dVarArr) {
                dVarPlus = dVarPlus.plus(dVar);
            }
            return dVarPlus;
        }

        @NotNull
        public final d[] getElements() {
            return this.elements;
        }
    }

    public CombinedContext(@NotNull d dVar, @NotNull d.b bVar) {
        p.k(dVar, "left");
        p.k(bVar, "element");
        this.left = dVar;
        this.element = bVar;
    }

    public static final String j(String str, d.b bVar) {
        p.k(str, "acc");
        p.k(bVar, "element");
        if (str.length() == 0) {
            return bVar.toString();
        }
        return str + ", " + bVar;
    }

    public static final r o(d[] dVarArr, Ref$IntRef ref$IntRef, r rVar, d.b bVar) {
        p.k(rVar, "<unused var>");
        p.k(bVar, "element");
        int i10 = ref$IntRef.element;
        ref$IntRef.element = i10 + 1;
        dVarArr[i10] = bVar;
        return r.f5635a;
    }

    private final Object writeReplace() {
        int i10 = i();
        final d[] dVarArr = new d[i10];
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        fold(r.f5635a, new sn.p() { // from class: hn.a
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public final Object mo2invoke(Object obj, Object obj2) {
                return CombinedContext.o(dVarArr, ref$IntRef, (r) obj, (d.b) obj2);
            }
        });
        if (ref$IntRef.element == i10) {
            return new Serialized(dVarArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof CombinedContext) {
                CombinedContext combinedContext = (CombinedContext) obj;
                if (combinedContext.i() != i() || !combinedContext.h(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // kotlin.coroutines.d
    public <R> R fold(R r10, @NotNull sn.p<? super R, ? super d.b, ? extends R> pVar) {
        p.k(pVar, "operation");
        return pVar.mo2invoke((Object) this.left.fold(r10, pVar), this.element);
    }

    public final boolean g(d.b bVar) {
        return p.f(get(bVar.getKey()), bVar);
    }

    @Override // kotlin.coroutines.d
    @Nullable
    public <E extends d.b> E get(@NotNull d.c<E> cVar) {
        p.k(cVar, "key");
        CombinedContext combinedContext = this;
        while (true) {
            E e10 = (E) combinedContext.element.get(cVar);
            if (e10 != null) {
                return e10;
            }
            d dVar = combinedContext.left;
            if (!(dVar instanceof CombinedContext)) {
                return (E) dVar.get(cVar);
            }
            combinedContext = (CombinedContext) dVar;
        }
    }

    public final boolean h(CombinedContext combinedContext) {
        while (g(combinedContext.element)) {
            d dVar = combinedContext.left;
            if (!(dVar instanceof CombinedContext)) {
                p.i(dVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return g((d.b) dVar);
            }
            combinedContext = (CombinedContext) dVar;
        }
        return false;
    }

    public int hashCode() {
        return this.left.hashCode() + this.element.hashCode();
    }

    public final int i() {
        int i10 = 2;
        CombinedContext combinedContext = this;
        while (true) {
            d dVar = combinedContext.left;
            combinedContext = dVar instanceof CombinedContext ? (CombinedContext) dVar : null;
            if (combinedContext == null) {
                return i10;
            }
            i10++;
        }
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public d minusKey(@NotNull d.c<?> cVar) {
        p.k(cVar, "key");
        if (this.element.get(cVar) != null) {
            return this.left;
        }
        d dVarMinusKey = this.left.minusKey(cVar);
        return dVarMinusKey == this.left ? this : dVarMinusKey == EmptyCoroutineContext.INSTANCE ? this.element : new CombinedContext(dVarMinusKey, this.element);
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public d plus(@NotNull d dVar) {
        return d.a.b(this, dVar);
    }

    @NotNull
    public String toString() {
        return '[' + ((String) fold("", new sn.p() { // from class: hn.b
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public final Object mo2invoke(Object obj, Object obj2) {
                return CombinedContext.j((String) obj, (d.b) obj2);
            }
        })) + ']';
    }
}
