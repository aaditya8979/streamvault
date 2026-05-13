package yads;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: loaded from: classes3.dex */
public final class tc2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f95146a;

    public tc2(Context context) {
        this.f95146a = context;
    }

    public final rc2 a() {
        Object systemService = this.f95146a.getSystemService("power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        Boolean boolValueOf = powerManager != null ? Boolean.valueOf(powerManager.isInteractive()) : null;
        if (boolValueOf != null && !boolValueOf.booleanValue()) {
            return rc2.f94373c;
        }
        Object systemService2 = this.f95146a.getSystemService("keyguard");
        KeyguardManager keyguardManager = systemService2 instanceof KeyguardManager ? (KeyguardManager) systemService2 : null;
        return (keyguardManager == null || !keyguardManager.isKeyguardLocked()) ? rc2.f94374d : rc2.f94372b;
    }
}
