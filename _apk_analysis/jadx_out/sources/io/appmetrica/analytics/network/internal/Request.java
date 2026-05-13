package io.appmetrica.analytics.network.internal;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.network.impl.e;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class Request {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f68242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f68243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f68244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f68245d;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f68246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f68247b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte[] f68248c = new byte[0];

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final HashMap f68249d = new HashMap();

        public Builder(@NonNull String str) {
            this.f68246a = str;
        }

        @NonNull
        public Builder addHeader(@NonNull String str, @Nullable String str2) {
            this.f68249d.put(str, str2);
            return this;
        }

        public Request build() {
            return new Request(this.f68246a, this.f68247b, this.f68248c, this.f68249d, 0);
        }

        @NonNull
        public Builder post(@NonNull byte[] bArr) {
            this.f68248c = bArr;
            return withMethod("POST");
        }

        @NonNull
        public Builder withMethod(@NonNull String str) {
            this.f68247b = str;
            return this;
        }
    }

    private Request(String str, String str2, byte[] bArr, HashMap map) {
        this.f68242a = str;
        this.f68243b = TextUtils.isEmpty(str2) ? "GET" : str2;
        this.f68244c = bArr;
        this.f68245d = e.a(map);
    }

    public /* synthetic */ Request(String str, String str2, byte[] bArr, HashMap map, int i10) {
        this(str, str2, bArr, map);
    }

    @NonNull
    public byte[] getBody() {
        return this.f68244c;
    }

    @NonNull
    public Map<String, String> getHeaders() {
        return this.f68245d;
    }

    @NonNull
    public String getMethod() {
        return this.f68243b;
    }

    @NonNull
    public String getUrl() {
        return this.f68242a;
    }

    public String toString() {
        return "Request{url=" + this.f68242a + ", method='" + this.f68243b + "', bodyLength=" + this.f68244c.length + ", headers=" + this.f68245d + '}';
    }
}
