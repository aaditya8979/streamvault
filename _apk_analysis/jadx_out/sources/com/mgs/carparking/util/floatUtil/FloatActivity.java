package com.mgs.carparking.util.floatUtil;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import com.safedk.android.utils.Logger;
import gd.c;
import gd.d;

/* JADX INFO: loaded from: classes11.dex */
public class FloatActivity extends Activity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static c f45006b;

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity activity, Intent intent, int i10) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (intent == null) {
            return;
        }
        activity.startActivityForResult(intent, i10);
    }

    @RequiresApi(api = 23)
    public final void a() {
        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
        intent.setData(Uri.parse("package:" + getPackageName()));
        safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(this, intent, 1);
    }

    @Override // android.app.Activity
    @RequiresApi(api = 23)
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (d.a(this)) {
            f45006b.onSuccess();
        } else {
            f45006b.a();
        }
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a();
    }
}
