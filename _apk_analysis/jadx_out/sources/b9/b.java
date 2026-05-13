package b9;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.ArrayList;
import java.util.Map;
import k8.h;
import k8.i;
import k8.j;

/* JADX INFO: compiled from: PDF417Reader.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i[] f5500a = new i[0];

    public static i[] b(k8.b bVar, Map<DecodeHintType, ?> map, boolean z10) throws NotFoundException, ChecksumException, FormatException {
        ArrayList arrayList = new ArrayList();
        e9.b bVarB = e9.a.b(bVar, map, z10);
        for (j[] jVarArr : bVarB.b()) {
            o8.d dVarI = c9.i.i(bVarB.a(), jVarArr[4], jVarArr[5], jVarArr[6], jVarArr[7], e(jVarArr), c(jVarArr));
            i iVar = new i(dVarI.h(), dVarI.e(), jVarArr, BarcodeFormat.PDF_417);
            iVar.h(ResultMetadataType.ERROR_CORRECTION_LEVEL, dVarI.b());
            c cVar = (c) dVarI.d();
            if (cVar != null) {
                iVar.h(ResultMetadataType.PDF417_EXTRA_METADATA, cVar);
            }
            arrayList.add(iVar);
        }
        return (i[]) arrayList.toArray(f5500a);
    }

    public static int c(j[] jVarArr) {
        return Math.max(Math.max(d(jVarArr[0], jVarArr[4]), (d(jVarArr[6], jVarArr[2]) * 17) / 18), Math.max(d(jVarArr[1], jVarArr[5]), (d(jVarArr[7], jVarArr[3]) * 17) / 18));
    }

    public static int d(j jVar, j jVar2) {
        if (jVar == null || jVar2 == null) {
            return 0;
        }
        return (int) Math.abs(jVar.c() - jVar2.c());
    }

    public static int e(j[] jVarArr) {
        return Math.min(Math.min(f(jVarArr[0], jVarArr[4]), (f(jVarArr[6], jVarArr[2]) * 17) / 18), Math.min(f(jVarArr[1], jVarArr[5]), (f(jVarArr[7], jVarArr[3]) * 17) / 18));
    }

    public static int f(j jVar, j jVar2) {
        if (jVar == null || jVar2 == null) {
            return Integer.MAX_VALUE;
        }
        return (int) Math.abs(jVar.c() - jVar2.c());
    }

    @Override // k8.h
    public i a(k8.b bVar, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        i iVar;
        i[] iVarArrB = b(bVar, map, false);
        if (iVarArrB.length == 0 || (iVar = iVarArrB[0]) == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        return iVar;
    }

    @Override // k8.h
    public void reset() {
    }
}
