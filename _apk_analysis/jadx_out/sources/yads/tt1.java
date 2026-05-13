package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class tt1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final tt1 f95350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final tt1 f95351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final tt1 f95352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ tt1[] f95353e;

    static {
        tt1 tt1Var = new tt1(0, "INITIALIZATION_NOT_STARTED");
        f95350b = tt1Var;
        tt1 tt1Var2 = new tt1(1, "INITIALIZING");
        f95351c = tt1Var2;
        tt1 tt1Var3 = new tt1(2, "INITIALIZED");
        f95352d = tt1Var3;
        tt1[] tt1VarArr = {tt1Var, tt1Var2, tt1Var3};
        f95353e = tt1VarArr;
        kotlin.enums.a.a(tt1VarArr);
    }

    public tt1(int i10, String str) {
    }

    public static tt1 valueOf(String str) {
        return (tt1) Enum.valueOf(tt1.class, str);
    }

    public static tt1[] values() {
        return (tt1[]) f95353e.clone();
    }
}
