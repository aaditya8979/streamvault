package yads;

import com.ironsource.C3978d4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class dv {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final cv f88988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final dv f88989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ dv[] f88990e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88991b;

    static {
        dv dvVar = new dv(0, "BROWSER", "browser");
        dv dvVar2 = new dv(1, "WEBVIEW", C3978d4.i.K);
        f88989d = dvVar2;
        dv[] dvVarArr = {dvVar, dvVar2};
        f88990e = dvVarArr;
        kotlin.enums.a.a(dvVarArr);
        f88988c = new cv();
    }

    public dv(int i10, String str, String str2) {
        this.f88991b = str2;
    }

    public static dv valueOf(String str) {
        return (dv) Enum.valueOf(dv.class, str);
    }

    public static dv[] values() {
        return (dv[]) f88990e.clone();
    }
}
