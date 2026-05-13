package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import androidx.browser.customtabs.CustomTabsService;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CustomTabUtils.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\b¨\u0006\f"}, d2 = {"Lcom/facebook/internal/e;", "", "", "b", "developerDefinedRedirectURI", "c", "a", "", "[Ljava/lang/String;", "CHROME_PACKAGES", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f15337a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final String[] CHROME_PACKAGES = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    @Nullable
    public static final String a() {
        if (c3.a.d(e.class)) {
            return null;
        }
        try {
            Context contextL = k2.t.l();
            List<ResolveInfo> listQueryIntentServices = contextL.getPackageManager().queryIntentServices(new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION), 0);
            tn.p.j(listQueryIntentServices, "context.packageManager.queryIntentServices(serviceIntent, 0)");
            HashSet hashSetE0 = cn.r.E0(CHROME_PACKAGES);
            Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
            while (it.hasNext()) {
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null && hashSetE0.contains(serviceInfo.packageName)) {
                    return serviceInfo.packageName;
                }
            }
            return null;
        } catch (Throwable th2) {
            c3.a.b(th2, e.class);
            return null;
        }
    }

    @NotNull
    public static final String b() {
        if (c3.a.d(e.class)) {
            return null;
        }
        try {
            return tn.p.t("fbconnect://cct.", k2.t.l().getPackageName());
        } catch (Throwable th2) {
            c3.a.b(th2, e.class);
            return null;
        }
    }

    @NotNull
    public static final String c(@NotNull String developerDefinedRedirectURI) {
        if (c3.a.d(e.class)) {
            return null;
        }
        try {
            tn.p.k(developerDefinedRedirectURI, "developerDefinedRedirectURI");
            k0 k0Var = k0.f15397a;
            return k0.d(k2.t.l(), developerDefinedRedirectURI) ? developerDefinedRedirectURI : k0.d(k2.t.l(), b()) ? b() : "";
        } catch (Throwable th2) {
            c3.a.b(th2, e.class);
            return null;
        }
    }
}
