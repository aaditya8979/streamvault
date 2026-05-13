package com.google.android.exoplayer2.drm;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.g;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.common.collect.ImmutableMap;
import com.ironsource.G5;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import r7.h;
import r7.k;
import r7.x;
import s7.m0;

/* JADX INFO: compiled from: HttpMediaDrmCallback.java */
/* JADX INFO: loaded from: classes8.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h.a f21541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f21542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f21543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, String> f21544d;

    public i(@Nullable String str, boolean z10, h.a aVar) {
        s7.a.a((z10 && TextUtils.isEmpty(str)) ? false : true);
        this.f21541a = aVar;
        this.f21542b = str;
        this.f21543c = z10;
        this.f21544d = new HashMap();
    }

    public static byte[] c(h.a aVar, String str, @Nullable byte[] bArr, Map<String, String> map) throws MediaDrmCallbackException {
        x xVar = new x(aVar.createDataSource());
        k kVarA = new k.b().i(str).e(map).d(2).c(bArr).b(1).a();
        int i10 = 0;
        k kVarA2 = kVarA;
        while (true) {
            try {
                r7.i iVar = new r7.i(xVar, kVarA2);
                try {
                    return m0.M0(iVar);
                } catch (HttpDataSource$InvalidResponseCodeException e10) {
                    String strD = d(e10, i10);
                    if (strD == null) {
                        throw e10;
                    }
                    i10++;
                    kVarA2 = kVarA2.a().i(strD).a();
                } finally {
                    m0.m(iVar);
                }
            } catch (Exception e11) {
                throw new MediaDrmCallbackException(kVarA, (Uri) s7.a.e(xVar.d()), xVar.getResponseHeaders(), xVar.c(), e11);
            }
        }
    }

    @Nullable
    public static String d(HttpDataSource$InvalidResponseCodeException httpDataSource$InvalidResponseCodeException, int i10) {
        Map<String, List<String>> map;
        List<String> list;
        int i11 = httpDataSource$InvalidResponseCodeException.responseCode;
        if (!((i11 == 307 || i11 == 308) && i10 < 5) || (map = httpDataSource$InvalidResponseCodeException.headerFields) == null || (list = map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override // com.google.android.exoplayer2.drm.j
    public byte[] a(UUID uuid, g.a aVar) throws MediaDrmCallbackException {
        String strB = aVar.b();
        if (this.f21543c || TextUtils.isEmpty(strB)) {
            strB = this.f21542b;
        }
        if (TextUtils.isEmpty(strB)) {
            throw new MediaDrmCallbackException(new k.b().h(Uri.EMPTY).a(), Uri.EMPTY, ImmutableMap.of(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = d6.c.f59585e;
        map.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : d6.c.f59583c.equals(uuid) ? G5.L : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f21544d) {
            map.putAll(this.f21544d);
        }
        return c(this.f21541a, strB, aVar.a(), map);
    }

    @Override // com.google.android.exoplayer2.drm.j
    public byte[] b(UUID uuid, g.d dVar) throws MediaDrmCallbackException {
        return c(this.f21541a, dVar.b() + "&signedRequest=" + m0.A(dVar.a()), null, Collections.emptyMap());
    }

    public void e(String str, String str2) {
        s7.a.e(str);
        s7.a.e(str2);
        synchronized (this.f21544d) {
            this.f21544d.put(str, str2);
        }
    }
}
