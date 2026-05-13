package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeChangeListener;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class Q2 extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BatteryInfo f65781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ R2 f65782b;

    public Q2(R2 r22, BatteryInfo batteryInfo) {
        this.f65782b = r22;
        this.f65781a = batteryInfo;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        S2 s22 = this.f65782b.f65830a;
        ChargeType chargeType = this.f65781a.chargeType;
        ChargeType chargeType2 = S2.f65857d;
        synchronized (s22) {
            Iterator it = s22.f65860c.iterator();
            while (it.hasNext()) {
                ((ChargeTypeChangeListener) it.next()).onChargeTypeChanged(chargeType);
            }
        }
    }
}
