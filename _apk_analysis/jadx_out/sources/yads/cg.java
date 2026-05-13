package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class cg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final cg f88449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final cg f88450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final cg f88451e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final cg f88452f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final cg f88453g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final cg f88454h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ cg[] f88455i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88456b;

    static {
        cg cgVar = new cg(0, "AD_REQUEST", "ad_request");
        f88449c = cgVar;
        cg cgVar2 = new cg(1, "AD_ATTEMPT", "ad_attempt");
        f88450d = cgVar2;
        cg cgVar3 = new cg(2, "AD_FILLED_REQUEST", "ad_filled_request");
        f88451e = cgVar3;
        cg cgVar4 = new cg(3, "AD_IMPRESSION", "ad_impression");
        f88452f = cgVar4;
        cg cgVar5 = new cg(4, "AD_CLICK", "ad_click");
        f88453g = cgVar5;
        cg cgVar6 = new cg(5, "AD_REWARD", "ad_reward");
        f88454h = cgVar6;
        cg[] cgVarArr = {cgVar, cgVar2, cgVar3, cgVar4, cgVar5, cgVar6};
        f88455i = cgVarArr;
        kotlin.enums.a.a(cgVarArr);
    }

    public cg(int i10, String str, String str2) {
        this.f88456b = str2;
    }

    public static cg valueOf(String str) {
        return (cg) Enum.valueOf(cg.class, str);
    }

    public static cg[] values() {
        return (cg[]) f88455i.clone();
    }

    public final String a() {
        return this.f88456b;
    }
}
