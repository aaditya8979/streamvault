package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ads.UnityAds;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.eg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4008eg implements InterfaceC3972cg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C4008eg f31592a = new C4008eg();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final bn.g f31593b = kotlin.b.b(a.f31594a);

    /* JADX INFO: renamed from: com.ironsource.eg$a */
    public static final class a extends Lambda implements sn.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31594a = new a();

        public a() {
            super(0);
        }

        @Override // sn.a
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            try {
                UnityAds unityAds = UnityAds.INSTANCE;
                Object objInvoke = UnityAds.class.getMethod("getVersion", null).invoke(null, null);
                if (objInvoke instanceof String) {
                    return (String) objInvoke;
                }
                return null;
            } catch (Throwable th2) {
                C4228r4.d().a(th2);
                IronLog.INTERNAL.warning(th2.getMessage());
                return null;
            }
        }
    }

    private C4008eg() {
    }

    @Override // com.ironsource.InterfaceC3972cg
    @Nullable
    public String a() {
        return (String) f31593b.getValue();
    }
}
