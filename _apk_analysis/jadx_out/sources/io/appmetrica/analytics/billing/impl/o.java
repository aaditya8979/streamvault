package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.Period;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public final class o {
    public static byte[] a(ProductInfo productInfo) {
        String currencyCode;
        z zVar = new z();
        zVar.f64518a = productInfo.quantity;
        zVar.f64523f = productInfo.priceMicros;
        try {
            currencyCode = Currency.getInstance(productInfo.priceCurrency).getCurrencyCode();
        } catch (Throwable unused) {
            currencyCode = "";
        }
        Charset charset = bo.c.f5639b;
        zVar.f64519b = currencyCode.getBytes(charset);
        zVar.f64520c = productInfo.sku.getBytes(charset);
        u uVar = new u();
        uVar.f64484a = productInfo.purchaseOriginalJson.getBytes(charset);
        uVar.f64485b = productInfo.signature.getBytes(charset);
        zVar.f64522e = uVar;
        zVar.f64524g = true;
        zVar.f64525h = 1;
        int i10 = n.f64471a[productInfo.type.ordinal()];
        zVar.f64526i = (i10 == 1 || i10 != 2) ? 1 : 2;
        y yVar = new y();
        yVar.f64507a = productInfo.purchaseToken.getBytes(charset);
        yVar.f64508b = TimeUnit.MILLISECONDS.toSeconds(productInfo.purchaseTime);
        zVar.f64527j = yVar;
        if (productInfo.type == ProductType.SUBS) {
            x xVar = new x();
            xVar.f64500a = productInfo.autoRenewing;
            Period period = productInfo.subscriptionPeriod;
            if (period != null) {
                w wVar = new w();
                wVar.f64497a = period.number;
                int i11 = n.f64472b[period.timeUnit.ordinal()];
                wVar.f64498b = i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? 0 : 4 : 3 : 2 : 1;
                xVar.f64501b = wVar;
            }
            v vVar = new v();
            vVar.f64487a = productInfo.introductoryPriceMicros;
            Period period2 = productInfo.introductoryPricePeriod;
            if (period2 != null) {
                w wVar2 = new w();
                wVar2.f64497a = period2.number;
                int i12 = n.f64472b[period2.timeUnit.ordinal()];
                wVar2.f64498b = i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? 0 : 4 : 3 : 2 : 1;
                vVar.f64488b = wVar2;
            }
            vVar.f64489c = productInfo.introductoryPriceCycles;
            xVar.f64502c = vVar;
            zVar.f64528k = xVar;
        }
        return MessageNano.toByteArray(zVar);
    }
}
