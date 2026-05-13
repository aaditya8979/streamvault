package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class sb3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final sb3 f94767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final sb3 f94768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final sb3 f94769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ sb3[] f94770f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94771b;

    static {
        sb3 sb3Var = new sb3(0, "INCONSISTENT_ASSET_VALUE", "inconsistent_asset_value");
        f94767c = sb3Var;
        sb3 sb3Var2 = new sb3(1, "NO_VISIBLE_SPONSORED_ASSET", "no_visible_sponsored_asset");
        f94768d = sb3Var2;
        sb3 sb3Var3 = new sb3(2, "NO_VISIBLE_REQUIRED_ASSETS", "no_visible_required_assets");
        f94769e = sb3Var3;
        sb3[] sb3VarArr = {sb3Var, sb3Var2, sb3Var3};
        f94770f = sb3VarArr;
        kotlin.enums.a.a(sb3VarArr);
    }

    public sb3(int i10, String str, String str2) {
        this.f94771b = str2;
    }

    public static sb3 valueOf(String str) {
        return (sb3) Enum.valueOf(sb3.class, str);
    }

    public static sb3[] values() {
        return (sb3[]) f94770f.clone();
    }
}
