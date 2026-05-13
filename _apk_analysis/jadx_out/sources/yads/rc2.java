package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class rc2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final rc2 f94372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final rc2 f94373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final rc2 f94374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ rc2[] f94375e;

    static {
        rc2 rc2Var = new rc2(0, "SCREEN_ON");
        f94372b = rc2Var;
        rc2 rc2Var2 = new rc2(1, "SCREEN_OFF");
        f94373c = rc2Var2;
        rc2 rc2Var3 = new rc2(2, "USER_PRESENT");
        f94374d = rc2Var3;
        rc2[] rc2VarArr = {rc2Var, rc2Var2, rc2Var3};
        f94375e = rc2VarArr;
        kotlin.enums.a.a(rc2VarArr);
    }

    public rc2(int i10, String str) {
    }

    public static rc2 valueOf(String str) {
        return (rc2) Enum.valueOf(rc2.class, str);
    }

    public static rc2[] values() {
        return (rc2[]) f94375e.clone();
    }
}
