package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.InterfaceC4106k7;
import com.ironsource.InterfaceC4357ye;
import com.ironsource.Ne;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import com.vungle.ads.internal.ui.AdActivity;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class Ke {
    private final C4169ne a(InterfaceC4106k7.a aVar) {
        return new C4169ne(aVar.b() ? C4169ne.f33108d : C4169ne.f33112h, aVar.a());
    }

    private final InterfaceC4357ye a(Context context, De de2, C4272te c4272te) throws Throwable {
        try {
            String strA = de2.a(context);
            if (TextUtils.isEmpty(strA)) {
                strA = de2.b(context);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            }
            String str = strA;
            C4002ea c4002eaD = de2.d();
            String strA2 = Pe.a(context, c4272te.d(), c4272te.f(), str, null, true, c4002eaD != null ? c4002eaD.f() : null, false);
            String string = C4037g9.a().toString();
            tn.p.j(string, "createRequestData().toString()");
            InterfaceC4106k7 interfaceC4106k7A = C4071i7.a(strA2, string);
            if (interfaceC4106k7A instanceof InterfaceC4106k7.a) {
                IronLog.INTERNAL.warning("HTTP init request failed: " + ((InterfaceC4106k7.a) interfaceC4106k7A).a());
                tn.p.j(interfaceC4106k7A, "serverResponse");
                return new InterfaceC4357ye.a(a((InterfaceC4106k7.a) interfaceC4106k7A), strA2, string);
            }
            if (!(interfaceC4106k7A instanceof InterfaceC4106k7.b)) {
                throw new NoWhenBranchMatchedException();
            }
            String strD = ((InterfaceC4106k7.b) interfaceC4106k7A).d();
            if (de2.e()) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("encrypt");
                JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(strD);
                String strOptString = jSONObjectJsonObjectInit.optString("response");
                if (TextUtils.isEmpty(strOptString)) {
                    ironLog.warning("encryptedResponse is empty - return null");
                    return new InterfaceC4357ye.a(new C4169ne(2100, C4222qe.f33358h), strA2, string);
                }
                boolean zOptBoolean = jSONObjectJsonObjectInit.optBoolean("compression", false);
                tn.p.j(strOptString, "encryptedResponse");
                strD = a(strOptString, zOptBoolean);
                if (TextUtils.isEmpty(strD)) {
                    ironLog.warning("encoded response invalid - return null");
                    de2.f();
                    return new InterfaceC4357ye.a(new C4169ne(C4169ne.f33110f, C4222qe.f33357g), strA2, string);
                }
            }
            Ne ne2 = new Ne(context, c4272te.d(), c4272te.f(), strD);
            ne2.a(Ne.a.SERVER);
            if (ne2.q()) {
                return new InterfaceC4357ye.b(new C4289ue(ne2));
            }
            IronLog.INTERNAL.warning("response invalid - return null");
            String strE = ne2.e();
            if (strE == null) {
                strE = "Unknown";
            }
            return new InterfaceC4357ye.a(new C4169ne(C4169ne.f33109e, strE), strA2, string);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.warning("exception = " + e10);
            return new InterfaceC4357ye.a(e10 instanceof JSONException ? new C4169ne(C4169ne.f33109e, "serverResponseIsNotValid") : new C4169ne(510, "internal error"), null, null, 6, null);
        }
    }

    private final String a(String str, boolean z10) {
        if (z10) {
            String strD = N9.d(C4196p5.b().c(), str);
            tn.p.j(strD, "{\n      IronSourceAES.de… encryptedResponse)\n    }");
            return strD;
        }
        String strB = N9.b(C4196p5.b().c(), str);
        tn.p.j(strB, "{\n      IronSourceAES.de… encryptedResponse)\n    }");
        return strB;
    }

    private final InterfaceC4357ye b(Context context, De de2, C4272te c4272te) throws Throwable {
        InterfaceC4357ye interfaceC4357yeA = a(context, de2, c4272te);
        if (!(interfaceC4357yeA instanceof InterfaceC4357ye.a)) {
            return interfaceC4357yeA;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "Null or invalid response. Trying to get cached response", 0);
        Ne neA = de2.a(context, c4272te.d());
        if (neA == null || !neA.q()) {
            return interfaceC4357yeA;
        }
        InterfaceC4357ye.b bVar = new InterfaceC4357ye.b(new C4289ue(neA));
        IronSourceError ironSourceErrorBuildUsingCachedConfigurationError = ErrorBuilder.buildUsingCachedConfigurationError(c4272te.d(), c4272te.f());
        IronSourceLoggerManager.getLogger().log(ironSourceTag, ironSourceErrorBuildUsingCachedConfigurationError + ": " + bVar.b(), 1);
        de2.g();
        return bVar;
    }

    public final void a(@NotNull Context context, @NotNull C4272te c4272te, @NotNull De de2, @NotNull InterfaceC4238re interfaceC4238re) throws Throwable {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(c4272te, AdActivity.REQUEST_KEY_EXTRA);
        tn.p.k(de2, "tools");
        tn.p.k(interfaceC4238re, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        String strF = c4272te.f();
        if (strF == null) {
            strF = "";
        }
        de2.a("userId", strF);
        de2.a("appKey", c4272te.d());
        de2.c().i(c4272te.f());
        de2.a();
        InterfaceC4357ye interfaceC4357yeB = b(context, de2, c4272te);
        if (interfaceC4357yeB instanceof InterfaceC4357ye.b) {
            interfaceC4238re.a(new C4131le(((InterfaceC4357ye.b) interfaceC4357yeB).b()));
        } else if (interfaceC4357yeB instanceof InterfaceC4357ye.a) {
            InterfaceC4357ye.a aVar = (InterfaceC4357ye.a) interfaceC4357yeB;
            de2.a(aVar.d(), aVar.f(), aVar.e());
            interfaceC4238re.a(aVar.d());
        }
    }
}
