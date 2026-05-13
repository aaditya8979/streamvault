package yads;

import io.bidmachine.iab.vast.tags.VastAttributes;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class r03 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ r03[] f94246c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94247b;

    static {
        r03[] r03VarArr = {new r03(0, "VISIBLE", VastAttributes.VISIBLE), new r03(1, "DELAYED", "delayed")};
        f94246c = r03VarArr;
        kotlin.enums.a.a(r03VarArr);
    }

    public r03(int i10, String str, String str2) {
        this.f94247b = str2;
    }

    public static r03 valueOf(String str) {
        return (r03) Enum.valueOf(r03.class, str);
    }

    public static r03[] values() {
        return (r03[]) f94246c.clone();
    }
}
