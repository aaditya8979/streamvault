package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class n10 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n10 f92688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n10 f92689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ n10[] f92690d;

    static {
        n10 n10Var = new n10(0, "TEXT");
        f92688b = n10Var;
        n10 n10Var2 = new n10(1, "IMAGE");
        f92689c = n10Var2;
        n10[] n10VarArr = {n10Var, n10Var2};
        f92690d = n10VarArr;
        kotlin.enums.a.a(n10VarArr);
    }

    public n10(int i10, String str) {
    }

    public static n10 valueOf(String str) {
        return (n10) Enum.valueOf(n10.class, str);
    }

    public static n10[] values() {
        return (n10[]) f92690d.clone();
    }
}
