package io.appmetrica.analytics.impl;

import android.content.Context;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5073r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Zn f67599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Boolean f67600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Ca f67601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Da f67602d;

    public C5073r0() {
        this(new Zn());
    }

    public C5073r0(Zn zn2) {
        this.f67599a = zn2;
    }

    public final synchronized Ca a(Context context, S3 s32) {
        if (this.f67601c == null) {
            if (a(context)) {
                this.f67601c = new C5173v0();
            } else {
                this.f67601c = new C5049q0(context, s32);
            }
        }
        return this.f67601c;
    }

    public final boolean a(Context context) {
        Boolean bool = this.f67600b;
        if (bool == null) {
            synchronized (this) {
                bool = this.f67600b;
                if (bool == null) {
                    this.f67599a.getClass();
                    Boolean boolValueOf = Boolean.valueOf(!Zn.a(context));
                    this.f67600b = boolValueOf;
                    if (boolValueOf.booleanValue()) {
                        ImportantLogger.INSTANCE.info(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APP_METRICA, "User is locked. So use stubs. Events will not be sent.", new Object[0]);
                    }
                    bool = boolValueOf;
                }
            }
        }
        return bool.booleanValue();
    }
}
