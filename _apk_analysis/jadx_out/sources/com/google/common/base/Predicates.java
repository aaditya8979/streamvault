package com.google.common.base;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import y7.l;
import y7.m;

/* JADX INFO: loaded from: classes11.dex */
public final class Predicates {

    public static class AndPredicate<T> implements m<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final List<? extends m<? super T>> components;

        public AndPredicate(List<? extends m<? super T>> list) {
            this.components = list;
        }

        @Override // y7.m
        public boolean apply(T t10) {
            for (int i10 = 0; i10 < this.components.size(); i10++) {
                if (!this.components.get(i10).apply(t10)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (obj instanceof AndPredicate) {
                return this.components.equals(((AndPredicate) obj).components);
            }
            return false;
        }

        public int hashCode() {
            return this.components.hashCode() + 306654252;
        }

        public String toString() {
            return Predicates.d("and", this.components);
        }
    }

    public static <T> m<T> b(m<? super T> mVar, m<? super T> mVar2) {
        return new AndPredicate(c((m) l.m(mVar), (m) l.m(mVar2)));
    }

    public static <T> List<m<? super T>> c(m<? super T> mVar, m<? super T> mVar2) {
        return Arrays.asList(mVar, mVar2);
    }

    public static String d(String str, Iterable<?> iterable) {
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append(str);
        sb2.append('(');
        boolean z10 = true;
        for (Object obj : iterable) {
            if (!z10) {
                sb2.append(',');
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
