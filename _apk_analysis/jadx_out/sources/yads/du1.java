package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class du1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final du1 f88977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final du1 f88978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final du1 f88979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ du1[] f88980e;

    static {
        du1 du1Var = new du1(0, "VERBOSE");
        du1 du1Var2 = new du1(1, "DEBUG");
        du1 du1Var3 = new du1(2, "INFO");
        f88977b = du1Var3;
        du1 du1Var4 = new du1(3, "WARNING");
        f88978c = du1Var4;
        du1 du1Var5 = new du1(4, "ERROR");
        f88979d = du1Var5;
        du1[] du1VarArr = {du1Var, du1Var2, du1Var3, du1Var4, du1Var5};
        f88980e = du1VarArr;
        kotlin.enums.a.a(du1VarArr);
    }

    public du1(int i10, String str) {
    }

    public static du1 valueOf(String str) {
        return (du1) Enum.valueOf(du1.class, str);
    }

    public static du1[] values() {
        return (du1[]) f88980e.clone();
    }
}
