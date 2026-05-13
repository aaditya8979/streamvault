package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C4809ge;
import io.appmetrica.analytics.impl.C4978n4;
import io.appmetrica.analytics.impl.C5084rb;
import io.appmetrica.analytics.impl.C5127t4;
import io.appmetrica.analytics.impl.C5154u6;
import io.appmetrica.analytics.impl.Ci;
import io.appmetrica.analytics.impl.Hb;
import io.appmetrica.analytics.impl.InterfaceC4793fo;
import io.appmetrica.analytics.impl.Yk;

/* JADX INFO: loaded from: classes7.dex */
public final class NumberAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5154u6 f68355a;

    public NumberAttribute(String str, C5084rb c5084rb, Hb hb2) {
        this.f68355a = new C5154u6(str, c5084rb, hb2);
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC4793fo> withValue(double d10) {
        return new UserProfileUpdate<>(new C4809ge(this.f68355a.f67772c, d10, new C5084rb(), new C5127t4(new Hb(new C4978n4(100)))));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC4793fo> withValueIfUndefined(double d10) {
        return new UserProfileUpdate<>(new C4809ge(this.f68355a.f67772c, d10, new C5084rb(), new Yk(new Hb(new C4978n4(100)))));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC4793fo> withValueReset() {
        return new UserProfileUpdate<>(new Ci(1, this.f68355a.f67772c, new C5084rb(), new Hb(new C4978n4(100))));
    }
}
