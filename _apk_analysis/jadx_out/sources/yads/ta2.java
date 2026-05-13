package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ta2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ta2 f95125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ta2 f95126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ta2 f95127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ta2[] f95128f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f95129b;

    static {
        ta2 ta2Var = new ta2(0, 2, "LANDSCAPE");
        f95125c = ta2Var;
        ta2 ta2Var2 = new ta2(1, 1, "PORTRAIT");
        f95126d = ta2Var2;
        ta2 ta2Var3 = new ta2(2, 0, "UNDEFINED");
        f95127e = ta2Var3;
        ta2[] ta2VarArr = {ta2Var, ta2Var2, ta2Var3};
        f95128f = ta2VarArr;
        kotlin.enums.a.a(ta2VarArr);
    }

    public ta2(int i10, int i11, String str) {
        this.f95129b = i11;
    }

    public static ta2 valueOf(String str) {
        return (ta2) Enum.valueOf(ta2.class, str);
    }

    public static ta2[] values() {
        return (ta2[]) f95128f.clone();
    }
}
