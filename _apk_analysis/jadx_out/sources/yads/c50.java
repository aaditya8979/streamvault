package yads;

import org.eclipse.jetty.util.security.Constraint;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class c50 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c50 f88348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c50 f88349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c50 f88350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ c50[] f88351f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88352b;

    static {
        c50 c50Var = new c50(0, "BIDDING", "Bidding");
        f88348c = c50Var;
        c50 c50Var2 = new c50(1, "WATERFALL", "Waterfall");
        f88349d = c50Var2;
        c50 c50Var3 = new c50(2, Constraint.NONE, "None");
        f88350e = c50Var3;
        c50[] c50VarArr = {c50Var, c50Var2, c50Var3};
        f88351f = c50VarArr;
        kotlin.enums.a.a(c50VarArr);
    }

    public c50(int i10, String str, String str2) {
        this.f88352b = str2;
    }

    public static c50 valueOf(String str) {
        return (c50) Enum.valueOf(c50.class, str);
    }

    public static c50[] values() {
        return (c50[]) f88351f.clone();
    }

    public final String a() {
        return this.f88352b;
    }
}
