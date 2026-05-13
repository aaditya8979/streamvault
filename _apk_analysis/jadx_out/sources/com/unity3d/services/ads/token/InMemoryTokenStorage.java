package com.unity3d.services.ads.token;

import bn.g;
import bn.r;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.reader.GameSessionIdReader;
import com.unity3d.services.core.device.reader.builder.DeviceInfoReaderBuilder;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import go.l;
import go.v;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.LazyThreadSafetyMode;
import kotlin.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import tn.p;
import tn.t;

/* JADX INFO: compiled from: InMemoryTokenStorage.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class InMemoryTokenStorage implements TokenStorage, IServiceComponent {

    @NotNull
    private final g asyncTokenStorage$delegate;

    @NotNull
    private final ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();

    @NotNull
    private final l<Integer> accessCounter = v.a(-1);

    @NotNull
    private final l<String> initToken = v.a(null);
    private final ExecutorService executorService = Executors.newSingleThreadExecutor();

    public InMemoryTokenStorage() {
        final String str = "";
        this.asyncTokenStorage$delegate = b.a(LazyThreadSafetyMode.NONE, new sn.a<AsyncTokenStorage>() { // from class: com.unity3d.services.ads.token.InMemoryTokenStorage$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.services.ads.token.AsyncTokenStorage, java.lang.Object] */
            @Override // sn.a
            @NotNull
            public final AsyncTokenStorage invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, t.b(AsyncTokenStorage.class));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _get_nativeGeneratedToken_$lambda$2(String str) {
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.TOKEN, TokenEvent.TOKEN_NATIVE_DATA, str);
    }

    private final AsyncTokenStorage getAsyncTokenStorage() {
        return (AsyncTokenStorage) this.asyncTokenStorage$delegate.getValue();
    }

    private final void triggerTokenAvailable(boolean z10) {
        InitializeEventsMetricSender.getInstance().sdkTokenDidBecomeAvailableWithConfig(z10);
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public void appendTokens(@NotNull JSONArray jSONArray) throws JSONException {
        p.k(jSONArray, "tokens");
        this.accessCounter.b(-1, 0);
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            this.queue.add(jSONArray.getString(i10));
        }
        if (length > 0) {
            triggerTokenAvailable(false);
            getAsyncTokenStorage().onTokenAvailable();
        }
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public void createTokens(@NotNull JSONArray jSONArray) throws JSONException {
        p.k(jSONArray, "tokens");
        deleteTokens();
        appendTokens(jSONArray);
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public void deleteTokens() {
        Integer value;
        this.queue.clear();
        l<Integer> lVar = this.accessCounter;
        do {
            value = lVar.getValue();
            value.intValue();
        } while (!lVar.b(value, -1));
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    @NotNull
    public r getNativeGeneratedToken() {
        new NativeTokenGenerator(this.executorService, new DeviceInfoReaderBuilder(new ConfigurationReader(), PrivacyConfigStorage.getInstance(), GameSessionIdReader.getInstance()), null).generateToken(new INativeTokenGeneratorListener() { // from class: com.unity3d.services.ads.token.a
            @Override // com.unity3d.services.ads.token.INativeTokenGeneratorListener
            public final void onReady(String str) {
                InMemoryTokenStorage._get_nativeGeneratedToken_$lambda$2(str);
            }
        });
        return r.f5635a;
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    @NotNull
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    @Nullable
    public String getToken() {
        Integer value;
        Integer num;
        if (this.accessCounter.getValue().intValue() == -1) {
            return this.initToken.getValue();
        }
        if (this.queue.isEmpty()) {
            WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.TOKEN, TokenEvent.QUEUE_EMPTY, new Object[0]);
            return null;
        }
        l<Integer> lVar = this.accessCounter;
        do {
            value = lVar.getValue();
            num = value;
        } while (!lVar.b(value, Integer.valueOf(num.intValue() + 1)));
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.TOKEN, TokenEvent.TOKEN_ACCESS, Integer.valueOf(num.intValue()));
        return this.queue.poll();
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public void setInitToken(@Nullable String str) {
        if (str == null) {
            return;
        }
        l<String> lVar = this.initToken;
        while (!lVar.b(lVar.getValue(), str)) {
        }
        triggerTokenAvailable(true);
        getAsyncTokenStorage().onTokenAvailable();
    }
}
