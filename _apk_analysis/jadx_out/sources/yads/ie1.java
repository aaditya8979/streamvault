package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class ie1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ie1 f90787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ie1 f90788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ie1 f90789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ie1[] f90790e;

    static {
        ie1 ie1Var = new ie1(0, "LOAD");
        f90787b = ie1Var;
        ie1 ie1Var2 = new ie1(1, "SHOW");
        f90788c = ie1Var2;
        ie1 ie1Var3 = new ie1(2, "RETURN_TO_APP");
        f90789d = ie1Var3;
        ie1[] ie1VarArr = {ie1Var, ie1Var2, ie1Var3};
        f90790e = ie1VarArr;
        kotlin.enums.a.a(ie1VarArr);
    }

    public ie1(int i10, String str) {
    }

    public static ie1 valueOf(String str) {
        return (ie1) Enum.valueOf(ie1.class, str);
    }

    public static ie1[] values() {
        return (ie1[]) f90790e.clone();
    }
}
