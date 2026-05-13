package com.google.common.base;

import com.google.common.base.Suppliers;
import java.io.Serializable;
import y7.h;
import y7.l;
import y7.p;

/* JADX INFO: loaded from: classes10.dex */
public final class Suppliers {

    public static class MemoizingSupplier<T> implements p<T>, Serializable {
        private static final long serialVersionUID = 0;
        public final p<T> delegate;
        public volatile transient boolean initialized;
        public transient T value;

        public MemoizingSupplier(p<T> pVar) {
            this.delegate = (p) l.m(pVar);
        }

        @Override // y7.p
        public T get() {
            if (!this.initialized) {
                synchronized (this) {
                    if (!this.initialized) {
                        T t10 = this.delegate.get();
                        this.value = t10;
                        this.initialized = true;
                        return t10;
                    }
                }
            }
            return (T) h.a(this.value);
        }

        public String toString() {
            Object obj;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (this.initialized) {
                obj = "<supplier that returned " + this.value + ">";
            } else {
                obj = this.delegate;
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public static class a<T> implements p<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final p<Void> f23055d = new p() { // from class: y7.q
            @Override // y7.p
            public final Object get() {
                return Suppliers.a.b();
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile p<T> f23056b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public T f23057c;

        public a(p<T> pVar) {
            this.f23056b = (p) l.m(pVar);
        }

        public static /* synthetic */ Void b() {
            throw new IllegalStateException();
        }

        @Override // y7.p
        public T get() {
            p<T> pVar = this.f23056b;
            p<T> pVar2 = (p<T>) f23055d;
            if (pVar != pVar2) {
                synchronized (this) {
                    if (this.f23056b != pVar2) {
                        T t10 = this.f23056b.get();
                        this.f23057c = t10;
                        this.f23056b = pVar2;
                        return t10;
                    }
                }
            }
            return (T) h.a(this.f23057c);
        }

        public String toString() {
            Object obj = this.f23056b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (obj == f23055d) {
                obj = "<supplier that returned " + this.f23057c + ">";
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public static <T> p<T> a(p<T> pVar) {
        return ((pVar instanceof a) || (pVar instanceof MemoizingSupplier)) ? pVar : pVar instanceof Serializable ? new MemoizingSupplier(pVar) : new a(pVar);
    }
}
