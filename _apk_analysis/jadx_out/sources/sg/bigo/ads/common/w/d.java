package sg.bigo.ads.common.w;

/* JADX INFO: loaded from: classes6.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f82800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f82801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f82802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f82803d = {0.24f, 0.52f, 0.24f};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f82804e = true;

    static {
        d dVar = new d();
        f82800a = dVar;
        float[] fArr = dVar.f82802c;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
        float[] fArr2 = dVar.f82801b;
        fArr2[0] = 0.35f;
        fArr2[1] = 1.0f;
    }

    public d() {
        float[] fArr = new float[3];
        this.f82801b = fArr;
        float[] fArr2 = new float[3];
        this.f82802c = fArr2;
        a(fArr);
        a(fArr2);
    }

    private static void a(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }
}
