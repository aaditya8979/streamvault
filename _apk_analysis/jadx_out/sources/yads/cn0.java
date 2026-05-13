package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class cn0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final cn0 f88508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final cn0 f88509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ cn0[] f88510d;

    static {
        cn0 cn0Var = new cn0(0, "FRAME");
        f88508b = cn0Var;
        cn0 cn0Var2 = new cn0(1, "TRACE");
        f88509c = cn0Var2;
        cn0[] cn0VarArr = {cn0Var, cn0Var2};
        f88510d = cn0VarArr;
        kotlin.enums.a.a(cn0VarArr);
    }

    public cn0(int i10, String str) {
    }

    public static cn0 valueOf(String str) {
        return (cn0) Enum.valueOf(cn0.class, str);
    }

    public static cn0[] values() {
        return (cn0[]) f88510d.clone();
    }
}
