package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class z5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z5 f97392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z5 f97393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z5 f97394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final z5 f97395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final z5 f97396f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ z5[] f97397g;

    static {
        z5 z5Var = new z5(0, "CANCELLED");
        f97392b = z5Var;
        z5 z5Var2 = new z5(1, "NOT_STARTED");
        f97393c = z5Var2;
        z5 z5Var3 = new z5(2, "LOADING");
        f97394d = z5Var3;
        z5 z5Var4 = new z5(3, "SUCCESSFULLY_LOADED");
        f97395e = z5Var4;
        z5 z5Var5 = new z5(4, "ERRONEOUSLY_LOADED");
        f97396f = z5Var5;
        z5[] z5VarArr = {z5Var, z5Var2, z5Var3, z5Var4, z5Var5};
        f97397g = z5VarArr;
        kotlin.enums.a.a(z5VarArr);
    }

    public z5(int i10, String str) {
    }

    public static z5 valueOf(String str) {
        return (z5) Enum.valueOf(z5.class, str);
    }

    public static z5[] values() {
        return (z5[]) f97397g.clone();
    }
}
