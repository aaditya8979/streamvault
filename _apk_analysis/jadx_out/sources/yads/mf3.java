package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class mf3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mf3 f92347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mf3 f92348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final mf3 f92349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final mf3 f92350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ mf3[] f92351f;

    static {
        mf3 mf3Var = new mf3(0, "PREROLL");
        f92347b = mf3Var;
        mf3 mf3Var2 = new mf3(1, "MIDROLL");
        f92348c = mf3Var2;
        mf3 mf3Var3 = new mf3(2, "POSTROLL");
        f92349d = mf3Var3;
        mf3 mf3Var4 = new mf3(3, "STANDALONE");
        f92350e = mf3Var4;
        mf3[] mf3VarArr = {mf3Var, mf3Var2, mf3Var3, mf3Var4};
        f92351f = mf3VarArr;
        kotlin.enums.a.a(mf3VarArr);
    }

    public mf3(int i10, String str) {
    }

    public static mf3 valueOf(String str) {
        return (mf3) Enum.valueOf(mf3.class, str);
    }

    public static mf3[] values() {
        return (mf3[]) f92351f.clone();
    }
}
