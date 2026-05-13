package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.util.Pair;
import android.widget.VideoView;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class cs extends cz {
    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static Object m5853(List<Object> list) {
        return ju.m6812((VideoView) cz.m5927(list, 0, VideoView.class));
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Object m5854(List<Object> list) {
        return ((Pair) cz.m5927(list, 0, Pair.class)).first;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static Object m5855(List<Object> list) {
        Context context = (Context) cz.m5927(list, 0, Context.class);
        ak.m4507(ak.m4506(context), (BroadcastReceiver) cz.m5927(list, 1, BroadcastReceiver.class));
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static long m5856() {
        return jx.m6854();
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Object m5857(List<Object> list) {
        return ((Pair) cz.m5927(list, 0, Pair.class)).second;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static Object m5858(List<Object> list) {
        return ak.m4506((Context) cz.m5927(list, 0, Context.class));
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Object m5859(List<Object> list) {
        Context context = (Context) cz.m5927(list, 0, Context.class);
        ak.m4505(ak.m4506(context), (BroadcastReceiver) cz.m5927(list, 1, BroadcastReceiver.class), (IntentFilter) cz.m5927(list, 2, IntentFilter.class));
        return null;
    }
}
