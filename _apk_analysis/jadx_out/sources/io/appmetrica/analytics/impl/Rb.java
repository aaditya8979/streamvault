package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public final class Rb extends Lambda implements sn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Rb f65833a = new Rb();

    public Rb() {
        super(1);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        ((LocationControllerObserver) obj).startLocationTracking();
        return bn.r.f5635a;
    }
}
