package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class f52 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f52 f89485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f52 f89486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f52 f89487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ f52[] f89488e;

    static {
        f52 f52Var = new f52(0, "FIXED");
        f89485b = f52Var;
        f52 f52Var2 = new f52(1, "FIXED_RATIO");
        f89486c = f52Var2;
        f52 f52Var3 = new f52(2, "PREFERRED_RATIO");
        f89487d = f52Var3;
        f52[] f52VarArr = {f52Var, f52Var2, f52Var3};
        f89488e = f52VarArr;
        kotlin.enums.a.a(f52VarArr);
    }

    public f52(int i10, String str) {
    }

    public static f52 valueOf(String str) {
        return (f52) Enum.valueOf(f52.class, str);
    }

    public static f52[] values() {
        return (f52[]) f89488e.clone();
    }
}
