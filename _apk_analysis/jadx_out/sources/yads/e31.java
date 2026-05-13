package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class e31 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e31 f89078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ e31[] f89079c;

    static {
        e31 e31Var = new e31(0, "PROD");
        f89078b = e31Var;
        e31[] e31VarArr = {e31Var, new e31(1, "PREDEFINED")};
        f89079c = e31VarArr;
        kotlin.enums.a.a(e31VarArr);
    }

    public e31(int i10, String str) {
    }

    public static e31 valueOf(String str) {
        return (e31) Enum.valueOf(e31.class, str);
    }

    public static e31[] values() {
        return (e31[]) f89079c.clone();
    }
}
