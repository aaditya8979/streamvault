package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class Be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f65042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final po f65043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qo f65044c;

    public Be(Context context) {
        this(context, new po(), new qo());
    }

    public Be(Context context, po poVar, qo qoVar) {
        this.f65042a = context;
        this.f65043b = poVar;
        this.f65044c = qoVar;
    }

    public final String a(String str) {
        try {
            this.f65044c.getClass();
            if (!qo.a(str)) {
                this.f65043b.getClass();
                str = bo.a0.S(UUID.randomUUID().toString(), "-", "", false, 4, null).toLowerCase(Locale.US);
            }
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f65042a, "uuid.dat");
            if (fileFromSdkStorage != null && str != null) {
                Ka.a(str, new FileOutputStream(fileFromSdkStorage));
            }
            return str;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void a() {
        File fileFromAppStorage;
        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f65042a, "uuid.dat");
        if (fileFromSdkStorage == null || fileFromSdkStorage.exists() || (fileFromAppStorage = FileUtils.getFileFromAppStorage(this.f65042a, "uuid.dat")) == null || !fileFromAppStorage.exists()) {
            return;
        }
        FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
    }
}
