package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class kt2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final kt2 f91746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final kt2 f91747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kt2[] f91748e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91749b;

    static {
        kt2 kt2Var = new kt2(0, "CONFIGURATION_FAILED", "configuration_failed");
        f91746c = kt2Var;
        kt2 kt2Var2 = new kt2(1, "TIMEOUT", "timeout");
        f91747d = kt2Var2;
        kt2[] kt2VarArr = {kt2Var, kt2Var2};
        f91748e = kt2VarArr;
        kotlin.enums.a.a(kt2VarArr);
    }

    public kt2(int i10, String str, String str2) {
        this.f91749b = str2;
    }

    public static kt2 valueOf(String str) {
        return (kt2) Enum.valueOf(kt2.class, str);
    }

    public static kt2[] values() {
        return (kt2[]) f91748e.clone();
    }
}
