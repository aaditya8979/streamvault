package com.facebook.ads.redexgen.core;

import com.google.common.collect.ParametricNullness;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0W, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0W<E> extends AbstractC14551n<E> {
    public final AbstractC1673Am<E> A00;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0W(AbstractC1673Am<E> abstractC1673Am, final int i10) {
        final int size = abstractC1673Am.size();
        new AF<E>(size, i10) { // from class: com.facebook.ads.redexgen.X.1n
            public static String[] A02 = {"CGVvWGsuzzGHQgo9zzOKQIJUE", "KVb58jbZH1vlab4O5iE8zizSXMaJECXq", "VptaZc", "glKzXP3GfNyb6OMGvuDXfVC1yHy2PNCZ", "pmbHPYSyFX1GsR09gqUeaAeR0V5aRJK7", "qAEg6Zt1UGu8L4Bf8ygtzAiT", "mjI", "bmKWD7kDb3scBQ7vRqmkLSkTVZvrcW"};
            public int A00;
            public final int A01;

            {
                AbstractC2871jA.A01(i10, size);
                this.A01 = size;
                this.A00 = i10;
            }

            @ParametricNullness
            public abstract E A00(int i11);

            @Override // java.util.Iterator, java.util.ListIterator
            public final boolean hasNext() {
                return this.A00 < this.A01;
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return this.A00 > 0;
            }

            @Override // java.util.Iterator, java.util.ListIterator
            @ParametricNullness
            public final E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i11 = this.A00;
                this.A00 = i11 + 1;
                if (A02[1].charAt(25) == 'X') {
                    throw new RuntimeException();
                }
                String[] strArr = A02;
                strArr[2] = "xP2Fxu";
                strArr[0] = "lDEAidUPCXG34cALHoPwa9Bl5";
                return A00(i11);
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return this.A00;
            }

            @Override // java.util.ListIterator
            @ParametricNullness
            public final E previous() {
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                int i11 = this.A00 - 1;
                this.A00 = i11;
                return A00(i11);
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return this.A00 - 1;
            }
        };
        this.A00 = abstractC1673Am;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC14551n
    public final E A00(int i10) {
        return this.A00.get(i10);
    }
}
