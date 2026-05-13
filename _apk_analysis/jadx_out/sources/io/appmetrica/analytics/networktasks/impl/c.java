package io.appmetrica.analytics.networktasks.impl;

import android.net.Uri;
import tn.p;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68258a;

    public c(String str) {
        this.f68258a = a(str);
    }

    public static String a(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        Uri uri = Uri.parse(str);
        return p.f("http", uri.getScheme()) ? uri.buildUpon().scheme("https").build().toString() : str;
    }
}
