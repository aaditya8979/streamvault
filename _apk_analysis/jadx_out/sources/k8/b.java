package k8;

import com.google.zxing.NotFoundException;

/* JADX INFO: compiled from: BinaryBitmap.java */
/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f73012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o8.b f73013b;

    public b(a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("Binarizer must be non-null.");
        }
        this.f73012a = aVar;
    }

    public o8.b a() throws NotFoundException {
        if (this.f73013b == null) {
            this.f73013b = this.f73012a.b();
        }
        return this.f73013b;
    }

    public o8.a b(int i10, o8.a aVar) throws NotFoundException {
        return this.f73012a.c(i10, aVar);
    }

    public int c() {
        return this.f73012a.d();
    }

    public int d() {
        return this.f73012a.f();
    }

    public boolean e() {
        return this.f73012a.e().e();
    }

    public b f() {
        return new b(this.f73012a.a(this.f73012a.e().f()));
    }

    public String toString() {
        try {
            return a().toString();
        } catch (NotFoundException unused) {
            return "";
        }
    }
}
