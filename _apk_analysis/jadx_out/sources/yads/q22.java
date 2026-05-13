package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class q22 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q22 f93868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q22 f93869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ q22[] f93870e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93871b;

    static {
        q22 q22Var = new q22(0, "CUSTOM", "custom");
        f93868c = q22Var;
        q22 q22Var2 = new q22(1, "TEMPLATE", "template");
        f93869d = q22Var2;
        q22[] q22VarArr = {q22Var, q22Var2};
        f93870e = q22VarArr;
        kotlin.enums.a.a(q22VarArr);
    }

    public q22(int i10, String str, String str2) {
        this.f93871b = str2;
    }

    public static q22 valueOf(String str) {
        return (q22) Enum.valueOf(q22.class, str);
    }

    public static q22[] values() {
        return (q22[]) f93870e.clone();
    }
}
