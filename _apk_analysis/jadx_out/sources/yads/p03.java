package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class p03 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p03 f93378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ p03[] f93379d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93380b;

    static {
        p03 p03Var = new p03(0, "NEXT", "next");
        p03 p03Var2 = new p03(1, "LAST", "last");
        f93378c = p03Var2;
        p03[] p03VarArr = {p03Var, p03Var2};
        f93379d = p03VarArr;
        kotlin.enums.a.a(p03VarArr);
    }

    public p03(int i10, String str, String str2) {
        this.f93380b = str2;
    }

    public static p03 valueOf(String str) {
        return (p03) Enum.valueOf(p03.class, str);
    }

    public static p03[] values() {
        return (p03[]) f93379d.clone();
    }
}
