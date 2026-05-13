package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class jl1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ jl1[] f91269c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91270b;

    static {
        jl1[] jl1VarArr = {new jl1(0, "STREAMING", "streaming"), new jl1(1, "PROGRESSIVE", "progressive")};
        f91269c = jl1VarArr;
        kotlin.enums.a.a(jl1VarArr);
    }

    public jl1(int i10, String str, String str2) {
        this.f91270b = str2;
    }

    public static jl1 valueOf(String str) {
        return (jl1) Enum.valueOf(jl1.class, str);
    }

    public static jl1[] values() {
        return (jl1[]) f91269c.clone();
    }
}
