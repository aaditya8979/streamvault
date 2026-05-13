package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public abstract class uz {
    public static final Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public static final ta2 b(Context context) {
        int i10 = context.getResources().getConfiguration().orientation;
        return i10 != 1 ? i10 != 2 ? ta2.f95127e : ta2.f95125c : ta2.f95126d;
    }
}
