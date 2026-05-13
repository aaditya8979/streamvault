package com.yandex.div.core.downloader;

import ah.c9;
import android.net.Uri;
import com.vungle.ads.internal.presenter.NativeAdPresenter;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.Assert;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivActionDownload;
import com.yandex.div2.DivDownloadCallbacks;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: DivDownloadActionHandler.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class DivDownloadActionHandler {

    @NotNull
    public static final DivDownloadActionHandler INSTANCE = new DivDownloadActionHandler();

    private DivDownloadActionHandler() {
    }

    public static final boolean canHandle(@Nullable Uri uri, @NotNull DivViewFacade divViewFacade) {
        String authority;
        if (uri == null || (authority = uri.getAuthority()) == null || !p.f(NativeAdPresenter.DOWNLOAD, authority)) {
            return false;
        }
        if (uri.getQueryParameter("url") == null) {
            Assert.fail("url param is required!");
            return false;
        }
        if (divViewFacade instanceof Div2View) {
            return true;
        }
        Assert.fail("Div2View should be used!");
        return false;
    }

    private final boolean executeDownload(String str, final List<DivAction> list, final List<DivAction> list2, final Div2View div2View, final ExpressionResolver expressionResolver) {
        div2View.addLoadReference(div2View.getDiv2Component$div_release().getDivDownloader().downloadPatch(div2View, str, new DivPatchDownloadCallback() { // from class: com.yandex.div.core.downloader.DivDownloadActionHandler$executeDownload$callback$1
        }), div2View);
        return true;
    }

    private final boolean handleAction(Uri uri, DivDownloadCallbacks divDownloadCallbacks, Div2View div2View, ExpressionResolver expressionResolver) {
        String queryParameter = uri.getQueryParameter("url");
        if (queryParameter == null) {
            return false;
        }
        return executeDownload(queryParameter, divDownloadCallbacks != null ? divDownloadCallbacks.f55179b : null, divDownloadCallbacks != null ? divDownloadCallbacks.f55178a : null, div2View, expressionResolver);
    }

    public static final boolean handleAction(@NotNull DivAction divAction, @NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver) {
        Uri uriEvaluate;
        Expression<Uri> expression = divAction.f54185k;
        if (expression == null || (uriEvaluate = expression.evaluate(expressionResolver)) == null) {
            return false;
        }
        return INSTANCE.handleAction(uriEvaluate, divAction.f54175a, div2View, expressionResolver);
    }

    public static final boolean handleVisibilityAction(@NotNull c9 c9Var, @NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver) {
        Uri uriEvaluate;
        Expression<Uri> url = c9Var.getUrl();
        if (url == null || (uriEvaluate = url.evaluate(expressionResolver)) == null) {
            return false;
        }
        return INSTANCE.handleAction(uriEvaluate, c9Var.a(), div2View, expressionResolver);
    }

    public final boolean handleAction(@NotNull DivActionDownload divActionDownload, @Nullable DivDownloadCallbacks divDownloadCallbacks, @NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver) {
        List<DivAction> list;
        List<DivAction> list2;
        Uri uriEvaluate = divActionDownload.f54297c.evaluate(expressionResolver);
        List<DivAction> list3 = divActionDownload.f54295a;
        if (list3 != null) {
            list = list3;
        } else if (divDownloadCallbacks != null) {
            list3 = divDownloadCallbacks.f55178a;
            list = list3;
        } else {
            list = null;
        }
        List<DivAction> list4 = divActionDownload.f54296b;
        if (list4 == null) {
            list2 = divDownloadCallbacks != null ? divDownloadCallbacks.f55179b : null;
        } else {
            list2 = list4;
        }
        return executeDownload(uriEvaluate.toString(), list2, list, div2View, expressionResolver);
    }
}
