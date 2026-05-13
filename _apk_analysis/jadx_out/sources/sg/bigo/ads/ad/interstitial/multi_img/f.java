package sg.bigo.ads.ad.interstitial.multi_img;

import android.view.View;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.common.view.Indicator;
import sg.bigo.ads.common.view.ViewFlow;

/* JADX INFO: loaded from: classes.dex */
public final class f implements ViewFlow.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final d f81174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Indicator f81175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final a f81176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ValueCallback<Integer> f81177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f81178e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f81179f;

    public f(@NonNull d dVar, @Nullable Indicator indicator, @Nullable a aVar) {
        this.f81174a = dVar;
        this.f81175b = indicator;
        this.f81176c = aVar;
    }

    public static void a(ViewFlow viewFlow, ValueCallback<Integer> valueCallback) {
        if (viewFlow == null || valueCallback == null) {
            return;
        }
        ViewFlow.c onItemChangeListener = viewFlow.getOnItemChangeListener();
        if (onItemChangeListener instanceof f) {
            ((f) onItemChangeListener).f81177d = valueCallback;
        }
    }

    public static boolean a(ViewFlow viewFlow) {
        ViewFlow.c onItemChangeListener = viewFlow != null ? viewFlow.getOnItemChangeListener() : null;
        if (onItemChangeListener == null || !(onItemChangeListener instanceof f)) {
            return false;
        }
        return ((f) onItemChangeListener).f81178e;
    }

    @Override // sg.bigo.ads.common.view.ViewFlow.c
    public final void a(int i10) {
        Indicator indicator = this.f81175b;
        if (indicator == null || i10 <= 1) {
            return;
        }
        if (indicator.getType() != 1) {
            this.f81175b.setNum(i10);
        } else {
            Indicator indicator2 = this.f81175b;
            indicator2.setLineLength(Indicator.a(i10, indicator2.getDistance(), this.f81175b.getRadius(), this.f81175b.getLengthSelected()));
        }
        this.f81175b.setVisibility(0);
    }

    @Override // sg.bigo.ads.common.view.ViewFlow.c
    public final void a(int i10, int i11) {
        Indicator indicator = this.f81175b;
        if (indicator == null || indicator.getType() != 1) {
            return;
        }
        float fMin = Math.min(1.0f, Math.max(0.0f, (i10 * 1.0f) / i11));
        Indicator indicator2 = this.f81175b;
        if (indicator2.f82560a != fMin) {
            indicator2.f82560a = Math.max(0.0f, Math.min(1.0f, fMin));
            indicator2.invalidate();
        }
    }

    @Override // sg.bigo.ads.common.view.ViewFlow.c
    public final void a(@NonNull View view, int i10) {
        Indicator indicator = this.f81175b;
        if (indicator != null && indicator.getType() != 1) {
            this.f81175b.a(i10);
        }
        this.f81179f = i10;
        a aVar = this.f81176c;
        if (aVar != null) {
            aVar.b(i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d6  */
    @Override // sg.bigo.ads.common.view.ViewFlow.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@androidx.annotation.NonNull android.view.View r11, int r12, float r13) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.multi_img.f.a(android.view.View, int, float):void");
    }
}
