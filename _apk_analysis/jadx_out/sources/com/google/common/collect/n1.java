package com.google.common.collect;

import com.google.common.base.Optional;
import java.util.Iterator;

/* JADX INFO: compiled from: FluentIterable.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class n1<E> implements Iterable<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Optional<Iterable<E>> f23424b = Optional.absent();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: FluentIterable.java */
    public class a<T> extends n1<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Iterable[] f23425c;

        /* JADX INFO: renamed from: com.google.common.collect.n1$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FluentIterable.java */
        public class C0319a extends com.google.common.collect.a<Iterator<? extends T>> {
            public C0319a(int i10) {
                super(i10);
            }

            @Override // com.google.common.collect.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Iterator<? extends T> a(int i10) {
                return a.this.f23425c[i10].iterator();
            }
        }

        public a(Iterable[] iterableArr) {
            this.f23425c = iterableArr;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return Iterators.d(new C0319a(this.f23425c.length));
        }
    }

    public static <T> n1<T> a(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return e(iterable, iterable2);
    }

    public static <T> n1<T> e(Iterable<? extends T>... iterableArr) {
        for (Iterable<? extends T> iterable : iterableArr) {
            y7.l.m(iterable);
        }
        return new a(iterableArr);
    }

    public final Iterable<E> f() {
        return this.f23424b.or(this);
    }

    public String toString() {
        return y1.p(f());
    }
}
