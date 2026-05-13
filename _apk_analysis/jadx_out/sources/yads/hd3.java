package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class hd3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hd3 f90366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final hd3 f90367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ hd3[] f90368e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f90369b;

    static {
        hd3 hd3Var = new hd3(0, 1, "VERIFICATION_REJECTED");
        hd3 hd3Var2 = new hd3(1, 2, "VERIFICATION_NOT_SUPPORTED");
        f90366c = hd3Var2;
        hd3 hd3Var3 = new hd3(2, 3, "ERROR_RESOURCE_LOAD");
        f90367d = hd3Var3;
        hd3[] hd3VarArr = {hd3Var, hd3Var2, hd3Var3};
        f90368e = hd3VarArr;
        kotlin.enums.a.a(hd3VarArr);
    }

    public hd3(int i10, int i11, String str) {
        this.f90369b = i11;
    }

    public static hd3 valueOf(String str) {
        return (hd3) Enum.valueOf(hd3.class, str);
    }

    public static hd3[] values() {
        return (hd3[]) f90368e.clone();
    }
}
