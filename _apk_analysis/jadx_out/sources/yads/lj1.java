package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class lj1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final lj1 f91995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final lj1 f91996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final lj1 f91997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ lj1[] f91998e;

    static {
        lj1 lj1Var = new lj1(0, "EXACTLY");
        f91995b = lj1Var;
        lj1 lj1Var2 = new lj1(1, "AT_MOST");
        f91996c = lj1Var2;
        lj1 lj1Var3 = new lj1(2, "UNSPECIFIED");
        f91997d = lj1Var3;
        lj1[] lj1VarArr = {lj1Var, lj1Var2, lj1Var3};
        f91998e = lj1VarArr;
        kotlin.enums.a.a(lj1VarArr);
    }

    public lj1(int i10, String str) {
    }

    public static lj1 valueOf(String str) {
        return (lj1) Enum.valueOf(lj1.class, str);
    }

    public static lj1[] values() {
        return (lj1[]) f91998e.clone();
    }
}
