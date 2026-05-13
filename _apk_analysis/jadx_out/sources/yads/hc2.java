package yads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class hc2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f90357a = cn.w.p("android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET");

    public static void a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            List listJ1 = cn.f0.j1(f90357a);
            String[] strArr = packageInfo.requestedPermissions;
            if (strArr != null) {
                listJ1.removeAll(cn.r.G0(strArr));
                if (!listJ1.isEmpty()) {
                    tn.x xVar = tn.x.f85368a;
                    String str = String.format("Please, check %s permission in AndroidManifest file.", Arrays.copyOf(new Object[]{listJ1}, 1));
                    tn.p.j(str, "format(...)");
                    throw new ub1(str, str);
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
