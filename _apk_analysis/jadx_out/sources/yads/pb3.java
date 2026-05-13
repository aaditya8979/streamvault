package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class pb3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final pb3 f93520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final pb3 f93521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final pb3 f93522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final pb3 f93523f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final pb3 f93524g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final pb3 f93525h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final pb3 f93526i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ pb3[] f93527j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93528b;

    static {
        pb3 pb3Var = new pb3(0, "NO_AD_VIEW", "no_ad_view");
        f93520c = pb3Var;
        pb3 pb3Var2 = new pb3(1, "NO_VISIBLE_ADS", "no_visible_ads");
        f93521d = pb3Var2;
        pb3 pb3Var3 = new pb3(2, "NOT_VISIBLE_FOR_PERCENT", "not_visible_for_percent");
        f93522e = pb3Var3;
        pb3 pb3Var4 = new pb3(3, "REQUIRED_ASSET_CAN_NOT_BE_VISIBLE", "required_asset_can_not_be_visible");
        f93523f = pb3Var4;
        pb3 pb3Var5 = new pb3(4, "SUPERVIEW_NULL", "superview_null");
        f93524g = pb3Var5;
        pb3 pb3Var6 = new pb3(5, "SUPERVIEW_HIDDEN", "superview_hidden");
        f93525h = pb3Var6;
        pb3 pb3Var7 = new pb3(6, "VISIBLE_AREA_TOO_SMALL", "visible_area_too_small");
        f93526i = pb3Var7;
        pb3[] pb3VarArr = {pb3Var, pb3Var2, pb3Var3, pb3Var4, pb3Var5, pb3Var6, pb3Var7};
        f93527j = pb3VarArr;
        kotlin.enums.a.a(pb3VarArr);
    }

    public pb3(int i10, String str, String str2) {
        this.f93528b = str2;
    }

    public static pb3 valueOf(String str) {
        return (pb3) Enum.valueOf(pb3.class, str);
    }

    public static pb3[] values() {
        return (pb3[]) f93527j.clone();
    }
}
