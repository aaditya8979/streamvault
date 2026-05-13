package com.ironsource;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.b8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC3946b8<T> {

    /* JADX INFO: renamed from: com.ironsource.b8$a */
    public static final class a implements InterfaceC3946b8<ISDemandOnlyInterstitialListener> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private C3928a8 f31015a = new C3928a8();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Map<String, C3928a8> f31016b = new HashMap();

        @Override // com.ironsource.InterfaceC3946b8
        public void a(@NotNull ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            tn.p.k(iSDemandOnlyInterstitialListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.f31015a.a(iSDemandOnlyInterstitialListener);
            Iterator<String> it = this.f31016b.keySet().iterator();
            while (it.hasNext()) {
                C3928a8 c3928a8 = this.f31016b.get(it.next());
                if (c3928a8 != null) {
                    c3928a8.a(iSDemandOnlyInterstitialListener);
                }
            }
        }

        @Override // com.ironsource.InterfaceC3946b8
        public void a(@NotNull String str, @NotNull ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            tn.p.k(str, "instanceId");
            tn.p.k(iSDemandOnlyInterstitialListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            if (!this.f31016b.containsKey(str)) {
                this.f31016b.put(str, new C3928a8(iSDemandOnlyInterstitialListener));
                return;
            }
            C3928a8 c3928a8 = this.f31016b.get(str);
            if (c3928a8 != null) {
                c3928a8.a(iSDemandOnlyInterstitialListener);
            }
        }

        @Override // com.ironsource.InterfaceC3946b8
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ISDemandOnlyInterstitialListener a(@NotNull String str) {
            tn.p.k(str, "instanceId");
            C3928a8 c3928a8 = this.f31016b.get(str);
            return c3928a8 != null ? c3928a8 : this.f31015a;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.b8$b */
    public static final class b implements InterfaceC3946b8<ISDemandOnlyRewardedVideoListener> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private C3982d8 f31017a = new C3982d8();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Map<String, C3982d8> f31018b = new HashMap();

        @Override // com.ironsource.InterfaceC3946b8
        public void a(@NotNull ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            tn.p.k(iSDemandOnlyRewardedVideoListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.f31017a.a(iSDemandOnlyRewardedVideoListener);
            Iterator<String> it = this.f31018b.keySet().iterator();
            while (it.hasNext()) {
                C3982d8 c3982d8 = this.f31018b.get(it.next());
                if (c3982d8 != null) {
                    c3982d8.a(iSDemandOnlyRewardedVideoListener);
                }
            }
        }

        @Override // com.ironsource.InterfaceC3946b8
        public void a(@NotNull String str, @NotNull ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            tn.p.k(str, "instanceId");
            tn.p.k(iSDemandOnlyRewardedVideoListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            if (!this.f31018b.containsKey(str)) {
                this.f31018b.put(str, new C3982d8(iSDemandOnlyRewardedVideoListener));
                return;
            }
            C3982d8 c3982d8 = this.f31018b.get(str);
            if (c3982d8 != null) {
                c3982d8.a(iSDemandOnlyRewardedVideoListener);
            }
        }

        @Override // com.ironsource.InterfaceC3946b8
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ISDemandOnlyRewardedVideoListener a(@NotNull String str) {
            tn.p.k(str, "instanceId");
            C3982d8 c3982d8 = this.f31018b.get(str);
            return c3982d8 != null ? c3982d8 : this.f31017a;
        }
    }

    T a(@NotNull String str);

    void a(T t10);

    void a(@NotNull String str, T t10);
}
