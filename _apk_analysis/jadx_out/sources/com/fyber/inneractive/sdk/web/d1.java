package com.fyber.inneractive.sdk.web;

import android.webkit.WebResourceRequest;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f19605c;

    public d1(WebResourceRequest webResourceRequest) {
        this.f19603a = webResourceRequest.getUrl().toString();
        this.f19604b = webResourceRequest.getMethod();
        this.f19605c = new HashMap(webResourceRequest.getRequestHeaders() == null ? Collections.emptyMap() : webResourceRequest.getRequestHeaders());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d1.class != obj.getClass()) {
            return false;
        }
        d1 d1Var = (d1) obj;
        if (this.f19603a.equals(d1Var.f19603a) && this.f19604b.equals(d1Var.f19604b)) {
            return this.f19605c.equals(d1Var.f19605c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19605c.hashCode() + ((this.f19604b.hashCode() + (this.f19603a.hashCode() * 31)) * 31);
    }
}
