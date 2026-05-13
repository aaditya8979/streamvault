package yads;

import com.unity3d.ads.core.data.model.exception.GatewayException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class q61 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q61 f93902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q61 f93903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q61 f93904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q61 f93905f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ q61[] f93906g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93907b;

    static {
        q61 q61Var = new q61(0, "INITIALIZATION", GatewayException.GATEWAY_RESPONSE_DEPTH_INITIALIZATION);
        f93902c = q61Var;
        q61 q61Var2 = new q61(1, "AD", "ad");
        f93903d = q61Var2;
        q61 q61Var3 = new q61(2, "INSTREAM", "instream");
        f93904e = q61Var3;
        q61 q61Var4 = new q61(3, "BIDDER_TOKEN", "bidder_token");
        f93905f = q61Var4;
        q61[] q61VarArr = {q61Var, q61Var2, q61Var3, q61Var4};
        f93906g = q61VarArr;
        kotlin.enums.a.a(q61VarArr);
    }

    public q61(int i10, String str, String str2) {
        this.f93907b = str2;
    }

    public static q61 valueOf(String str) {
        return (q61) Enum.valueOf(q61.class, str);
    }

    public static q61[] values() {
        return (q61[]) f93906g.clone();
    }
}
