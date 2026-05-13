package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes11.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdRevenue f65167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f65168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC5122t f65169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ym f65170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Vm f65171e;

    public E(AdRevenue adRevenue, boolean z10, C4818gn c4818gn, PublicLogger publicLogger) {
        this.f65167a = adRevenue;
        this.f65168b = z10;
        this.f65169c = c4818gn;
        this.f65170d = new Ym(100, "ad revenue strings", publicLogger);
        this.f65171e = new Vm(30720, "ad revenue payload", publicLogger);
    }

    public final Pair a() {
        Map linkedHashMap;
        C5097s c5097s = new C5097s();
        int length = 0;
        for (Pair pair : cn.w.p(bn.h.a(this.f65167a.adNetwork, new C5222x(c5097s)), bn.h.a(this.f65167a.adPlacementId, new C5247y(c5097s)), bn.h.a(this.f65167a.adPlacementName, new C5272z(c5097s)), bn.h.a(this.f65167a.adUnitId, new A(c5097s)), bn.h.a(this.f65167a.adUnitName, new B(c5097s)), bn.h.a(this.f65167a.precision, new C(c5097s)), bn.h.a(this.f65167a.currency.getCurrencyCode(), new D(c5097s)))) {
            String str = (String) pair.getFirst();
            sn.l lVar = (sn.l) pair.getSecond();
            Ym ym2 = this.f65170d;
            ym2.getClass();
            String strA = ym2.a(str);
            byte[] bArrStringToBytesForProtobuf = StringUtils.stringToBytesForProtobuf(str);
            byte[] bArrStringToBytesForProtobuf2 = StringUtils.stringToBytesForProtobuf(strA);
            lVar.invoke(bArrStringToBytesForProtobuf2);
            length += bArrStringToBytesForProtobuf.length - bArrStringToBytesForProtobuf2.length;
        }
        Integer num = (Integer) F.f65226a.get(this.f65167a.adType);
        c5097s.f67647d = num != null ? num.intValue() : 0;
        r rVar = new r();
        BigDecimal bigDecimal = this.f65167a.adRevenue;
        BigInteger bigInteger = AbstractC5255y7.f68030a;
        int i10 = -bigDecimal.scale();
        BigInteger bigIntegerUnscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (bigIntegerUnscaledValue.compareTo(AbstractC5255y7.f68030a) <= 0 && bigIntegerUnscaledValue.compareTo(AbstractC5255y7.f68031b) >= 0) {
                break;
            }
            bigIntegerUnscaledValue = bigIntegerUnscaledValue.divide(BigInteger.TEN);
            i10++;
        }
        Pair pairA = bn.h.a(Long.valueOf(bigIntegerUnscaledValue.longValue()), Integer.valueOf(i10));
        long jLongValue = ((Number) pairA.getFirst()).longValue();
        int iIntValue = ((Number) pairA.getSecond()).intValue();
        rVar.f67597a = jLongValue;
        rVar.f67598b = iIntValue;
        c5097s.f67645b = rVar;
        Map<String, String> map = this.f65167a.payload;
        InterfaceC5122t interfaceC5122t = this.f65169c;
        if (map == null || (linkedHashMap = kotlin.collections.a.C(map)) == null) {
            linkedHashMap = new LinkedHashMap();
        }
        String strB = AbstractC4832hb.b(interfaceC5122t.a(linkedHashMap));
        Vm vm2 = this.f65171e;
        vm2.getClass();
        byte[] bArrStringToBytesForProtobuf3 = StringUtils.stringToBytesForProtobuf(vm2.a(strB));
        c5097s.f67654k = bArrStringToBytesForProtobuf3;
        int length2 = (StringUtils.stringToBytesForProtobuf(strB).length - bArrStringToBytesForProtobuf3.length) + length;
        if (this.f65168b) {
            c5097s.f67644a = "autocollected".getBytes(bo.c.f5639b);
        }
        return bn.h.a(MessageNano.toByteArray(c5097s), Integer.valueOf(length2));
    }
}
