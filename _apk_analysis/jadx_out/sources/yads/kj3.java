package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class kj3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kj3 f91613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kj3[] f91614c;

    static {
        kj3 kj3Var = new kj3(0, "FIT_XY");
        kj3 kj3Var2 = new kj3(1, "FIT_CENTER");
        f91613b = kj3Var2;
        kj3[] kj3VarArr = {kj3Var, kj3Var2, new kj3(2, "CENTER_CROP")};
        f91614c = kj3VarArr;
        kotlin.enums.a.a(kj3VarArr);
    }

    public kj3(int i10, String str) {
    }

    public static kj3 valueOf(String str) {
        return (kj3) Enum.valueOf(kj3.class, str);
    }

    public static kj3[] values() {
        return (kj3[]) f91614c.clone();
    }
}
