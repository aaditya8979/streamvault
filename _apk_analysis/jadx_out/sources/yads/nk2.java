package yads;

/* JADX INFO: loaded from: classes5.dex */
public final class nk2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float[] f92862i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float[] f92863j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float[] f92864k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f92865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public mk2 f92866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public rz0 f92867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f92868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f92869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f92870f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f92871g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f92872h;

    public static boolean a(kk2 kk2Var) {
        ik2 ik2Var = kk2Var.f91620a;
        ik2 ik2Var2 = kk2Var.f91621b;
        jk2[] jk2VarArr = ik2Var.f90869a;
        if (jk2VarArr.length != 1 || jk2VarArr[0].f91262a != 0) {
            return false;
        }
        jk2[] jk2VarArr2 = ik2Var2.f90869a;
        return jk2VarArr2.length == 1 && jk2VarArr2[0].f91262a == 0;
    }
}
