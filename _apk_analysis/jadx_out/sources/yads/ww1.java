package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class ww1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ww1 f96546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ww1 f96547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ww1[] f96548d;

    static {
        ww1 ww1Var = new ww1(0, "LEFT");
        f96546b = ww1Var;
        ww1 ww1Var2 = new ww1(1, "RIGHT");
        f96547c = ww1Var2;
        ww1[] ww1VarArr = {ww1Var, ww1Var2};
        f96548d = ww1VarArr;
        kotlin.enums.a.a(ww1VarArr);
    }

    public ww1(int i10, String str) {
    }

    public static ww1 valueOf(String str) {
        return (ww1) Enum.valueOf(ww1.class, str);
    }

    public static ww1[] values() {
        return (ww1[]) f96548d.clone();
    }
}
