package com.fyber.inneractive.sdk.ui;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.util.o;

/* JADX INFO: loaded from: classes9.dex */
public class CloseButtonFlowManager implements com.fyber.inneractive.sdk.flow.storepromo.observer.a, CloseButtonConfigurationChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f19456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f19457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f19458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f19459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FrameLayout f19460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f19461f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CloseButtonConfiguration f19462g = new CloseButtonConfiguration(this);

    public CloseButtonFlowManager(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        View viewFindViewById = inneractiveFullscreenAdActivity.findViewById(R.id.ia_fl_close_button);
        this.f19456a = viewFindViewById;
        this.f19457b = (TextView) inneractiveFullscreenAdActivity.findViewById(R.id.ia_tv_close_button);
        View viewFindViewById2 = inneractiveFullscreenAdActivity.findViewById(R.id.ia_clickable_close_button);
        this.f19458c = viewFindViewById2;
        this.f19459d = (ImageView) inneractiveFullscreenAdActivity.findViewById(R.id.ia_iv_close_button);
        this.f19460e = (FrameLayout) inneractiveFullscreenAdActivity.findViewById(R.id.close_button_container);
        viewFindViewById.setVisibility(8);
        viewFindViewById2.setOnClickListener(new a(inneractiveFullscreenAdActivity));
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.observer.a
    public final void a(com.fyber.inneractive.sdk.flow.storepromo.observer.b bVar) {
        CloseButtonConfiguration closeButtonConfiguration = this.f19462g;
        closeButtonConfiguration.f19454f = bVar.f16629a;
        closeButtonConfiguration.f19455g.a(closeButtonConfiguration);
    }

    @Override // com.fyber.inneractive.sdk.ui.CloseButtonConfigurationChangeListener
    public final void a(CloseButtonConfiguration closeButtonConfiguration) {
        int i10;
        int i11;
        if (closeButtonConfiguration.f19454f) {
            this.f19456a.setVisibility(8);
            this.f19457b.setVisibility(8);
            this.f19459d.setVisibility(8);
            this.f19458c.setVisibility(8);
            return;
        }
        CloseButtonConfiguration closeButtonConfiguration2 = this.f19462g;
        if (closeButtonConfiguration2.f19450b) {
            if (!closeButtonConfiguration2.f19451c || this.f19461f) {
                this.f19456a.setAlpha(1.0f);
                this.f19459d.setAlpha(1.0f);
            } else {
                this.f19456a.setAlpha(0.0f);
                this.f19459d.setAlpha(0.0f);
            }
            this.f19457b.setText("");
            this.f19457b.setVisibility(8);
            int i12 = closeButtonConfiguration2.f19452d;
            if (i12 >= 5) {
                int iA = o.a(i12);
                this.f19459d.getLayoutParams().width = iA;
                this.f19459d.getLayoutParams().height = iA;
            }
            int i13 = closeButtonConfiguration2.f19453e;
            if (i13 >= 5) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f19459d.getLayoutParams();
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f19456a.getLayoutParams();
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f19458c.getLayoutParams();
                int iA2 = o.a(i13);
                int i14 = layoutParams.width;
                int i15 = iA2 - i14;
                if (iA2 <= i14 || i15 <= (i11 = layoutParams2.rightMargin)) {
                    layoutParams3.width = iA2;
                    layoutParams3.height = iA2;
                    i10 = layoutParams2.rightMargin;
                    if (i15 < i10) {
                        i10 -= i15 / 2;
                    }
                } else {
                    int i16 = (i14 / 2) + (iA2 / 2) + i11;
                    layoutParams3.width = i16;
                    layoutParams3.height = i16;
                    layoutParams2.gravity = 53;
                    i10 = 0;
                }
                layoutParams3.setMargins(i10, i10, i10, i10);
                layoutParams3.gravity = 17;
            }
        }
        this.f19456a.setVisibility((closeButtonConfiguration.f19449a || closeButtonConfiguration.f19450b) ? 0 : 8);
        this.f19457b.setVisibility(closeButtonConfiguration.f19449a ? 0 : 8);
        int i17 = closeButtonConfiguration.f19450b ? 0 : 8;
        this.f19459d.setVisibility(i17);
        this.f19458c.setVisibility(i17);
        this.f19458c.setEnabled(closeButtonConfiguration.f19450b);
    }
}
