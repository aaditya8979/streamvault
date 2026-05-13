package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ca, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4702ca implements Co {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f66498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f66499b;

    public C4702ca(@NotNull Context context, @NotNull String str) {
        this.f66498a = context;
        this.f66499b = str;
    }

    @Override // io.appmetrica.analytics.impl.Co
    @Nullable
    public final String a() {
        try {
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f66498a, this.f66499b);
            if (fileFromSdkStorage == null) {
                return null;
            }
            fileFromSdkStorage.exists();
            File fileFromAppStorage = FileUtils.getFileFromAppStorage(this.f66498a, this.f66499b);
            if (fileFromAppStorage != null) {
                FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
            }
            return on.g.l(fileFromSdkStorage, null, 1, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // io.appmetrica.analytics.impl.Co
    public final void a(@NotNull String str) {
        try {
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f66498a, this.f66499b);
            if (fileFromSdkStorage != null) {
                on.g.o(fileFromSdkStorage, str, null, 2, null);
            }
        } catch (Throwable unused) {
        }
    }
}
