package com.ironsource;

import com.ironsource.C3978d4;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.c7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3963c7 implements Y6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final JSONObject f31127a;

    /* JADX INFO: renamed from: com.ironsource.c7$a */
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final boolean f31129b = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f31131d = 24;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f31128a = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f31130c = EnumC3981d7.SendEvent.b();

        private a() {
        }

        public final int a() {
            return f31130c;
        }
    }

    public C3963c7(@Nullable JSONObject jSONObject) {
        this.f31127a = jSONObject == null ? IronSourceVideoBridge.jsonObjectInit() : jSONObject;
    }

    @Override // com.ironsource.Y6
    public long a() {
        return ((long) this.f31127a.optInt("timeout", 24)) * 1000;
    }

    @Override // com.ironsource.X5
    public boolean b() {
        return this.f31127a.optBoolean(com.ironsource.mediationsdk.metadata.a.f32685j, false);
    }

    @Override // com.ironsource.Y6
    @NotNull
    public EnumC3981d7 c() {
        return EnumC3981d7.f31452b.a(this.f31127a.optInt(C3978d4.f.f31283e, a.f31128a.a()));
    }
}
