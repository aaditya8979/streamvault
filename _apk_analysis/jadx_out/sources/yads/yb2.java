package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class yb2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final yb2 f97058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final yb2 f97059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final yb2 f97060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ yb2[] f97061e;

    static {
        yb2 yb2Var = new yb2(0, "INVALIDATED");
        f97058b = yb2Var;
        yb2 yb2Var2 = new yb2(1, "ACTIVE");
        f97059c = yb2Var2;
        yb2 yb2Var3 = new yb2(2, "PAUSED");
        f97060d = yb2Var3;
        yb2[] yb2VarArr = {yb2Var, yb2Var2, yb2Var3};
        f97061e = yb2VarArr;
        kotlin.enums.a.a(yb2VarArr);
    }

    public yb2(int i10, String str) {
    }

    public static yb2 valueOf(String str) {
        return (yb2) Enum.valueOf(yb2.class, str);
    }

    public static yb2[] values() {
        return (yb2[]) f97061e.clone();
    }
}
