package com.yandex.div.core.view2.divs;

import ah.c9;
import android.net.Uri;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.KLog;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import com.yandex.div2.DivAction;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: DivActionBeaconSender.kt */
/* JADX INFO: loaded from: classes8.dex */
public class DivActionBeaconSender {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private final boolean isSwipeOutBeaconsEnabled;
    private final boolean isTapBeaconsEnabled;
    private final boolean isVisibilityBeaconsEnabled;

    @NotNull
    private final ch.a<xf.b> sendBeaconManagerLazy;

    /* JADX INFO: compiled from: DivActionBeaconSender.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public DivActionBeaconSender(@NotNull ch.a<xf.b> aVar, boolean z10, boolean z11, boolean z12) {
        this.sendBeaconManagerLazy = aVar;
        this.isTapBeaconsEnabled = z10;
        this.isVisibilityBeaconsEnabled = z11;
        this.isSwipeOutBeaconsEnabled = z12;
    }

    private boolean isHttpScheme(String str) {
        return p.f(str, "http") || p.f(str, "https");
    }

    private Map<String, String> toHttpHeaders(c9 c9Var, ExpressionResolver expressionResolver) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Expression<Uri> expressionF = c9Var.f();
        if (expressionF != null) {
            linkedHashMap.put("Referer", expressionF.evaluate(expressionResolver).toString());
        }
        return linkedHashMap;
    }

    private Map<String, String> toHttpHeaders(DivAction divAction, ExpressionResolver expressionResolver) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Expression<Uri> expression = divAction.f54181g;
        if (expression != null) {
            linkedHashMap.put("Referer", expression.evaluate(expressionResolver).toString());
        }
        return linkedHashMap;
    }

    public void sendSwipeOutActionBeacon(@NotNull DivAction divAction, @NotNull ExpressionResolver expressionResolver) {
        Uri uriEvaluate;
        Expression<Uri> expression = divAction.f54178d;
        if (expression == null || (uriEvaluate = expression.evaluate(expressionResolver)) == null) {
            return;
        }
        if (!isHttpScheme(uriEvaluate.getScheme())) {
            KLog kLog = KLog.INSTANCE;
            if (kLog.isAtLeast(Severity.WARNING)) {
                kLog.print(5, "DivActionBeaconSender", "Trying to send beacon with unsupported URL '" + uriEvaluate + '\'');
                return;
            }
            return;
        }
        if (this.isSwipeOutBeaconsEnabled) {
            xf.b bVar = this.sendBeaconManagerLazy.get();
            if (bVar != null) {
                bVar.a(uriEvaluate, toHttpHeaders(divAction, expressionResolver), divAction.f54180f);
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("SendBeaconManager was not configured");
            }
        }
    }

    public void sendTapActionBeacon(@NotNull DivAction divAction, @NotNull ExpressionResolver expressionResolver) {
        Uri uriEvaluate;
        Expression<Uri> expression = divAction.f54178d;
        if (expression == null || (uriEvaluate = expression.evaluate(expressionResolver)) == null) {
            return;
        }
        if (!isHttpScheme(uriEvaluate.getScheme())) {
            KLog kLog = KLog.INSTANCE;
            if (kLog.isAtLeast(Severity.WARNING)) {
                kLog.print(5, "DivActionBeaconSender", "Trying to send beacon with unsupported URL '" + uriEvaluate + '\'');
                return;
            }
            return;
        }
        if (this.isTapBeaconsEnabled) {
            xf.b bVar = this.sendBeaconManagerLazy.get();
            if (bVar != null) {
                bVar.a(uriEvaluate, toHttpHeaders(divAction, expressionResolver), divAction.f54180f);
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("SendBeaconManager was not configured");
            }
        }
    }

    public void sendVisibilityActionBeacon(@NotNull c9 c9Var, @NotNull ExpressionResolver expressionResolver) {
        Uri uriEvaluate;
        Expression<Uri> url = c9Var.getUrl();
        if (url == null || (uriEvaluate = url.evaluate(expressionResolver)) == null) {
            return;
        }
        if (!isHttpScheme(uriEvaluate.getScheme())) {
            KLog kLog = KLog.INSTANCE;
            if (kLog.isAtLeast(Severity.WARNING)) {
                kLog.print(5, "DivActionBeaconSender", "Trying to send beacon with unsupported URL '" + uriEvaluate + '\'');
                return;
            }
            return;
        }
        if (this.isVisibilityBeaconsEnabled) {
            xf.b bVar = this.sendBeaconManagerLazy.get();
            if (bVar != null) {
                bVar.a(uriEvaluate, toHttpHeaders(c9Var, expressionResolver), c9Var.getPayload());
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("SendBeaconManager was not configured");
            }
        }
    }
}
