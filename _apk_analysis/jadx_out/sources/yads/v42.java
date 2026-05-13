package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class v42 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v42 f95918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v42 f95919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v42 f95920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ v42[] f95921f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f95922b;

    static {
        v42 v42Var = new v42(0, "AD", "ad");
        f95918c = v42Var;
        v42 v42Var2 = new v42(1, "BULK", "bulk");
        f95919d = v42Var2;
        v42 v42Var3 = new v42(2, "SLIDER", "ad_unit");
        f95920e = v42Var3;
        v42[] v42VarArr = {v42Var, v42Var2, v42Var3};
        f95921f = v42VarArr;
        kotlin.enums.a.a(v42VarArr);
    }

    public v42(int i10, String str, String str2) {
        this.f95922b = str2;
    }

    public static v42 valueOf(String str) {
        return (v42) Enum.valueOf(v42.class, str);
    }

    public static v42[] values() {
        return (v42[]) f95921f.clone();
    }
}
