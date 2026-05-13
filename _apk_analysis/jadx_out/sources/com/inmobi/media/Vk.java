package com.inmobi.media;

import android.content.ComponentName;
import android.content.Context;
import androidx.window.embedding.ActivityFilter;
import androidx.window.embedding.ActivityRule;
import androidx.window.embedding.RuleController;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.core.config.models.AdConfig;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes9.dex */
public final class Vk extends SuspendLambda implements sn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f26508b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vk(Context context, hn.c cVar) {
        super(1, cVar);
        this.f26508b = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(hn.c cVar) {
        return new Vk(this.f26508b, cVar);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        return new Vk(this.f26508b, (hn.c) obj).invokeSuspend(bn.r.f5635a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws InterruptedException {
        String string;
        ?? M;
        Object objG = in.a.g();
        int i10 = this.f26507a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            bn.g gVar = AbstractC3456h9.f27284a;
            Context context = Ji.f25747a;
            if (context != null) {
                String[] strArrDatabaseList = context.databaseList();
                if (strArrDatabaseList != null) {
                    M = new ArrayList();
                    for (String str : strArrDatabaseList) {
                        tn.p.h(str);
                        if (new Regex("com\\.im_([0-9]+\\.){2}[0-9]+([-.\\w]*).db(-wal)?(-shm)?").matches(str) && !tn.p.f(str, "com.im_11.1.0.db")) {
                            M.add(str);
                        }
                    }
                } else {
                    M = cn.w.m();
                }
                for (String str2 : M) {
                    File databasePath = context.getDatabasePath(str2);
                    if (databasePath != null && databasePath.exists()) {
                        context.deleteDatabase(str2);
                    }
                }
            }
            K4 k42 = K4.f25792a;
            tn.p.j("K4", "TAG");
            p000do.h.b(null, new F4(null), 1, null);
            if (E0.f25353b == null) {
                E0.f25353b = new A0();
            }
            C3476i4 c3476i4 = Y3.f26611a;
            Y3.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, E0.f25355d);
            A0 a02 = E0.f25353b;
            if (a02 == null) {
                tn.p.C("executor");
                a02 = null;
            }
            if (!a02.f25125a.get()) {
                A0 a03 = E0.f25353b;
                if (a03 == null) {
                    tn.p.C("executor");
                    a03 = null;
                }
                if (!a03.f25125a.get()) {
                    tn.p.k(AdConfig.class, "clazz");
                    if (((AdConfig) Y3.f26611a.a(AdConfig.class)).getAdQuality().getEnabled()) {
                        a03.a();
                    }
                }
            }
            F9.b();
            F9.a();
            L5 l52 = J5.f25689a;
            tn.p.k(AdConfig.class, "clazz");
            AdConfig adConfig = (AdConfig) Y3.f26611a.a(AdConfig.class);
            N0 adReqDeprecateChecker = adConfig.getAdReqDeprecateChecker();
            boolean zA = adReqDeprecateChecker != null ? adReqDeprecateChecker.a(true) : true;
            J5.f25693e = zA;
            if (!zA && J5.f25691c == null) {
                Context context2 = Ji.f25747a;
                if (context2 == null) {
                    string = null;
                } else {
                    ConcurrentHashMap concurrentHashMap = Ea.f25372b;
                    Ea eaA = Da.a(context2, "display_info_store");
                    tn.p.k("gesture_margin", "key");
                    string = eaA.f25373a.getString("gesture_margin", null);
                }
                J5.f25691c = string;
            }
            if (adConfig.getRendering().getEnableImmersive()) {
                J5.j();
                J5.i();
            }
            Vg.b();
            Yk yk2 = Yk.f26661a;
            this.f26507a = 1;
            if (yk2.b(this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        Context context3 = this.f26508b;
        tn.p.k(context3, GAMConfig.KEY_CONTEXT);
        try {
            tn.t.b(ActivityFilter.class).getSimpleName();
            tn.t.b(ActivityRule.class).getSimpleName();
            tn.t.b(RuleController.class).getSimpleName();
            RuleController.Companion.getInstance(context3).addRule(new ActivityRule.Builder(cn.v0.d(new ActivityFilter(new ComponentName(context3, (Class<?>) InMobiAdActivity.class), null))).setAlwaysExpand(true).build());
        } catch (NoClassDefFoundError unused) {
        }
        Context context4 = this.f26508b;
        tn.p.k(context4, GAMConfig.KEY_CONTEXT);
        ConcurrentHashMap concurrentHashMap2 = Ea.f25372b;
        Da.a(context4, "sdk_version_store").a("sdk_version", "11.1.0", false);
        Yk.f26662b = true;
        return bn.r.f5635a;
    }
}
