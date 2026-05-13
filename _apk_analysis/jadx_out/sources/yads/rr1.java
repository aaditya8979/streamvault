package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class rr1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final rr1 f94595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final rr1 f94596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ rr1[] f94597d;

    static {
        rr1 rr1Var = new rr1(0, "INFO");
        f94595b = rr1Var;
        rr1 rr1Var2 = new rr1(1, "ERROR");
        f94596c = rr1Var2;
        rr1[] rr1VarArr = {rr1Var, rr1Var2};
        f94597d = rr1VarArr;
        kotlin.enums.a.a(rr1VarArr);
    }

    public rr1(int i10, String str) {
    }

    public static rr1 valueOf(String str) {
        return (rr1) Enum.valueOf(rr1.class, str);
    }

    public static rr1[] values() {
        return (rr1[]) f94597d.clone();
    }
}
