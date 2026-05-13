package x8;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Map;

/* JADX INFO: compiled from: UPCAReader.java */
/* JADX INFO: loaded from: classes12.dex */
public final class s extends x {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final x f86857i = new h();

    public static k8.i r(k8.i iVar) throws FormatException {
        String strF = iVar.f();
        if (strF.charAt(0) != '0') {
            throw FormatException.getFormatInstance();
        }
        k8.i iVar2 = new k8.i(strF.substring(1), null, iVar.e(), BarcodeFormat.UPC_A);
        if (iVar.d() != null) {
            iVar2.g(iVar.d());
        }
        return iVar2;
    }

    @Override // x8.q, k8.h
    public k8.i a(k8.b bVar, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        return r(this.f86857i.a(bVar, map));
    }

    @Override // x8.x, x8.q
    public k8.i b(int i10, o8.a aVar, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return r(this.f86857i.b(i10, aVar, map));
    }

    @Override // x8.x
    public int k(o8.a aVar, int[] iArr, StringBuilder sb2) throws NotFoundException {
        return this.f86857i.k(aVar, iArr, sb2);
    }

    @Override // x8.x
    public k8.i l(int i10, o8.a aVar, int[] iArr, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return r(this.f86857i.l(i10, aVar, iArr, map));
    }

    @Override // x8.x
    public BarcodeFormat p() {
        return BarcodeFormat.UPC_A;
    }
}
