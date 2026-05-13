package com.ironsource;

import android.util.Log;
import com.ironsource.C3978d4;
import com.ironsource.InterfaceC4139m4;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import kotlin.Result;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.o4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4177o4 implements InterfaceC4333x7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4121l4 f33134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final sn.l<C8, Object> f33135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final C7 f33136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4262t4 f33137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f33138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private C8 f33139f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f33140g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final C3969cd f33141h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private String f33142i;

    /* JADX INFO: renamed from: com.ironsource.o4$a */
    public /* synthetic */ class a extends FunctionReferenceImpl implements sn.l<Result<? extends C8>, bn.r> {
        public a(Object obj) {
            super(1, obj, C4177o4.class, "onHtmlDownloadFinished", "onHtmlDownloadFinished(Ljava/lang/Object;)V", 0);
        }

        public final void a(@NotNull Object obj) {
            ((C4177o4) this.receiver).b(obj);
        }

        @Override // sn.l
        public /* bridge */ /* synthetic */ bn.r invoke(Result<? extends C8> result) {
            a(result.m7542unboximpl());
            return bn.r.f5635a;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o4$b */
    public /* synthetic */ class b extends FunctionReferenceImpl implements sn.l<Result<? extends JSONObject>, bn.r> {
        public b(Object obj) {
            super(1, obj, C4177o4.class, "onAbTestDownloadFinished", "onAbTestDownloadFinished(Ljava/lang/Object;)V", 0);
        }

        public final void a(@NotNull Object obj) throws JSONException {
            ((C4177o4) this.receiver).a(obj);
        }

        @Override // sn.l
        public /* bridge */ /* synthetic */ bn.r invoke(Result<? extends JSONObject> result) throws JSONException {
            a(result.m7542unboximpl());
            return bn.r.f5635a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4177o4(@NotNull C4121l4 c4121l4, @NotNull sn.l<? super C8, ? extends Object> lVar, @NotNull C7 c72, @NotNull InterfaceC4262t4 interfaceC4262t4) {
        tn.p.k(c4121l4, "config");
        tn.p.k(lVar, "onFinish");
        tn.p.k(c72, "downloadManager");
        tn.p.k(interfaceC4262t4, "currentTimeProvider");
        this.f33134a = c4121l4;
        this.f33135b = lVar;
        this.f33136c = c72;
        this.f33137d = interfaceC4262t4;
        this.f33138e = C4177o4.class.getSimpleName();
        this.f33139f = new C8(c4121l4.d(), "mobileController_0.html");
        this.f33140g = interfaceC4262t4.a();
        this.f33141h = new C3969cd(c4121l4.a());
        this.f33142i = "";
    }

    private final C4159n4 a(String str) {
        return new C4159n4(new C4133lg(this.f33141h, str), this.f33134a.d() + "/mobileController_" + str + ".html", this.f33136c, new a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Object obj) throws JSONException {
        if (Result.m7539isFailureimpl(obj)) {
            obj = null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject == null || tn.p.f(jSONObject.optString("htmlBuildNumber"), "")) {
            a("0").m();
            return;
        }
        SDKUtils.updateControllerConfig("abTestMap", jSONObject);
        String string = jSONObject.getString("htmlBuildNumber");
        tn.p.j(string, "abTestMapAsJson.getString(\"htmlBuildNumber\")");
        this.f33142i = string;
        C4159n4 c4159n4A = a(string);
        if (!c4159n4A.j()) {
            c4159n4A.m();
            return;
        }
        C8 c8K = c4159n4A.k();
        this.f33139f = c8K;
        this.f33135b.invoke(c8K);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Object obj) {
        if (Result.m7540isSuccessimpl(obj)) {
            C8 c82 = (C8) (Result.m7539isFailureimpl(obj) ? null : obj);
            if (!tn.p.f(c82 != null ? c82.getAbsolutePath() : null, this.f33139f.getAbsolutePath())) {
                try {
                    IronSourceStorageUtils.deleteFile(this.f33139f);
                    tn.p.h(c82);
                    on.i.u(c82, this.f33139f, true, 0, 4, null);
                } catch (Exception e10) {
                    C4228r4.d().a(e10);
                    Log.e(this.f33138e, "Unable to copy downloaded mobileController.html to cache folder: " + e10.getMessage());
                }
                tn.p.h(c82);
                this.f33139f = c82;
            }
            new InterfaceC4139m4.b(this.f33134a.b(), this.f33140g, this.f33137d).a();
        } else {
            new InterfaceC4139m4.a(this.f33134a.b()).a();
        }
        sn.l<C8, Object> lVar = this.f33135b;
        if (Result.m7539isFailureimpl(obj)) {
            obj = null;
        }
        lVar.invoke((C8) obj);
    }

    @NotNull
    public final InterfaceC4262t4 a() {
        return this.f33137d;
    }

    @Override // com.ironsource.InterfaceC4333x7
    public boolean a(@NotNull C8 c82) {
        tn.p.k(c82, C3978d4.i.f31327b);
        String name = c82.getName();
        tn.p.j(name, "file.name");
        return new Regex("mobileController(_\\d+)?\\.html").matches(name);
    }

    @Override // com.ironsource.InterfaceC4333x7
    public void b() {
        this.f33140g = this.f33137d.a();
        new C3955c(new C3973d(this.f33141h), this.f33134a.d() + "/temp", this.f33136c, new b(this)).m();
    }

    @Override // com.ironsource.InterfaceC4333x7
    @NotNull
    public C8 c() {
        return this.f33139f;
    }

    @NotNull
    public final sn.l<C8, Object> d() {
        return this.f33135b;
    }
}
