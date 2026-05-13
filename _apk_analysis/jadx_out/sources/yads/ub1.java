package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class ub1 extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f95592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f95593c;

    public ub1(String str, String str2) {
        super(str);
        this.f95592b = str;
        this.f95593c = str2;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f95592b;
    }
}
