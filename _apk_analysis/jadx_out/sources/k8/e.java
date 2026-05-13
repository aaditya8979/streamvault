package k8;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import x8.o;

/* JADX INFO: compiled from: MultiFormatReader.java */
/* JADX INFO: loaded from: classes11.dex */
public final class e implements h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h[] f73018c = new h[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<DecodeHintType, ?> f73019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h[] f73020b;

    @Override // k8.h
    public i a(b bVar, Map<DecodeHintType, ?> map) throws NotFoundException {
        d(map);
        return b(bVar);
    }

    public final i b(b bVar) throws NotFoundException {
        h[] hVarArr = this.f73020b;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                try {
                    return hVar.a(bVar, this.f73019a);
                } catch (ReaderException unused) {
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public i c(b bVar) throws NotFoundException {
        if (this.f73020b == null) {
            d(null);
        }
        return b(bVar);
    }

    public void d(Map<DecodeHintType, ?> map) {
        this.f73019a = map;
        boolean z10 = true;
        boolean z11 = map != null && map.containsKey(DecodeHintType.TRY_HARDER);
        Collection collection = map == null ? null : (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (!collection.contains(BarcodeFormat.UPC_A) && !collection.contains(BarcodeFormat.UPC_E) && !collection.contains(BarcodeFormat.EAN_13) && !collection.contains(BarcodeFormat.EAN_8) && !collection.contains(BarcodeFormat.CODABAR) && !collection.contains(BarcodeFormat.CODE_39) && !collection.contains(BarcodeFormat.CODE_93) && !collection.contains(BarcodeFormat.CODE_128) && !collection.contains(BarcodeFormat.ITF) && !collection.contains(BarcodeFormat.RSS_14) && !collection.contains(BarcodeFormat.RSS_EXPANDED)) {
                z10 = false;
            }
            if (z10 && !z11) {
                arrayList.add(new o(map));
            }
            if (collection.contains(BarcodeFormat.QR_CODE)) {
                arrayList.add(new g9.a());
            }
            if (collection.contains(BarcodeFormat.DATA_MATRIX)) {
                arrayList.add(new r8.a());
            }
            if (collection.contains(BarcodeFormat.AZTEC)) {
                arrayList.add(new l8.b());
            }
            if (collection.contains(BarcodeFormat.PDF_417)) {
                arrayList.add(new b9.b());
            }
            if (collection.contains(BarcodeFormat.MAXICODE)) {
                arrayList.add(new v8.a());
            }
            if (z10 && z11) {
                arrayList.add(new o(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z11) {
                arrayList.add(new o(map));
            }
            arrayList.add(new g9.a());
            arrayList.add(new r8.a());
            arrayList.add(new l8.b());
            arrayList.add(new b9.b());
            arrayList.add(new v8.a());
            if (z11) {
                arrayList.add(new o(map));
            }
        }
        this.f73020b = (h[]) arrayList.toArray(f73018c);
    }

    @Override // k8.h
    public void reset() {
        h[] hVarArr = this.f73020b;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                hVar.reset();
            }
        }
    }
}
