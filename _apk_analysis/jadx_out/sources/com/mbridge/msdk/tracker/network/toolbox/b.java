package com.mbridge.msdk.tracker.network.toolbox;

import android.os.SystemClock;
import android.text.TextUtils;
import com.mbridge.msdk.tracker.network.b0;
import com.mbridge.msdk.tracker.network.p;
import com.mbridge.msdk.tracker.network.q;
import com.mbridge.msdk.tracker.network.t;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: BasicNetwork.java */
/* JADX INFO: loaded from: classes8.dex */
public class b implements com.mbridge.msdk.tracker.network.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f41054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f41055b;

    public b(a aVar) {
        this(aVar, new c(4096));
    }

    public b(a aVar, c cVar) {
        this.f41054a = aVar;
        this.f41055b = cVar;
    }

    private static void a(p pVar, int i10) {
        if (pVar != null) {
            try {
                pVar.b(i10);
            } catch (Exception unused) {
            }
        }
    }

    private static void a(p pVar, int i10, Exception exc) {
        if (pVar != null) {
            try {
                pVar.a(exc);
                pVar.a(i10);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.mbridge.msdk.tracker.network.p b(com.mbridge.msdk.tracker.network.t<?> r4) {
        /*
            if (r4 == 0) goto L14
            boolean r0 = r4.a()     // Catch: java.lang.Exception -> L4d
            if (r0 == 0) goto L14
            java.lang.String r0 = r4.t()     // Catch: java.lang.Exception -> L4d
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L4d
            if (r0 != 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L4d
            int r0 = r4.g()     // Catch: java.lang.Exception -> L4d
            if (r0 != 0) goto L20
            java.lang.String r0 = "GET"
            goto L22
        L20:
            java.lang.String r0 = "POST"
        L22:
            com.mbridge.msdk.tracker.network.p r1 = new com.mbridge.msdk.tracker.network.p     // Catch: java.lang.Exception -> L4d
            java.lang.String r2 = r4.p()     // Catch: java.lang.Exception -> L4d
            r1.<init>(r2, r0)     // Catch: java.lang.Exception -> L4d
            java.lang.String r0 = "queue"
            r1.d(r0)     // Catch: java.lang.Exception -> L4d
            java.lang.String r0 = "local_id"
            java.lang.String r0 = r4.d(r0)     // Catch: java.lang.Exception -> L4d
            r1.e(r0)     // Catch: java.lang.Exception -> L4d
            java.lang.String r0 = "ad_type"
            java.lang.String r0 = r4.d(r0)     // Catch: java.lang.Exception -> L4d
            r1.a(r0)     // Catch: java.lang.Exception -> L4d
            long r2 = r4.r()     // Catch: java.lang.Exception -> L4d
            r1.i(r2)     // Catch: java.lang.Exception -> L4d
            r4.a(r1)     // Catch: java.lang.Exception -> L4d
            return r1
        L4d:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.tracker.network.toolbox.b.b(com.mbridge.msdk.tracker.network.t):com.mbridge.msdk.tracker.network.p");
    }

    @Override // com.mbridge.msdk.tracker.network.m
    public q a(t<?> tVar) throws b0 {
        IOException iOException;
        g gVar;
        byte[] bArr;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        p pVarB = b(tVar);
        while (true) {
            Collections.emptyList();
            try {
                g gVarA = this.f41054a.a(tVar, f.a(tVar.d()));
                try {
                    int iD = gVarA.d();
                    a(pVarB, iD);
                    List<com.mbridge.msdk.tracker.network.g> listC = gVarA.c();
                    if (iD == 304) {
                        return k.a(tVar, SystemClock.elapsedRealtime() - jElapsedRealtime, listC);
                    }
                    InputStream inputStreamA = gVarA.a();
                    byte[] bArrA = inputStreamA != null ? k.a(inputStreamA, gVarA.b(), this.f41055b, pVarB) : new byte[0];
                    try {
                        k.a(SystemClock.elapsedRealtime() - jElapsedRealtime, tVar, bArrA, iD);
                        if (iD < 200 || iD > 299) {
                            throw new IOException();
                        }
                        a(pVarB, 1, null);
                        return new q(iD, bArrA, false, SystemClock.elapsedRealtime() - jElapsedRealtime, listC);
                    } catch (IOException e10) {
                        e = e10;
                        gVar = gVarA;
                        bArr = bArrA;
                        iOException = e;
                        a(pVarB, TextUtils.equals(iOException.getMessage(), "timeout") ? 3 : 2, iOException);
                        k.a(tVar, k.a(tVar, iOException, jElapsedRealtime, gVar, bArr));
                    }
                } catch (IOException e11) {
                    e = e11;
                    bArr = null;
                    gVar = gVarA;
                }
            } catch (IOException e12) {
                iOException = e12;
                gVar = null;
                bArr = null;
            }
            a(pVarB, TextUtils.equals(iOException.getMessage(), "timeout") ? 3 : 2, iOException);
            k.a(tVar, k.a(tVar, iOException, jElapsedRealtime, gVar, bArr));
        }
    }
}
