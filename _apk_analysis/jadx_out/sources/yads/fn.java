package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class fn {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final en f89630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fn f89631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final fn f89632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ fn[] f89633f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f89634b;

    /* JADX WARN: Type inference failed for: r0v1, types: [yads.en] */
    static {
        fn fnVar = new fn(0, "CONSTANT", "constant");
        fn fnVar2 = new fn(1, "RATIO", "ratio");
        fn fnVar3 = new fn(2, "SCREEN_BASED", "screen_based");
        fn fnVar4 = new fn(3, "SCREEN_ORIENTATION_BASED", "screen_orientation_based");
        f89631d = fnVar4;
        fn fnVar5 = new fn(4, "MEDIATION", "mediation");
        f89632e = fnVar5;
        fn[] fnVarArr = {fnVar, fnVar2, fnVar3, fnVar4, fnVar5};
        f89633f = fnVarArr;
        kotlin.enums.a.a(fnVarArr);
        f89630c = new Object() { // from class: yads.en
        };
    }

    public fn(int i10, String str, String str2) {
        this.f89634b = str2;
    }

    public static fn valueOf(String str) {
        return (fn) Enum.valueOf(fn.class, str);
    }

    public static fn[] values() {
        return (fn[]) f89633f.clone();
    }
}
