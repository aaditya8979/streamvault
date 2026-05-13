package com.safedk.android.utils;

import android.widget.Toast;
import com.safedk.android.SafeDK;

/* JADX INFO: loaded from: classes12.dex */
public class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f53178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f53179b;

    public j(String str) {
        this(str, null);
    }

    public j(String str, String str2) {
        this.f53178a = str;
        this.f53179b = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        Toast.makeText(SafeDK.getInstance().l(), "SDK '" + this.f53178a + "' " + (this.f53179b == null ? "" : "Toggle '" + this.f53179b + "'") + " blocked by SafeDK", 0).show();
    }
}
