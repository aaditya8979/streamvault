package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class xh0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final xh0 f96775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final xh0 f96776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ xh0[] f96777d;

    static {
        xh0 xh0Var = new xh0(0, "BLOCK");
        f96775b = xh0Var;
        xh0 xh0Var2 = new xh0(1, "BLOCK_INNER_AD");
        f96776c = xh0Var2;
        xh0[] xh0VarArr = {xh0Var, xh0Var2};
        f96777d = xh0VarArr;
        kotlin.enums.a.a(xh0VarArr);
    }

    public xh0(int i10, String str) {
    }

    public static xh0 valueOf(String str) {
        return (xh0) Enum.valueOf(xh0.class, str);
    }

    public static xh0[] values() {
        return (xh0[]) f96777d.clone();
    }
}
