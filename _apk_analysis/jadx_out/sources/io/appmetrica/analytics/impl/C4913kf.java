package io.appmetrica.analytics.impl;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.kf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4913kf implements Vi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f67124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f67125b = "content://" + a() + "/preload_info";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f67126c = "tracking_id";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f67127d = "additional_parameters";

    public C4913kf(@NotNull Context context) {
        this.f67124a = context;
    }

    @NotNull
    public final String a() {
        return "com.yandex.preinstallsatellite.appmetrica.provider";
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067 A[Catch: all -> 0x00a7, TryCatch #1 {all -> 0x00a7, blocks: (B:8:0x002a, B:10:0x0030, B:19:0x0061, B:21:0x0067, B:24:0x006e, B:25:0x0076, B:18:0x005b, B:28:0x0096, B:29:0x009e, B:12:0x0046, B:15:0x004d, B:16:0x0054), top: B:37:0x0028, inners: #2 }] */
    @Override // io.appmetrica.analytics.impl.Vi, sn.a
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.appmetrica.analytics.impl.C5088rf invoke() {
        /*
            r10 = this;
            android.content.Context r0 = r10.f67124a
            java.lang.String r1 = "com.yandex.preinstallsatellite.appmetrica.provider"
            boolean r0 = io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils.hasContentProvider(r0, r1)
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L14
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "Satellite content provider with preload info was not found."
            io.appmetrica.analytics.impl.AbstractC4814gj.a(r2, r0)
            return r1
        L14:
            android.content.Context r0 = r10.f67124a     // Catch: java.lang.Throwable -> La6
            android.content.ContentResolver r3 = r0.getContentResolver()     // Catch: java.lang.Throwable -> La6
            java.lang.String r0 = r10.f67125b     // Catch: java.lang.Throwable -> La6
            android.net.Uri r4 = android.net.Uri.parse(r0)     // Catch: java.lang.Throwable -> La6
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r0 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> La6
            if (r0 == 0) goto L9e
            boolean r3 = r0.moveToFirst()     // Catch: java.lang.Throwable -> La7
            if (r3 == 0) goto L96
            java.lang.String r3 = r10.f67126c     // Catch: java.lang.Throwable -> La7
            int r3 = r0.getColumnIndexOrThrow(r3)     // Catch: java.lang.Throwable -> La7
            java.lang.String r5 = r0.getString(r3)     // Catch: java.lang.Throwable -> La7
            java.lang.String r3 = r10.f67127d     // Catch: java.lang.Throwable -> La7
            int r3 = r0.getColumnIndexOrThrow(r3)     // Catch: java.lang.Throwable -> La7
            java.lang.String r3 = r0.getString(r3)     // Catch: java.lang.Throwable -> La7
            if (r3 == 0) goto L54
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L5b
            if (r4 != 0) goto L4d
            goto L54
        L4d:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5b
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L5b
            r6 = r4
            goto L61
        L54:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5b
            r3.<init>()     // Catch: java.lang.Throwable -> L5b
        L59:
            r6 = r3
            goto L61
        L5b:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La7
            r3.<init>()     // Catch: java.lang.Throwable -> La7
            goto L59
        L61:
            boolean r3 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> La7
            if (r3 != 0) goto L76
            java.lang.Long r3 = io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils.parseLong(r5)     // Catch: java.lang.Throwable -> La7
            if (r3 == 0) goto L6e
            goto L76
        L6e:
            java.lang.String r3 = "Tracking id from Satellite is not a number."
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> La7
            io.appmetrica.analytics.impl.AbstractC4814gj.a(r3, r2)     // Catch: java.lang.Throwable -> La7
            goto La7
        L76:
            java.lang.String r3 = "Preload info from Satellite: {tracking id = %s, additional parameters = %s}"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> La7
            r4[r2] = r5     // Catch: java.lang.Throwable -> La7
            r2 = 1
            r4[r2] = r6     // Catch: java.lang.Throwable -> La7
            io.appmetrica.analytics.impl.AbstractC4814gj.a(r3, r4)     // Catch: java.lang.Throwable -> La7
            io.appmetrica.analytics.impl.rf r3 = new io.appmetrica.analytics.impl.rf     // Catch: java.lang.Throwable -> La7
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> La7
            r7 = r4 ^ 1
            r8 = 0
            io.appmetrica.analytics.impl.T7 r9 = io.appmetrica.analytics.impl.T7.f65927d     // Catch: java.lang.Throwable -> La7
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> La7
            io.appmetrica.analytics.impl.mo.a(r0)
            return r3
        L96:
            java.lang.String r3 = "No Preload Info data in Satellite content provider"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> La7
            io.appmetrica.analytics.impl.AbstractC4814gj.a(r3, r2)     // Catch: java.lang.Throwable -> La7
            goto La7
        L9e:
            java.lang.String r3 = "No Satellite content provider found"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> La7
            io.appmetrica.analytics.impl.AbstractC4814gj.a(r3, r2)     // Catch: java.lang.Throwable -> La7
            goto La7
        La6:
            r0 = r1
        La7:
            io.appmetrica.analytics.impl.mo.a(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C4913kf.invoke():io.appmetrica.analytics.impl.rf");
    }
}
