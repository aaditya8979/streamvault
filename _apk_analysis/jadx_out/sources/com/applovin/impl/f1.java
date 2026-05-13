package com.applovin.impl;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsService;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.R;
import com.ironsource.C3978d4;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CustomTabsClient f8263b;

    public class a extends CustomTabsServiceConnection {
        public a() {
        }

        @Override // androidx.browser.customtabs.CustomTabsServiceConnection
        public void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
            f1.this.f8262a.O();
            if (com.applovin.impl.sdk.o.a()) {
                f1.this.f8262a.O().a("CustomTabsManager", "Connection successful: " + componentName);
            }
            f1.this.f8263b = customTabsClient;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            f1.this.f8262a.O();
            if (com.applovin.impl.sdk.o.a()) {
                f1.this.f8262a.O().a("CustomTabsManager", "Service disconnected: " + componentName);
            }
            f1.this.f8263b = null;
        }
    }

    public class b extends CustomTabsCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f8265a;

        public b(com.applovin.impl.adview.a aVar) {
            this.f8265a = new WeakReference(aVar);
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onNavigationEvent(int i10, Bundle bundle) {
            com.applovin.impl.adview.a aVar = (com.applovin.impl.adview.a) this.f8265a.get();
            if (aVar == null) {
                f1.this.f8262a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    f1.this.f8262a.O().b("CustomTabsManager", "Unable to track navigation event (" + i10 + "). Controller is null.");
                }
                return;
            }
            com.applovin.impl.sdk.ad.b bVarG = aVar.g();
            if (bVarG == null) {
                f1.this.f8262a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    f1.this.f8262a.O().b("CustomTabsManager", "Unable to track navigation event (" + i10 + "). No ad specified.");
                    return;
                }
                return;
            }
            switch (i10) {
                case 1:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        f1.this.f8262a.k().trackCustomTabsNavigationStarted(bVarG);
                    }
                    break;
                case 2:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        f1.this.f8262a.k().trackCustomTabsNavigationFinished(bVarG);
                    }
                    break;
                case 3:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        f1.this.f8262a.k().trackCustomTabsNavigationFailed(bVarG);
                    }
                    break;
                case 4:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        f1.this.f8262a.k().trackCustomTabsNavigationAborted(bVarG);
                    }
                    break;
                case 5:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        f1.this.f8262a.k().trackCustomTabsTabShown(bVarG);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_shown"), null);
                    t2.c(aVar.e(), bVarG, aVar.i());
                    break;
                case 6:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        f1.this.f8262a.k().trackCustomTabsTabHidden(bVarG);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_hidden"), null);
                    t2.a(aVar.e(), bVarG, aVar.i());
                    break;
                default:
                    f1.this.f8262a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        f1.this.f8262a.O().a("CustomTabsManager", "Unknown navigation event: " + i10);
                    }
                    break;
            }
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle) {
            f1.this.f8262a.O();
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVarO = f1.this.f8262a.O();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Validation ");
                sb2.append(z10 ? "succeeded" : C3978d4.i.f31363t);
                sb2.append(" for session-URL relation(");
                sb2.append(i10);
                sb2.append("), requestedOrigin(");
                sb2.append(uri);
                sb2.append(")");
                oVarO.a("CustomTabsManager", sb2.toString());
            }
        }
    }

    public class c extends CustomTabsCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f8267a;

        public c(AppLovinNativeAdImpl appLovinNativeAdImpl) {
            this.f8267a = new WeakReference(appLovinNativeAdImpl);
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onNavigationEvent(int i10, Bundle bundle) {
            AppLovinNativeAdImpl appLovinNativeAdImpl = (AppLovinNativeAdImpl) this.f8267a.get();
            if (appLovinNativeAdImpl == null) {
                f1.this.f8262a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    f1.this.f8262a.O().b("CustomTabsManager", "Unable to track navigation event (" + i10 + "). Native ad is null.");
                }
                return;
            }
            switch (i10) {
                case 1:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.this.f8262a.k().trackNativeAdCustomTabsNavigationStarted(appLovinNativeAdImpl);
                    }
                    break;
                case 2:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.this.f8262a.k().trackNativeAdCustomTabsNavigationFinished(appLovinNativeAdImpl);
                    }
                    break;
                case 3:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.this.f8262a.k().trackNativeAdCustomTabsNavigationFailed(appLovinNativeAdImpl);
                    }
                    break;
                case 4:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.this.f8262a.k().trackNativeAdCustomTabsNavigationAborted(appLovinNativeAdImpl);
                    }
                    break;
                case 5:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.this.f8262a.k().trackNativeAdCustomTabsTabShown(appLovinNativeAdImpl);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_shown"), null);
                    break;
                case 6:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.this.f8262a.k().trackNativeAdCustomTabsTabHidden(appLovinNativeAdImpl);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_hidden"), null);
                    break;
                default:
                    f1.this.f8262a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        f1.this.f8262a.O().a("CustomTabsManager", "Unknown navigation event: " + i10);
                    }
                    break;
            }
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle) {
            f1.this.f8262a.O();
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVarO = f1.this.f8262a.O();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Validation ");
                sb2.append(z10 ? "succeeded" : C3978d4.i.f31363t);
                sb2.append(" for session-URL relation(");
                sb2.append(i10);
                sb2.append("), requestedOrigin(");
                sb2.append(uri);
                sb2.append(")");
                oVarO.a("CustomTabsManager", sb2.toString());
            }
        }
    }

    public f1(com.applovin.impl.sdk.k kVar) {
        this.f8262a = kVar;
    }

    private CustomTabsIntent a(com.applovin.impl.adview.a aVar, Activity activity) {
        com.applovin.impl.sdk.ad.b bVarG = aVar.g();
        return a(bVarG != null ? bVarG.getCustomTabsSettings() : null, bVarG != null ? bVarG.getCustomTabsHeaders() : Bundle.EMPTY, aVar.h(), activity);
    }

    private CustomTabsIntent a(g1 g1Var, Bundle bundle, CustomTabsSession customTabsSession, Activity activity) {
        this.f8262a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f8262a.O().a("CustomTabsManager", "Creating Custom Tabs intent");
        }
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(customTabsSession);
        if (((Boolean) this.f8262a.a(x4.f10735g7)).booleanValue()) {
            int i10 = R.anim.applovin_slide_up_animation;
            int i11 = R.anim.applovin_slide_down_animation;
            builder.setStartAnimations(activity, i10, i11);
            builder.setExitAnimations(activity, i10, i11);
        }
        if (g1Var != null) {
            Integer numH = g1Var.h();
            if (numH != null) {
                builder.setDefaultColorSchemeParams(new CustomTabColorSchemeParams.Builder().setToolbarColor(numH.intValue()).build());
            }
            Integer numA = g1Var.a();
            if (numA != null) {
                builder.setColorSchemeParams(2, new CustomTabColorSchemeParams.Builder().setToolbarColor(numA.intValue()).build());
            }
            Boolean boolI = g1Var.i();
            if (boolI != null) {
                builder.setUrlBarHidingEnabled(boolI.booleanValue());
            }
            Boolean boolG = g1Var.g();
            if (boolG != null) {
                builder.setShowTitle(boolG.booleanValue());
            }
            Boolean boolC = g1Var.c();
            if (boolC != null) {
                builder.setInstantAppsEnabled(boolC.booleanValue());
            }
            Integer numF = g1Var.f();
            if (numF != null) {
                builder.setShareState(numF.intValue());
            }
        }
        CustomTabsIntent customTabsIntentBuild = builder.build();
        if (g1Var != null) {
            String strD = g1Var.d();
            if (strD != null) {
                customTabsIntentBuild.intent.putExtra("android.intent.extra.REFERRER", Uri.parse(strD));
            }
            if (!bundle.isEmpty()) {
                customTabsIntentBuild.intent.putExtra("com.android.browser.headers", bundle);
            }
        }
        return customTabsIntentBuild;
    }

    private CustomTabsIntent a(AppLovinNativeAdImpl appLovinNativeAdImpl, Activity activity) {
        return a(appLovinNativeAdImpl.getCustomTabsSettings(), appLovinNativeAdImpl.getCustomTabsHeaders(), appLovinNativeAdImpl.getCustomTabsSession(), activity);
    }

    private void a(Uri uri, Activity activity) {
        if (((Boolean) this.f8262a.a(x4.f10744h7)).booleanValue()) {
            k7.a(uri, activity, this.f8262a);
        }
        AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_failure"), CollectionUtils.map("url", uri));
    }

    private void a(CustomTabsSession customTabsSession, com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null || !bVar.isCustomTabsClientWarmupEnabled()) {
            return;
        }
        a(bVar.getCustomTabsSettings(), customTabsSession);
    }

    private void a(CustomTabsSession customTabsSession, AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (appLovinNativeAdImpl == null || !appLovinNativeAdImpl.isCustomTabsClientWarmupEnabled()) {
            return;
        }
        a(appLovinNativeAdImpl.getCustomTabsSettings(), customTabsSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.adview.a aVar, Activity activity, Uri uri) {
        safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(a(aVar, activity), activity, uri);
    }

    private void a(final g1 g1Var, final CustomTabsSession customTabsSession) {
        a("client warmup", new Runnable() { // from class: com.applovin.impl.fa
            @Override // java.lang.Runnable
            public final void run() {
                this.f8308b.b(g1Var, customTabsSession);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinNativeAdImpl appLovinNativeAdImpl, Activity activity, Uri uri) {
        safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(a(appLovinNativeAdImpl, activity), activity, uri);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006e A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(java.util.LinkedList r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Retrying with next package name..."
            java.lang.String r1 = "CustomTabsManager"
            r2 = 0
            android.content.Context r3 = com.applovin.impl.sdk.k.o()     // Catch: java.lang.Throwable -> L44
            java.lang.Object r4 = r7.poll()     // Catch: java.lang.Throwable -> L44
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L44
            com.applovin.impl.f1$a r5 = new com.applovin.impl.f1$a     // Catch: java.lang.Throwable -> L44
            r5.<init>()     // Catch: java.lang.Throwable -> L44
            boolean r2 = androidx.browser.customtabs.CustomTabsClient.bindCustomTabsService(r3, r4, r5)     // Catch: java.lang.Throwable -> L44
            if (r2 != 0) goto L30
            com.applovin.impl.sdk.k r3 = r6.f8262a     // Catch: java.lang.Throwable -> L44
            r3.O()     // Catch: java.lang.Throwable -> L44
            boolean r3 = com.applovin.impl.sdk.o.a()     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L30
            com.applovin.impl.sdk.k r3 = r6.f8262a     // Catch: java.lang.Throwable -> L44
            com.applovin.impl.sdk.o r3 = r3.O()     // Catch: java.lang.Throwable -> L44
            java.lang.String r4 = "Custom Tabs service not available"
            r3.b(r1, r4)     // Catch: java.lang.Throwable -> L44
        L30:
            if (r2 != 0) goto L7a
            boolean r2 = r7.isEmpty()
            if (r2 != 0) goto L7a
            com.applovin.impl.sdk.k r2 = r6.f8262a
            r2.O()
            boolean r2 = com.applovin.impl.sdk.o.a()
            if (r2 == 0) goto L77
            goto L6e
        L44:
            r3 = move-exception
            com.applovin.impl.sdk.k r4 = r6.f8262a     // Catch: java.lang.Throwable -> L7b
            r4.O()     // Catch: java.lang.Throwable -> L7b
            boolean r4 = com.applovin.impl.sdk.o.a()     // Catch: java.lang.Throwable -> L7b
            if (r4 == 0) goto L5b
            com.applovin.impl.sdk.k r4 = r6.f8262a     // Catch: java.lang.Throwable -> L7b
            com.applovin.impl.sdk.o r4 = r4.O()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r5 = "Failed to bind to service"
            r4.a(r1, r5, r3)     // Catch: java.lang.Throwable -> L7b
        L5b:
            if (r2 != 0) goto L7a
            boolean r2 = r7.isEmpty()
            if (r2 != 0) goto L7a
            com.applovin.impl.sdk.k r2 = r6.f8262a
            r2.O()
            boolean r2 = com.applovin.impl.sdk.o.a()
            if (r2 == 0) goto L77
        L6e:
            com.applovin.impl.sdk.k r2 = r6.f8262a
            com.applovin.impl.sdk.o r2 = r2.O()
            r2.a(r1, r0)
        L77:
            r6.a(r7)
        L7a:
            return
        L7b:
            r3 = move-exception
            if (r2 != 0) goto L9b
            boolean r2 = r7.isEmpty()
            if (r2 != 0) goto L9b
            com.applovin.impl.sdk.k r2 = r6.f8262a
            r2.O()
            boolean r2 = com.applovin.impl.sdk.o.a()
            if (r2 == 0) goto L98
            com.applovin.impl.sdk.k r2 = r6.f8262a
            com.applovin.impl.sdk.o r2 = r2.O()
            r2.a(r1, r0)
        L98:
            r6.a(r7)
        L9b:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.f1.a(java.util.LinkedList):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, CustomTabsSession customTabsSession) {
        this.f8262a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f8262a.O().a("CustomTabsManager", "Warming up URLs: " + list);
        }
        String str = (String) list.remove(0);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putParcelable(CustomTabsService.KEY_URL, Uri.parse(str2));
            arrayList.add(bundle);
        }
        boolean zMayLaunchUrl = customTabsSession.mayLaunchUrl(Uri.parse(str), null, arrayList);
        this.f8262a.O();
        if (com.applovin.impl.sdk.o.a()) {
            com.applovin.impl.sdk.o oVarO = this.f8262a.O();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Warmup for URLs ");
            sb2.append(zMayLaunchUrl ? "succeeded" : C3978d4.i.f31363t);
            oVarO.a("CustomTabsManager", sb2.toString());
        }
    }

    private boolean a(String str, Runnable runnable) {
        try {
            this.f8262a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8262a.O().a("CustomTabsManager", "Running operation: " + str);
            }
            runnable.run();
            this.f8262a.O();
            if (!com.applovin.impl.sdk.o.a()) {
                return true;
            }
            this.f8262a.O().a("CustomTabsManager", "Finished operation: " + str);
            return true;
        } catch (Throwable th2) {
            this.f8262a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8262a.O().a("CustomTabsManager", "Failed to run operation: " + str, th2);
            }
            this.f8262a.D().a("CustomTabsManager", str, th2);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(g1 g1Var, CustomTabsSession customTabsSession) {
        this.f8263b.warmup(0L);
        if (g1Var == null) {
            return;
        }
        Integer numE = g1Var.e();
        String strB = g1Var.b();
        if (numE == null || TextUtils.isEmpty(strB)) {
            return;
        }
        if (customTabsSession == null) {
            this.f8262a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8262a.O().b("CustomTabsManager", "Cannot validate session-URL relation because the session is null");
                return;
            }
            return;
        }
        this.f8262a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f8262a.O().a("CustomTabsManager", "Validating session-URL relation: " + numE + " with digital asset link: " + strB);
        }
        customTabsSession.validateRelationship(numE.intValue(), Uri.parse(strB), null);
    }

    public static void safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(CustomTabsIntent customTabsIntent, Context context, Uri uri) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/browser/customtabs/CustomTabsIntent;->launchUrl(Landroid/content/Context;Landroid/net/Uri;)V");
        if (uri == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(uri, com.safedk.android.utils.g.f53127a);
        customTabsIntent.launchUrl(context, uri);
    }

    public CustomTabsSession a(com.applovin.impl.adview.a aVar) {
        if (this.f8263b == null) {
            this.f8262a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8262a.O().a("CustomTabsManager", "Custom Tabs service is not connected, cannot start session");
            }
            return null;
        }
        this.f8262a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f8262a.O().a("CustomTabsManager", "Starting Custom Tabs session");
        }
        try {
            CustomTabsSession customTabsSessionNewSession = this.f8263b.newSession(new b(aVar));
            a(customTabsSessionNewSession, aVar.g());
            return customTabsSessionNewSession;
        } catch (Exception e10) {
            this.f8262a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8262a.O().a("CustomTabsManager", "Failed to create Custom Tabs session", e10);
            }
            return null;
        }
    }

    public CustomTabsSession a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (this.f8263b == null) {
            this.f8262a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8262a.O().a("CustomTabsManager", "Custom Tabs service is not connected, cannot start session");
            }
            return null;
        }
        this.f8262a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f8262a.O().a("CustomTabsManager", "Starting Custom Tabs session");
        }
        try {
            CustomTabsSession customTabsSessionNewSession = this.f8263b.newSession(new c(appLovinNativeAdImpl));
            a(customTabsSessionNewSession, appLovinNativeAdImpl);
            return customTabsSessionNewSession;
        } catch (Exception e10) {
            this.f8262a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8262a.O().a("CustomTabsManager", "Failed to create Custom Tabs session", e10);
            }
            return null;
        }
    }

    public void a() {
        if (((Boolean) this.f8262a.a(x4.f10708d7)).booleanValue() && this.f8263b == null) {
            String packageName = CustomTabsClient.getPackageName(com.applovin.impl.sdk.k.o(), this.f8262a.c(x4.f10717e7), true);
            String packageName2 = CustomTabsClient.getPackageName(com.applovin.impl.sdk.k.o(), null);
            LinkedList linkedList = new LinkedList();
            if (((Boolean) this.f8262a.a(x4.f10726f7)).booleanValue()) {
                CollectionUtils.addUniqueObjectIfExists(packageName2, linkedList);
                CollectionUtils.addUniqueObjectIfExists(packageName, linkedList);
            } else {
                CollectionUtils.addUniqueObjectIfExists(packageName, linkedList);
                CollectionUtils.addUniqueObjectIfExists(packageName2, linkedList);
            }
            if (!linkedList.isEmpty()) {
                a(linkedList);
                return;
            }
            this.f8262a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8262a.O().b("CustomTabsManager", "Unable to find a supported Custom Tabs package name");
            }
        }
    }

    public void a(final Uri uri, final com.applovin.impl.adview.a aVar, final Activity activity) {
        if (aVar.h() == null) {
            this.f8262a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8262a.O().b("CustomTabsManager", "Unable to launch URL in Custom Tabs. No Custom Tabs session found.");
            }
            a(uri, activity);
            return;
        }
        if (a("launch uri", new Runnable() { // from class: com.applovin.impl.ea
            @Override // java.lang.Runnable
            public final void run() {
                this.f8245b.a(aVar, activity, uri);
            }
        })) {
            this.f8262a.m0().pauseForClick();
            return;
        }
        this.f8262a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f8262a.O().b("CustomTabsManager", "Opening in Custom Tabs failed: " + uri);
        }
        a(uri, activity);
    }

    public boolean a(final Uri uri, final AppLovinNativeAdImpl appLovinNativeAdImpl, final Activity activity) {
        if (appLovinNativeAdImpl.getCustomTabsSession() == null) {
            this.f8262a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8262a.O().b("CustomTabsManager", "Unable to launch URL in Custom Tabs. No Custom Tabs session found.");
            }
            a(uri, activity);
            return false;
        }
        boolean zA = a("launch uri", new Runnable() { // from class: com.applovin.impl.da
            @Override // java.lang.Runnable
            public final void run() {
                this.f8117b.a(appLovinNativeAdImpl, activity, uri);
            }
        });
        if (zA) {
            this.f8262a.m0().pauseForClick();
        } else {
            this.f8262a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8262a.O().b("CustomTabsManager", "Opening in Custom Tabs failed: " + uri);
            }
            a(uri, activity);
        }
        return zA;
    }

    public void b(final List list, final CustomTabsSession customTabsSession) {
        if (list.isEmpty()) {
            return;
        }
        if (customTabsSession != null) {
            a("warmup urls", new Runnable() { // from class: com.applovin.impl.ga
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8375b.a(list, customTabsSession);
                }
            });
            return;
        }
        this.f8262a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f8262a.O().a("CustomTabsManager", "Custom Tabs session is null, cannot warmup urls");
        }
    }
}
