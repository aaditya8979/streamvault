package com.ironsource.sdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.InterfaceC4060he;
import com.ironsource.S9;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class SSAFactory {
    public static InterfaceC4060he getPublisherInstance(Activity activity) throws Exception {
        return S9.b((Context) activity);
    }

    public static InterfaceC4060he getPublisherTestInstance(Activity activity, int i10) throws Exception {
        return S9.a(activity, i10);
    }
}
