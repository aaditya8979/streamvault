package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ch {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ch f88459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ch f88460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ch f88461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ch[] f88462e;

    static {
        ch chVar = new ch(0, "UNKNOWN");
        f88459b = chVar;
        ch chVar2 = new ch(1, "NETWORK");
        f88460c = chVar2;
        ch chVar3 = new ch(2, "INVALID_RESPONSE");
        f88461d = chVar3;
        ch[] chVarArr = {chVar, chVar2, chVar3};
        f88462e = chVarArr;
        kotlin.enums.a.a(chVarArr);
    }

    public ch(int i10, String str) {
    }

    public static ch valueOf(String str) {
        return (ch) Enum.valueOf(ch.class, str);
    }

    public static ch[] values() {
        return (ch[]) f88462e.clone();
    }
}
