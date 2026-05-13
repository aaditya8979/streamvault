package yads;

import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@so.k
public final class di2 {

    @NotNull
    public static final ci2 Companion;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bn.g f88859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final di2 f88860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final di2 f88861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ di2[] f88862e;

    static {
        di2 di2Var = new di2(0, "SUCCESS");
        f88860c = di2Var;
        di2 di2Var2 = new di2(1, "ERROR");
        f88861d = di2Var2;
        di2[] di2VarArr = {di2Var, di2Var2};
        f88862e = di2VarArr;
        kotlin.enums.a.a(di2VarArr);
        Companion = new ci2();
        f88859b = kotlin.b.a(LazyThreadSafetyMode.PUBLICATION, new sn.a() { // from class: yads.bi2
            @Override // sn.a
            public final Object invoke() {
                return wo.i0.a("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationResultStatus", di2.values(), new String[]{"success", "error"}, new Annotation[][]{null, null}, null);
            }
        });
    }

    public di2(int i10, String str) {
    }

    public static di2 valueOf(String str) {
        return (di2) Enum.valueOf(di2.class, str);
    }

    public static di2[] values() {
        return (di2[]) f88862e.clone();
    }
}
