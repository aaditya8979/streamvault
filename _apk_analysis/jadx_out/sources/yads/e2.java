package yads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes3.dex */
public final class e2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f89067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f89068c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v1 f89069a = new v1();

    static {
        String str = com.safedk.android.utils.g.f53151y + ".common.AdActivity";
        f89067b = str;
        f89068c = "There is no presence of " + str + " activity in AndroidManifest file.";
    }

    public final void a(Context context) {
        try {
            ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), f89067b), 0);
            this.f89069a.getClass();
            v1.a(activityInfo);
        } catch (PackageManager.NameNotFoundException unused) {
            String str = f89068c;
            throw new ub1(str, str);
        }
    }
}
