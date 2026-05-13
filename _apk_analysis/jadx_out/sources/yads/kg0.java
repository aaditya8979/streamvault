package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class kg0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kg0 f91588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final kg0 f91589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final kg0 f91590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kg0[] f91591e;

    static {
        kg0 kg0Var = new kg0(0, "PHONE");
        f91588b = kg0Var;
        kg0 kg0Var2 = new kg0(1, "TABLET");
        f91589c = kg0Var2;
        kg0 kg0Var3 = new kg0(2, "TV");
        f91590d = kg0Var3;
        kg0[] kg0VarArr = {kg0Var, kg0Var2, kg0Var3};
        f91591e = kg0VarArr;
        kotlin.enums.a.a(kg0VarArr);
    }

    public kg0(int i10, String str) {
    }

    public static kg0 valueOf(String str) {
        return (kg0) Enum.valueOf(kg0.class, str);
    }

    public static kg0[] values() {
        return (kg0[]) f91591e.clone();
    }
}
