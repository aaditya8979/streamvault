package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class do2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final do2 f88937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final do2 f88938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final do2 f88939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ do2[] f88940f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88941b;

    static {
        do2 do2Var = new do2(0, "SUCCESS", "success");
        f88937c = do2Var;
        do2 do2Var2 = new do2(1, "ERROR", "error");
        f88938d = do2Var2;
        do2 do2Var3 = new do2(2, "NO_ADS", "no_ads");
        f88939e = do2Var3;
        do2[] do2VarArr = {do2Var, do2Var2, do2Var3, new do2(3, "FILTERED", "filtered")};
        f88940f = do2VarArr;
        kotlin.enums.a.a(do2VarArr);
    }

    public do2(int i10, String str, String str2) {
        this.f88941b = str2;
    }

    public static do2 valueOf(String str) {
        return (do2) Enum.valueOf(do2.class, str);
    }

    public static do2[] values() {
        return (do2[]) f88940f.clone();
    }
}
