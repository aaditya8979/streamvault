package com.unity3d.ads.network.model;

import java.util.Map;
import kotlin.collections.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: HttpResponse.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HttpResponse {

    @NotNull
    private final Object body;

    @NotNull
    private final Map<String, Object> headers;
    private final int statusCode;

    @NotNull
    private final String urlString;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(@NotNull Object obj) {
        this(obj, 0, null, null, 14, null);
        p.k(obj, "body");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(@NotNull Object obj, int i10) {
        this(obj, i10, null, null, 12, null);
        p.k(obj, "body");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(@NotNull Object obj, int i10, @NotNull Map<String, ? extends Object> map) {
        this(obj, i10, map, null, 8, null);
        p.k(obj, "body");
        p.k(map, "headers");
    }

    public HttpResponse(@NotNull Object obj, int i10, @NotNull Map<String, ? extends Object> map, @NotNull String str) {
        p.k(obj, "body");
        p.k(map, "headers");
        p.k(str, "urlString");
        this.body = obj;
        this.statusCode = i10;
        this.headers = map;
        this.urlString = str;
    }

    public /* synthetic */ HttpResponse(Object obj, int i10, Map map, String str, int i11, i iVar) {
        this(obj, (i11 & 2) != 0 ? 200 : i10, (i11 & 4) != 0 ? a.j() : map, (i11 & 8) != 0 ? "" : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HttpResponse copy$default(HttpResponse httpResponse, Object obj, int i10, Map map, String str, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = httpResponse.body;
        }
        if ((i11 & 2) != 0) {
            i10 = httpResponse.statusCode;
        }
        if ((i11 & 4) != 0) {
            map = httpResponse.headers;
        }
        if ((i11 & 8) != 0) {
            str = httpResponse.urlString;
        }
        return httpResponse.copy(obj, i10, map, str);
    }

    @NotNull
    public final Object component1() {
        return this.body;
    }

    public final int component2() {
        return this.statusCode;
    }

    @NotNull
    public final Map<String, Object> component3() {
        return this.headers;
    }

    @NotNull
    public final String component4() {
        return this.urlString;
    }

    @NotNull
    public final HttpResponse copy(@NotNull Object obj, int i10, @NotNull Map<String, ? extends Object> map, @NotNull String str) {
        p.k(obj, "body");
        p.k(map, "headers");
        p.k(str, "urlString");
        return new HttpResponse(obj, i10, map, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpResponse)) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) obj;
        return p.f(this.body, httpResponse.body) && this.statusCode == httpResponse.statusCode && p.f(this.headers, httpResponse.headers) && p.f(this.urlString, httpResponse.urlString);
    }

    @NotNull
    public final Object getBody() {
        return this.body;
    }

    @NotNull
    public final Map<String, Object> getHeaders() {
        return this.headers;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    @NotNull
    public final String getUrlString() {
        return this.urlString;
    }

    public int hashCode() {
        return (((((this.body.hashCode() * 31) + Integer.hashCode(this.statusCode)) * 31) + this.headers.hashCode()) * 31) + this.urlString.hashCode();
    }

    @NotNull
    public String toString() {
        return "HttpResponse(body=" + this.body + ", statusCode=" + this.statusCode + ", headers=" + this.headers + ", urlString=" + this.urlString + ')';
    }
}
