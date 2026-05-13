package com.fyber.inneractive.sdk.network;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InputStream f16990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f16991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f16992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f16993f = new ArrayList();

    public l() {
    }

    public l(FilterInputStream filterInputStream, int i10, String str, Map map, String str2) {
        this.f16990c = filterInputStream;
        this.f16988a = i10;
        this.f16989b = str;
        this.f16991d = map;
        this.f16992e = str2;
    }

    public void a() {
        InputStream inputStream = this.f16990c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Throwable unused) {
            }
        }
    }
}
