package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C5127t4;
import io.appmetrica.analytics.impl.C5154u6;
import io.appmetrica.analytics.impl.Ci;
import io.appmetrica.analytics.impl.InterfaceC4793fo;
import io.appmetrica.analytics.impl.InterfaceC4900k2;
import io.appmetrica.analytics.impl.Y2;
import io.appmetrica.analytics.impl.Yk;
import io.appmetrica.analytics.impl.to;

/* JADX INFO: loaded from: classes3.dex */
public class BooleanAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5154u6 f68344a;

    public BooleanAttribute(String str, to toVar, InterfaceC4900k2 interfaceC4900k2) {
        this.f68344a = new C5154u6(str, toVar, interfaceC4900k2);
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC4793fo> withValue(boolean z10) {
        C5154u6 c5154u6 = this.f68344a;
        return new UserProfileUpdate<>(new Y2(c5154u6.f67772c, z10, c5154u6.f67770a, new C5127t4(c5154u6.f67771b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC4793fo> withValueIfUndefined(boolean z10) {
        C5154u6 c5154u6 = this.f68344a;
        return new UserProfileUpdate<>(new Y2(c5154u6.f67772c, z10, c5154u6.f67770a, new Yk(c5154u6.f67771b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC4793fo> withValueReset() {
        C5154u6 c5154u6 = this.f68344a;
        return new UserProfileUpdate<>(new Ci(3, c5154u6.f67772c, c5154u6.f67770a, c5154u6.f67771b));
    }
}
