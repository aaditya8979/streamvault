package yads;

import com.fyber.inneractive.sdk.external.NativeAdContent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ge3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ge3 f89969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ge3 f89970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ge3 f89971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ge3 f89972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ge3[] f89973f;

    static {
        ge3 ge3Var = new ge3(0, "CONTROLS");
        f89969b = ge3Var;
        ge3 ge3Var2 = new ge3(1, "CLOSE_AD");
        f89970c = ge3Var2;
        ge3 ge3Var3 = new ge3(2, "NOT_VISIBLE");
        f89971d = ge3Var3;
        ge3 ge3Var4 = new ge3(3, NativeAdContent.ViewTag.OTHER);
        f89972e = ge3Var4;
        ge3[] ge3VarArr = {ge3Var, ge3Var2, ge3Var3, ge3Var4};
        f89973f = ge3VarArr;
        kotlin.enums.a.a(ge3VarArr);
    }

    public ge3(int i10, String str) {
    }

    public static ge3 valueOf(String str) {
        return (ge3) Enum.valueOf(ge3.class, str);
    }

    public static ge3[] values() {
        return (ge3[]) f89973f.clone();
    }
}
