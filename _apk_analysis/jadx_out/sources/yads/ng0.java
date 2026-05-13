package yads;

import android.app.Activity;
import android.app.Dialog;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ng0 {
    public static final void a(Dialog dialog) {
        Activity ownerActivity = dialog.getOwnerActivity();
        boolean z10 = ownerActivity == null || !(ownerActivity.isFinishing() || ownerActivity.isDestroyed());
        if (dialog.isShowing() && z10) {
            try {
                dialog.dismiss();
            } catch (Exception unused) {
                boolean z11 = ad1.f87661a;
            }
        }
    }
}
