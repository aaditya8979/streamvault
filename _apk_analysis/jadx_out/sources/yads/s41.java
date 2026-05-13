package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class s41 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s41 f94700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s41 f94701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s41 f94702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s41 f94703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ s41[] f94704f;

    static {
        s41 s41Var = new s41(0, "PNG");
        f94700b = s41Var;
        s41 s41Var2 = new s41(1, "JPEG");
        f94701c = s41Var2;
        s41 s41Var3 = new s41(2, "GIF");
        f94702d = s41Var3;
        s41 s41Var4 = new s41(3, "UNKNOWN");
        f94703e = s41Var4;
        s41[] s41VarArr = {s41Var, s41Var2, s41Var3, s41Var4};
        f94704f = s41VarArr;
        kotlin.enums.a.a(s41VarArr);
    }

    public s41(int i10, String str) {
    }

    public static s41 valueOf(String str) {
        return (s41) Enum.valueOf(s41.class, str);
    }

    public static s41[] values() {
        return (s41[]) f94704f.clone();
    }
}
