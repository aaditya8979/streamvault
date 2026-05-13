package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.k7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4905k7 implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4963me f67096a;

    /* JADX WARN: Multi-variable type inference failed */
    public C4905k7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C4905k7(@NotNull C4963me c4963me) {
        this.f67096a = c4963me;
    }

    public /* synthetic */ C4905k7(C4963me c4963me, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? new C4963me() : c4963me);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4879j7 toModel(@Nullable C5006o7 c5006o7) {
        if (c5006o7 == null) {
            return new C4879j7(null, null, null, null, null, null, null, null, null, null);
        }
        C5006o7 c5006o72 = new C5006o7();
        Boolean boolA = this.f67096a.a(c5006o7.f67398a);
        Double dValueOf = Double.valueOf(c5006o7.f67400c);
        if (!(!(dValueOf.doubleValue() == c5006o72.f67400c))) {
            dValueOf = null;
        }
        Double dValueOf2 = Double.valueOf(c5006o7.f67399b);
        if (!(!(dValueOf2.doubleValue() == c5006o72.f67399b))) {
            dValueOf2 = null;
        }
        Long lValueOf = Long.valueOf(c5006o7.f67405h);
        Long l10 = lValueOf.longValue() != c5006o72.f67405h ? lValueOf : null;
        Integer numValueOf = Integer.valueOf(c5006o7.f67403f);
        Integer num = numValueOf.intValue() != c5006o72.f67403f ? numValueOf : null;
        Integer numValueOf2 = Integer.valueOf(c5006o7.f67402e);
        Integer num2 = numValueOf2.intValue() != c5006o72.f67402e ? numValueOf2 : null;
        Integer numValueOf3 = Integer.valueOf(c5006o7.f67404g);
        Integer num3 = numValueOf3.intValue() != c5006o72.f67404g ? numValueOf3 : null;
        Integer numValueOf4 = Integer.valueOf(c5006o7.f67401d);
        Integer num4 = numValueOf4.intValue() != c5006o72.f67401d ? numValueOf4 : null;
        String str = c5006o7.f67406i;
        String str2 = tn.p.f(str, c5006o72.f67406i) ^ true ? str : null;
        String str3 = c5006o7.f67407j;
        return new C4879j7(boolA, dValueOf2, dValueOf, num4, num2, num, num3, l10, str2, tn.p.f(str3, c5006o72.f67407j) ^ true ? str3 : null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5006o7 fromModel(@NotNull C4879j7 c4879j7) {
        C5006o7 c5006o7 = new C5006o7();
        Boolean bool = c4879j7.f67010a;
        if (bool != null) {
            c5006o7.f67398a = this.f67096a.fromModel(Boolean.valueOf(bool.booleanValue())).intValue();
        }
        Double d10 = c4879j7.f67012c;
        if (d10 != null) {
            c5006o7.f67400c = d10.doubleValue();
        }
        Double d11 = c4879j7.f67011b;
        if (d11 != null) {
            c5006o7.f67399b = d11.doubleValue();
        }
        Long l10 = c4879j7.f67017h;
        if (l10 != null) {
            c5006o7.f67405h = l10.longValue();
        }
        Integer num = c4879j7.f67015f;
        if (num != null) {
            c5006o7.f67403f = num.intValue();
        }
        Integer num2 = c4879j7.f67014e;
        if (num2 != null) {
            c5006o7.f67402e = num2.intValue();
        }
        Integer num3 = c4879j7.f67016g;
        if (num3 != null) {
            c5006o7.f67404g = num3.intValue();
        }
        Integer num4 = c4879j7.f67013d;
        if (num4 != null) {
            c5006o7.f67401d = num4.intValue();
        }
        String str = c4879j7.f67018i;
        if (str != null) {
            c5006o7.f67406i = str;
        }
        String str2 = c4879j7.f67019j;
        if (str2 != null) {
            c5006o7.f67407j = str2;
        }
        return c5006o7;
    }
}
