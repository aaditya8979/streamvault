package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class v80 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v80 f95986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v80 f95987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v80 f95988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ v80[] f95989e;

    static {
        v80 v80Var = new v80(0, "SUCCESS");
        f95986b = v80Var;
        v80 v80Var2 = new v80(1, "WARNING");
        f95987c = v80Var2;
        v80 v80Var3 = new v80(2, "ERROR");
        f95988d = v80Var3;
        v80[] v80VarArr = {v80Var, v80Var2, v80Var3};
        f95989e = v80VarArr;
        kotlin.enums.a.a(v80VarArr);
    }

    public v80(int i10, String str) {
    }

    public static v80 valueOf(String str) {
        return (v80) Enum.valueOf(v80.class, str);
    }

    public static v80[] values() {
        return (v80[]) f95989e.clone();
    }
}
