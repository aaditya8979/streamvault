package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Di {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Context f65158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f65160c;

    public Di(Context context, String str, String str2) {
        this.f65158a = context;
        this.f65159b = str;
        this.f65160c = str2;
    }

    @Nullable
    public final Object a() {
        int identifier = this.f65158a.getResources().getIdentifier(this.f65159b, this.f65160c, this.f65158a.getPackageName());
        if (identifier == 0) {
            return null;
        }
        try {
            return a(identifier);
        } catch (Throwable unused) {
            return null;
        }
    }

    public abstract Object a(int i10);
}
