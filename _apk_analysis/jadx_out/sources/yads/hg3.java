package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class hg3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final hg3 f90401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hg3 f90402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final hg3 f90403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final hg3 f90404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final hg3 f90405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final hg3 f90406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final hg3 f90407h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final hg3 f90408i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final hg3 f90409j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final hg3 f90410k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ hg3[] f90411l;

    static {
        hg3 hg3Var = new hg3(0, "INITIAL");
        f90401b = hg3Var;
        hg3 hg3Var2 = new hg3(1, "PREPARING");
        f90402c = hg3Var2;
        hg3 hg3Var3 = new hg3(2, "PREPARED");
        f90403d = hg3Var3;
        hg3 hg3Var4 = new hg3(3, "PLAYING");
        f90404e = hg3Var4;
        hg3 hg3Var5 = new hg3(4, "STOPPED");
        f90405f = hg3Var5;
        hg3 hg3Var6 = new hg3(5, "FINISHED");
        f90406g = hg3Var6;
        hg3 hg3Var7 = new hg3(6, "PAUSED");
        f90407h = hg3Var7;
        hg3 hg3Var8 = new hg3(7, "BUFFERING");
        f90408i = hg3Var8;
        hg3 hg3Var9 = new hg3(8, "PLAYING_ERROR");
        f90409j = hg3Var9;
        hg3 hg3Var10 = new hg3(9, "PREPARING_ERROR");
        f90410k = hg3Var10;
        hg3[] hg3VarArr = {hg3Var, hg3Var2, hg3Var3, hg3Var4, hg3Var5, hg3Var6, hg3Var7, hg3Var8, hg3Var9, hg3Var10};
        f90411l = hg3VarArr;
        kotlin.enums.a.a(hg3VarArr);
    }

    public hg3(int i10, String str) {
    }

    public static hg3 valueOf(String str) {
        return (hg3) Enum.valueOf(hg3.class, str);
    }

    public static hg3[] values() {
        return (hg3[]) f90411l.clone();
    }
}
