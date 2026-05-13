package yads;

import java.util.LinkedHashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class ff2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ef2 f89560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f89561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ff2 f89562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ff2[] f89563f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f89564b;

    static {
        ff2 ff2Var = new ff2(0, 1, "IDLE");
        ff2 ff2Var2 = new ff2(1, 2, "BUFFERING");
        ff2 ff2Var3 = new ff2(2, 3, "READY");
        f89562e = ff2Var3;
        ff2[] ff2VarArr = {ff2Var, ff2Var2, ff2Var3, new ff2(3, 4, "ENDED")};
        f89563f = ff2VarArr;
        kn.a aVarA = kotlin.enums.a.a(ff2VarArr);
        f89560c = new ef2();
        LinkedHashMap linkedHashMap = new LinkedHashMap(zn.n.e(cn.p0.f(cn.x.x(aVarA, 10)), 16));
        for (Object obj : aVarA) {
            linkedHashMap.put(Integer.valueOf(((ff2) obj).f89564b), obj);
        }
        f89561d = linkedHashMap;
    }

    public ff2(int i10, int i11, String str) {
        this.f89564b = i11;
    }

    public static ff2 valueOf(String str) {
        return (ff2) Enum.valueOf(ff2.class, str);
    }

    public static ff2[] values() {
        return (ff2[]) f89563f.clone();
    }
}
