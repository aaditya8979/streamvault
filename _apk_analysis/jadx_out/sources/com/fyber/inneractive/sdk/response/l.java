package com.fyber.inneractive.sdk.response;

import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.response.nativead.j f19410e;

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.fyber.inneractive.sdk.response.nativead.i a(org.json.JSONObject r15) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.response.l.a(org.json.JSONObject):com.fyber.inneractive.sdk.response.nativead.i");
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public final e a() {
        com.fyber.inneractive.sdk.response.nativead.j jVar = new com.fyber.inneractive.sdk.response.nativead.j();
        this.f19370a = jVar;
        this.f19410e = jVar;
        return jVar;
    }

    public final void a(com.fyber.inneractive.sdk.response.nativead.j jVar, r0 r0Var) {
        com.fyber.inneractive.sdk.response.nativead.e eVarC = jVar.T.c();
        String str = eVarC != null ? eVarC.f19414a : null;
        if (str == null || str.isEmpty()) {
            throw new com.fyber.inneractive.sdk.flow.vast.h("Missing vast content", "VastErrorInvalidFile");
        }
        d dVar = new d(false);
        dVar.f19370a = new g();
        dVar.f19374e = this.f19410e;
        dVar.a(str, r0Var);
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public final void a(String str, r0 r0Var) throws Exception {
        com.fyber.inneractive.sdk.response.nativead.j jVar;
        if (this.f19370a == null || (jVar = this.f19410e) == null) {
            throw new Exception("Missing response ".concat(this.f19370a == null ? "data" : "data native"));
        }
        if (r0Var == null) {
            jVar.f19389i = "ErrorConfigurationMismatch";
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.isNull("native")) {
            this.f19410e.f19389i = "ErrorInvalidJsonResponse";
            throw new com.fyber.inneractive.sdk.response.nativead.a("Missing native ad object", "ErrorInvalidJsonResponse");
        }
        try {
            com.fyber.inneractive.sdk.response.nativead.i iVarA = a(jSONObject.optJSONObject("native"));
            com.fyber.inneractive.sdk.response.nativead.k kVar = this.f19410e.T;
            kVar.N = iVarA;
            if (kVar.d()) {
                a(this.f19410e, r0Var);
            }
        } catch (com.fyber.inneractive.sdk.flow.vast.h e10) {
            if (e10.getCause() != null) {
                this.f19410e.f19389i = e10.getCause().getMessage();
            }
            this.f19410e.f19390j = e10.getMessage();
            throw e10;
        } catch (com.fyber.inneractive.sdk.response.nativead.a e11) {
            if (e11.getCause() != null) {
                this.f19410e.f19389i = e11.getCause().getMessage();
            }
            this.f19410e.f19390j = e11.getMessage();
            IAlog.f("%s: parsing native ad response: error: %s", "NativeAdResponseParser", e11.getMessage());
            throw e11;
        } catch (Exception e12) {
            this.f19410e.f19390j = e12.getMessage();
            com.fyber.inneractive.sdk.response.nativead.j jVar2 = this.f19410e;
            jVar2.f19389i = "ErrorInvalidNativeOrtbObject";
            jVar2.f19406z = e12;
            IAlog.f("%s: parsing native ad response: error: %s", "NativeAdResponseParser", e12.getMessage());
            if (IAlog.f19500a == 2) {
                e12.printStackTrace();
            }
            throw e12;
        }
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public final boolean b() {
        return false;
    }
}
