package io.appmetrica.analytics.impl;

import com.mbridge.msdk.foundation.tools.SameMD5;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes7.dex */
public final class N7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U f65627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4668b2 f65628b;

    public N7() {
        this(C5009oa.k().c(), C5009oa.k().d());
    }

    public N7(U u10, C4668b2 c4668b2) {
        this.f65627a = u10;
        this.f65628b = c4668b2;
    }

    public final String a() {
        AdvertisingIdsHolder advertisingIdsHolder;
        byte[] bArrDigest;
        U u10 = this.f65627a;
        Kn kn2 = new Kn(5, 500);
        synchronized (u10) {
            try {
                u10.a((Hi) kn2, true).get();
            } catch (InterruptedException | ExecutionException unused) {
            }
            advertisingIdsHolder = u10.f65966k;
        }
        AdTrackingInfoResult yandex = advertisingIdsHolder.getYandex();
        if (!yandex.isValid()) {
            String id2 = this.f65628b.getAppSetId().getId();
            if (id2 != null && id2.length() != 0) {
                try {
                    UUID.fromString(id2);
                    if (!tn.p.f(id2, "00000000-0000-0000-0000-000000000000")) {
                        return bo.a0.S(id2, "-", "", false, 4, null);
                    }
                } catch (Throwable unused2) {
                }
            }
            return bo.a0.S(UUID.randomUUID().toString(), "-", "", false, 4, null).toLowerCase(Locale.US);
        }
        AdTrackingInfo adTrackingInfo = yandex.mAdTrackingInfo;
        tn.p.h(adTrackingInfo);
        String str = adTrackingInfo.advId;
        tn.p.h(str);
        try {
            bArrDigest = MessageDigest.getInstance(SameMD5.TAG).digest(str.getBytes(bo.c.f5639b));
        } catch (NoSuchAlgorithmException unused3) {
            bArrDigest = new byte[0];
        }
        return StringUtils.toHexString(bArrDigest);
    }
}
