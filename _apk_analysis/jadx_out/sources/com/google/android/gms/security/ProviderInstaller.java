package com.google.android.gms.security;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes6.dex */
public class ProviderInstaller {

    @NonNull
    public static final String PROVIDER_NAME = "GmsCore_OpenSSL";
    private static final GoogleApiAvailabilityLight zza = GoogleApiAvailabilityLight.getInstance();
    private static final Object zzb = new Object();

    @Nullable
    @GuardedBy("ProviderInstaller.lock")
    private static Method zzc = null;

    @GuardedBy("ProviderInstaller.lock")
    private static boolean zzd = false;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    public interface ProviderInstallListener {
        void onProviderInstallFailed(int i10, @Nullable Intent intent);

        void onProviderInstalled();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[Catch: all -> 0x00a5, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0014, B:7:0x001b, B:12:0x003d, B:13:0x0042, B:10:0x0029, B:15:0x0044, B:26:0x008f, B:27:0x0094, B:29:0x0096, B:30:0x00a4, B:18:0x0051, B:20:0x0055, B:23:0x007f), top: B:36:0x0014, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f A[Catch: all -> 0x00a5, TryCatch #1 {, blocks: (B:4:0x0014, B:7:0x001b, B:12:0x003d, B:13:0x0042, B:10:0x0029, B:15:0x0044, B:26:0x008f, B:27:0x0094, B:29:0x0096, B:30:0x00a4, B:18:0x0051, B:20:0x0055, B:23:0x007f), top: B:36:0x0014, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096 A[Catch: all -> 0x00a5, TryCatch #1 {, blocks: (B:4:0x0014, B:7:0x001b, B:12:0x003d, B:13:0x0042, B:10:0x0029, B:15:0x0044, B:26:0x008f, B:27:0x0094, B:29:0x0096, B:30:0x00a4, B:18:0x0051, B:20:0x0055, B:23:0x007f), top: B:36:0x0014, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void installIfNeeded(@androidx.annotation.NonNull android.content.Context r14) throws com.google.android.gms.common.GooglePlayServicesRepairableException, com.google.android.gms.common.GooglePlayServicesNotAvailableException {
        /*
            java.lang.String r0 = "Context must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r14, r0)
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = com.google.android.gms.security.ProviderInstaller.zza
            r1 = 11925000(0xb5f608, float:1.6710484E-38)
            r0.verifyGooglePlayServicesIsAvailable(r14, r1)
            long r0 = android.os.SystemClock.uptimeMillis()
            java.lang.Object r2 = com.google.android.gms.security.ProviderInstaller.zzb
            monitor-enter(r2)
            boolean r3 = com.google.android.gms.security.ProviderInstaller.zzd     // Catch: java.lang.Throwable -> La5
            r4 = 0
            if (r3 != 0) goto L44
            java.lang.String r3 = "Failed to load providerinstaller module: "
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy r5 = com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L28 java.lang.Throwable -> La5
            java.lang.String r6 = "com.google.android.gms.providerinstaller.dynamite"
            com.google.android.gms.dynamite.DynamiteModule r5 = com.google.android.gms.dynamite.DynamiteModule.load(r14, r5, r6)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L28 java.lang.Throwable -> La5
            android.content.Context r3 = r5.getModuleContext()     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L28 java.lang.Throwable -> La5
            goto L3b
        L28:
            r5 = move-exception
            java.lang.String r6 = "ProviderInstaller"
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> La5
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> La5
            java.lang.String r3 = r3.concat(r5)     // Catch: java.lang.Throwable -> La5
            android.util.Log.w(r6, r3)     // Catch: java.lang.Throwable -> La5
            r3 = r4
        L3b:
            if (r3 == 0) goto L44
            java.lang.String r0 = "com.google.android.gms.providerinstaller.ProviderInstallerImpl"
            zzb(r3, r14, r0)     // Catch: java.lang.Throwable -> La5
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La5
            return
        L44:
            boolean r3 = com.google.android.gms.security.ProviderInstaller.zzd     // Catch: java.lang.Throwable -> La5
            r5 = 1
            r3 = r3 ^ r5
            java.lang.String r6 = "Failed to report request stats: "
            android.content.Context r7 = com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteContext(r14)     // Catch: java.lang.Throwable -> La5
            if (r7 != 0) goto L51
            goto L8d
        L51:
            com.google.android.gms.security.ProviderInstaller.zzd = r5     // Catch: java.lang.Throwable -> La5
            if (r3 == 0) goto L8c
            long r3 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> La5
            java.lang.String r8 = "com.google.android.gms.common.security.ProviderInstallerImpl"
            java.lang.String r9 = "reportRequestStats2"
            java.lang.ClassLoader r10 = r7.getClassLoader()     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> La5
            r11 = 3
            com.google.android.gms.internal.common.zzi[] r11 = new com.google.android.gms.internal.common.zzi[r11]     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> La5
            java.lang.Class<android.content.Context> r12 = android.content.Context.class
            r13 = 0
            com.google.android.gms.internal.common.zzi r12 = com.google.android.gms.internal.common.zzi.zzb(r12, r14)     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> La5
            r11[r13] = r12     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> La5
            com.google.android.gms.internal.common.zzh r0 = com.google.android.gms.internal.common.zzh.zza(r0)     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> La5
            r11[r5] = r0     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> La5
            r0 = 2
            com.google.android.gms.internal.common.zzh r1 = com.google.android.gms.internal.common.zzh.zza(r3)     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> La5
            r11[r0] = r1     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> La5
            com.google.android.gms.internal.common.zzj.zzb(r8, r9, r10, r11)     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> La5
            goto L8c
        L7e:
            r0 = move-exception
            java.lang.String r1 = "ProviderInstaller"
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> La5
            java.lang.String r0 = r6.concat(r0)     // Catch: java.lang.Throwable -> La5
            android.util.Log.w(r1, r0)     // Catch: java.lang.Throwable -> La5
        L8c:
            r4 = r7
        L8d:
            if (r4 == 0) goto L96
            java.lang.String r0 = "com.google.android.gms.common.security.ProviderInstallerImpl"
            zzb(r4, r14, r0)     // Catch: java.lang.Throwable -> La5
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La5
            return
        L96:
            java.lang.String r14 = "ProviderInstaller"
            java.lang.String r0 = "Failed to get remote context"
            android.util.Log.e(r14, r0)     // Catch: java.lang.Throwable -> La5
            com.google.android.gms.common.GooglePlayServicesNotAvailableException r14 = new com.google.android.gms.common.GooglePlayServicesNotAvailableException     // Catch: java.lang.Throwable -> La5
            r0 = 8
            r14.<init>(r0)     // Catch: java.lang.Throwable -> La5
            throw r14     // Catch: java.lang.Throwable -> La5
        La5:
            r14 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La5
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.security.ProviderInstaller.installIfNeeded(android.content.Context):void");
    }

    public static void installIfNeededAsync(@NonNull Context context, @NonNull ProviderInstallListener providerInstallListener) {
        Preconditions.checkNotNull(context, "Context must not be null");
        Preconditions.checkNotNull(providerInstallListener, "Listener must not be null");
        Preconditions.checkMainThread("Must be called on the UI thread");
        new zza(context, providerInstallListener).execute(new Void[0]);
    }

    @GuardedBy("ProviderInstaller.lock")
    private static void zzb(Context context, Context context2, String str) throws GooglePlayServicesNotAvailableException {
        try {
            if (zzc == null) {
                zzc = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            zzc.invoke(null, context);
        } catch (Exception e10) {
            Throwable cause = e10.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e10.toString() : cause.toString())));
            }
            throw new GooglePlayServicesNotAvailableException(8);
        }
    }
}
