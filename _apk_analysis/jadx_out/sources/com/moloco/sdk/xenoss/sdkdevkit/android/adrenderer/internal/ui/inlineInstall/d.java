package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import bo.d0;
import com.moloco.sdk.internal.MolocoLogger;
import java.util.Locale;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
public final class d implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f48971b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f48972c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Regex f48973a = new Regex("^[a-z][a-z0-9]*(\\.[a-z][a-z0-9]*)+$");

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.c
    public boolean a(@NotNull String str) {
        tn.p.k(str, "bundleId");
        return this.f48973a.matches(str);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.c
    @Nullable
    public String b(@NotNull String str) {
        String lowerCase;
        String lowerCase2;
        String queryParameter;
        tn.p.k(str, "url");
        try {
            Uri uri = Uri.parse(str);
            tn.p.j(uri, "parse(this)");
            String scheme = uri.getScheme();
            if (scheme != null) {
                lowerCase = scheme.toLowerCase(Locale.ROOT);
                tn.p.j(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            String host = uri.getHost();
            if (host != null) {
                lowerCase2 = host.toLowerCase(Locale.ROOT);
                tn.p.j(lowerCase2, "toLowerCase(...)");
            } else {
                lowerCase2 = null;
            }
            if (tn.p.f(lowerCase, "market")) {
                queryParameter = uri.getQueryParameter("id");
            } else {
                if (lowerCase2 == null || !d0.c0(lowerCase2, "play.google.com", false, 2, null)) {
                    return null;
                }
                queryParameter = uri.getQueryParameter("id");
            }
            return queryParameter;
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "BundleExtractor", "Failed to parse URL for bundle ID", e10, false, 8, null);
            return null;
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.c
    @Nullable
    public String d(@NotNull String str) {
        String lowerCase;
        String lowerCase2;
        String queryParameter;
        tn.p.k(str, "url");
        try {
            Uri uri = Uri.parse(str);
            tn.p.j(uri, "parse(this)");
            String scheme = uri.getScheme();
            if (scheme != null) {
                lowerCase = scheme.toLowerCase(Locale.ROOT);
                tn.p.j(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            String host = uri.getHost();
            if (host != null) {
                lowerCase2 = host.toLowerCase(Locale.ROOT);
                tn.p.j(lowerCase2, "toLowerCase(...)");
            } else {
                lowerCase2 = null;
            }
            if (tn.p.f(lowerCase, "market")) {
                queryParameter = uri.getQueryParameter("referrer");
            } else {
                if (lowerCase2 == null || !d0.c0(lowerCase2, "play.google.com", false, 2, null)) {
                    return null;
                }
                queryParameter = uri.getQueryParameter("referrer");
            }
            return queryParameter;
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "BundleExtractor", "Failed to parse URL for referrer", e10, false, 8, null);
            return null;
        }
    }
}
