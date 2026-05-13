package com.moloco.sdk.internal.services.bidtoken;

import android.os.Build;
import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.service_locator.b;
import io.ktor.client.HttpClient;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import p000do.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final bn.g f47155a = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.internal.services.bidtoken.a
        @Override // sn.a
        public final Object invoke() {
            return d.a();
        }
    });

    public static final z a() {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "ServerBidTokenService", "Creating BidTokenService instance", null, false, 12, null);
        b.e eVar = b.e.f47645a;
        HttpClient httpClientE = com.moloco.sdk.internal.http.e.e(eVar.h().invoke(), eVar.l().invoke());
        l lVar = new l(2800L, 3, 200L);
        String language = Locale.getDefault().getLanguage();
        tn.p.j(language, "getLanguage(...)");
        String str = Build.VERSION.RELEASE;
        tn.p.j(str, "RELEASE");
        String str2 = Build.MANUFACTURER;
        String str3 = str2 == null ? "" : str2;
        String str4 = Build.MODEL;
        String str5 = str4 == null ? "" : str4;
        String str6 = Build.HARDWARE;
        return new z(new c(BuildConfig.SDK_VERSION_NAME, httpClientE, lVar, new j(language, str, str3, str5, str6 == null ? "" : str6)), kotlinx.coroutines.d.a(j2.b(null, 1, null).plus(com.moloco.sdk.internal.scheduling.c.a().getIo())), y.f47331a.a(new com.moloco.sdk.internal.bidtoken.c(), new com.moloco.sdk.internal.services.k()));
    }

    public static final z c() {
        return (z) f47155a.getValue();
    }
}
