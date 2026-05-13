package a9;

/* JADX INFO: compiled from: DecodedInformation.java */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3660d;

    public n(int i10, String str) {
        super(i10);
        this.f3658b = str;
        this.f3660d = false;
        this.f3659c = 0;
    }

    public n(int i10, String str, int i11) {
        super(i10);
        this.f3660d = true;
        this.f3659c = i11;
        this.f3658b = str;
    }

    public String b() {
        return this.f3658b;
    }

    public int c() {
        return this.f3659c;
    }

    public boolean d() {
        return this.f3660d;
    }
}
