package com.mbridge.msdk.config.component.common.network;

import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: NetworkRequest.java */
/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.a f35881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.result.a f35882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.model.a f35883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.monitor.b f35884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f35885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f35886f = "HTTP";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.connect.socket.a f35887g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.connect.okhttp.a f35888h = null;

    /* JADX INFO: compiled from: NetworkRequest.java */
    public class a implements com.mbridge.msdk.config.component.common.network.b {
        public a() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.b
        public void a() {
            if (c.this.f35887g != null) {
                c.this.f35887g.a();
            }
        }
    }

    /* JADX INFO: compiled from: NetworkRequest.java */
    public class b implements com.mbridge.msdk.config.component.common.network.b {
        public b() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.b
        public void a() {
            if (c.this.f35888h != null) {
                c.this.f35888h.a();
            }
        }
    }

    public c(com.mbridge.msdk.config.component.nori.model.a aVar, com.mbridge.msdk.config.component.common.network.result.a aVar2) {
        this.f35883c = aVar;
        this.f35882b = aVar2;
        this.f35884d = aVar2.a();
    }

    private void a() {
        try {
            com.mbridge.msdk.config.component.common.network.connect.okhttp.a aVar = new com.mbridge.msdk.config.component.common.network.connect.okhttp.a(this.f35883c, this.f35882b, this.f35881a);
            this.f35888h = aVar;
            aVar.a(this.f35885e);
            this.f35884d.a(new b());
        } catch (Exception e10) {
            q0.b("NetworkRequestTask", e10.getMessage(), e10);
        }
    }

    private void c() {
        try {
            com.mbridge.msdk.config.component.common.network.connect.socket.a aVar = new com.mbridge.msdk.config.component.common.network.connect.socket.a(this.f35883c, this.f35882b, this.f35881a);
            this.f35887g = aVar;
            aVar.a(this.f35885e);
            this.f35884d.a(new a());
        } catch (Exception e10) {
            q0.b("NetworkRequestTask", e10.getMessage(), e10);
        }
    }

    public void a(String str, com.mbridge.msdk.config.component.common.network.a aVar) {
        this.f35885e = str;
        this.f35881a = aVar;
        this.f35886f = this.f35883c.i();
    }

    public void b() {
        com.mbridge.msdk.config.component.common.network.a aVar = this.f35881a;
        if (aVar != null) {
            aVar.a(this.f35882b);
        }
        if (this.f35886f.equals("TCP")) {
            c();
        } else {
            a();
        }
    }
}
