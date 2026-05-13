package com.ironsource;

import com.ironsource.C3978d4;
import com.ironsource.Q8;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.sdk.controller.FeaturesManager;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class Xe implements Q8, Q8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private Map<String, C4308w> f30674a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4185oc f30675b = new C4185oc();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final ReadWriteLock f30676c = new ReentrantReadWriteLock();

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30677a;

        static {
            int[] iArr = new int[We.values().length];
            try {
                iArr[We.CurrentlyLoadedAdsAndFullHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[We.CurrentlyLoadedAds.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[We.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f30677a = iArr;
        }
    }

    private final void b() {
        Ve sessionHistoryConfig = FeaturesManager.getInstance().getSessionHistoryConfig();
        C4185oc c4185oc = this.f30675b;
        tn.p.j(sessionHistoryConfig, com.safedk.android.utils.i.f53156c);
        c4185oc.a(a(sessionHistoryConfig));
        this.f30675b.a(a());
    }

    @Override // com.ironsource.Q8
    public int a(@NotNull IronSource.a aVar) {
        tn.p.k(aVar, "adFormat");
        this.f30676c.readLock().lock();
        try {
            C4308w c4308w = this.f30674a.get(aVar.toString());
            return c4308w != null ? c4308w.a() : 0;
        } finally {
            this.f30676c.readLock().unlock();
        }
    }

    @Override // com.ironsource.Q8
    @NotNull
    public List<String> a() {
        this.f30676c.readLock().lock();
        try {
            Map<String, C4308w> map = this.f30674a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, C4308w> entry : map.entrySet()) {
                if (entry.getValue().b()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return cn.f0.g1(linkedHashMap.keySet());
        } finally {
            this.f30676c.readLock().unlock();
        }
    }

    @Override // com.ironsource.Q8
    @NotNull
    public Map<String, JSONObject> a(@NotNull Ve ve2) {
        Map<String, JSONObject> mapO;
        tn.p.k(ve2, com.safedk.android.utils.i.f53156c);
        this.f30676c.readLock().lock();
        try {
            int i10 = a.f30677a[ve2.a().ordinal()];
            if (i10 == 1) {
                mapO = kotlin.collections.a.o(bn.h.a(Q6.f30285z1, a(EnumC4061hf.FullHistory)), bn.h.a(Q6.A1, a(EnumC4061hf.CurrentlyLoadedAds)));
            } else if (i10 == 2) {
                mapO = kotlin.collections.a.o(bn.h.a(Q6.A1, a(EnumC4061hf.CurrentlyLoadedAds)));
            } else {
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                mapO = kotlin.collections.a.j();
            }
            return mapO;
        } finally {
            this.f30676c.readLock().unlock();
        }
    }

    @Override // com.ironsource.Q8
    @NotNull
    public JSONObject a(@NotNull EnumC4061hf enumC4061hf) {
        tn.p.k(enumC4061hf, C3978d4.a.f31224t);
        this.f30676c.readLock().lock();
        try {
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
            for (Map.Entry<String, C4308w> entry : this.f30674a.entrySet()) {
                String key = entry.getKey();
                JSONObject jSONObjectA = entry.getValue().a(enumC4061hf);
                if (jSONObjectA.length() > 0) {
                    jSONObjectJsonObjectInit.put(key, jSONObjectA);
                }
            }
            return jSONObjectJsonObjectInit;
        } finally {
            this.f30676c.readLock().unlock();
        }
    }

    @Override // com.ironsource.Q8.a
    public void a(@NotNull Ye ye2) {
        tn.p.k(ye2, "historyRecord");
        this.f30676c.writeLock().lock();
        try {
            O oA = ye2.a();
            String strValueOf = String.valueOf(oA != null ? oA.b() : null);
            Map<String, C4308w> map = this.f30674a;
            C4308w c4308w = map.get(strValueOf);
            if (c4308w == null) {
                c4308w = new C4308w();
                map.put(strValueOf, c4308w);
            }
            c4308w.a(ye2.a(new C4007ef()));
            this.f30676c.writeLock().unlock();
            b();
        } catch (Throwable th2) {
            this.f30676c.writeLock().unlock();
            throw th2;
        }
    }
}
