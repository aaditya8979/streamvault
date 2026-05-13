package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class gp2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final gp2 f90082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final gp2 f90083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ gp2[] f90084e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f90085b;

    static {
        gp2 gp2Var = new gp2(0, "LIGHT", "light");
        f90082c = gp2Var;
        gp2 gp2Var2 = new gp2(1, "DARK", "dark");
        f90083d = gp2Var2;
        gp2[] gp2VarArr = {gp2Var, gp2Var2};
        f90084e = gp2VarArr;
        kotlin.enums.a.a(gp2VarArr);
    }

    public gp2(int i10, String str, String str2) {
        this.f90085b = str2;
    }

    public static gp2 valueOf(String str) {
        return (gp2) Enum.valueOf(gp2.class, str);
    }

    public static gp2[] values() {
        return (gp2[]) f90084e.clone();
    }
}
