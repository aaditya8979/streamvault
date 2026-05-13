package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.network.a;
import com.applovin.impl.u4;
import com.applovin.impl.x4;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class e extends com.applovin.impl.sdk.network.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f10321s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f10322t;

    public static class a extends a.C0156a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private String f10323r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f10324s;

        public a(k kVar) {
            super(kVar);
            this.f10270h = ((Integer) kVar.a(x4.H2)).intValue();
            this.f10271i = ((Integer) kVar.a(x4.G2)).intValue();
            this.f10272j = ((Integer) kVar.a(x4.S2)).intValue();
        }

        @Override // com.applovin.impl.sdk.network.a.C0156a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(u4.a aVar) {
            this.f10279q = aVar;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0156a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(Object obj) {
            this.f10269g = obj;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0156a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(JSONObject jSONObject) {
            this.f10268f = jSONObject;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0156a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a() {
            return new e(this);
        }

        @Override // com.applovin.impl.sdk.network.a.C0156a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a a(Map map) {
            this.f10267e = map;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0156a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(int i10) {
            this.f10270h = i10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0156a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(String str) {
            this.f10265c = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0156a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a b(Map map) {
            this.f10266d = map;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0156a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a b(int i10) {
            this.f10272j = i10;
            return this;
        }

        public a e(String str) {
            this.f10323r = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0156a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a c(int i10) {
            this.f10271i = i10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0156a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a b(String str) {
            this.f10264b = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0156a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public a c(String str) {
            this.f10263a = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0156a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a(boolean z10) {
            this.f10276n = z10;
            return this;
        }

        public a h(boolean z10) {
            this.f10324s = z10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0156a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public a b(boolean z10) {
            this.f10278p = z10;
            return this;
        }
    }

    public e(a aVar) {
        super(aVar);
        this.f10321s = aVar.f10323r;
        this.f10322t = aVar.f10324s;
    }

    public static a b(k kVar) {
        return new a(kVar);
    }

    public String s() {
        return this.f10321s;
    }

    public boolean t() {
        return this.f10321s != null;
    }

    public boolean u() {
        return this.f10322t;
    }
}
