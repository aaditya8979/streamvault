package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.pn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5047pn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5096rn f67542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC5096rn f67543b;

    public C5047pn(Context context) {
        if (new SafePackageManager().hasSystemFeature(context, "android.hardware.telephony")) {
            this.f67542a = new M2(new C5020ol(context));
            this.f67543b = new M2(new Mc(context));
        } else {
            this.f67542a = new Z7();
            this.f67543b = new Z7();
        }
    }
}
