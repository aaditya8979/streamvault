package com.ironsource;

import com.ironsource.C3978d4;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public interface U4 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Map<String, Object> f30540a;

        public a(@NotNull String str) {
            tn.p.k(str, "providerName");
            this.f30540a = kotlin.collections.a.o(bn.h.a(IronSourceConstants.EVENTS_PROVIDER, str), bn.h.a(IronSourceConstants.EVENTS_DEMAND_ONLY, 1));
        }

        @NotNull
        public final Map<String, Object> a() {
            return kotlin.collections.a.C(this.f30540a);
        }

        public final void a(@NotNull String str, @NotNull Object obj) {
            tn.p.k(str, "key");
            tn.p.k(obj, "value");
            this.f30540a.put(str, obj);
        }
    }

    public static final class b implements U4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final F7 f30541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final a f30542b;

        public b(@NotNull F7 f72, @NotNull a aVar) {
            tn.p.k(f72, "eventManager");
            tn.p.k(aVar, "eventBaseData");
            this.f30541a = f72;
            this.f30542b = aVar;
        }

        @Override // com.ironsource.U4
        public void a(@NotNull D5 d52, @Nullable Be be2) {
            tn.p.k(d52, C3978d4.i.f31344j0);
            Map<String, Object> mapA = this.f30542b.a();
            if (be2 != null) {
                mapA.put(IronSourceConstants.EVENTS_EXT1, be2.toString());
            }
            this.f30541a.a(new C5(d52, new JSONObject(kotlin.collections.a.z(mapA))));
        }

        @Override // com.ironsource.U4
        public void a(@NotNull D5 d52, @NotNull String str) {
            tn.p.k(d52, C3978d4.i.f31344j0);
            tn.p.k(str, "instanceId");
            Map<String, Object> mapA = this.f30542b.a();
            mapA.put("spId", str);
            this.f30541a.a(new C5(d52, new JSONObject(kotlin.collections.a.z(mapA))));
        }
    }

    void a(@NotNull D5 d52, @Nullable Be be2);

    void a(@NotNull D5 d52, @NotNull String str);
}
