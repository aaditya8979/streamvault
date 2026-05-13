package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.ads.internal.util.common.FbValidationUtils;
import com.facebook.login.DefaultAudience;
import com.facebook.login.LoginTargetApp;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.Ne;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NativeProtocol.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0007_NQ\b\u0005\u0004)B\t\b\u0002¢\u0006\u0004\b]\u0010^J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u001a\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0006H\u0002J¢\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00072\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u0002J \u0010$\u001a\u00020#2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\"\u001a\u00020!H\u0002J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010\t\u001a\u00020\u0003H\u0002J\u0010\u0010)\u001a\u00020(2\u0006\u0010\t\u001a\u00020\u0003H\u0002J&\u0010-\u001a\u0004\u0018\u00010\u001e2\u0006\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010\u001e2\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0007J&\u0010.\u001a\u0004\u0018\u00010\u001e2\u0006\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010\u001e2\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0007J|\u00100\u001a\u0004\u0018\u00010\u001e2\u0006\u0010+\u001a\u00020*2\u0006\u0010\n\u001a\u00020\u00072\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000eH\u0007Jª\u0001\u00101\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00022\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010\n\u001a\u00020\u00072\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u0007J\b\u00102\u001a\u00020&H\u0007J\u0010\u00104\u001a\u00020\u000e2\u0006\u00103\u001a\u00020&H\u0007J&\u0010:\u001a\u0004\u0018\u00010\u001e2\u0006\u00105\u001a\u00020\u001e2\b\u00107\u001a\u0004\u0018\u0001062\b\u00109\u001a\u0004\u0018\u000108H\u0007J\u0012\u0010;\u001a\u0004\u0018\u00010\u001e2\u0006\u0010+\u001a\u00020*H\u0007J\u0010\u0010<\u001a\u00020&2\u0006\u0010,\u001a\u00020\u001eH\u0007J\u0014\u0010>\u001a\u0004\u0018\u00010=2\b\u0010,\u001a\u0004\u0018\u00010\u001eH\u0007J\u0012\u0010?\u001a\u0004\u0018\u0001062\u0006\u0010,\u001a\u00020\u001eH\u0007J\u0012\u0010@\u001a\u0004\u0018\u0001062\u0006\u0010,\u001a\u00020\u001eH\u0007J\u0010\u0010B\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020\u001eH\u0007J\u0014\u0010D\u001a\u0004\u0018\u0001082\b\u0010C\u001a\u0004\u0018\u000106H\u0007J\u0014\u0010E\u001a\u0004\u0018\u0001062\b\u0010\u0005\u001a\u0004\u0018\u000108H\u0007J\u0010\u0010G\u001a\u00020&2\u0006\u0010F\u001a\u00020&H\u0007J\b\u0010I\u001a\u00020HH\u0007J(\u0010L\u001a\u00020&2\u000e\u0010J\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%2\u0006\u0010K\u001a\u00020&2\u0006\u0010\"\u001a\u00020!H\u0007R\u001c\u0010P\u001a\n M*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010RR&\u0010V\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010UR\u0014\u0010Y\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010XR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020&0Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010[¨\u0006`"}, d2 = {"Lcom/facebook/internal/d0;", "", "", "Lcom/facebook/internal/d0$e;", InneractiveMediationDefs.GENDER_FEMALE, "e", "", "", "d", "appInfo", "applicationId", "", "permissions", "e2e", "", "isForPublish", "Lcom/facebook/login/DefaultAudience;", "defaultAudience", "clientState", "authType", "ignoreAppSwitchToLoggedOut", "messengerPageId", "resetMessengerState", "Lcom/facebook/login/LoginTargetApp;", "targetApp", "isFamilyLogin", "shouldSkipAccountDedupe", "nonce", "codeChallenge", "codeChallengeMethod", "Landroid/content/Intent;", CampaignEx.JSON_KEY_AD_K, "appInfoList", "", "versionSpec", "Lcom/facebook/internal/d0$f;", "s", "Ljava/util/TreeSet;", "", "o", "Landroid/net/Uri;", "g", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "intent", "B", "C", "isRerequest", "j", "n", "u", "version", VastAttributes.VERTICAL_POSITION, "requestIntent", "Landroid/os/Bundle;", "results", "Lcom/facebook/FacebookException;", "error", InneractiveMediationDefs.GENDER_MALE, "l", "w", "Ljava/util/UUID;", "q", "p", "v", "resultIntent", VastAttributes.HORIZONTAL_POSITION, "errorData", "r", "i", "minimumVersion", "t", "Lbn/r;", "z", "allAvailableFacebookAppVersions", "latestSdkVersion", "h", "kotlin.jvm.PlatformType", "b", "Ljava/lang/String;", "TAG", "c", "Ljava/util/List;", "facebookAppInfoList", "effectCameraAppInfoList", "Ljava/util/Map;", "actionToAppInfoMap", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "protocolVersionsAsyncUpdating", "", "[Ljava/lang/Integer;", "KNOWN_PROTOCOL_VERSIONS", "<init>", "()V", "a", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d0 f15326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final String TAG;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final List<e> facebookAppInfoList;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final List<e> effectCameraAppInfoList;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Map<String, List<e>> actionToAppInfoMap;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final AtomicBoolean protocolVersionsAsyncUpdating;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Integer[] KNOWN_PROTOCOL_VERSIONS;

    /* JADX INFO: compiled from: NativeProtocol.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/facebook/internal/d0$a;", "Lcom/facebook/internal/d0$e;", "", "g", "", "d", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class a extends e {
        @Override // com.facebook.internal.d0.e
        public /* bridge */ /* synthetic */ String c() {
            return (String) g();
        }

        @Override // com.facebook.internal.d0.e
        @NotNull
        public String d() {
            return "com.facebook.arstudio.player";
        }

        @Nullable
        public Void g() {
            return null;
        }
    }

    /* JADX INFO: compiled from: NativeProtocol.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/facebook/internal/d0$b;", "Lcom/facebook/internal/d0$e;", "", "c", "d", "e", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class b extends e {
        @Override // com.facebook.internal.d0.e
        @NotNull
        public String c() {
            return "com.instagram.platform.AppAuthorizeActivity";
        }

        @Override // com.facebook.internal.d0.e
        @NotNull
        public String d() {
            return "com.instagram.android";
        }

        @Override // com.facebook.internal.d0.e
        @NotNull
        public String e() {
            return "token,signed_request,graph_domain,granted_scopes";
        }
    }

    /* JADX INFO: compiled from: NativeProtocol.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0002¨\u0006\u000b"}, d2 = {"Lcom/facebook/internal/d0$c;", "Lcom/facebook/internal/d0$e;", "", "c", "d", "Lbn/r;", InneractiveMediationDefs.GENDER_FEMALE, "", "g", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class c extends e {
        @Override // com.facebook.internal.d0.e
        @NotNull
        public String c() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // com.facebook.internal.d0.e
        @NotNull
        public String d() {
            return FbValidationUtils.FB_PACKAGE;
        }

        @Override // com.facebook.internal.d0.e
        public void f() {
            if (g()) {
                Log.w(d0.c(), "Apps that target Android API 30+ (Android 11+) cannot call Facebook native apps unless the package visibility needs are declared. Please follow https://developers.facebook.com/docs/android/troubleshooting/#faq_267321845055988 to make the declaration.");
            }
        }

        public final boolean g() {
            return k2.t.l().getApplicationInfo().targetSdkVersion >= 30;
        }
    }

    /* JADX INFO: compiled from: NativeProtocol.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/facebook/internal/d0$d;", "Lcom/facebook/internal/d0$e;", "", "g", "", "d", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class d extends e {
        @Override // com.facebook.internal.d0.e
        public /* bridge */ /* synthetic */ String c() {
            return (String) g();
        }

        @Override // com.facebook.internal.d0.e
        @NotNull
        public String d() {
            return "com.facebook.orca";
        }

        @Nullable
        public Void g() {
            return null;
        }
    }

    /* JADX INFO: compiled from: NativeProtocol.kt */
    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bR\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/facebook/internal/d0$e;", "", "", "d", "c", "e", "Lbn/r;", InneractiveMediationDefs.GENDER_FEMALE, "Ljava/util/TreeSet;", "", "b", "", "force", "a", "Ljava/util/TreeSet;", "availableVersions", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public TreeSet<Integer> availableVersions;

        /* JADX WARN: Removed duplicated region for block: B:11:0x001b A[Catch: all -> 0x0038, TryCatch #0 {, blocks: (B:4:0x0003, B:9:0x0013, B:12:0x0023, B:14:0x0027, B:20:0x0033, B:8:0x000b, B:11:0x001b), top: B:26:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0033 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:9:0x0013, B:12:0x0023, B:14:0x0027, B:20:0x0033, B:8:0x000b, B:11:0x001b), top: B:26:0x0003 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final synchronized void a(boolean r2) {
            /*
                r1 = this;
                monitor-enter(r1)
                if (r2 != 0) goto L1b
                java.util.TreeSet<java.lang.Integer> r2 = r1.availableVersions     // Catch: java.lang.Throwable -> L38
                if (r2 == 0) goto L1b
                if (r2 != 0) goto Lb
                r2 = 0
                goto L13
            Lb:
                boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L38
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L38
            L13:
                java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L38
                boolean r2 = tn.p.f(r2, r0)     // Catch: java.lang.Throwable -> L38
                if (r2 != 0) goto L23
            L1b:
                com.facebook.internal.d0 r2 = com.facebook.internal.d0.f15326a     // Catch: java.lang.Throwable -> L38
                java.util.TreeSet r2 = com.facebook.internal.d0.b(r2, r1)     // Catch: java.lang.Throwable -> L38
                r1.availableVersions = r2     // Catch: java.lang.Throwable -> L38
            L23:
                java.util.TreeSet<java.lang.Integer> r2 = r1.availableVersions     // Catch: java.lang.Throwable -> L38
                if (r2 == 0) goto L30
                boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L38
                if (r2 == 0) goto L2e
                goto L30
            L2e:
                r2 = 0
                goto L31
            L30:
                r2 = 1
            L31:
                if (r2 == 0) goto L36
                r1.f()     // Catch: java.lang.Throwable -> L38
            L36:
                monitor-exit(r1)
                return
            L38:
                r2 = move-exception
                monitor-exit(r1)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.d0.e.a(boolean):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.TreeSet<java.lang.Integer> b() {
            /*
                r2 = this;
                java.util.TreeSet<java.lang.Integer> r0 = r2.availableVersions
                if (r0 == 0) goto L18
                if (r0 != 0) goto L8
                r0 = 0
                goto L10
            L8:
                boolean r0 = r0.isEmpty()
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            L10:
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                boolean r0 = tn.p.f(r0, r1)
                if (r0 != 0) goto L1c
            L18:
                r0 = 0
                r2.a(r0)
            L1c:
                java.util.TreeSet<java.lang.Integer> r0 = r2.availableVersions
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.d0.e.b():java.util.TreeSet");
        }

        @Nullable
        public abstract String c();

        @NotNull
        public abstract String d();

        @NotNull
        public String e() {
            return "id_token,token,signed_request,graph_domain";
        }

        public void f() {
        }
    }

    /* JADX INFO: compiled from: NativeProtocol.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \f2\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R(\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R$\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/facebook/internal/d0$f;", "", "Lcom/facebook/internal/d0$e;", "<set-?>", "a", "Lcom/facebook/internal/d0$e;", "getAppInfo", "()Lcom/facebook/internal/d0$e;", "appInfo", "", "b", "I", "c", "()I", Ne.f29940j2, "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class f {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public e appInfo;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public int protocolVersion;

        /* JADX INFO: renamed from: com.facebook.internal.d0$f$a, reason: from kotlin metadata */
        /* JADX INFO: compiled from: NativeProtocol.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, d2 = {"Lcom/facebook/internal/d0$f$a;", "", "Lcom/facebook/internal/d0$e;", "nativeAppInfo", "", Ne.f29940j2, "Lcom/facebook/internal/d0$f;", "a", "b", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(tn.i iVar) {
                this();
            }

            @NotNull
            public final f a(@Nullable e nativeAppInfo, int protocolVersion) {
                f fVar = new f(null);
                fVar.appInfo = nativeAppInfo;
                fVar.protocolVersion = protocolVersion;
                return fVar;
            }

            @NotNull
            public final f b() {
                f fVar = new f(null);
                fVar.protocolVersion = -1;
                return fVar;
            }
        }

        public f() {
        }

        public /* synthetic */ f(tn.i iVar) {
            this();
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getProtocolVersion() {
            return this.protocolVersion;
        }
    }

    /* JADX INFO: compiled from: NativeProtocol.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/facebook/internal/d0$g;", "Lcom/facebook/internal/d0$e;", "", "c", "d", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class g extends e {
        @Override // com.facebook.internal.d0.e
        @NotNull
        public String c() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // com.facebook.internal.d0.e
        @NotNull
        public String d() {
            return FbValidationUtils.DEBUG_FB_PACKAGE;
        }
    }

    static {
        d0 d0Var = new d0();
        f15326a = d0Var;
        TAG = d0.class.getName();
        facebookAppInfoList = d0Var.f();
        effectCameraAppInfoList = d0Var.e();
        actionToAppInfoMap = d0Var.d();
        protocolVersionsAsyncUpdating = new AtomicBoolean(false);
        KNOWN_PROTOCOL_VERSIONS = new Integer[]{20210906, 20171115, 20170417, 20170411, 20170213, 20161017, 20160327, 20150702, 20150401, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140313, 20140204, 20131107, 20131024, 20130618, 20130502, 20121101};
    }

    public static final void A() {
        if (c3.a.d(d0.class)) {
            return;
        }
        try {
            try {
                Iterator<e> it = facebookAppInfoList.iterator();
                while (it.hasNext()) {
                    it.next().a(true);
                }
            } finally {
                protocolVersionsAsyncUpdating.set(false);
            }
        } catch (Throwable th2) {
            c3.a.b(th2, d0.class);
        }
    }

    @Nullable
    public static final Intent B(@NotNull Context context, @Nullable Intent intent, @Nullable e appInfo) {
        ResolveInfo resolveInfoResolveActivity;
        if (c3.a.d(d0.class)) {
            return null;
        }
        try {
            tn.p.k(context, GAMConfig.KEY_CONTEXT);
            if (intent == null || (resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 0)) == null) {
                return null;
            }
            k kVar = k.f15395a;
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            tn.p.j(str, "resolveInfo.activityInfo.packageName");
            if (k.a(context, str)) {
                return intent;
            }
            return null;
        } catch (Throwable th2) {
            c3.a.b(th2, d0.class);
            return null;
        }
    }

    @Nullable
    public static final Intent C(@NotNull Context context, @Nullable Intent intent, @Nullable e appInfo) {
        ResolveInfo resolveInfoResolveService;
        if (c3.a.d(d0.class)) {
            return null;
        }
        try {
            tn.p.k(context, GAMConfig.KEY_CONTEXT);
            if (intent == null || (resolveInfoResolveService = context.getPackageManager().resolveService(intent, 0)) == null) {
                return null;
            }
            k kVar = k.f15395a;
            String str = resolveInfoResolveService.serviceInfo.packageName;
            tn.p.j(str, "resolveInfo.serviceInfo.packageName");
            if (k.a(context, str)) {
                return intent;
            }
            return null;
        } catch (Throwable th2) {
            c3.a.b(th2, d0.class);
            return null;
        }
    }

    public static final /* synthetic */ TreeSet b(d0 d0Var, e eVar) {
        if (c3.a.d(d0.class)) {
            return null;
        }
        try {
            return d0Var.o(eVar);
        } catch (Throwable th2) {
            c3.a.b(th2, d0.class);
            return null;
        }
    }

    public static final /* synthetic */ String c() {
        if (c3.a.d(d0.class)) {
            return null;
        }
        try {
            return TAG;
        } catch (Throwable th2) {
            c3.a.b(th2, d0.class);
            return null;
        }
    }

    public static final int h(@Nullable TreeSet<Integer> allAvailableFacebookAppVersions, int latestSdkVersion, @NotNull int[] versionSpec) {
        if (c3.a.d(d0.class)) {
            return 0;
        }
        try {
            tn.p.k(versionSpec, "versionSpec");
            if (allAvailableFacebookAppVersions == null) {
                return -1;
            }
            int length = versionSpec.length - 1;
            Iterator<Integer> itDescendingIterator = allAvailableFacebookAppVersions.descendingIterator();
            int iMax = -1;
            while (itDescendingIterator.hasNext()) {
                Integer next = itDescendingIterator.next();
                tn.p.j(next, "fbAppVersion");
                iMax = Math.max(iMax, next.intValue());
                while (length >= 0 && versionSpec[length] > next.intValue()) {
                    length--;
                }
                if (length < 0) {
                    return -1;
                }
                if (versionSpec[length] == next.intValue()) {
                    if (length % 2 == 0) {
                        return Math.min(iMax, latestSdkVersion);
                    }
                    return -1;
                }
            }
            return -1;
        } catch (Throwable th2) {
            c3.a.b(th2, d0.class);
            return 0;
        }
    }

    @Nullable
    public static final Bundle i(@Nullable FacebookException e10) {
        if (c3.a.d(d0.class) || e10 == null) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("error_description", e10.toString());
            if (e10 instanceof FacebookOperationCanceledException) {
                bundle.putString("error_type", "UserCanceled");
            }
            return bundle;
        } catch (Throwable th2) {
            c3.a.b(th2, d0.class);
            return null;
        }
    }

    @Nullable
    public static final Intent j(@NotNull Context context, @NotNull String applicationId, @NotNull Collection<String> permissions, @NotNull String e2e, boolean isRerequest, boolean isForPublish, @NotNull DefaultAudience defaultAudience, @NotNull String clientState, @NotNull String authType, @Nullable String messengerPageId, boolean resetMessengerState, boolean isFamilyLogin, boolean shouldSkipAccountDedupe) {
        if (c3.a.d(d0.class)) {
            return null;
        }
        try {
            tn.p.k(context, GAMConfig.KEY_CONTEXT);
            tn.p.k(applicationId, "applicationId");
            tn.p.k(permissions, "permissions");
            tn.p.k(e2e, "e2e");
            tn.p.k(defaultAudience, "defaultAudience");
            tn.p.k(clientState, "clientState");
            tn.p.k(authType, "authType");
            b bVar = new b();
            return B(context, f15326a.k(bVar, applicationId, permissions, e2e, isForPublish, defaultAudience, clientState, authType, false, messengerPageId, resetMessengerState, LoginTargetApp.INSTAGRAM, isFamilyLogin, shouldSkipAccountDedupe, "", null, null), bVar);
        } catch (Throwable th2) {
            c3.a.b(th2, d0.class);
            return null;
        }
    }

    @Nullable
    public static final Intent l(@NotNull Context context) {
        if (c3.a.d(d0.class)) {
            return null;
        }
        try {
            tn.p.k(context, GAMConfig.KEY_CONTEXT);
            for (e eVar : facebookAppInfoList) {
                Intent intentC = C(context, new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(eVar.d()).addCategory("android.intent.category.DEFAULT"), eVar);
                if (intentC != null) {
                    return intentC;
                }
            }
            return null;
        } catch (Throwable th2) {
            c3.a.b(th2, d0.class);
            return null;
        }
    }

    @Nullable
    public static final Intent m(@NotNull Intent requestIntent, @Nullable Bundle results, @Nullable FacebookException error) {
        if (c3.a.d(d0.class)) {
            return null;
        }
        try {
            tn.p.k(requestIntent, "requestIntent");
            UUID uuidQ = q(requestIntent);
            if (uuidQ == null) {
                return null;
            }
            Intent intent = new Intent();
            intent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", w(requestIntent));
            Bundle bundle = new Bundle();
            bundle.putString("action_id", uuidQ.toString());
            if (error != null) {
                bundle.putBundle("error", i(error));
            }
            intent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle);
            if (results != null) {
                intent.putExtra("com.facebook.platform.protocol.RESULT_ARGS", results);
            }
            return intent;
        } catch (Throwable th2) {
            c3.a.b(th2, d0.class);
            return null;
        }
    }

    @NotNull
    public static final List<Intent> n(@Nullable Context context, @NotNull String applicationId, @NotNull Collection<String> permissions, @NotNull String e2e, boolean isRerequest, boolean isForPublish, @NotNull DefaultAudience defaultAudience, @NotNull String clientState, @NotNull String authType, boolean ignoreAppSwitchToLoggedOut, @Nullable String messengerPageId, boolean resetMessengerState, boolean isFamilyLogin, boolean shouldSkipAccountDedupe, @Nullable String nonce, @Nullable String codeChallenge, @Nullable String codeChallengeMethod) {
        if (c3.a.d(d0.class)) {
            return null;
        }
        try {
            tn.p.k(applicationId, "applicationId");
            tn.p.k(permissions, "permissions");
            tn.p.k(e2e, "e2e");
            tn.p.k(defaultAudience, "defaultAudience");
            tn.p.k(clientState, "clientState");
            tn.p.k(authType, "authType");
            List<e> list = facebookAppInfoList;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ArrayList arrayList2 = arrayList;
                Intent intentK = f15326a.k((e) it.next(), applicationId, permissions, e2e, isForPublish, defaultAudience, clientState, authType, ignoreAppSwitchToLoggedOut, messengerPageId, resetMessengerState, LoginTargetApp.FACEBOOK, isFamilyLogin, shouldSkipAccountDedupe, nonce, codeChallenge, codeChallengeMethod);
                if (intentK != null) {
                    arrayList2.add(intentK);
                }
                arrayList = arrayList2;
            }
            return arrayList;
        } catch (Throwable th2) {
            c3.a.b(th2, d0.class);
            return null;
        }
    }

    @Nullable
    public static final Bundle p(@NotNull Intent intent) {
        if (c3.a.d(d0.class)) {
            return null;
        }
        try {
            tn.p.k(intent, "intent");
            if (y(w(intent))) {
                return intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
            }
            return null;
        } catch (Throwable th2) {
            c3.a.b(th2, d0.class);
            return null;
        }
    }

    @Nullable
    public static final UUID q(@Nullable Intent intent) {
        String stringExtra;
        if (c3.a.d(d0.class) || intent == null) {
            return null;
        }
        try {
            if (y(w(intent))) {
                Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
                stringExtra = bundleExtra != null ? bundleExtra.getString("action_id") : null;
            } else {
                stringExtra = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
            }
            if (stringExtra == null) {
                return null;
            }
            try {
                return UUID.fromString(stringExtra);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        } catch (Throwable th2) {
            c3.a.b(th2, d0.class);
            return null;
        }
    }

    @Nullable
    public static final FacebookException r(@Nullable Bundle errorData) {
        if (c3.a.d(d0.class) || errorData == null) {
            return null;
        }
        try {
            String string = errorData.getString("error_type");
            if (string == null) {
                string = errorData.getString("com.facebook.platform.status.ERROR_TYPE");
            }
            String string2 = errorData.getString("error_description");
            if (string2 == null) {
                string2 = errorData.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
            }
            return (string == null || !bo.a0.J(string, "UserCanceled", true)) ? new FacebookException(string2) : new FacebookOperationCanceledException(string2);
        } catch (Throwable th2) {
            c3.a.b(th2, d0.class);
            return null;
        }
    }

    public static final int t(int minimumVersion) {
        if (c3.a.d(d0.class)) {
            return 0;
        }
        try {
            return f15326a.s(facebookAppInfoList, new int[]{minimumVersion}).getProtocolVersion();
        } catch (Throwable th2) {
            c3.a.b(th2, d0.class);
            return 0;
        }
    }

    public static final int u() {
        if (c3.a.d(d0.class)) {
            return 0;
        }
        try {
            return KNOWN_PROTOCOL_VERSIONS[0].intValue();
        } catch (Throwable th2) {
            c3.a.b(th2, d0.class);
            return 0;
        }
    }

    @Nullable
    public static final Bundle v(@NotNull Intent intent) {
        if (c3.a.d(d0.class)) {
            return null;
        }
        try {
            tn.p.k(intent, "intent");
            return !y(w(intent)) ? intent.getExtras() : intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        } catch (Throwable th2) {
            c3.a.b(th2, d0.class);
            return null;
        }
    }

    public static final int w(@NotNull Intent intent) {
        if (c3.a.d(d0.class)) {
            return 0;
        }
        try {
            tn.p.k(intent, "intent");
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable th2) {
            c3.a.b(th2, d0.class);
            return 0;
        }
    }

    public static final boolean x(@NotNull Intent resultIntent) {
        if (c3.a.d(d0.class)) {
            return false;
        }
        try {
            tn.p.k(resultIntent, "resultIntent");
            Bundle bundleP = p(resultIntent);
            Boolean boolValueOf = bundleP == null ? null : Boolean.valueOf(bundleP.containsKey("error"));
            return boolValueOf == null ? resultIntent.hasExtra("com.facebook.platform.status.ERROR_TYPE") : boolValueOf.booleanValue();
        } catch (Throwable th2) {
            c3.a.b(th2, d0.class);
            return false;
        }
    }

    public static final boolean y(int version) {
        if (c3.a.d(d0.class)) {
            return false;
        }
        try {
            return cn.r.P(KNOWN_PROTOCOL_VERSIONS, Integer.valueOf(version)) && version >= 20140701;
        } catch (Throwable th2) {
            c3.a.b(th2, d0.class);
            return false;
        }
    }

    public static final void z() {
        if (c3.a.d(d0.class)) {
            return;
        }
        try {
            if (protocolVersionsAsyncUpdating.compareAndSet(false, true)) {
                k2.t.t().execute(new Runnable() { // from class: com.facebook.internal.c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        d0.A();
                    }
                });
            }
        } catch (Throwable th2) {
            c3.a.b(th2, d0.class);
        }
    }

    public final Map<String, List<e>> d() {
        if (c3.a.d(this)) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new d());
            List<e> list = facebookAppInfoList;
            map.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", list);
            map.put("com.facebook.platform.action.request.FEED_DIALOG", list);
            map.put("com.facebook.platform.action.request.LIKE_DIALOG", list);
            map.put("com.facebook.platform.action.request.APPINVITES_DIALOG", list);
            map.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
            map.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
            map.put("com.facebook.platform.action.request.CAMERA_EFFECT", effectCameraAppInfoList);
            map.put("com.facebook.platform.action.request.SHARE_STORY", list);
            return map;
        } catch (Throwable th2) {
            c3.a.b(th2, this);
            return null;
        }
    }

    public final List<e> e() {
        if (c3.a.d(this)) {
            return null;
        }
        try {
            ArrayList arrayListG = cn.w.g(new a());
            arrayListG.addAll(f());
            return arrayListG;
        } catch (Throwable th2) {
            c3.a.b(th2, this);
            return null;
        }
    }

    public final List<e> f() {
        if (c3.a.d(this)) {
            return null;
        }
        try {
            return cn.w.g(new c(), new g());
        } catch (Throwable th2) {
            c3.a.b(th2, this);
            return null;
        }
    }

    public final Uri g(e appInfo) {
        if (c3.a.d(this)) {
            return null;
        }
        try {
            Uri uri = Uri.parse("content://" + appInfo.d() + ".provider.PlatformProvider/versions");
            tn.p.j(uri, "parse(CONTENT_SCHEME + appInfo.getPackage() + PLATFORM_PROVIDER_VERSIONS)");
            return uri;
        } catch (Throwable th2) {
            c3.a.b(th2, this);
            return null;
        }
    }

    public final Intent k(e appInfo, String applicationId, Collection<String> permissions, String e2e, boolean isForPublish, DefaultAudience defaultAudience, String clientState, String authType, boolean ignoreAppSwitchToLoggedOut, String messengerPageId, boolean resetMessengerState, LoginTargetApp targetApp, boolean isFamilyLogin, boolean shouldSkipAccountDedupe, String nonce, String codeChallenge, String codeChallengeMethod) {
        if (c3.a.d(this)) {
            return null;
        }
        try {
            String strC = appInfo.c();
            if (strC == null) {
                return null;
            }
            Intent intentPutExtra = new Intent().setClassName(appInfo.d(), strC).putExtra("client_id", applicationId);
            tn.p.j(intentPutExtra, "Intent()\n            .setClassName(appInfo.getPackage(), activityName)\n            .putExtra(FACEBOOK_PROXY_AUTH_APP_ID_KEY, applicationId)");
            intentPutExtra.putExtra("facebook_sdk_version", k2.t.B());
            if (!j0.Y(permissions)) {
                intentPutExtra.putExtra("scope", TextUtils.join(StringUtils.COMMA, permissions));
            }
            if (!j0.X(e2e)) {
                intentPutExtra.putExtra("e2e", e2e);
            }
            intentPutExtra.putExtra("state", clientState);
            intentPutExtra.putExtra("response_type", appInfo.e());
            intentPutExtra.putExtra("nonce", nonce);
            intentPutExtra.putExtra("return_scopes", "true");
            if (isForPublish) {
                intentPutExtra.putExtra("default_audience", defaultAudience.getNativeProtocolAudience());
            }
            intentPutExtra.putExtra("legacy_override", k2.t.w());
            intentPutExtra.putExtra("auth_type", authType);
            if (ignoreAppSwitchToLoggedOut) {
                intentPutExtra.putExtra("fail_on_logged_out", true);
            }
            intentPutExtra.putExtra("messenger_page_id", messengerPageId);
            intentPutExtra.putExtra("reset_messenger_state", resetMessengerState);
            if (isFamilyLogin) {
                intentPutExtra.putExtra("fx_app", targetApp.getTargetApp());
            }
            if (shouldSkipAccountDedupe) {
                intentPutExtra.putExtra("skip_dedupe", true);
            }
            return intentPutExtra;
        } catch (Throwable th2) {
            c3.a.b(th2, this);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007e A[Catch: all -> 0x008b, TRY_ENTER, TryCatch #4 {all -> 0x008b, blocks: (B:5:0x000d, B:38:0x008a, B:37:0x0087, B:31:0x007e), top: B:45:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005f A[EXC_TOP_SPLITTER, LOOP:0: B:43:0x005f->B:24:0x0065, LOOP_START, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.TreeSet<java.lang.Integer> o(com.facebook.internal.d0.e r13) {
        /*
            r12 = this;
            java.lang.String r0 = "version"
            java.lang.String r1 = "Failed to query content resolver."
            boolean r2 = c3.a.d(r12)
            r3 = 0
            if (r2 == 0) goto Ld
            return r3
        Ld:
            java.util.TreeSet r2 = new java.util.TreeSet     // Catch: java.lang.Throwable -> L8b
            r2.<init>()     // Catch: java.lang.Throwable -> L8b
            android.content.Context r4 = k2.t.l()     // Catch: java.lang.Throwable -> L8b
            android.content.ContentResolver r5 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L8b
            java.lang.String[] r7 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L8b
            android.net.Uri r6 = r12.g(r13)     // Catch: java.lang.Throwable -> L8b
            android.content.Context r4 = k2.t.l()     // Catch: java.lang.Throwable -> L82
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L82
            java.lang.String r13 = r13.d()     // Catch: java.lang.Throwable -> L82
            java.lang.String r8 = ".provider.PlatformProvider"
            java.lang.String r13 = tn.p.t(r13, r8)     // Catch: java.lang.Throwable -> L82
            r8 = 0
            android.content.pm.ProviderInfo r13 = r4.resolveContentProvider(r13, r8)     // Catch: java.lang.RuntimeException -> L3a java.lang.Throwable -> L82
            goto L41
        L3a:
            r13 = move-exception
            java.lang.String r4 = com.facebook.internal.d0.TAG     // Catch: java.lang.Throwable -> L82
            android.util.Log.e(r4, r1, r13)     // Catch: java.lang.Throwable -> L82
            r13 = r3
        L41:
            if (r13 == 0) goto L7a
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r13 = r5.query(r6, r7, r8, r9, r10)     // Catch: java.lang.IllegalArgumentException -> L4b java.lang.SecurityException -> L51 java.lang.NullPointerException -> L57 java.lang.Throwable -> L82
            goto L5d
        L4b:
            java.lang.String r13 = com.facebook.internal.d0.TAG     // Catch: java.lang.Throwable -> L82
            android.util.Log.e(r13, r1)     // Catch: java.lang.Throwable -> L82
            goto L5c
        L51:
            java.lang.String r13 = com.facebook.internal.d0.TAG     // Catch: java.lang.Throwable -> L82
            android.util.Log.e(r13, r1)     // Catch: java.lang.Throwable -> L82
            goto L5c
        L57:
            java.lang.String r13 = com.facebook.internal.d0.TAG     // Catch: java.lang.Throwable -> L82
            android.util.Log.e(r13, r1)     // Catch: java.lang.Throwable -> L82
        L5c:
            r13 = r3
        L5d:
            if (r13 == 0) goto L7b
        L5f:
            boolean r1 = r13.moveToNext()     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto L7b
            int r1 = r13.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L75
            int r1 = r13.getInt(r1)     // Catch: java.lang.Throwable -> L75
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L75
            r2.add(r1)     // Catch: java.lang.Throwable -> L75
            goto L5f
        L75:
            r0 = move-exception
            r11 = r0
            r0 = r13
            r13 = r11
            goto L84
        L7a:
            r13 = r3
        L7b:
            if (r13 != 0) goto L7e
            goto L81
        L7e:
            r13.close()     // Catch: java.lang.Throwable -> L8b
        L81:
            return r2
        L82:
            r13 = move-exception
            r0 = r3
        L84:
            if (r0 != 0) goto L87
            goto L8a
        L87:
            r0.close()     // Catch: java.lang.Throwable -> L8b
        L8a:
            throw r13     // Catch: java.lang.Throwable -> L8b
        L8b:
            r13 = move-exception
            c3.a.b(r13, r12)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.d0.o(com.facebook.internal.d0$e):java.util.TreeSet");
    }

    public final f s(List<? extends e> appInfoList, int[] versionSpec) {
        if (c3.a.d(this)) {
            return null;
        }
        try {
            z();
            if (appInfoList == null) {
                return f.INSTANCE.b();
            }
            for (e eVar : appInfoList) {
                int iH = h(eVar.b(), u(), versionSpec);
                if (iH != -1) {
                    return f.INSTANCE.a(eVar, iH);
                }
            }
            return f.INSTANCE.b();
        } catch (Throwable th2) {
            c3.a.b(th2, this);
            return null;
        }
    }
}
