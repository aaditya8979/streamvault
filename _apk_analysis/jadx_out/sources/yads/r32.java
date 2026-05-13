package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class r32 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r32 f94273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r32 f94274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ r32[] f94275e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94276b;

    static {
        r32 r32Var = new r32(0, "LoadingOnShow", "loading_on_show");
        f94273c = r32Var;
        r32 r32Var2 = new r32(1, "LoadingOnBack", "loading_on_back");
        f94274d = r32Var2;
        r32[] r32VarArr = {r32Var, r32Var2};
        f94275e = r32VarArr;
        kotlin.enums.a.a(r32VarArr);
    }

    public r32(int i10, String str, String str2) {
        this.f94276b = str2;
    }

    public static r32 valueOf(String str) {
        return (r32) Enum.valueOf(r32.class, str);
    }

    public static r32[] values() {
        return (r32[]) f94275e.clone();
    }

    public final String a() {
        return this.f94276b;
    }
}
