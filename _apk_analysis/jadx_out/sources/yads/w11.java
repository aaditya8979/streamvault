package yads;

import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.G5;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class w11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o30 f96254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f96255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f96256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f96257d;

    public w11(String str, boolean z10, pd0 pd0Var) {
        ni.a((z10 && TextUtils.isEmpty(str)) ? false : true);
        this.f96254a = pd0Var;
        this.f96255b = str;
        this.f96256c = z10;
        this.f96257d = new HashMap();
    }

    public static byte[] a(o30 o30Var, String str, byte[] bArr, Map map) throws hl1 {
        r30 r30Var;
        Map map2;
        List list;
        byte[] bArr2;
        ByteArrayOutputStream byteArrayOutputStream;
        r33 r33Var = new r33(o30Var.createDataSource());
        Collections.emptyMap();
        Uri uri = Uri.parse(str);
        ni.a(uri, "The uri must be set.");
        String str2 = "The uri must be set.";
        u30 u30Var = new u30(uri, 0L, 2, bArr, map, 0L, -1L, null, 1, null);
        int i10 = 0;
        int i11 = 0;
        u30 u30Var2 = u30Var;
        while (true) {
            try {
                r30Var = new r30(r33Var, u30Var2);
                try {
                    int i12 = ib3.f90737a;
                    bArr2 = new byte[4096];
                    byteArrayOutputStream = new ByteArrayOutputStream();
                } catch (s11 e10) {
                    try {
                        int i13 = e10.f94672e;
                        String str3 = ((i13 != 307 && i13 != 308) || i11 >= 5 || (map2 = e10.f94673f) == null || (list = (List) map2.get("Location")) == null || list.isEmpty()) ? null : (String) list.get(i10);
                        if (str3 == null) {
                            throw e10;
                        }
                        int i14 = i11 + 1;
                        long j10 = u30Var2.f95523b;
                        int i15 = u30Var2.f95524c;
                        byte[] bArr3 = u30Var2.f95525d;
                        Map map3 = u30Var2.f95526e;
                        long j11 = u30Var2.f95527f;
                        long j12 = u30Var2.f95528g;
                        String str4 = u30Var2.f95529h;
                        int i16 = u30Var2.f95530i;
                        Object obj = u30Var2.f95531j;
                        Uri uri2 = Uri.parse(str3);
                        String str5 = str2;
                        ni.a(uri2, str5);
                        u30Var2 = new u30(uri2, j10, i15, bArr3, map3, j11, j12, str4, i16, obj);
                        i10 = 0;
                        str2 = str5;
                        i11 = i14;
                    } finally {
                        ib3.a((Closeable) r30Var);
                    }
                }
            } catch (Exception e11) {
                Uri uri3 = r33Var.f94279c;
                uri3.getClass();
                throw new hl1(u30Var, uri3, r33Var.f94277a.getResponseHeaders(), r33Var.f94278b, e11);
            }
            while (true) {
                int i17 = r30Var.read(bArr2);
                if (i17 == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr2, i10, i17);
                Uri uri32 = r33Var.f94279c;
                uri32.getClass();
                throw new hl1(u30Var, uri32, r33Var.f94277a.getResponseHeaders(), r33Var.f94278b, e11);
            }
        }
    }

    public final byte[] a(UUID uuid, kn0 kn0Var) throws hl1 {
        String str = kn0Var.f91664b;
        if (this.f96256c || TextUtils.isEmpty(str)) {
            str = this.f96255b;
        }
        if (TextUtils.isEmpty(str)) {
            Map mapEmptyMap = Collections.emptyMap();
            Uri uri = Uri.EMPTY;
            ni.a(uri, "The uri must be set.");
            throw new hl1(new u30(uri, 0L, 1, null, mapEmptyMap, 0L, -1L, null, 0, null), uri, xm2.f96817h, 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = jr.f91334e;
        map.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : jr.f91332c.equals(uuid) ? G5.L : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f96257d) {
            map.putAll(this.f96257d);
        }
        return a(this.f96254a, str, kn0Var.f91663a, map);
    }

    public final byte[] a(nn0 nn0Var) {
        return a(this.f96254a, nn0Var.f92895b + "&signedRequest=" + ib3.a(nn0Var.f92894a), null, Collections.emptyMap());
    }
}
