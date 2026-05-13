package yads;

import com.fyber.inneractive.sdk.external.NativeAdContent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class my {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final my f92634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final my f92635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final my f92636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ my[] f92637e;

    static {
        my myVar = new my(0, "FAVICON");
        f92634b = myVar;
        my myVar2 = new my(1, NativeAdContent.ViewTag.AD_ICON);
        f92635c = myVar2;
        my myVar3 = new my(2, "THUMB");
        f92636d = myVar3;
        my[] myVarArr = {myVar, myVar2, myVar3};
        f92637e = myVarArr;
        kotlin.enums.a.a(myVarArr);
    }

    public my(int i10, String str) {
    }

    public static my valueOf(String str) {
        return (my) Enum.valueOf(my.class, str);
    }

    public static my[] values() {
        return (my[]) f92637e.clone();
    }
}
