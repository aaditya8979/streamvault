package com.bytedance.sdk.openadsdk.vm.lh;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes11.dex */
public final class ouw {
    public final SharedPreferences ouw;

    public ouw(Context context) {
        this.ouw = context.getSharedPreferences("pag_monitor_record", 0);
    }

    public final void ouw(long j10) {
        SharedPreferences.Editor editorEdit = this.ouw.edit();
        editorEdit.putLong("last_upload_time", j10);
        editorEdit.apply();
    }
}
