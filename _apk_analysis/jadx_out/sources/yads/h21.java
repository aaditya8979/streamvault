package yads;

import io.bidmachine.iab.vast.tags.VastTagName;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class h21 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g21 f90201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ h21[] f90202d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f90203b;

    static {
        h21[] h21VarArr = {new h21(0, "STATIC_RESOURCE", VastTagName.STATIC_RESOURCE), new h21(1, "IFRAME_RESOURCE", VastTagName.I_FRAME_RESOURCE), new h21(2, "HTML_RESOURCE", VastTagName.HTML_RESOURCE)};
        f90202d = h21VarArr;
        kotlin.enums.a.a(h21VarArr);
        f90201c = new g21();
    }

    public h21(int i10, String str, String str2) {
        this.f90203b = str2;
    }

    public static h21 valueOf(String str) {
        return (h21) Enum.valueOf(h21.class, str);
    }

    public static h21[] values() {
        return (h21[]) f90202d.clone();
    }
}
