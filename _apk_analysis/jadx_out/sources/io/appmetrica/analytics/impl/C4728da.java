package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.da, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4728da {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Boolean f66595a;

    public final void a(Context context) {
        if (this.f66595a == null) {
            synchronized (this) {
                if (this.f66595a == null) {
                    boolean z10 = false;
                    try {
                        File fileFromAppStorage = FileUtils.getFileFromAppStorage(context, "uuid.dat");
                        boolean zExists = fileFromAppStorage != null ? fileFromAppStorage.exists() : false;
                        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(context, "uuid.dat");
                        boolean zExists2 = fileFromSdkStorage != null ? fileFromSdkStorage.exists() : false;
                        if (zExists || zExists2) {
                            z10 = true;
                        }
                    } catch (Throwable unused) {
                    }
                    this.f66595a = Boolean.valueOf(z10);
                }
                bn.r rVar = bn.r.f5635a;
            }
        }
    }
}
