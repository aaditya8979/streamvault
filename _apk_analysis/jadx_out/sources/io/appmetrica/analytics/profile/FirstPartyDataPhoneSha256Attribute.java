package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C4674b8;
import io.appmetrica.analytics.impl.C4978n4;
import io.appmetrica.analytics.impl.C5127t4;
import io.appmetrica.analytics.impl.C5154u6;
import io.appmetrica.analytics.impl.Hb;
import io.appmetrica.analytics.impl.InterfaceC4793fo;
import io.appmetrica.analytics.impl.Xm;
import io.appmetrica.analytics.impl.Ym;
import io.appmetrica.analytics.impl.Zk;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class FirstPartyDataPhoneSha256Attribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5154u6 f68348a = new C5154u6("appmetrica_1pd_phone_sha256", new C4674b8(), new Hb(new C4978n4(100)));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Zk f68349b;

    public FirstPartyDataPhoneSha256Attribute(Zk zk2) {
        this.f68349b = zk2;
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC4793fo> withPhoneValues(@NonNull Iterable<String> iterable) {
        String str = this.f68348a.f67772c;
        ArrayList arrayListA = this.f68349b.a(iterable);
        Ym ym2 = new Ym(200, "First party data phones attribute", PublicLogger.getAnonymousInstance());
        C5154u6 c5154u6 = this.f68348a;
        return new UserProfileUpdate<>(new Xm(str, arrayListA, 10, ym2, c5154u6.f67770a, new C5127t4(c5154u6.f67771b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC4793fo> withPhoneValues(@NonNull String... strArr) {
        return withPhoneValues(Arrays.asList(strArr));
    }
}
