package sg.bigo.ads.a.a;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import sg.bigo.ads.a.a.b;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CustomTabsClient f79759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CustomTabsServiceConnection f79760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC0957a f79761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CustomTabsCallback f79762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CustomTabsSession f79763e;

    /* JADX INFO: renamed from: sg.bigo.ads.a.a.a$a, reason: collision with other inner class name */
    public interface InterfaceC0957a {
        void c();

        void d();
    }

    public interface b {
        void a(Context context, b.a aVar);

        void a(b.a aVar);
    }

    public final CustomTabsSession a() {
        CustomTabsSession customTabsSessionNewSession;
        CustomTabsClient customTabsClient = this.f79759a;
        if (customTabsClient != null) {
            customTabsSessionNewSession = this.f79763e == null ? customTabsClient.newSession(new CustomTabsCallback() { // from class: sg.bigo.ads.a.a.a.1
                @Override // androidx.browser.customtabs.CustomTabsCallback
                public final void extraCallback(String str, Bundle bundle) {
                    super.extraCallback(str, bundle);
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                public final void onMessageChannelReady(Bundle bundle) {
                    super.onMessageChannelReady(bundle);
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                public final void onNavigationEvent(int i10, @Nullable Bundle bundle) {
                    super.onNavigationEvent(i10, bundle);
                    CustomTabsCallback customTabsCallback = a.this.f79762d;
                    if (customTabsCallback != null) {
                        customTabsCallback.onNavigationEvent(i10, bundle);
                    }
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                public final void onPostMessage(String str, Bundle bundle) {
                    super.onPostMessage(str, bundle);
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                public final void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle) {
                    super.onRelationshipValidationResult(i10, uri, z10, bundle);
                }
            }) : null;
            return this.f79763e;
        }
        this.f79763e = customTabsSessionNewSession;
        return this.f79763e;
    }

    @Override // sg.bigo.ads.a.a.d
    public final void a(CustomTabsClient customTabsClient) {
        this.f79759a = customTabsClient;
        customTabsClient.warmup(0L);
        InterfaceC0957a interfaceC0957a = this.f79761c;
        if (interfaceC0957a != null) {
            interfaceC0957a.c();
        }
    }

    @Override // sg.bigo.ads.a.a.d
    public final void b() {
        this.f79759a = null;
        this.f79763e = null;
        InterfaceC0957a interfaceC0957a = this.f79761c;
        if (interfaceC0957a != null) {
            interfaceC0957a.d();
        }
    }
}
