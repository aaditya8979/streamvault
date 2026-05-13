package kotlin.sequences;

import ao.c;
import ao.e;
import ao.f;
import ao.h;
import ao.i;
import ao.r;
import ao.s;
import ao.x;
import ao.y;
import bo.q;
import cn.a0;
import cn.v;
import cn.v0;
import cn.w;
import cn.w0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Pair;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: _Sequences.kt */
/* JADX INFO: loaded from: classes.dex */
public class SequencesKt___SequencesKt extends s {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Iterables.kt */
    public static final class a<T> implements Iterable<T>, un.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f73238b;

        public a(i iVar) {
            this.f73238b = iVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.f73238b.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: _Sequences.kt */
    public static final class b<T> implements i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i<T> f73239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Comparator<? super T> f73240b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(i<? extends T> iVar, Comparator<? super T> comparator) {
            this.f73239a = iVar;
            this.f73240b = comparator;
        }

        @Override // ao.i
        public Iterator<T> iterator() {
            List listV = SequencesKt___SequencesKt.V(this.f73239a);
            a0.D(listV, this.f73240b);
            return listV.iterator();
        }
    }

    @NotNull
    public static final <T> i<T> A(@NotNull i<? extends T> iVar, @NotNull l<? super T, Boolean> lVar) {
        p.k(iVar, "<this>");
        p.k(lVar, "predicate");
        return new e(iVar, false, lVar);
    }

    @NotNull
    public static final <T> i<T> B(@NotNull i<? extends T> iVar) {
        p.k(iVar, "<this>");
        i<T> iVarA = A(iVar, new l() { // from class: ao.u
            @Override // sn.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SequencesKt___SequencesKt.C(obj));
            }
        });
        p.i(iVarA, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return iVarA;
    }

    public static final boolean C(Object obj) {
        return obj == null;
    }

    @Nullable
    public static final <T> T D(@NotNull i<? extends T> iVar) {
        p.k(iVar, "<this>");
        Iterator<? extends T> it = iVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    @NotNull
    public static final <T, R> i<R> E(@NotNull i<? extends T> iVar, @NotNull l<? super T, ? extends Iterable<? extends R>> lVar) {
        p.k(iVar, "<this>");
        p.k(lVar, "transform");
        return new f(iVar, lVar, SequencesKt___SequencesKt$flatMap$1.INSTANCE);
    }

    public static final <T> int F(@NotNull i<? extends T> iVar, T t10) {
        p.k(iVar, "<this>");
        int i10 = 0;
        for (T t11 : iVar) {
            if (i10 < 0) {
                w.w();
            }
            if (p.f(t10, t11)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @NotNull
    public static final <T, A extends Appendable> A G(@NotNull i<? extends T> iVar, @NotNull A a10, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i10, @NotNull CharSequence charSequence4, @Nullable l<? super T, ? extends CharSequence> lVar) throws IOException {
        p.k(iVar, "<this>");
        p.k(a10, "buffer");
        p.k(charSequence, "separator");
        p.k(charSequence2, "prefix");
        p.k(charSequence3, "postfix");
        p.k(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (T t10 : iVar) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            q.a(a10, t10, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    @NotNull
    public static final <T> String H(@NotNull i<? extends T> iVar, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i10, @NotNull CharSequence charSequence4, @Nullable l<? super T, ? extends CharSequence> lVar) {
        p.k(iVar, "<this>");
        p.k(charSequence, "separator");
        p.k(charSequence2, "prefix");
        p.k(charSequence3, "postfix");
        p.k(charSequence4, "truncated");
        return ((StringBuilder) G(iVar, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
    }

    public static /* synthetic */ String I(i iVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return H(iVar, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static final <T> T J(@NotNull i<? extends T> iVar) {
        p.k(iVar, "<this>");
        Iterator<? extends T> it = iVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    @NotNull
    public static final <T, R> i<R> K(@NotNull i<? extends T> iVar, @NotNull l<? super T, ? extends R> lVar) {
        p.k(iVar, "<this>");
        p.k(lVar, "transform");
        return new y(iVar, lVar);
    }

    @NotNull
    public static final <T, R> i<R> L(@NotNull i<? extends T> iVar, @NotNull l<? super T, ? extends R> lVar) {
        p.k(iVar, "<this>");
        p.k(lVar, "transform");
        return B(new y(iVar, lVar));
    }

    @Nullable
    public static final <T extends Comparable<? super T>> T M(@NotNull i<? extends T> iVar) {
        p.k(iVar, "<this>");
        Iterator<? extends T> it = iVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    @Nullable
    public static final <T> T N(@NotNull i<? extends T> iVar, @NotNull Comparator<? super T> comparator) {
        p.k(iVar, "<this>");
        p.k(comparator, "comparator");
        Iterator<? extends T> it = iVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    @NotNull
    public static final <T> i<T> O(@NotNull i<? extends T> iVar, @NotNull i<? extends T> iVar2) {
        p.k(iVar, "<this>");
        p.k(iVar2, "elements");
        return r.j(r.s(iVar, iVar2));
    }

    @NotNull
    public static final <T, R> i<R> P(@NotNull i<? extends T> iVar, R r10, @NotNull sn.p<? super R, ? super T, ? extends R> pVar) {
        p.k(iVar, "<this>");
        p.k(pVar, "operation");
        return ao.l.b(new SequencesKt___SequencesKt$runningFold$1(r10, iVar, pVar, null));
    }

    @NotNull
    public static final <T> i<T> Q(@NotNull i<? extends T> iVar, @NotNull Comparator<? super T> comparator) {
        p.k(iVar, "<this>");
        p.k(comparator, "comparator");
        return new b(iVar, comparator);
    }

    @NotNull
    public static final <T> i<T> R(@NotNull i<? extends T> iVar, int i10) {
        p.k(iVar, "<this>");
        if (i10 >= 0) {
            return i10 == 0 ? r.i() : iVar instanceof c ? ((c) iVar).b(i10) : new ao.w(iVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @NotNull
    public static final <T> i<T> S(@NotNull i<? extends T> iVar, @NotNull l<? super T, Boolean> lVar) {
        p.k(iVar, "<this>");
        p.k(lVar, "predicate");
        return new x(iVar, lVar);
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C T(@NotNull i<? extends T> iVar, @NotNull C c10) {
        p.k(iVar, "<this>");
        p.k(c10, "destination");
        Iterator<? extends T> it = iVar.iterator();
        while (it.hasNext()) {
            c10.add(it.next());
        }
        return c10;
    }

    @NotNull
    public static final <T> List<T> U(@NotNull i<? extends T> iVar) {
        p.k(iVar, "<this>");
        Iterator<? extends T> it = iVar.iterator();
        if (!it.hasNext()) {
            return w.m();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return v.e(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> V(@NotNull i<? extends T> iVar) {
        p.k(iVar, "<this>");
        return (List) T(iVar, new ArrayList());
    }

    @NotNull
    public static final <T> Set<T> W(@NotNull i<? extends T> iVar) {
        p.k(iVar, "<this>");
        Iterator<? extends T> it = iVar.iterator();
        if (!it.hasNext()) {
            return w0.f();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return v0.d(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    @NotNull
    public static final <T, R> i<Pair<T, R>> X(@NotNull i<? extends T> iVar, @NotNull i<? extends R> iVar2) {
        p.k(iVar, "<this>");
        p.k(iVar2, "other");
        return new h(iVar, iVar2, new sn.p() { // from class: ao.t
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public final Object mo2invoke(Object obj, Object obj2) {
                return SequencesKt___SequencesKt.Y(obj, obj2);
            }
        });
    }

    public static final Pair Y(Object obj, Object obj2) {
        return bn.h.a(obj, obj2);
    }

    @NotNull
    public static final <T> Iterable<T> v(@NotNull i<? extends T> iVar) {
        p.k(iVar, "<this>");
        return new a(iVar);
    }

    public static final <T> boolean w(@NotNull i<? extends T> iVar, T t10) {
        p.k(iVar, "<this>");
        return F(iVar, t10) >= 0;
    }

    public static final <T> int x(@NotNull i<? extends T> iVar) {
        p.k(iVar, "<this>");
        Iterator<? extends T> it = iVar.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                w.v();
            }
        }
        return i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> i<T> y(@NotNull i<? extends T> iVar, int i10) {
        p.k(iVar, "<this>");
        if (i10 >= 0) {
            return i10 == 0 ? iVar : iVar instanceof c ? ((c) iVar).a(i10) : new ao.b(iVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @NotNull
    public static final <T> i<T> z(@NotNull i<? extends T> iVar, @NotNull l<? super T, Boolean> lVar) {
        p.k(iVar, "<this>");
        p.k(lVar, "predicate");
        return new e(iVar, true, lVar);
    }
}
