package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.m4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC3037m4 {
    public static final AbstractC3037m4 A00 = new B0();
    public static final AbstractC3037m4 A02 = new C1677Aq(-1);
    public static final AbstractC3037m4 A01 = new C1677Aq(1);

    public AbstractC3037m4() {
    }

    public /* synthetic */ AbstractC3037m4(B0 b02) {
        this();
    }

    public static AbstractC3037m4 A01() {
        return A00;
    }

    public abstract int A05();

    public abstract AbstractC3037m4 A06(int i10, int i11);

    public abstract AbstractC3037m4 A07(long j10, long j11);

    public abstract <T> AbstractC3037m4 A08(@ParametricNullness T t10, @ParametricNullness T t11, Comparator<T> comparator);

    public abstract AbstractC3037m4 A09(boolean z10, boolean z11);

    public abstract AbstractC3037m4 A0A(boolean z10, boolean z11);
}
