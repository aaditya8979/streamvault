package com.yandex.android.beacon;

import android.net.Uri;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: BeaconItem.kt */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Uri f53931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f53932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final JSONObject f53933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f53934d;

    /* JADX INFO: renamed from: com.yandex.android.beacon.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BeaconItem.kt */
    public static final class C0719a extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f53935e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final yf.a f53936f;

        public C0719a(@NotNull Uri uri, @NotNull Map<String, String> map, @Nullable JSONObject jSONObject, long j10, long j11) {
            super(uri, map, jSONObject, j10);
            this.f53935e = j11;
        }

        @Override // com.yandex.android.beacon.a
        @NotNull
        public C0719a a() {
            return this;
        }

        @Override // com.yandex.android.beacon.a
        @Nullable
        public yf.a b() {
            return this.f53936f;
        }

        public final long f() {
            return this.f53935e;
        }
    }

    public a(@NotNull Uri uri, @NotNull Map<String, String> map, @Nullable JSONObject jSONObject, long j10) {
        this.f53931a = uri;
        this.f53932b = map;
        this.f53933c = jSONObject;
        this.f53934d = j10;
    }

    @Nullable
    public abstract C0719a a();

    @Nullable
    public abstract yf.a b();

    @NotNull
    public final Map<String, String> c() {
        return this.f53932b;
    }

    @Nullable
    public final JSONObject d() {
        return this.f53933c;
    }

    @NotNull
    public final Uri e() {
        return this.f53931a;
    }

    @NotNull
    public String toString() {
        return "BeaconItem{url=" + this.f53931a + ", headers=" + this.f53932b + ", addTimestamp=" + this.f53934d;
    }
}
