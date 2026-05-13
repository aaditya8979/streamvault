package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class z20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f97361a;

    public z20(Context context) {
        this.f97361a = uz.a(context);
    }

    public final boolean a() {
        return (this.f97361a.getResources().getConfiguration().uiMode & 48) == 32;
    }
}
