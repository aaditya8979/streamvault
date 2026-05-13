package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class wc3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final wc3 f96349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final wc3 f96350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final wc3 f96351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ wc3[] f96352e;

    static {
        wc3 wc3Var = new wc3(0, "MILLISECONDS");
        f96349b = wc3Var;
        wc3 wc3Var2 = new wc3(1, "PERCENTS");
        f96350c = wc3Var2;
        wc3 wc3Var3 = new wc3(2, "POSITION");
        f96351d = wc3Var3;
        wc3[] wc3VarArr = {wc3Var, wc3Var2, wc3Var3};
        f96352e = wc3VarArr;
        kotlin.enums.a.a(wc3VarArr);
    }

    public wc3(int i10, String str) {
    }

    public static wc3 valueOf(String str) {
        return (wc3) Enum.valueOf(wc3.class, str);
    }

    public static wc3[] values() {
        return (wc3[]) f96352e.clone();
    }
}
