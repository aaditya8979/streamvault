package yads;

import com.ironsource.Y1;
import java.util.LinkedHashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class vn3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final un3 f96142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f96143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final vn3 f96144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ vn3[] f96145f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f96146b;

    static {
        vn3 vn3Var = new vn3(0, "DEFAULT", "default");
        f96144e = vn3Var;
        vn3[] vn3VarArr = {vn3Var, new vn3(1, "CACHE_ELSE_NETWORK", "cache_else_network"), new vn3(2, "CACHE_ONLY", "cache_only"), new vn3(3, "DISABLED", Y1.f30689e)};
        f96145f = vn3VarArr;
        kn.a aVarA = kotlin.enums.a.a(vn3VarArr);
        f96142c = new un3();
        LinkedHashMap linkedHashMap = new LinkedHashMap(zn.n.e(cn.p0.f(cn.x.x(aVarA, 10)), 16));
        for (Object obj : aVarA) {
            linkedHashMap.put(((vn3) obj).f96146b, obj);
        }
        f96143d = linkedHashMap;
    }

    public vn3(int i10, String str, String str2) {
        this.f96146b = str2;
    }

    public static vn3 valueOf(String str) {
        return (vn3) Enum.valueOf(vn3.class, str);
    }

    public static vn3[] values() {
        return (vn3[]) f96145f.clone();
    }
}
