package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class cn {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private a f1394;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private ds f1395;

    public static abstract class a {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private Class f1396;

        public a(Class cls) {
            this.f1396 = cls;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final Class m5692() {
            return this.f1396;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public abstract boolean mo5693(hv hvVar);
    }

    public static class b extends a {
        public b(Class cls) {
            super(cls);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.cn.a
        /* JADX INFO: renamed from: ﾇ */
        public final boolean mo5693(hv hvVar) {
            return m5692().isInstance(hvVar.mo6430());
        }
    }

    public static class c extends a {
        public c(Class cls) {
            super(cls);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.cn.a
        /* JADX INFO: renamed from: ﾇ */
        public final boolean mo5693(hv hvVar) {
            return m5692().equals(hvVar.mo6429().getType());
        }
    }

    public static class d extends a {
        public d(Class cls) {
            super(cls);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.cn.a
        /* JADX INFO: renamed from: ﾇ */
        public final boolean mo5693(hv hvVar) {
            return m5692().isAssignableFrom(hvVar.mo6429().getType());
        }
    }

    public static class e {

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private cn f1397 = new cn();

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final e m5694(Class cls) {
            this.f1397.f1394 = new d(cls);
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final e m5695(Class cls) {
            this.f1397.f1394 = new c(cls);
            return this;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final cn m5696() {
            return this.f1397;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final e m5697(ds dsVar) {
            this.f1397.f1395 = dsVar;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final e m5698(Class cls) {
            this.f1397.f1394 = new b(cls);
            return this;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m5691(hv hvVar, du duVar, cq cqVar, List<Object> list) {
        a aVar = this.f1394;
        if (aVar != null && !aVar.mo5693(hvVar)) {
            return false;
        }
        if (this.f1395 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(0, hvVar);
        return this.f1395.m6173(duVar, cqVar, arrayList).m6167();
    }
}
