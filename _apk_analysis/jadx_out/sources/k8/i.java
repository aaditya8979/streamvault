package k8;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ResultMetadataType;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: compiled from: Result.java */
/* JADX INFO: loaded from: classes11.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f73028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f73029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j[] f73030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BarcodeFormat f73031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<ResultMetadataType, Object> f73032f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f73033g;

    public i(String str, byte[] bArr, int i10, j[] jVarArr, BarcodeFormat barcodeFormat, long j10) {
        this.f73027a = str;
        this.f73028b = bArr;
        this.f73029c = i10;
        this.f73030d = jVarArr;
        this.f73031e = barcodeFormat;
        this.f73032f = null;
        this.f73033g = j10;
    }

    public i(String str, byte[] bArr, j[] jVarArr, BarcodeFormat barcodeFormat) {
        this(str, bArr, jVarArr, barcodeFormat, System.currentTimeMillis());
    }

    public i(String str, byte[] bArr, j[] jVarArr, BarcodeFormat barcodeFormat, long j10) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, jVarArr, barcodeFormat, j10);
    }

    public void a(j[] jVarArr) {
        j[] jVarArr2 = this.f73030d;
        if (jVarArr2 == null) {
            this.f73030d = jVarArr;
            return;
        }
        if (jVarArr == null || jVarArr.length <= 0) {
            return;
        }
        j[] jVarArr3 = new j[jVarArr2.length + jVarArr.length];
        System.arraycopy(jVarArr2, 0, jVarArr3, 0, jVarArr2.length);
        System.arraycopy(jVarArr, 0, jVarArr3, jVarArr2.length, jVarArr.length);
        this.f73030d = jVarArr3;
    }

    public BarcodeFormat b() {
        return this.f73031e;
    }

    public byte[] c() {
        return this.f73028b;
    }

    public Map<ResultMetadataType, Object> d() {
        return this.f73032f;
    }

    public j[] e() {
        return this.f73030d;
    }

    public String f() {
        return this.f73027a;
    }

    public void g(Map<ResultMetadataType, Object> map) {
        if (map != null) {
            Map<ResultMetadataType, Object> map2 = this.f73032f;
            if (map2 == null) {
                this.f73032f = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    public void h(ResultMetadataType resultMetadataType, Object obj) {
        if (this.f73032f == null) {
            this.f73032f = new EnumMap(ResultMetadataType.class);
        }
        this.f73032f.put(resultMetadataType, obj);
    }

    public String toString() {
        return this.f73027a;
    }
}
