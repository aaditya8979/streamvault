package com.facebook.ads.redexgen.core;

import com.google.common.base.ElementTypesAreNonnullByDefault;
import com.google.common.base.ParametricNullness;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC2835iX<T> implements Iterator<T> {
    public EnumC2834iW A00 = EnumC2834iW.A04;

    @CheckForNull
    public T A01;

    private boolean A01() {
        this.A00 = EnumC2834iW.A03;
        this.A01 = A03();
        if (this.A00 == EnumC2834iW.A02) {
            return false;
        }
        this.A00 = EnumC2834iW.A05;
        return true;
    }

    @CheckForNull
    public final T A02() {
        this.A00 = EnumC2834iW.A02;
        return null;
    }

    @CheckForNull
    public abstract T A03();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        AbstractC2871jA.A0D(this.A00 != EnumC2834iW.A03);
        switch (this.A00) {
            case A02:
                return false;
            case A05:
                return true;
            default:
                return A01();
        }
    }

    @Override // java.util.Iterator
    @ParametricNullness
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.A00 = EnumC2834iW.A04;
        T t10 = (T) AbstractC2864j2.A00(this.A01);
        this.A01 = null;
        return t10;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
