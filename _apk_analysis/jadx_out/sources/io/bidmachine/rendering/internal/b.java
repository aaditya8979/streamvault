package io.bidmachine.rendering.internal;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static final Intent a(Context context, Class cls) {
        tn.p.k(context, "<this>");
        tn.p.k(cls, "clazz");
        Intent intent = new Intent(context, (Class<?>) cls);
        intent.addFlags(268435456);
        intent.addFlags(8388608);
        return intent;
    }
}
