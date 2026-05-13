package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class e8 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d8 f89151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ e8[] f89152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kn.a f89153e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f89154b;

    static {
        e8[] e8VarArr = {new e8(0, "APPLOVIN", "applovin"), new e8(1, "APPLOVINMAX", "applovin_max"), new e8(2, "BIGOADS", "bigoads"), new e8(3, "CHARTBOOST", "chartboost"), new e8(4, "DIGITALTURBINE", "digitalturbine"), new e8(5, "GOOGLE", "admanager"), new e8(6, "ADMOB", "admob"), new e8(7, "INMOBI", "inmobi"), new e8(8, "IRONSOURCE", "ironsource"), new e8(9, "MINTEGRAL", "mintegral"), new e8(10, "MYTARGET", "mytarget"), new e8(11, "PANGLE", "pangle"), new e8(12, "TAPJOY", "tapjoy"), new e8(13, "UNITYADS", "unityads"), new e8(14, "VUNGLE", "vungle"), new e8(15, "YANDEX", "yandex")};
        f89152d = e8VarArr;
        f89153e = kotlin.enums.a.a(e8VarArr);
        f89151c = new d8();
    }

    public e8(int i10, String str, String str2) {
        this.f89154b = str2;
    }

    public static e8 valueOf(String str) {
        return (e8) Enum.valueOf(e8.class, str);
    }

    public static e8[] values() {
        return (e8[]) f89152d.clone();
    }
}
