package com.google.android.gms.internal.ads;

import android.graphics.PointF;
import androidx.annotation.Nullable;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
final class zzamx {
    private static final Pattern zzc = Pattern.compile("\\{([^}]*)\\}");
    private static final Pattern zzd;
    private static final Pattern zze;
    private static final Pattern zzf;
    public final int zza;

    @Nullable
    public final PointF zzb;

    static {
        String str = zzfj.zza;
        Locale locale = Locale.US;
        zzd = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        zze = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        zzf = Pattern.compile("\\\\an(\\d+)");
    }

    private zzamx(int i10, @Nullable PointF pointF) {
        this.zza = i10;
        this.zzb = pointF;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:5|35|6|(2:(1:9)|10)(1:(1:12)(8:19|(1:21)|37|22|41|(3:24|25|26)(1:28)|(3:40|30|44)(1:43)|42))|13|14|15|16|17|(0)|37|22|41|(0)(0)|(0)(0)|42|3) */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091 A[Catch: RuntimeException -> 0x000a, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x000a, blocks: (B:22:0x0085, B:24:0x0091, B:26:0x0098), top: B:37:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x000a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzamx zza(java.lang.String r13) {
        /*
            java.util.regex.Pattern r0 = com.google.android.gms.internal.ads.zzamx.zzc
            java.util.regex.Matcher r13 = r0.matcher(r13)
            r0 = 0
            r1 = -1
            r3 = r0
            r2 = r1
        La:
            boolean r4 = r13.find()
            if (r4 == 0) goto La3
            r4 = 1
            java.lang.String r5 = r13.group(r4)
            r5.getClass()
            java.lang.String r6 = "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='"
            java.lang.String r7 = "'"
            java.util.regex.Pattern r8 = com.google.android.gms.internal.ads.zzamx.zzd     // Catch: java.lang.RuntimeException -> L85
            java.util.regex.Matcher r8 = r8.matcher(r5)     // Catch: java.lang.RuntimeException -> L85
            java.util.regex.Pattern r9 = com.google.android.gms.internal.ads.zzamx.zze     // Catch: java.lang.RuntimeException -> L85
            java.util.regex.Matcher r9 = r9.matcher(r5)     // Catch: java.lang.RuntimeException -> L85
            boolean r10 = r8.find()     // Catch: java.lang.RuntimeException -> L85
            boolean r11 = r9.find()     // Catch: java.lang.RuntimeException -> L85
            r12 = 2
            if (r10 == 0) goto L5b
            if (r11 == 0) goto L52
            java.lang.String r9 = "SsaStyle.Overrides"
            int r10 = r5.length()     // Catch: java.lang.RuntimeException -> L85
            int r10 = r10 + 82
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L85
            r11.<init>(r10)     // Catch: java.lang.RuntimeException -> L85
            r11.append(r6)     // Catch: java.lang.RuntimeException -> L85
            r11.append(r5)     // Catch: java.lang.RuntimeException -> L85
            r11.append(r7)     // Catch: java.lang.RuntimeException -> L85
            java.lang.String r6 = r11.toString()     // Catch: java.lang.RuntimeException -> L85
            com.google.android.gms.internal.ads.zzee.zzb(r9, r6)     // Catch: java.lang.RuntimeException -> L85
        L52:
            java.lang.String r6 = r8.group(r4)     // Catch: java.lang.RuntimeException -> L85
            java.lang.String r7 = r8.group(r12)     // Catch: java.lang.RuntimeException -> L85
            goto L65
        L5b:
            if (r11 == 0) goto L81
            java.lang.String r6 = r9.group(r4)     // Catch: java.lang.RuntimeException -> L85
            java.lang.String r7 = r9.group(r12)     // Catch: java.lang.RuntimeException -> L85
        L65:
            android.graphics.PointF r8 = new android.graphics.PointF     // Catch: java.lang.RuntimeException -> L85
            r6.getClass()
            java.lang.String r6 = r6.trim()     // Catch: java.lang.RuntimeException -> L85
            float r6 = java.lang.Float.parseFloat(r6)     // Catch: java.lang.RuntimeException -> L85
            r7.getClass()
            java.lang.String r7 = r7.trim()     // Catch: java.lang.RuntimeException -> L85
            float r7 = java.lang.Float.parseFloat(r7)     // Catch: java.lang.RuntimeException -> L85
            r8.<init>(r6, r7)     // Catch: java.lang.RuntimeException -> L85
            goto L82
        L81:
            r8 = r0
        L82:
            if (r8 == 0) goto L85
            r3 = r8
        L85:
            java.util.regex.Pattern r6 = com.google.android.gms.internal.ads.zzamx.zzf     // Catch: java.lang.RuntimeException -> La
            java.util.regex.Matcher r5 = r6.matcher(r5)     // Catch: java.lang.RuntimeException -> La
            boolean r6 = r5.find()     // Catch: java.lang.RuntimeException -> La
            if (r6 == 0) goto L9d
            java.lang.String r4 = r5.group(r4)     // Catch: java.lang.RuntimeException -> La
            r4.getClass()
            int r4 = com.google.android.gms.internal.ads.zzamy.zzc(r4)     // Catch: java.lang.RuntimeException -> La
            goto L9e
        L9d:
            r4 = r1
        L9e:
            if (r4 == r1) goto La
            r2 = r4
            goto La
        La3:
            com.google.android.gms.internal.ads.zzamx r13 = new com.google.android.gms.internal.ads.zzamx
            r13.<init>(r2, r3)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamx.zza(java.lang.String):com.google.android.gms.internal.ads.zzamx");
    }

    public static String zzb(String str) {
        return zzc.matcher(str).replaceAll("");
    }
}
