package io.bidmachine.rendering.internal.view.privacy;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bn.g;
import bn.r;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.rendering.R;
import io.bidmachine.util.UtilsKt;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes.dex */
public final class c extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f70667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f70668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f70669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g f70670d;

    public static final class a extends Lambda implements sn.a {
        public a() {
            super(0);
        }

        @Override // sn.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LinearLayout invoke() {
            return (LinearLayout) c.this.findViewById(R.id.bmPrivacySheetActionButtonsContainer);
        }
    }

    public static final class b extends Lambda implements sn.a {
        public b() {
            super(0);
        }

        @Override // sn.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View invoke() {
            return c.this.findViewById(R.id.bmPrivacySheetClose);
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.rendering.internal.view.privacy.c$c, reason: collision with other inner class name */
    public static final class C0842c extends Lambda implements sn.a {
        public C0842c() {
            super(0);
        }

        @Override // sn.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView invoke() {
            return (TextView) c.this.findViewById(R.id.bmPrivacySheetSubtitle);
        }
    }

    public static final class d extends Lambda implements sn.a {
        public d() {
            super(0);
        }

        @Override // sn.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView invoke() {
            return (TextView) c.this.findViewById(R.id.bmPrivacySheetTitle);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context);
        p.k(context, GAMConfig.KEY_CONTEXT);
        this.f70667a = kotlin.b.b(new d());
        this.f70668b = kotlin.b.b(new C0842c());
        this.f70669c = kotlin.b.b(new b());
        this.f70670d = kotlin.b.b(new a());
        View.inflate(context, R.layout.bm_privacy_sheet, this);
        setOrientation(1);
        setBackgroundResource(R.drawable.bm_bg_privacy_sheet);
        int iDpToPx = UtilsKt.dpToPx(context, 16.0f);
        setPadding(iDpToPx, iDpToPx, iDpToPx, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(sn.a aVar, View view) {
        p.k(aVar, "$clickListener");
        aVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(sn.a aVar, View view) {
        p.k(aVar, "$clickListener");
        aVar.invoke();
    }

    private final LinearLayout getActionButtonsContainer() {
        Object value = this.f70670d.getValue();
        p.j(value, "<get-actionButtonsContainer>(...)");
        return (LinearLayout) value;
    }

    private final View getCloseButton() {
        Object value = this.f70669c.getValue();
        p.j(value, "<get-closeButton>(...)");
        return (View) value;
    }

    private final TextView getSubtitleTextView() {
        Object value = this.f70668b.getValue();
        p.j(value, "<get-subtitleTextView>(...)");
        return (TextView) value;
    }

    private final TextView getTitleTextView() {
        Object value = this.f70667a.getValue();
        p.j(value, "<get-titleTextView>(...)");
        return (TextView) value;
    }

    public final void a() {
        getActionButtonsContainer().removeAllViews();
    }

    public final void a(String str, Drawable drawable, final sn.a aVar) {
        p.k(str, "title");
        p.k(aVar, "clickListener");
        LinearLayout actionButtonsContainer = getActionButtonsContainer();
        Context context = getContext();
        p.j(context, GAMConfig.KEY_CONTEXT);
        io.bidmachine.rendering.internal.view.privacy.a aVar2 = new io.bidmachine.rendering.internal.view.privacy.a(context);
        aVar2.setText(str);
        aVar2.setActionIcon(drawable);
        aVar2.setOnClickListener(new View.OnClickListener() { // from class: nk.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                io.bidmachine.rendering.internal.view.privacy.c.a(aVar, view);
            }
        });
        actionButtonsContainer.addView(aVar2, -1, -2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public final void setOnCloseButtonClickListener(@NotNull final sn.a<r> aVar) {
        p.k(aVar, "clickListener");
        getCloseButton().setOnClickListener(new View.OnClickListener() { // from class: nk.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                io.bidmachine.rendering.internal.view.privacy.c.b(aVar, view);
            }
        });
    }

    public final void setSubtitle(@NotNull String str) {
        p.k(str, "subtitle");
        getSubtitleTextView().setText(str);
    }

    public final void setTitle(@NotNull String str) {
        p.k(str, "title");
        getTitleTextView().setText(str);
    }
}
