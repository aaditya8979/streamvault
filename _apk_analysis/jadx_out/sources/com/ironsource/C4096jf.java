package com.ironsource;

import android.content.Context;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.jf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4096jf implements H3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f32084d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f32085e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f32086f = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f32087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f32088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final N8 f32089c;

    /* JADX INFO: renamed from: com.ironsource.jf$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public C4096jf(@NotNull Context context, @NotNull String str, @NotNull N8 n82) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(str, "baseName");
        tn.p.k(n82, "sdkSharedPref");
        this.f32087a = context;
        this.f32088b = str;
        this.f32089c = n82;
    }

    public /* synthetic */ C4096jf(Context context, String str, N8 n82, int i10, tn.i iVar) {
        this(context, str, (i10 & 4) != 0 ? new Ie() : n82);
    }

    private final Integer a(Integer num) {
        if (num != null && num.intValue() == -1) {
            return null;
        }
        return num;
    }

    private final Long a(Long l10) {
        if (l10 != null && l10.longValue() == -1) {
            return null;
        }
        return l10;
    }

    @Override // com.ironsource.H3
    @Nullable
    public Long a(@NotNull String str) {
        tn.p.k(str, "identifier");
        return a(Long.valueOf(this.f32089c.b(this.f32087a, new C4114kf(str, this.f32088b + ".show_count_threshold").a(), -1L)));
    }

    @Override // com.ironsource.H3
    public void a(@NotNull String str, int i10) {
        tn.p.k(str, "identifier");
        this.f32089c.a(this.f32087a, new C4114kf(str, this.f32088b + ".show_count_show_counter").a(), i10);
    }

    @Override // com.ironsource.H3
    public void a(@NotNull String str, long j10) {
        tn.p.k(str, "identifier");
        this.f32089c.a(this.f32087a, new C4114kf(str, this.f32088b + ".pacing_last_show_time").a(), j10);
    }

    @Override // com.ironsource.H3
    @Nullable
    public Long b(@NotNull String str) {
        tn.p.k(str, "identifier");
        return a(Long.valueOf(this.f32089c.b(this.f32087a, new C4114kf(str, this.f32088b + ".pacing_last_show_time").a(), -1L)));
    }

    @Override // com.ironsource.H3
    public void b(@NotNull String str, long j10) {
        tn.p.k(str, "identifier");
        this.f32089c.a(this.f32087a, new C4114kf(str, this.f32088b + ".show_count_threshold").a(), j10);
    }

    @Override // com.ironsource.H3
    @Nullable
    public Integer c(@NotNull String str) {
        tn.p.k(str, "identifier");
        return a(Integer.valueOf(this.f32089c.b(this.f32087a, new C4114kf(str, this.f32088b + ".show_count_show_counter").a(), -1)));
    }
}
