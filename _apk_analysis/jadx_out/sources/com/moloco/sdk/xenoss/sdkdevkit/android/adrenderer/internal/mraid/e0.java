package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.net.Uri;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.moloco.sdk.internal.g0;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred(parameters = 1)
public abstract class e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final b f48343b = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f48344a;

    @StabilityInferred(parameters = 1)
    public static final class a extends e0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final a f48345c = new a();

        public a() {
            super("close", null);
        }
    }

    public static final class b {

        @StabilityInferred(parameters = 1)
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f48346a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final String f48347b;

            public a(boolean z10, @NotNull String str) {
                tn.p.k(str, UnifiedMediationParams.KEY_DESCRIPTION);
                this.f48346a = z10;
                this.f48347b = str;
            }

            public final boolean a() {
                return this.f48346a;
            }
        }

        public b() {
        }

        public /* synthetic */ b(tn.i iVar) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @NotNull
        public final com.moloco.sdk.internal.g0<e0, a> a(@Nullable String str) {
            Object objM7534constructorimpl;
            try {
                Result.a aVar = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(Uri.parse(str));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
            }
            Object objB = null;
            if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
                objM7534constructorimpl = null;
            }
            Uri uri = (Uri) objM7534constructorimpl;
            if (uri == null) {
                return new g0.a(new a(false, "Invalid url: " + str));
            }
            if (!tn.p.f(uri.getScheme(), "mraid")) {
                return new g0.a(new a(false, "Non-mraid url scheme: " + str));
            }
            Map<String, String> mapD = d(uri);
            String host = uri.getHost();
            if (host != null) {
                switch (host.hashCode()) {
                    case -1289167206:
                        if (host.equals("expand")) {
                            objB = b(mapD);
                        }
                        break;
                    case -934437708:
                        if (host.equals("resize")) {
                            c();
                        }
                        break;
                    case 3417674:
                        if (host.equals("open")) {
                            objB = e(mapD);
                        }
                        break;
                    case 94756344:
                        if (host.equals("close")) {
                            objB = a.f48345c;
                        }
                        break;
                    case 133423073:
                        if (host.equals(MRAIDPresenter.SET_ORIENTATION_PROPERTIES)) {
                            objB = f(mapD);
                        }
                        break;
                }
            }
            if (objB != null) {
                return new g0.b(objB);
            }
            return new g0.a(new a(true, "Unknown/unsupported mraid command " + uri.getHost()));
        }

        public final c b(Map<String, String> map) {
            Object objM7534constructorimpl;
            String str = map.get("url");
            Uri uri = null;
            if (str != null) {
                try {
                    Result.a aVar = Result.Companion;
                    objM7534constructorimpl = Result.m7534constructorimpl(Uri.parse(str));
                } catch (Throwable th2) {
                    Result.a aVar2 = Result.Companion;
                    objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
                }
                uri = (Uri) (Result.m7539isFailureimpl(objM7534constructorimpl) ? null : objM7534constructorimpl);
            }
            return new c(uri);
        }

        public final e c() {
            return null;
        }

        public final Map<String, String> d(Uri uri) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : uri.getQueryParameterNames()) {
                linkedHashMap.put(str, TextUtils.join(StringUtils.COMMA, uri.getQueryParameters(str)));
            }
            return linkedHashMap;
        }

        public final d e(Map<String, String> map) {
            Object objM7534constructorimpl;
            String str = map.get("url");
            if (str == null) {
                return null;
            }
            try {
                Result.a aVar = Result.Companion;
                Uri uri = Uri.parse(str);
                tn.p.j(uri, "parse(...)");
                objM7534constructorimpl = Result.m7534constructorimpl(new d(uri));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
            }
            return (d) (Result.m7539isFailureimpl(objM7534constructorimpl) ? null : objM7534constructorimpl);
        }

        public final f f(Map<String, String> map) {
            Boolean boolR1;
            String str = map.get("allowOrientationChange");
            if (str == null || (boolR1 = bo.d0.r1(str)) == null) {
                return null;
            }
            boolean zBooleanValue = boolR1.booleanValue();
            p pVarA = p.f48424a.a(map.get("forceOrientation"));
            if (pVarA == null) {
                return null;
            }
            return new f(zBooleanValue, pVarA);
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class c extends e0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final Uri f48348c;

        public c(@Nullable Uri uri) {
            super("expand", null);
            this.f48348c = uri;
        }

        @Nullable
        public final Uri c() {
            return this.f48348c;
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class d extends e0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Uri f48349c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull Uri uri) {
            super("open", null);
            tn.p.k(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
            this.f48349c = uri;
        }

        @NotNull
        public final Uri c() {
            return this.f48349c;
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class e extends e0 {
    }

    @StabilityInferred(parameters = 1)
    public static final class f extends e0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f48350c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final p f48351d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z10, @NotNull p pVar) {
            super(MRAIDPresenter.SET_ORIENTATION_PROPERTIES, null);
            tn.p.k(pVar, "forceOrientation");
            this.f48350c = z10;
            this.f48351d = pVar;
        }

        public final boolean c() {
            return this.f48350c;
        }

        @NotNull
        public final p d() {
            return this.f48351d;
        }
    }

    public e0(String str) {
        this.f48344a = str;
    }

    public /* synthetic */ e0(String str, tn.i iVar) {
        this(str);
    }

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b a(@NotNull f fVar) {
        tn.p.k(fVar, "<this>");
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b(g0.a(fVar.d()), fVar.c());
    }

    @NotNull
    public final String b() {
        return this.f48344a;
    }
}
