package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class h50 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h50 f90248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ h50[] f90249d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f90250b;

    static {
        h50 h50Var = new h50(0, "ERROR", "error");
        h50 h50Var2 = new h50(1, "MESSAGE", "message");
        f90248c = h50Var2;
        h50[] h50VarArr = {h50Var, h50Var2};
        f90249d = h50VarArr;
        kotlin.enums.a.a(h50VarArr);
    }

    public h50(int i10, String str, String str2) {
        this.f90250b = str2;
    }

    public static h50 valueOf(String str) {
        return (h50) Enum.valueOf(h50.class, str);
    }

    public static h50[] values() {
        return (h50[]) f90249d.clone();
    }
}
