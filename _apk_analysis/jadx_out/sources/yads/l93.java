package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class l93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f91912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f91913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f91914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f91915e;

    public l93(int i10, int i11, int i12) {
        String str;
        if (i10 != Integer.MIN_VALUE) {
            str = i10 + "/";
        } else {
            str = "";
        }
        this.f91911a = str;
        this.f91912b = i11;
        this.f91913c = i12;
        this.f91914d = Integer.MIN_VALUE;
        this.f91915e = "";
    }

    public final void a() {
        int i10 = this.f91914d;
        this.f91914d = i10 == Integer.MIN_VALUE ? this.f91912b : i10 + this.f91913c;
        this.f91915e = this.f91911a + this.f91914d;
    }

    public final void b() {
        if (this.f91914d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }
}
