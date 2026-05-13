package com.yandex.android.beacon;

import android.net.Uri;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: SendBeaconRequest.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f53941e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Uri f53942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f53943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final JSONObject f53944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final yf.a f53945d;

    /* JADX INFO: compiled from: SendBeaconRequest.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        @NotNull
        public final c a(@NotNull com.yandex.android.beacon.a aVar) {
            return new c(aVar.e(), aVar.c(), aVar.d(), aVar.b());
        }
    }

    public c(@NotNull Uri uri, @NotNull Map<String, String> map, @Nullable JSONObject jSONObject, @Nullable yf.a aVar) {
        this.f53942a = uri;
        this.f53943b = map;
        this.f53944c = jSONObject;
        this.f53945d = aVar;
    }

    @NotNull
    public final Uri a() {
        return this.f53942a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return p.f(this.f53942a, cVar.f53942a) && p.f(this.f53943b, cVar.f53943b) && p.f(this.f53944c, cVar.f53944c) && p.f(this.f53945d, cVar.f53945d);
    }

    public int hashCode() {
        int iHashCode = ((this.f53942a.hashCode() * 31) + this.f53943b.hashCode()) * 31;
        JSONObject jSONObject = this.f53944c;
        int iHashCode2 = (iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        yf.a aVar = this.f53945d;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SendBeaconRequest(url=" + this.f53942a + ", headers=" + this.f53943b + ", payload=" + this.f53944c + ", cookieStorage=" + this.f53945d + ')';
    }
}
