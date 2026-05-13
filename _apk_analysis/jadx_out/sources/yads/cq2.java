package yads;

import com.mbridge.msdk.MBridgeConstans;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class cq2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final cq2 f88584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final cq2 f88585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final cq2 f88586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ cq2[] f88587f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88588b;

    static {
        cq2 cq2Var = new cq2(0, "CONTENT", "content");
        f88584c = cq2Var;
        cq2 cq2Var2 = new cq2(1, "APP_INSTALL", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        f88585d = cq2Var2;
        cq2 cq2Var3 = new cq2(2, "IMAGE", "image");
        cq2 cq2Var4 = new cq2(3, "PRODUCT_PROMO", "productPromo");
        f88586e = cq2Var4;
        cq2[] cq2VarArr = {cq2Var, cq2Var2, cq2Var3, cq2Var4};
        f88587f = cq2VarArr;
        kotlin.enums.a.a(cq2VarArr);
    }

    public cq2(int i10, String str, String str2) {
        this.f88588b = str2;
    }

    public static cq2 valueOf(String str) {
        return (cq2) Enum.valueOf(cq2.class, str);
    }

    public static cq2[] values() {
        return (cq2[]) f88587f.clone();
    }
}
