package x8;

import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;

/* JADX INFO: compiled from: UPCEANExtensionSupport.java */
/* JADX INFO: loaded from: classes12.dex */
public final class w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f86864c = {1, 1, 2};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f86865a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f86866b = new v();

    public k8.i a(int i10, o8.a aVar, int i11) throws NotFoundException {
        int[] iArrM = x.m(aVar, i11, false, f86864c);
        try {
            return this.f86866b.b(i10, aVar, iArrM);
        } catch (ReaderException unused) {
            return this.f86865a.b(i10, aVar, iArrM);
        }
    }
}
