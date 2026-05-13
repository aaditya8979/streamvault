package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C5084rb;
import io.appmetrica.analytics.impl.C5154u6;
import io.appmetrica.analytics.impl.Hb;
import io.appmetrica.analytics.impl.InterfaceC4793fo;
import io.appmetrica.analytics.impl.R5;

/* JADX INFO: loaded from: classes2.dex */
public final class CounterAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5154u6 f68345a;

    public CounterAttribute(String str, C5084rb c5084rb, Hb hb2) {
        this.f68345a = new C5154u6(str, c5084rb, hb2);
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC4793fo> withDelta(double d10) {
        return new UserProfileUpdate<>(new R5(this.f68345a.f67772c, d10));
    }
}
