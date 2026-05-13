package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.e2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3994e2 implements Vc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final W0 f31518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.ironsource.mediationsdk.e f31519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f31520c;

    public C3994e2(@NotNull W0 w02, @NotNull com.ironsource.mediationsdk.e eVar) {
        tn.p.k(w02, "adTools");
        tn.p.k(eVar, "auctionHandler");
        this.f31518a = w02;
        this.f31519b = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3994e2 c3994e2, ImpressionDataListener impressionDataListener, Z8 z82) {
        tn.p.k(c3994e2, "this$0");
        tn.p.k(impressionDataListener, "$listener");
        tn.p.k(z82, "$impressionData");
        IronLog.CALLBACK.verbose(C4173o0.a(c3994e2.f31518a, "onImpressionSuccess " + impressionDataListener.getClass().getSimpleName() + ": " + z82, (String) null, 2, (Object) null));
        impressionDataListener.onImpressionSuccess(z82);
    }

    private final void a(C4201pa c4201pa, A a10) {
        final Z8 z82 = new Z8(a10.e());
        for (final ImpressionDataListener impressionDataListener : new HashSet(c4201pa.a())) {
            this.f31518a.e(new Runnable() { // from class: com.ironsource.uk
                @Override // java.lang.Runnable
                public final void run() {
                    C3994e2.a(this.f34230b, impressionDataListener, z82);
                }
            });
            this.f31518a.e().h().a(z82);
        }
    }

    @Override // com.ironsource.Vc
    public void a(@NotNull A a10, @Nullable String str, @NotNull C4201pa c4201pa) {
        tn.p.k(a10, C4157n2.f33007p);
        tn.p.k(c4201pa, "publisherDataHolder");
        this.f31519b.a(a10.h(), a10.r(), a10.m(), str);
        a(c4201pa, a10);
    }

    @Override // com.ironsource.Vc
    public void a(@NotNull List<? extends A> list, @NotNull A a10) {
        tn.p.k(list, "waterfallInstances");
        tn.p.k(a10, "winnerInstance");
        if (this.f31520c) {
            return;
        }
        this.f31520c = true;
        C4157n2 c4157n2H = a10.h();
        this.f31519b.a(c4157n2H, a10.r(), a10.m());
        ArrayList<String> arrayList = new ArrayList<>();
        ConcurrentHashMap<String, C4157n2> concurrentHashMap = new ConcurrentHashMap<>();
        for (A a11 : list) {
            arrayList.add(a11.p());
            concurrentHashMap.put(a11.p(), a11.h());
        }
        this.f31519b.a(arrayList, concurrentHashMap, a10.r(), a10.m(), c4157n2H);
    }
}
