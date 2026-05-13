package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.g0;
import java.io.File;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
public final class m implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f48243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f48244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f48245c;

    public m(@NotNull Context context, @NotNull String str) {
        tn.p.k(context, "appContext");
        tn.p.k(str, "cacheDir");
        this.f48243a = context;
        this.f48244b = str;
        this.f48245c = "MediaCacheLocationProviderImpl";
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.l
    @NotNull
    public g0<File, com.moloco.sdk.internal.q> a() {
        try {
            File externalCacheDir = this.f48243a.getExternalCacheDir();
            if (externalCacheDir != null) {
                File file = new File(externalCacheDir, this.f48244b);
                file.mkdir();
                if (file.exists()) {
                    return new g0.b(file);
                }
            }
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, this.f48245c, "Failed to create cache directory in external storage", null, false, 12, null);
            return new g0.a(new com.moloco.sdk.internal.q("Failed to create cache directory in external storage", 102));
        } catch (IOException e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f48245c, "Failed to create cache directory in external storage", e10, false, 8, null);
            return new g0.a(new com.moloco.sdk.internal.q("Failed to create cache directory in external storage", 101));
        } catch (SecurityException e11) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f48245c, "Failed to create cache directory in external storage", e11, false, 8, null);
            return new g0.a(new com.moloco.sdk.internal.q("Failed to create cache directory in external storage", 100));
        } catch (Exception e12) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f48245c, "Failed to create cache directory in external storage", e12, false, 8, null);
            return new g0.a(new com.moloco.sdk.internal.q("Failed to create cache directory in external storage", 200));
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.l
    @NotNull
    public g0<File, com.moloco.sdk.internal.q> b() {
        try {
            if (this.f48243a.getCacheDir() != null) {
                File file = new File(this.f48243a.getCacheDir(), this.f48244b);
                file.mkdir();
                if (file.exists()) {
                    MolocoLogger.debug$default(MolocoLogger.INSTANCE, this.f48245c, "Able to write to internal storage cache directory", false, 4, null);
                    return new g0.b(file);
                }
            }
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f48245c, "Failed to create cache directory in internal storage", null, false, 12, null);
            return new g0.a(new com.moloco.sdk.internal.q("Failed to create cache directory in internal storage", 102));
        } catch (IOException e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f48245c, "Failed to create cache directory in external storage", e10, false, 8, null);
            return new g0.a(new com.moloco.sdk.internal.q("Failed to create cache directory in internal storage", 101));
        } catch (SecurityException e11) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f48245c, "Failed to create cache directory in external storage", e11, false, 8, null);
            return new g0.a(new com.moloco.sdk.internal.q("Failed to create cache directory in internal storage", 100));
        } catch (Exception e12) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f48245c, "Failed to create cache directory in external storage", e12, false, 8, null);
            return new g0.a(new com.moloco.sdk.internal.q("Failed to create cache directory in internal storage", 200));
        }
    }
}
