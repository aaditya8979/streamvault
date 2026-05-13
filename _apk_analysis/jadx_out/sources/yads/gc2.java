package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class gc2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f89918a;

    public gc2(Context context) {
        this.f89918a = context.getApplicationContext();
    }

    public final boolean a(String str) {
        return this.f89918a.checkCallingOrSelfPermission(str) == 0;
    }
}
