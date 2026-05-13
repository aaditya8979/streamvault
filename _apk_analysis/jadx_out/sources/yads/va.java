package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class va {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final va f96036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final va f96037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final va f96038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ va[] f96039e;

    static {
        va vaVar = new va(0, "SINGLE");
        f96036b = vaVar;
        va vaVar2 = new va(1, "BLOCK");
        f96037c = vaVar2;
        va vaVar3 = new va(2, "BLOCK_INNER_CREATIVE");
        f96038d = vaVar3;
        va[] vaVarArr = {vaVar, vaVar2, vaVar3};
        f96039e = vaVarArr;
        kotlin.enums.a.a(vaVarArr);
    }

    public va(int i10, String str) {
    }

    public static va valueOf(String str) {
        return (va) Enum.valueOf(va.class, str);
    }

    public static va[] values() {
        return (va[]) f96039e.clone();
    }
}
