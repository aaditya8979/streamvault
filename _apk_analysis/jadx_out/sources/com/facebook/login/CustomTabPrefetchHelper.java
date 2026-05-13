package com.facebook.login;

import android.content.ComponentName;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CustomTabPrefetchHelper.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, d2 = {"Lcom/facebook/login/CustomTabPrefetchHelper;", "Landroidx/browser/customtabs/CustomTabsServiceConnection;", "Landroid/content/ComponentName;", "name", "Landroidx/browser/customtabs/CustomTabsClient;", "newClient", "Lbn/r;", "onCustomTabsServiceConnected", "componentName", "onServiceDisconnected", "<init>", "()V", "b", "a", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class CustomTabPrefetchHelper extends CustomTabsServiceConnection {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public static CustomTabsClient f15500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public static CustomTabsSession f15501d;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final ReentrantLock f15502e = new ReentrantLock();

    /* JADX INFO: renamed from: com.facebook.login.CustomTabPrefetchHelper$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: CustomTabPrefetchHelper.kt */
    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\b\u0010\b\u001a\u00020\u0004H\u0002R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/facebook/login/CustomTabPrefetchHelper$a;", "", "Landroid/net/Uri;", "url", "Lbn/r;", "c", "Landroidx/browser/customtabs/CustomTabsSession;", "b", "d", "Landroidx/browser/customtabs/CustomTabsClient;", "client", "Landroidx/browser/customtabs/CustomTabsClient;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "session", "Landroidx/browser/customtabs/CustomTabsSession;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(tn.i iVar) {
            this();
        }

        @Nullable
        public final CustomTabsSession b() {
            CustomTabPrefetchHelper.f15502e.lock();
            CustomTabsSession customTabsSession = CustomTabPrefetchHelper.f15501d;
            CustomTabPrefetchHelper.f15501d = null;
            CustomTabPrefetchHelper.f15502e.unlock();
            return customTabsSession;
        }

        public final void c(@NotNull Uri uri) {
            tn.p.k(uri, "url");
            d();
            CustomTabPrefetchHelper.f15502e.lock();
            CustomTabsSession customTabsSession = CustomTabPrefetchHelper.f15501d;
            if (customTabsSession != null) {
                customTabsSession.mayLaunchUrl(uri, null, null);
            }
            CustomTabPrefetchHelper.f15502e.unlock();
        }

        public final void d() {
            CustomTabsClient customTabsClient;
            CustomTabPrefetchHelper.f15502e.lock();
            if (CustomTabPrefetchHelper.f15501d == null && (customTabsClient = CustomTabPrefetchHelper.f15500c) != null) {
                CustomTabPrefetchHelper.f15501d = customTabsClient.newSession(null);
            }
            CustomTabPrefetchHelper.f15502e.unlock();
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public void onCustomTabsServiceConnected(@NotNull ComponentName componentName, @NotNull CustomTabsClient customTabsClient) {
        tn.p.k(componentName, "name");
        tn.p.k(customTabsClient, "newClient");
        customTabsClient.warmup(0L);
        f15500c = customTabsClient;
        INSTANCE.d();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(@NotNull ComponentName componentName) {
        tn.p.k(componentName, "componentName");
    }
}
