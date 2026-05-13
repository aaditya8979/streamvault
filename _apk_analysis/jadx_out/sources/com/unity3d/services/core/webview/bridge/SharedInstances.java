package com.unity3d.services.core.webview.bridge;

import com.unity3d.services.core.webview.WebViewApp;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: SharedInstances.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class SharedInstances {

    @NotNull
    public static final SharedInstances INSTANCE = new SharedInstances();

    @NotNull
    private static final IInvocationCallbackInvoker webViewAppInvocationCallbackInvoker = new IInvocationCallbackInvoker() { // from class: com.unity3d.services.core.webview.bridge.a
        @Override // com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker
        public final void invokeCallback(Invocation invocation) {
            SharedInstances.webViewAppInvocationCallbackInvoker$lambda$0(invocation);
        }
    };

    @NotNull
    private static final INativeCallbackSubject webViewAppNativeCallbackSubject = new INativeCallbackSubject() { // from class: com.unity3d.services.core.webview.bridge.SharedInstances$webViewAppNativeCallbackSubject$1
        @Override // com.unity3d.services.core.webview.bridge.INativeCallbackSubject
        @NotNull
        public NativeCallback getCallback(@NotNull String str) {
            p.k(str, "callbackId");
            NativeCallback callback = WebViewApp.getCurrentApp().getCallback(str);
            p.j(callback, "getCurrentApp().getCallback(callbackId)");
            return callback;
        }

        @Override // com.unity3d.services.core.webview.bridge.INativeCallbackSubject
        public void remove(@NotNull NativeCallback nativeCallback) {
            p.k(nativeCallback, "callback");
            WebViewApp.getCurrentApp().removeCallback(nativeCallback);
        }
    };

    @NotNull
    private static final IEventSender webViewEventSender = new IEventSender() { // from class: com.unity3d.services.core.webview.bridge.SharedInstances$webViewEventSender$1
        @Override // com.unity3d.services.core.webview.bridge.IEventSender
        public boolean canSend() {
            return WebViewApp.getCurrentApp() != null;
        }

        @Override // com.unity3d.services.core.webview.bridge.IEventSender
        public boolean sendEvent(@NotNull Enum<?> r32, @NotNull Enum<?> r42, @NotNull Object... objArr) {
            p.k(r32, "eventCategory");
            p.k(r42, "eventId");
            p.k(objArr, "params");
            WebViewApp currentApp = WebViewApp.getCurrentApp();
            if (currentApp != null) {
                return currentApp.sendEvent(r32, r42, Arrays.copyOf(objArr, objArr.length));
            }
            return false;
        }
    };

    @NotNull
    private static final IWebViewBridge webViewBridge = new IWebViewBridge() { // from class: com.unity3d.services.core.webview.bridge.SharedInstances$webViewBridge$1
        @Override // com.unity3d.services.core.webview.bridge.IWebViewBridge
        public void handleCallback(@Nullable String str, @Nullable String str2, @Nullable Object[] objArr) throws Exception {
            WebViewBridge.getInstance().handleCallback(str, str2, objArr);
        }

        @Override // com.unity3d.services.core.webview.bridge.IWebViewBridge
        public void handleInvocation(@Nullable String str, @Nullable String str2, @Nullable Object[] objArr, @Nullable WebViewCallback webViewCallback) throws Exception {
            WebViewBridge.getInstance().handleInvocation(str, str2, objArr, webViewCallback);
        }
    };

    private SharedInstances() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void webViewAppInvocationCallbackInvoker$lambda$0(Invocation invocation) {
        p.k(invocation, "it");
        WebViewApp.getCurrentApp().invokeCallback(invocation);
    }

    @NotNull
    public final IInvocationCallbackInvoker getWebViewAppInvocationCallbackInvoker() {
        return webViewAppInvocationCallbackInvoker;
    }

    @NotNull
    public final INativeCallbackSubject getWebViewAppNativeCallbackSubject() {
        return webViewAppNativeCallbackSubject;
    }

    @NotNull
    public final IWebViewBridge getWebViewBridge() {
        return webViewBridge;
    }

    @NotNull
    public final IEventSender getWebViewEventSender() {
        return webViewEventSender;
    }
}
