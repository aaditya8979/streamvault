package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class gj3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final gj3 f90011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final gj3 f90012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ gj3[] f90013d;

    static {
        gj3 gj3Var = new gj3(0, "LEFT_TOP");
        f90011b = gj3Var;
        gj3 gj3Var2 = new gj3(1, "CENTER");
        f90012c = gj3Var2;
        gj3[] gj3VarArr = {gj3Var, gj3Var2};
        f90013d = gj3VarArr;
        kotlin.enums.a.a(gj3VarArr);
    }

    public gj3(int i10, String str) {
    }

    public static gj3 valueOf(String str) {
        return (gj3) Enum.valueOf(gj3.class, str);
    }

    public static gj3[] values() {
        return (gj3[]) f90013d.clone();
    }
}
