package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Intent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class z0 {
    public static final int A(@NotNull Intent intent) {
        tn.p.k(intent, "<this>");
        return intent.getIntExtra("DEC_DELAY_SECONDS", 0);
    }

    @Nullable
    public static final Boolean B(@NotNull Intent intent) {
        tn.p.k(intent, "<this>");
        if (intent.hasExtra("SKIP_ENABLED")) {
            return Boolean.valueOf(intent.getBooleanExtra("SKIP_ENABLED", false));
        }
        return null;
    }

    public static final int C(@NotNull Intent intent) {
        tn.p.k(intent, "<this>");
        return intent.getIntExtra("SKIP_DELAY_SECONDS", 0);
    }

    public static final boolean D(@NotNull Intent intent) {
        tn.p.k(intent, "<this>");
        return intent.getBooleanExtra("START_MUTED", true);
    }

    @Nullable
    public static final String a(@NotNull Intent intent) {
        tn.p.k(intent, "<this>");
        return intent.getStringExtra("ANDROID_AUTOINLINE_CLICKTHROUGH");
    }

    public static final void b(@NotNull Intent intent, int i10) {
        tn.p.k(intent, "<this>");
        intent.putExtra("CLOSE_DELAY_SECONDS", i10);
    }

    public static final void c(@NotNull Intent intent, @Nullable Boolean bool) {
        tn.p.k(intent, "<this>");
        if (bool != null) {
            intent.putExtra("SKIP_ENABLED", bool.booleanValue());
        }
    }

    public static final void d(@NotNull Intent intent, @NotNull String str) {
        tn.p.k(intent, "<this>");
        tn.p.k(str, "value");
        intent.putExtra("ANDROID_AUTOINLINE_CLICKTHROUGH", str);
    }

    public static final void e(@NotNull Intent intent, boolean z10) {
        tn.p.k(intent, "<this>");
        intent.putExtra("ANDROID_AUTOINLINE_ENABLED", z10);
    }

    public static final void f(@NotNull Intent intent, int i10) {
        tn.p.k(intent, "<this>");
        intent.putExtra("DEC_DELAY_SECONDS", i10);
    }

    public static final void g(@NotNull Intent intent, @NotNull String str) {
        tn.p.k(intent, "<this>");
        tn.p.k(str, "value");
        intent.putExtra("ANDROID_AUTOINLINE_EVENTLINK", str);
    }

    public static final void h(@NotNull Intent intent, boolean z10) {
        tn.p.k(intent, "<this>");
        intent.putExtra("ANDROID_AUTOINLINE_FORCE_FULLSCREEN", z10);
    }

    public static final boolean i(@NotNull Intent intent) {
        tn.p.k(intent, "<this>");
        return intent.getBooleanExtra("ANDROID_AUTOINLINE_ENABLED", false);
    }

    @Nullable
    public static final String j(@NotNull Intent intent) {
        tn.p.k(intent, "<this>");
        return intent.getStringExtra("ANDROID_AUTOINLINE_EVENTLINK");
    }

    public static final void k(@NotNull Intent intent, int i10) {
        tn.p.k(intent, "<this>");
        intent.putExtra("SKIP_DELAY_SECONDS", i10);
    }

    public static final void l(@NotNull Intent intent, @NotNull String str) {
        tn.p.k(intent, "<this>");
        tn.p.k(str, "value");
        intent.putExtra("ANDROID_INLINE_URL", str);
    }

    public static final void m(@NotNull Intent intent, boolean z10) {
        tn.p.k(intent, "<this>");
        intent.putExtra("ANDROID_AUTOINLINE_SKIP", z10);
    }

    public static final void n(@NotNull Intent intent, @NotNull String str) {
        tn.p.k(intent, "<this>");
        tn.p.k(str, "value");
        intent.putExtra("BUNDLE_ID", str);
    }

    public static final void o(@NotNull Intent intent, boolean z10) {
        tn.p.k(intent, "<this>");
        intent.putExtra("ANDROID_INLINE_ENABLED", z10);
    }

    public static final boolean p(@NotNull Intent intent) {
        tn.p.k(intent, "<this>");
        return intent.getBooleanExtra("ANDROID_AUTOINLINE_FORCE_FULLSCREEN", false);
    }

    public static final void q(@NotNull Intent intent, boolean z10) {
        tn.p.k(intent, "<this>");
        intent.putExtra("AUTO_STORE_ON_COMPLETE", z10);
    }

    public static final boolean r(@NotNull Intent intent) {
        tn.p.k(intent, "<this>");
        return intent.getBooleanExtra("ANDROID_AUTOINLINE_SKIP", false);
    }

    public static final void s(@NotNull Intent intent, boolean z10) {
        tn.p.k(intent, "<this>");
        intent.putExtra("AUTO_STORE_ON_SKIP", z10);
    }

    public static final boolean t(@NotNull Intent intent) {
        tn.p.k(intent, "<this>");
        return intent.getBooleanExtra("ANDROID_INLINE_ENABLED", false);
    }

    @Nullable
    public static final String u(@NotNull Intent intent) {
        tn.p.k(intent, "<this>");
        return intent.getStringExtra("ANDROID_INLINE_URL");
    }

    public static final void v(@NotNull Intent intent, boolean z10) {
        tn.p.k(intent, "<this>");
        intent.putExtra("START_MUTED", z10);
    }

    public static final boolean w(@NotNull Intent intent) {
        tn.p.k(intent, "<this>");
        return intent.getBooleanExtra("AUTO_STORE_ON_COMPLETE", false);
    }

    public static final boolean x(@NotNull Intent intent) {
        tn.p.k(intent, "<this>");
        return intent.getBooleanExtra("AUTO_STORE_ON_SKIP", false);
    }

    @Nullable
    public static final String y(@NotNull Intent intent) {
        tn.p.k(intent, "<this>");
        return intent.getStringExtra("BUNDLE_ID");
    }

    public static final int z(@NotNull Intent intent) {
        tn.p.k(intent, "<this>");
        return intent.getIntExtra("CLOSE_DELAY_SECONDS", 0);
    }
}
