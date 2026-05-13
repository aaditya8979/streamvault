package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.c7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4699c7 implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4963me f66482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4905k7 f66483b;

    /* JADX WARN: Multi-variable type inference failed */
    public C4699c7() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public C4699c7(@NotNull C4963me c4963me, @NotNull C4905k7 c4905k7) {
        this.f66482a = c4963me;
        this.f66483b = c4905k7;
    }

    public /* synthetic */ C4699c7(C4963me c4963me, C4905k7 c4905k7, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? new C4963me() : c4963me, (i10 & 2) != 0 ? new C4905k7(null, 1, null) : c4905k7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4750e7 toModel(@NotNull C4981n7 c4981n7) {
        EnumC4983n9 enumC4983n9;
        C4981n7 c4981n72 = new C4981n7();
        Integer numValueOf = Integer.valueOf(c4981n7.f67330a);
        Integer num = numValueOf.intValue() != c4981n72.f67330a ? numValueOf : null;
        String str = c4981n7.f67331b;
        String str2 = tn.p.f(str, c4981n72.f67331b) ^ true ? str : null;
        String str3 = c4981n7.f67332c;
        String str4 = tn.p.f(str3, c4981n72.f67332c) ^ true ? str3 : null;
        Long lValueOf = Long.valueOf(c4981n7.f67333d);
        Long l10 = lValueOf.longValue() != c4981n72.f67333d ? lValueOf : null;
        C4879j7 model = this.f66483b.toModel(c4981n7.f67334e);
        String str5 = c4981n7.f67335f;
        String str6 = tn.p.f(str5, c4981n72.f67335f) ^ true ? str5 : null;
        String str7 = c4981n7.f67336g;
        String str8 = tn.p.f(str7, c4981n72.f67336g) ^ true ? str7 : null;
        Long lValueOf2 = Long.valueOf(c4981n7.f67337h);
        if (lValueOf2.longValue() == c4981n72.f67337h) {
            lValueOf2 = null;
        }
        Integer numValueOf2 = Integer.valueOf(c4981n7.f67338i);
        Integer num2 = numValueOf2.intValue() != c4981n72.f67338i ? numValueOf2 : null;
        Integer numValueOf3 = Integer.valueOf(c4981n7.f67339j);
        Integer num3 = numValueOf3.intValue() != c4981n72.f67339j ? numValueOf3 : null;
        String str9 = c4981n7.f67340k;
        String str10 = tn.p.f(str9, c4981n72.f67340k) ^ true ? str9 : null;
        Integer numValueOf4 = Integer.valueOf(c4981n7.f67341l);
        if (numValueOf4.intValue() == c4981n72.f67341l) {
            numValueOf4 = null;
        }
        J8 j8A = numValueOf4 != null ? J8.a(Integer.valueOf(numValueOf4.intValue())) : null;
        String str11 = c4981n7.f67342m;
        String str12 = tn.p.f(str11, c4981n72.f67342m) ^ true ? str11 : null;
        Integer numValueOf5 = Integer.valueOf(c4981n7.f67343n);
        if (numValueOf5.intValue() == c4981n72.f67343n) {
            numValueOf5 = null;
        }
        EnumC4753ea enumC4753eaA = numValueOf5 != null ? EnumC4753ea.a(Integer.valueOf(numValueOf5.intValue())) : null;
        Integer numValueOf6 = Integer.valueOf(c4981n7.f67344o);
        if (numValueOf6.intValue() == c4981n72.f67344o) {
            numValueOf6 = null;
        }
        if (numValueOf6 != null) {
            int iIntValue = numValueOf6.intValue();
            EnumC4983n9[] enumC4983n9ArrValues = EnumC4983n9.values();
            int length = enumC4983n9ArrValues.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    enumC4983n9 = EnumC4983n9.NATIVE;
                    break;
                }
                EnumC4983n9 enumC4983n92 = enumC4983n9ArrValues[i10];
                EnumC4983n9[] enumC4983n9Arr = enumC4983n9ArrValues;
                if (enumC4983n92.f67355a == iIntValue) {
                    enumC4983n9 = enumC4983n92;
                    break;
                }
                i10++;
                enumC4983n9ArrValues = enumC4983n9Arr;
            }
        } else {
            enumC4983n9 = null;
        }
        Boolean boolA = this.f66482a.a(c4981n7.f67345p);
        Integer numValueOf7 = Integer.valueOf(c4981n7.f67346q);
        Integer num4 = numValueOf7.intValue() != c4981n72.f67346q ? numValueOf7 : null;
        byte[] bArr = c4981n7.f67347r;
        return new C4750e7(num, str2, str4, l10, model, str6, str8, lValueOf2, num2, num3, str10, j8A, str12, enumC4753eaA, enumC4983n9, boolA, num4, Arrays.equals(bArr, c4981n72.f67347r) ^ true ? bArr : null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4981n7 fromModel(@NotNull C4750e7 c4750e7) {
        C4981n7 c4981n7 = new C4981n7();
        Integer num = c4750e7.f66654a;
        if (num != null) {
            c4981n7.f67330a = num.intValue();
        }
        String str = c4750e7.f66655b;
        if (str != null) {
            c4981n7.f67331b = StringUtils.correctIllFormedString(str);
        }
        String str2 = c4750e7.f66656c;
        if (str2 != null) {
            c4981n7.f67332c = StringUtils.correctIllFormedString(str2);
        }
        Long l10 = c4750e7.f66657d;
        if (l10 != null) {
            c4981n7.f67333d = l10.longValue();
        }
        C4879j7 c4879j7 = c4750e7.f66658e;
        if (c4879j7 != null) {
            c4981n7.f67334e = this.f66483b.fromModel(c4879j7);
        }
        String str3 = c4750e7.f66659f;
        if (str3 != null) {
            c4981n7.f67335f = str3;
        }
        String str4 = c4750e7.f66660g;
        if (str4 != null) {
            c4981n7.f67336g = str4;
        }
        Long l11 = c4750e7.f66661h;
        if (l11 != null) {
            c4981n7.f67337h = l11.longValue();
        }
        Integer num2 = c4750e7.f66662i;
        if (num2 != null) {
            c4981n7.f67338i = num2.intValue();
        }
        Integer num3 = c4750e7.f66663j;
        if (num3 != null) {
            c4981n7.f67339j = num3.intValue();
        }
        String str5 = c4750e7.f66664k;
        if (str5 != null) {
            c4981n7.f67340k = str5;
        }
        J8 j82 = c4750e7.f66665l;
        if (j82 != null) {
            c4981n7.f67341l = j82.f65438a;
        }
        String str6 = c4750e7.f66666m;
        if (str6 != null) {
            c4981n7.f67342m = str6;
        }
        EnumC4753ea enumC4753ea = c4750e7.f66667n;
        if (enumC4753ea != null) {
            c4981n7.f67343n = enumC4753ea.f66681a;
        }
        EnumC4983n9 enumC4983n9 = c4750e7.f66668o;
        if (enumC4983n9 != null) {
            c4981n7.f67344o = enumC4983n9.f67355a;
        }
        Boolean bool = c4750e7.f66669p;
        if (bool != null) {
            c4981n7.f67345p = this.f66482a.fromModel(Boolean.valueOf(bool.booleanValue())).intValue();
        }
        Integer num4 = c4750e7.f66670q;
        if (num4 != null) {
            c4981n7.f67346q = num4.intValue();
        }
        byte[] bArr = c4750e7.f66671r;
        if (bArr != null) {
            c4981n7.f67347r = bArr;
        }
        return c4981n7;
    }
}
