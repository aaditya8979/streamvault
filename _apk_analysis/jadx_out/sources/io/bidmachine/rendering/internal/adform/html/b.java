package io.bidmachine.rendering.internal.adform.html;

import android.webkit.WebView;
import io.bidmachine.iab.IabError;
import io.bidmachine.iab.mraid.MraidAdView;
import io.bidmachine.iab.mraid.MraidOrientationProperties;
import io.bidmachine.iab.mraid.MraidResizeProperties;
import io.bidmachine.iab.mraid.MraidScreenMetrics;
import io.bidmachine.rendering.internal.adform.c;
import io.bidmachine.rendering.measurer.HtmlMeasurer;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.model.PrivacySheetParams;
import tn.p;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements MraidAdView.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f70051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f70052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.event.b f70053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HtmlMeasurer f70054d;

    public b(a aVar, c cVar, io.bidmachine.rendering.internal.event.b bVar, HtmlMeasurer htmlMeasurer) {
        p.k(aVar, "htmlAdForm");
        p.k(cVar, "adFormListener");
        p.k(bVar, "eventCallback");
        this.f70051a = aVar;
        this.f70052b = cVar;
        this.f70053c = bVar;
        this.f70054d = htmlMeasurer;
    }

    @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
    public void onCalendarEventIntention(MraidAdView mraidAdView, String str) {
        p.k(mraidAdView, "mraidAdView");
        p.k(str, "url");
        onOpenUrlIntention(mraidAdView, str);
    }

    @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
    public void onChangeOrientationIntention(MraidAdView mraidAdView, MraidOrientationProperties mraidOrientationProperties) {
        p.k(mraidAdView, "mraidAdView");
        p.k(mraidOrientationProperties, "mraidOrientationProperties");
    }

    @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
    public void onCloseIntention(MraidAdView mraidAdView) {
        p.k(mraidAdView, "mraidAdView");
        this.f70053c.onClose();
    }

    @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
    public boolean onExpandIntention(MraidAdView mraidAdView, WebView webView, MraidOrientationProperties mraidOrientationProperties, boolean z10) {
        p.k(mraidAdView, "mraidAdView");
        p.k(webView, "webView");
        return false;
    }

    @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
    public void onExpanded(MraidAdView mraidAdView) {
        p.k(mraidAdView, "mraidAdView");
    }

    @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
    public void onMraidAdViewExpired(MraidAdView mraidAdView, IabError iabError) {
        p.k(mraidAdView, "mraidAdView");
        p.k(iabError, "iabError");
        c cVar = this.f70052b;
        a aVar = this.f70051a;
        String message = iabError.getMessage();
        p.j(message, "iabError.message");
        cVar.b(aVar, new Error(message));
    }

    @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
    public void onMraidAdViewLoadFailed(MraidAdView mraidAdView, IabError iabError) {
        p.k(mraidAdView, "mraidAdView");
        p.k(iabError, "iabError");
        a aVar = this.f70051a;
        String message = iabError.getMessage();
        p.j(message, "iabError.message");
        aVar.a(new Error(message));
    }

    @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
    public void onMraidAdViewPageLoaded(MraidAdView mraidAdView, String str, WebView webView, boolean z10) {
        p.k(mraidAdView, "mraidAdView");
        p.k(str, "url");
        p.k(webView, "webView");
        HtmlMeasurer htmlMeasurer = this.f70054d;
        if (htmlMeasurer != null) {
            htmlMeasurer.onViewReady(webView);
        }
        this.f70052b.b(this.f70051a);
    }

    @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
    public void onMraidAdViewShowFailed(MraidAdView mraidAdView, IabError iabError) {
        p.k(mraidAdView, "mraidAdView");
        p.k(iabError, "iabError");
        a aVar = this.f70051a;
        String message = iabError.getMessage();
        p.j(message, "iabError.message");
        aVar.b(new Error(message));
    }

    @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
    public void onMraidAdViewShown(MraidAdView mraidAdView) {
        p.k(mraidAdView, "mraidAdView");
    }

    @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
    public void onMraidLoadedIntention(MraidAdView mraidAdView) {
        p.k(mraidAdView, "mraidAdView");
    }

    @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
    public void onOpenPrivacySheet(MraidAdView mraidAdView, PrivacySheetParams privacySheetParams) {
        p.k(mraidAdView, "mraidAdView");
        p.k(privacySheetParams, "privacySheetParams");
    }

    @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
    public void onOpenUrlIntention(MraidAdView mraidAdView, String str) {
        p.k(mraidAdView, "mraidAdView");
        p.k(str, "url");
        HtmlMeasurer htmlMeasurer = this.f70054d;
        if (htmlMeasurer != null) {
            htmlMeasurer.onClicked();
        }
        this.f70053c.a(str);
    }

    @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
    public void onPlayVideoIntention(MraidAdView mraidAdView, String str) {
        p.k(mraidAdView, "mraidAdView");
        p.k(str, "url");
    }

    @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
    public boolean onResizeIntention(MraidAdView mraidAdView, WebView webView, MraidResizeProperties mraidResizeProperties, MraidScreenMetrics mraidScreenMetrics) {
        p.k(mraidAdView, "mraidAdView");
        p.k(webView, "webView");
        p.k(mraidResizeProperties, "mraidResizeProperties");
        p.k(mraidScreenMetrics, "mraidScreenMetrics");
        return false;
    }

    @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
    public void onStorePictureIntention(MraidAdView mraidAdView, String str) {
        p.k(mraidAdView, "mraidAdView");
        p.k(str, "url");
        onOpenUrlIntention(mraidAdView, str);
    }

    @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
    public void onSyncCustomCloseIntention(MraidAdView mraidAdView, boolean z10) {
        p.k(mraidAdView, "mraidAdView");
        this.f70053c.onUseCustomClose(z10);
    }
}
