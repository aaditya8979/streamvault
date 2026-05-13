package yads;

import android.content.Context;
import android.net.Uri;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;

/* JADX INFO: loaded from: classes11.dex */
public final class oh0 extends DivActionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kz f93219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ph0 f93220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zh0 f93221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qi0 f93222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pi0 f93223e;

    public /* synthetic */ oh0(Context context, d4 d4Var, lu2 lu2Var, v9 v9Var, kz kzVar, ph0 ph0Var, zh0 zh0Var) {
        this(kzVar, ph0Var, zh0Var, new qi0(new dd2(context, d4Var, lu2Var, k83.f91513d)), new pi0(v9Var, ((iu3) lu2Var).a()));
    }

    public oh0(kz kzVar, ph0 ph0Var, zh0 zh0Var, qi0 qi0Var, pi0 pi0Var) {
        this.f93219a = kzVar;
        this.f93220b = ph0Var;
        this.f93221c = zh0Var;
        this.f93222d = qi0Var;
        this.f93223e = pi0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(org.json.JSONObject r5, android.net.Uri r6, com.yandex.div.core.DivViewFacade r7) {
        /*
            r4 = this;
            java.lang.String r0 = r6.getScheme()
            java.lang.String r1 = "mobileads"
            boolean r0 = tn.p.f(r0, r1)
            r1 = 1
            if (r0 == 0) goto Lc2
            java.lang.String r0 = r6.getHost()
            if (r0 == 0) goto Lbb
            int r2 = r0.hashCode()
            r3 = 94750088(0x5a5c588, float:1.5589087E-35)
            if (r2 == r3) goto La8
            r7 = 866535483(0x33a6483b, float:7.743116E-8)
            if (r2 == r7) goto L99
            r7 = 986975867(0x3ad40e7b, float:0.0016178632)
            if (r2 == r7) goto L55
            r5 = 1270469668(0x4bb9d424, float:2.4356936E7)
            if (r2 == r5) goto L2d
            goto Lbb
        L2d:
            java.lang.String r5 = "trackUrl"
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L37
            goto Lbb
        L37:
            yads.qi0 r5 = r4.f93222d
            r5.getClass()
            java.lang.String r7 = "trackingUrl"
            java.lang.String r6 = r6.getQueryParameter(r7)
            if (r6 == 0) goto Lc3
            int r7 = r6.length()
            if (r7 <= 0) goto Lc3
            yads.wa3 r5 = r5.f94041a
            java.util.Map r7 = kotlin.collections.a.j()
            r5.a(r6, r7)
            goto Lc3
        L55:
            java.lang.String r7 = "trackAnalytics"
            boolean r7 = r0.equals(r7)
            if (r7 != 0) goto L5e
            goto Lbb
        L5e:
            yads.pi0 r7 = r4.f93223e
            r7.getClass()
            java.lang.String r0 = "eventName"
            java.lang.String r6 = r6.getQueryParameter(r0)
            if (r6 == 0) goto Lc3
            int r0 = r6.length()
            if (r0 != 0) goto L72
            r6 = 0
        L72:
            if (r6 == 0) goto Lc3
            if (r5 == 0) goto L85
            yads.ee1 r0 = r7.f93599c
            r0.getClass()
            java.util.HashMap r5 = yads.ee1.a(r5)
            java.util.Map r5 = kotlin.collections.a.C(r5)
            if (r5 != 0) goto L8a
        L85:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
        L8a:
            yads.eo2 r0 = new yads.eo2
            yads.v9 r2 = r7.f93597a
            yads.c r2 = r2.f95998i
            r0.<init>(r6, r5, r2)
            yads.io2 r5 = r7.f93598b
            r5.a(r0)
            goto Lc3
        L99:
            java.lang.String r5 = "closeAd"
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto La2
            goto Lbb
        La2:
            yads.kz r5 = r4.f93219a
            r5.e()
            goto Lc3
        La8:
            java.lang.String r5 = "click"
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto Lb1
            goto Lbb
        Lb1:
            yads.zh0 r5 = r4.f93221c
            android.view.View r7 = r7.getView()
            r5.a(r6, r7)
            goto Lc3
        Lbb:
            yads.ph0 r5 = r4.f93220b
            boolean r1 = r5.a(r6)
            goto Lc3
        Lc2:
            r1 = 0
        Lc3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.oh0.a(org.json.JSONObject, android.net.Uri, com.yandex.div.core.DivViewFacade):boolean");
    }

    @Override // com.yandex.div.core.DivActionHandler
    public final boolean handleAction(ah.c9 c9Var, DivViewFacade divViewFacade, ExpressionResolver expressionResolver) {
        if (super.handleAction(c9Var, divViewFacade, expressionResolver)) {
            return true;
        }
        Expression<Uri> url = c9Var.getUrl();
        return url != null && a(c9Var.getPayload(), url.evaluate(expressionResolver), divViewFacade);
    }

    @Override // com.yandex.div.core.DivActionHandler
    public final boolean handleAction(DivAction divAction, DivViewFacade divViewFacade, ExpressionResolver expressionResolver) {
        if (super.handleAction(divAction, divViewFacade, expressionResolver)) {
            return true;
        }
        Expression<Uri> expression = divAction.f54185k;
        return expression != null && a(divAction.f54180f, expression.evaluate(expressionResolver), divViewFacade);
    }
}
