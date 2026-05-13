package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor;
import io.appmetrica.analytics.coreutils.internal.network.UserAgent;
import io.appmetrica.analytics.networktasks.internal.AESRSARequestBodyEncrypter;
import io.appmetrica.analytics.networktasks.internal.AllHostsExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseValidityChecker;
import io.appmetrica.analytics.networktasks.internal.ExponentialBackoffDataHolder;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class Wd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Wd f66101a = new Wd();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f66102b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f66103c = UserAgent.getFor(BuildConfig.LIBRARY_PACKAGE_NAME, "7.14.0", "50145656");

    public static final NetworkTask a(Y4 y42) {
        AESRSARequestBodyEncrypter aESRSARequestBodyEncrypter = new AESRSARequestBodyEncrypter();
        C4657ah c4657ah = new C4657ah(aESRSARequestBodyEncrypter);
        C5284zb c5284zb = new C5284zb(y42);
        return new NetworkTask(new BlockingExecutor(), new C5054q5(y42.f66214a), new AllHostsExponentialBackoffPolicy(f66101a.a(Ud.REPORT)), new C5190vh(y42, c4657ah, c5284zb, new FullUrlFormer(c4657ah, c5284zb), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), y42.i(), y42.p(), y42.u(), aESRSARequestBodyEncrypter), cn.v.e(new lo()), f66103c);
    }

    public final synchronized ExponentialBackoffDataHolder a(Ud ud2) {
        Object exponentialBackoffDataHolder;
        LinkedHashMap linkedHashMap = f66102b;
        exponentialBackoffDataHolder = linkedHashMap.get(ud2);
        if (exponentialBackoffDataHolder == null) {
            exponentialBackoffDataHolder = new ExponentialBackoffDataHolder(new C5233xa(C5009oa.I.y(), ud2), ud2.name());
            linkedHashMap.put(ud2, exponentialBackoffDataHolder);
        }
        return (ExponentialBackoffDataHolder) exponentialBackoffDataHolder;
    }
}
