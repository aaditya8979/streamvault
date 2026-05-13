package com.bykv.vk.openvk.ouw.ouw.vt.vt;

import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class ouw {
    public static boolean ouw() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }
}
