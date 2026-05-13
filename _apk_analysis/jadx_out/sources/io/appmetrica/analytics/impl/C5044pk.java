package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.pk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5044pk implements Jc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xo f67536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f67537b = "startup_state";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AESEncrypter f67538c;

    public C5044pk(@NotNull xo xoVar) {
        this.f67536a = xoVar;
        C4639a c4639a = new C4639a(C5009oa.k().g());
        this.f67538c = new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, c4639a.b(), c4639a.a());
    }

    public static void a(xo xoVar, C4894jm c4894jm, Bb bb2) {
        String strOptStringOrNull;
        synchronized (xoVar) {
            strOptStringOrNull = JsonUtils.optStringOrNull(xoVar.f67993a.a(), "device_id");
        }
        if (TextUtils.isEmpty(strOptStringOrNull)) {
            if (!TextUtils.isEmpty(bb2.f65034d)) {
                xoVar.a(bb2.f65034d);
            }
            if (!TextUtils.isEmpty(bb2.f65035e)) {
                xoVar.b(bb2.f65035e);
            }
            if (TextUtils.isEmpty(bb2.f65031a)) {
                return;
            }
            c4894jm.f67045a = bb2.f65031a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048 A[Catch: all -> 0x004d, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x004d, blocks: (B:5:0x001d, B:7:0x0023, B:9:0x0029, B:13:0x0048), top: B:21:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.appmetrica.analytics.impl.Bb a(android.database.sqlite.SQLiteDatabase r12) {
        /*
            r11 = this;
            java.lang.String r0 = "value"
            r1 = 0
            java.lang.String r3 = "binary_data"
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L4c
            java.lang.String r5 = "data_key = ?"
            r10 = 1
            java.lang.String[] r6 = new java.lang.String[r10]     // Catch: java.lang.Throwable -> L4c
            r2 = 0
            java.lang.String r7 = r11.f67537b     // Catch: java.lang.Throwable -> L4c
            r6[r2] = r7     // Catch: java.lang.Throwable -> L4c
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r12
            android.database.Cursor r12 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L4c
            if (r12 == 0) goto L46
            int r2 = r12.getCount()     // Catch: java.lang.Throwable -> L4d
            if (r2 != r10) goto L46
            boolean r2 = r12.moveToFirst()     // Catch: java.lang.Throwable -> L4d
            if (r2 == 0) goto L46
            int r0 = r12.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L4d
            byte[] r0 = r12.getBlob(r0)     // Catch: java.lang.Throwable -> L4d
            io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter r2 = r11.f67538c     // Catch: java.lang.Throwable -> L4d
            byte[] r0 = r2.decrypt(r0)     // Catch: java.lang.Throwable -> L4d
            io.appmetrica.analytics.impl.Bb r2 = new io.appmetrica.analytics.impl.Bb     // Catch: java.lang.Throwable -> L4d
            r2.<init>()     // Catch: java.lang.Throwable -> L4d
            io.appmetrica.analytics.protobuf.nano.MessageNano r0 = io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(r2, r0)     // Catch: java.lang.Throwable -> L4d
            io.appmetrica.analytics.impl.Bb r0 = (io.appmetrica.analytics.impl.Bb) r0     // Catch: java.lang.Throwable -> L4d
            io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt.closeSafely(r12)
            return r0
        L46:
            if (r12 == 0) goto L4d
            r12.getCount()     // Catch: java.lang.Throwable -> L4d
            goto L4d
        L4c:
            r12 = r1
        L4d:
            io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt.closeSafely(r12)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C5044pk.a(android.database.sqlite.SQLiteDatabase):io.appmetrica.analytics.impl.Bb");
    }

    @Override // io.appmetrica.analytics.impl.Jc
    public final void a(@NotNull Context context) {
        SQLiteDatabase readableDatabase = C5009oa.I.B().f(context).getReadableDatabase();
        if (readableDatabase != null) {
            try {
                Bb bbA = a(readableDatabase);
                C4894jm c4894jm = new C4894jm(new C4953m4(new C4902k4()));
                if (bbA != null) {
                    a(this.f67536a, c4894jm, bbA);
                    c4894jm.f67060p = bbA.f65033c;
                    c4894jm.f67062r = bbA.f65032b;
                }
                C4920km c4920km = new C4920km(c4894jm);
                Sm sm2 = (Sm) Qm.a(C4920km.class);
                sm2.a(context, sm2.b(context)).save(c4920km);
            } catch (Throwable unused) {
            }
        }
    }
}
