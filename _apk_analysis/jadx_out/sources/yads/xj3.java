package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class xj3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final xj3 f96792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final xj3 f96793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final xj3 f96794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ xj3[] f96795e;

    static {
        xj3 xj3Var = new xj3(0, "FIRST_QUARTILE");
        f96792b = xj3Var;
        xj3 xj3Var2 = new xj3(1, "MIDPOINT");
        f96793c = xj3Var2;
        xj3 xj3Var3 = new xj3(2, "THIRD_QUARTILE");
        f96794d = xj3Var3;
        xj3[] xj3VarArr = {xj3Var, xj3Var2, xj3Var3};
        f96795e = xj3VarArr;
        kotlin.enums.a.a(xj3VarArr);
    }

    public xj3(int i10, String str) {
    }

    public static xj3 valueOf(String str) {
        return (xj3) Enum.valueOf(xj3.class, str);
    }

    public static xj3[] values() {
        return (xj3[]) f96795e.clone();
    }
}
