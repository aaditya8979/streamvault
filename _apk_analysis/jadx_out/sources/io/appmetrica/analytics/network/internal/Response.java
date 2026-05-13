package io.appmetrica.analytics.network.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.network.impl.e;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class Response {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f68250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f68251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f68252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f68253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f68254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Throwable f68255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f68256g;

    public Response(@Nullable Throwable th2) {
        this(false, 0, new byte[0], new byte[0], new HashMap(), th2);
    }

    public Response(boolean z10, int i10, @NonNull byte[] bArr, @NonNull byte[] bArr2, @Nullable Map<String, List<String>> map, @Nullable Throwable th2) {
        this(z10, i10, bArr, bArr2, map, th2, null);
    }

    public Response(boolean z10, int i10, @NonNull byte[] bArr, @NonNull byte[] bArr2, @Nullable Map<String, List<String>> map, @Nullable Throwable th2, @Nullable String str) {
        this.f68250a = z10;
        this.f68251b = i10;
        this.f68252c = bArr;
        this.f68253d = bArr2;
        this.f68254e = map == null ? Collections.emptyMap() : e.a(map);
        this.f68255f = th2;
        this.f68256g = str;
    }

    public int getCode() {
        return this.f68251b;
    }

    @NonNull
    public byte[] getErrorData() {
        return this.f68253d;
    }

    @Nullable
    public Throwable getException() {
        return this.f68255f;
    }

    @NonNull
    public Map<String, List<String>> getHeaders() {
        return this.f68254e;
    }

    @NonNull
    public byte[] getResponseData() {
        return this.f68252c;
    }

    @Nullable
    public String getUrl() {
        return this.f68256g;
    }

    public boolean isCompleted() {
        return this.f68250a;
    }

    public String toString() {
        return "Response{completed=" + this.f68250a + ", code=" + this.f68251b + ", responseDataLength=" + this.f68252c.length + ", errorDataLength=" + this.f68253d.length + ", headers=" + this.f68254e + ", exception=" + this.f68255f + ", url=" + this.f68256g + '}';
    }
}
