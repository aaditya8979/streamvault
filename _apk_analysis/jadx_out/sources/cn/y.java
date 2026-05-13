package cn;

import java.util.Enumeration;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: IteratorsJVM.kt */
/* JADX INFO: loaded from: classes10.dex */
public class y extends x {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: IteratorsJVM.kt */
    public static final class a<T> implements Iterator<T>, un.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Enumeration<T> f6772b;

        public a(Enumeration<T> enumeration) {
            this.f6772b = enumeration;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f6772b.hasMoreElements();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.f6772b.nextElement();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @NotNull
    public static final <T> Iterator<T> A(@NotNull Enumeration<T> enumeration) {
        tn.p.k(enumeration, "<this>");
        return new a(enumeration);
    }
}
