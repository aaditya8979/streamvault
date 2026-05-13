package com.moloco.sdk.internal.services.config;

import androidx.compose.runtime.internal.StabilityInferred;
import cn.v;
import cn.x;
import com.moloco.sdk.Init$SDKInitResponse;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.o;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.q;
import com.moloco.sdk.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f47361a = "RemoteConfigService";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<String, Object> f47362b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f47363c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<com.moloco.sdk.internal.services.config.handlers.a> f47364d = v.e(new com.moloco.sdk.internal.services.config.handlers.b());

    @Override // com.moloco.sdk.internal.services.config.a
    public void a(@NotNull Init$SDKInitResponse init$SDKInitResponse) {
        p.k(init$SDKInitResponse, "sdkInitResponse");
        c(init$SDKInitResponse);
        d(init$SDKInitResponse);
    }

    @Override // com.moloco.sdk.internal.services.config.a
    public boolean a(@NotNull String str) {
        p.k(str, "featureFlagName");
        return this.f47363c.containsKey(str);
    }

    @Override // com.moloco.sdk.internal.services.config.a
    public <T> T b(@NotNull Class<T> cls, T t10) {
        p.k(cls, "configType");
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, this.f47361a, "Retrieving config: " + cls, false, 4, null);
        T t11 = (T) this.f47362b.get(cls.getName());
        return t11 == null ? t10 : t11;
    }

    @Override // com.moloco.sdk.internal.services.config.a
    @Nullable
    public String b(@NotNull String str) {
        p.k(str, "featureFlagName");
        return this.f47363c.get(str);
    }

    public final void c(Init$SDKInitResponse init$SDKInitResponse) {
        for (com.moloco.sdk.internal.services.config.handlers.a aVar : this.f47364d) {
            this.f47362b.put(aVar.a().getName(), aVar.a(init$SDKInitResponse));
            MolocoLogger.info$default(MolocoLogger.INSTANCE, this.f47361a, "Adding config: " + aVar.a().getName(), null, false, 12, null);
        }
        this.f47362b.put(o.class.getName(), e(init$SDKInitResponse));
    }

    public final void d(Init$SDKInitResponse init$SDKInitResponse) {
        List<Init$SDKInitResponse.g> listF = init$SDKInitResponse.f();
        p.j(listF, "getExperimentalFeatureFlagsList(...)");
        for (Init$SDKInitResponse.g gVar : listF) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, this.f47361a, "Adding ExperimentalFeatureFlag: " + gVar.getName(), null, false, 12, null);
            Map<String, String> map = this.f47363c;
            String name = gVar.getName();
            String value = gVar.getValue();
            map.put(name, (value == null || value.length() == 0) ? null : gVar.getValue());
        }
    }

    public final o e(Init$SDKInitResponse init$SDKInitResponse) {
        o oVar;
        List<Init$SDKInitResponse.g> listF = init$SDKInitResponse.f();
        p.j(listF, "getExperimentalFeatureFlagsList(...)");
        ArrayList arrayList = new ArrayList(x.x(listF, 10));
        Iterator<T> it = listF.iterator();
        while (it.hasNext()) {
            arrayList.add(((Init$SDKInitResponse.g) it.next()).getName());
        }
        boolean zContains = arrayList.contains("ANDROID_STREAMING_ENABLED");
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, this.f47361a, "Adding StreamingEnabled: " + zContains, null, false, 12, null);
        if (init$SDKInitResponse.k() && init$SDKInitResponse.c().d() && init$SDKInitResponse.c().b().d()) {
            z.c.b bVarC = init$SDKInitResponse.c().b().c();
            oVar = new o(((int) init$SDKInitResponse.c().b().c().d()) > 0 ? ((int) bVarC.d()) * 1024 : q.a().a(), zContains, init$SDKInitResponse.c().b().c().c() > 0.0d ? bVarC.c() : q.a().c(), q.a().b());
        } else {
            oVar = new o(q.a().a(), zContains, q.a().c(), q.a().b());
        }
        MolocoLogger.debug$default(molocoLogger, this.f47361a, "Parsed and adding MediaConfig: " + oVar.a() + ", " + oVar.d() + ", " + oVar.c() + ", " + oVar.b() + ' ', false, 4, null);
        return oVar;
    }
}
