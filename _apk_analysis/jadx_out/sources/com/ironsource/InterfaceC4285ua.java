package com.ironsource;

import android.annotation.SuppressLint;
import android.os.Build;
import android.webkit.WebView;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.ua, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC4285ua {

    /* JADX INFO: renamed from: com.ironsource.ua$a */
    public static final class a implements InterfaceC4285ua {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private WebView f34201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f34202b;

        public a() {
            this(0, 1, null);
        }

        public a(int i10) {
            this.f34202b = i10 >= 19;
        }

        public /* synthetic */ a(int i10, int i11, tn.i iVar) {
            this((i11 & 1) != 0 ? Build.VERSION.SDK_INT : i10);
        }

        @SuppressLint({"NewApi"})
        private final void b(String str) {
            WebView webView = this.f34201a;
            if (webView != null) {
                webView.evaluateJavascript(str, null);
            }
        }

        private final void c(String str) {
            WebView webView = this.f34201a;
            if (webView != null) {
                IronSourceNetworkBridge.webviewLoadUrl(webView, SafeDKWebAppInterface.f52902f + str);
            }
        }

        @Override // com.ironsource.InterfaceC4285ua
        public void a(@NotNull WebView webView) {
            tn.p.k(webView, "webView");
            this.f34201a = webView;
        }

        @Override // com.ironsource.InterfaceC4285ua
        public void a(@NotNull String str) {
            tn.p.k(str, "script");
            try {
                if (this.f34202b) {
                    b(str);
                } else {
                    c(str);
                }
            } catch (Throwable th2) {
                C4228r4.d().a(th2);
                this.f34202b = false;
                c(str);
            }
        }

        @Override // com.ironsource.InterfaceC4285ua
        public boolean a() {
            return this.f34201a != null;
        }
    }

    void a(@NotNull WebView webView);

    void a(@NotNull String str);

    boolean a();
}
