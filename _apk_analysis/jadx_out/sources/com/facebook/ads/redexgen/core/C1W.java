package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1W, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public final class C1W<E> extends AbstractC1672Al<E> {
    public final transient Object[] A00;
    public final transient Object[] A01;
    public final transient int A02;
    public final transient int A03;
    public final transient int A04;
    public static final Object[] A06 = new Object[0];
    public static final C1W<Object> A05 = new C1W<>(A06, 0, A06, 0, 0);

    public C1W(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.A00 = objArr;
        this.A02 = i10;
        this.A01 = objArr2;
        this.A03 = i11;
        this.A04 = i12;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3068ma
    public final int A0G() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3068ma
    public final int A0H() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3068ma
    public final int A0I(Object[] objArr, int i10) {
        System.arraycopy(this.A00, 0, objArr, i10, this.A04);
        return this.A04 + i10;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3068ma
    public final boolean A0K() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3068ma
    public final Object[] A0L() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1672Al
    public final AbstractC1673Am<E> A0M() {
        return AbstractC1673Am.A09(this.A00, this.A04);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: A0N */
    public final AbstractC3240pg<E> iterator() {
        return A0J().iterator();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1672Al
    public final boolean A0O() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3068ma, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        Object[] objArr = this.A01;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iA02 = AbstractC3062mU.A02(obj);
        while (true) {
            int i10 = iA02 & this.A03;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iA02 = i10 + 1;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1672Al, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.A02;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A04;
    }
}
