package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C5127t4;
import io.appmetrica.analytics.impl.C5154u6;
import io.appmetrica.analytics.impl.Ci;
import io.appmetrica.analytics.impl.InterfaceC4793fo;
import io.appmetrica.analytics.impl.InterfaceC4900k2;
import io.appmetrica.analytics.impl.Mn;
import io.appmetrica.analytics.impl.Yk;
import io.appmetrica.analytics.impl.Ym;
import io.appmetrica.analytics.impl.Zm;
import io.appmetrica.analytics.impl.to;

/* JADX INFO: loaded from: classes2.dex */
public class StringAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Mn f68356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5154u6 f68357b;

    public StringAttribute(String str, Ym ym2, to toVar, InterfaceC4900k2 interfaceC4900k2) {
        this.f68357b = new C5154u6(str, toVar, interfaceC4900k2);
        this.f68356a = ym2;
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC4793fo> withValue(@NonNull String str) {
        C5154u6 c5154u6 = this.f68357b;
        return new UserProfileUpdate<>(new Zm(c5154u6.f67772c, str, this.f68356a, c5154u6.f67770a, new C5127t4(c5154u6.f67771b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC4793fo> withValueIfUndefined(@NonNull String str) {
        C5154u6 c5154u6 = this.f68357b;
        return new UserProfileUpdate<>(new Zm(c5154u6.f67772c, str, this.f68356a, c5154u6.f67770a, new Yk(c5154u6.f67771b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC4793fo> withValueReset() {
        C5154u6 c5154u6 = this.f68357b;
        return new UserProfileUpdate<>(new Ci(0, c5154u6.f67772c, c5154u6.f67770a, c5154u6.f67771b));
    }
}
