package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class g63 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g63 f89824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g63 f89825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g63 f89826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g63 f89827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g63 f89828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ g63[] f89829g;

    static {
        g63 g63Var = new g63(0, "TIME");
        f89824b = g63Var;
        g63 g63Var2 = new g63(1, "PERCENTAGE");
        f89825c = g63Var2;
        g63 g63Var3 = new g63(2, "START");
        f89826d = g63Var3;
        g63 g63Var4 = new g63(3, "END");
        f89827e = g63Var4;
        g63 g63Var5 = new g63(4, "POSITION");
        f89828f = g63Var5;
        g63[] g63VarArr = {g63Var, g63Var2, g63Var3, g63Var4, g63Var5};
        f89829g = g63VarArr;
        kotlin.enums.a.a(g63VarArr);
    }

    public g63(int i10, String str) {
    }

    public static g63 valueOf(String str) {
        return (g63) Enum.valueOf(g63.class, str);
    }

    public static g63[] values() {
        return (g63[]) f89829g.clone();
    }
}
