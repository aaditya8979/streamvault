package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class G1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4676ba f65271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f65272b;

    public G1() {
        this(new C4676ba());
    }

    public G1(C4676ba c4676ba) {
        this.f65272b = false;
        this.f65271a = c4676ba;
    }

    public final synchronized long a(Context context) {
        String strA;
        try {
            this.f65271a.getClass();
            strA = Ka.a(FileUtils.getFileFromAppStorage(context, "metrica_service_settings.dat"));
        } catch (Throwable unused) {
        }
        return !TextUtils.isEmpty(strA) ? new JSONObject(strA).optLong("delay") : 0L;
    }

    public final void b(Context context) {
        synchronized (this) {
        }
        if (this.f65272b) {
            return;
        }
        long jA = a(context);
        if (jA > 0) {
            try {
                Thread.sleep(jA);
            } catch (Throwable unused) {
            }
        }
        this.f65272b = true;
    }
}
