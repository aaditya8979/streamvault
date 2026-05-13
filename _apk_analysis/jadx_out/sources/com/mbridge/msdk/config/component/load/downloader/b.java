package com.mbridge.msdk.config.component.load.downloader;

import com.mbridge.msdk.foundation.tools.q0;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: DownloadMessage.java */
/* JADX INFO: loaded from: classes3.dex */
public class b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private T f36043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f36045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, Object> f36046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36047e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f36048f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f36049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f36050h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f36051i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f36052j;

    public b(T t10, String str, String str2, int i10) {
        this.f36043a = t10;
        this.f36049g = str2;
        this.f36044b = i10;
        try {
            URL url = new URL(str);
            this.f36045c = url.getProtocol() + "://" + url.getHost() + url.getPath();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("resourceUrl: ");
            sb2.append(this.f36045c);
            q0.a("DownloadMessage", sb2.toString());
        } catch (MalformedURLException e10) {
            q0.b("DownloadMessage", e10.getMessage(), e10);
        }
    }

    public long a() {
        return this.f36051i;
    }

    public void a(float f10) {
        this.f36052j = f10;
    }

    public void a(long j10) {
        this.f36051i = j10;
    }

    public void a(String str) {
        this.f36048f = str;
    }

    public void a(String str, Object obj) {
        if (this.f36046d == null) {
            this.f36046d = new HashMap(4);
        }
        this.f36046d.put(str, obj);
    }

    public void a(boolean z10) {
        this.f36050h = z10;
    }

    public float b() {
        return this.f36052j;
    }

    public int c() {
        return this.f36044b;
    }

    public String d() {
        return this.f36045c;
    }

    public String e() {
        return this.f36049g;
    }

    public String f() {
        return this.f36048f;
    }

    public boolean g() {
        return this.f36050h;
    }
}
