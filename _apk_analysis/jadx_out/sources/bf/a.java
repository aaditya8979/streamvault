package bf;

import android.os.Bundle;

/* JADX INFO: compiled from: RequestExtras.java */
/* JADX INFO: loaded from: classes12.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f5585b = "query_info_type";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f5586c = "requester_type_5";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f5587d = "UnityScar";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f5588a;

    public a(String str) {
        this.f5588a = f5587d + str;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString(f5585b, f5586c);
        return bundle;
    }

    public String b() {
        return this.f5588a;
    }
}
