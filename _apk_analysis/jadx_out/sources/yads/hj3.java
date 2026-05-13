package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class hj3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final hj3 f90435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hj3 f90436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ hj3[] f90437d;

    static {
        hj3 hj3Var = new hj3(0, "LEFT_TOP");
        f90435b = hj3Var;
        hj3 hj3Var2 = new hj3(1, "CENTER");
        f90436c = hj3Var2;
        hj3[] hj3VarArr = {hj3Var, hj3Var2};
        f90437d = hj3VarArr;
        kotlin.enums.a.a(hj3VarArr);
    }

    public hj3(int i10, String str) {
    }

    public static hj3 valueOf(String str) {
        return (hj3) Enum.valueOf(hj3.class, str);
    }

    public static hj3[] values() {
        return (hj3[]) f90437d.clone();
    }
}
