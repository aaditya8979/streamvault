package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public abstract class BI<T> extends AbstractC3240pg<T> {
    public EnumC2934kC A00 = EnumC2934kC.A04;

    @CheckForNull
    public T A01;

    private boolean A00() {
        this.A00 = EnumC2934kC.A03;
        this.A01 = A02();
        if (this.A00 == EnumC2934kC.A02) {
            return false;
        }
        this.A00 = EnumC2934kC.A05;
        return true;
    }

    @CheckForNull
    public final T A01() {
        this.A00 = EnumC2934kC.A02;
        return null;
    }

    @CheckForNull
    public abstract T A02();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        AbstractC2871jA.A0D(this.A00 != EnumC2934kC.A03);
        switch (this.A00) {
            case A02:
                return false;
            case A05:
                return true;
            default:
                return A00();
        }
    }

    @Override // java.util.Iterator
    @ParametricNullness
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.A00 = EnumC2934kC.A04;
        T t10 = (T) AbstractC3180oQ.A01(this.A01);
        this.A01 = null;
        return t10;
    }
}
