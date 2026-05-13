package yads;

import java.util.Arrays;
import org.json.JSONObject;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class gl3 implements de1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final gl3 f90029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final gl3 f90030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final gl3 f90031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ gl3[] f90032f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f90033b;

    static {
        gl3 gl3Var = new gl3(0, "DEFAULT", "default");
        f90029c = gl3Var;
        gl3 gl3Var2 = new gl3(1, "LOADING", "loading");
        f90030d = gl3Var2;
        gl3 gl3Var3 = new gl3(2, "HIDDEN", "hidden");
        f90031e = gl3Var3;
        gl3[] gl3VarArr = {gl3Var, gl3Var2, gl3Var3};
        f90032f = gl3VarArr;
        kotlin.enums.a.a(gl3VarArr);
    }

    public gl3(int i10, String str, String str2) {
        this.f90033b = str2;
    }

    public static gl3 valueOf(String str) {
        return (gl3) Enum.valueOf(gl3.class, str);
    }

    public static gl3[] values() {
        return (gl3[]) f90032f.clone();
    }

    @Override // yads.de1
    public final String a() {
        String strQuote = JSONObject.quote(this.f90033b);
        tn.x xVar = tn.x.f85368a;
        String str = String.format("state: %s", Arrays.copyOf(new Object[]{strQuote}, 1));
        tn.p.j(str, "format(...)");
        return str;
    }
}
