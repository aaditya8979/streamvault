package zp;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: VCUtilsImp.java */
/* JADX INFO: loaded from: classes3.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f98404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Map<Class<?>, Object> f98405b = new HashMap();

    public static void a(Context context) {
        if (context == null) {
            throw new NullPointerException("Cannot are null of  context");
        }
        f98404a = context.getApplicationContext();
    }
}
