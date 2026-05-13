package io.bidmachine.rendering.internal.adform.label;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.mbridge.msdk.MBridgeConstans;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.rendering.internal.adform.c;
import io.bidmachine.rendering.internal.event.b;
import io.bidmachine.rendering.internal.j;
import io.bidmachine.rendering.internal.z;
import io.bidmachine.rendering.model.AdElementParams;
import io.bidmachine.rendering.model.AppearanceParams;
import io.bidmachine.rendering.model.Border;
import io.bidmachine.rendering.model.FontStyleType;
import io.bidmachine.util.UtilsKt;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends io.bidmachine.rendering.internal.adform.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0818a f70057s = new C0818a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final TextView f70058r;

    /* JADX INFO: renamed from: io.bidmachine.rendering.internal.adform.label.a$a, reason: collision with other inner class name */
    public static final class C0818a {
        private C0818a() {
        }

        public /* synthetic */ C0818a(i iVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, io.bidmachine.rendering.internal.repository.a aVar, AdElementParams adElementParams, c cVar, b bVar, io.bidmachine.rendering.internal.detector.brokencreative.a aVar2) {
        super(context, aVar, adElementParams, cVar, bVar, aVar2);
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(aVar, "repository");
        p.k(adElementParams, "adElementParams");
        p.k(cVar, "adFormListener");
        p.k(bVar, "eventCallback");
        this.f70058r = new TextView(context);
    }

    @Override // io.bidmachine.rendering.internal.adform.a
    public void a(View view, z zVar) {
        p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        int cornerRadiusPxOrDefault$default = AppearanceParams.getCornerRadiusPxOrDefault$default(u(), v(), 0, 2, null);
        Border border = u().getBorder(v());
        if (zVar != null) {
            zVar.a(this.f70058r, Integer.valueOf(cornerRadiusPxOrDefault$default), border);
            return;
        }
        TextView textView = this.f70058r;
        j jVar = new j();
        jVar.b(AppearanceParams.getBackgroundOrDefault$default(u(), 0, 1, null));
        jVar.a(cornerRadiusPxOrDefault$default);
        if (border != null) {
            j.a(jVar, border.getStrokeWidthPx(), border.getStrokeColor(), 0.0f, 0.0f, 12, null);
            this.f70058r.setPadding(border.getStrokeWidthPx(), border.getStrokeWidthPx() - UtilsKt.dpToPx(v(), 2.0f), border.getStrokeWidthPx(), border.getStrokeWidthPx() + UtilsKt.dpToPx(v(), 2.0f));
        }
        textView.setBackground(jVar);
    }

    @Override // io.bidmachine.rendering.internal.adform.a, io.bidmachine.rendering.internal.c
    public void c() {
        this.f70058r.setText(h().getText());
        Integer strokeColor = u().getStrokeColor();
        if (strokeColor != null) {
            this.f70058r.setTextColor(strokeColor.intValue());
        }
        Float fontSize = u().getFontSize();
        if (fontSize != null && fontSize.floatValue() > 0.0f) {
            this.f70058r.setTextSize(1, fontSize.floatValue());
        }
        FontStyleType fontStyleType = u().getFontStyleType();
        if (fontStyleType != null) {
            this.f70058r.setTypeface(Typeface.create(Typeface.DEFAULT, fontStyleType.getTypeface()));
        }
        Integer textMaxLines = u().getTextMaxLines();
        if (textMaxLines != null && textMaxLines.intValue() > 0) {
            this.f70058r.setMaxLines(textMaxLines.intValue());
        }
        if (u().getTextLineSpacingPx(v()) != null) {
            this.f70058r.setLineSpacing(r0.intValue(), 1.0f);
        }
        this.f70058r.setGravity(u().getTextHorizontalGravity().getValue() | 16);
        Integer shadowColor = u().getShadowColor();
        if (shadowColor != null) {
            int iIntValue = shadowColor.intValue();
            float fDpToPx = UtilsKt.dpToPx(v(), 1.0f);
            this.f70058r.setShadowLayer(UtilsKt.dpToPx(v(), 1.0f), fDpToPx, fDpToPx, iIntValue);
        }
        this.f70058r.setIncludeFontPadding(false);
        t().b(this);
    }

    @Override // io.bidmachine.rendering.internal.adform.a
    public View x() {
        return this.f70058r;
    }
}
