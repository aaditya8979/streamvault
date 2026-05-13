package com.bytedance.sdk.openadsdk.component.reward.top;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.vpp;
import com.bytedance.sdk.openadsdk.core.le.fkw;
import com.bytedance.sdk.openadsdk.core.le.pno;
import com.bytedance.sdk.openadsdk.core.le.yu;
import com.bytedance.sdk.openadsdk.core.model.ex;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.tc;
import com.bytedance.sdk.openadsdk.core.widget.le;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.cf;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.rn;
import com.google.android.material.badge.BadgeDrawable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes9.dex */
public class TopLayoutDislike2 extends fkw implements ouw<TopLayoutDislike2> {
    public fkw container;
    private boolean hasCutDown;
    private boolean hasShowClose;
    private boolean isVast;
    private yu mCloseBtn;
    private View mImgDislike;
    private ImageView mImgSound;
    private boolean mIsSoundMute;
    private TextView mNextAdTextTv;
    private fkw mPlayableNextAd;
    private com.bytedance.sdk.openadsdk.core.cf.vt.lh.ouw mProgressBar;
    private int mProgressBgColor;
    private int mProgressColor;
    private int mProgressRadiusSize;
    private com.bytedance.sdk.openadsdk.core.cf.vt.lh.ouw mProgressRing;
    private int mProgressSize;
    private CharSequence mProgressStr;
    private int mProgressType;
    private ImageView mSkipIV;
    private TextView mTextViewCountDown;
    private vt mTopListener;
    private boolean shouldShowSkipTime;
    private int skipTime;
    private int videoDuration;

    public TopLayoutDislike2(@NonNull Context context) {
        this(context, null);
    }

    public TopLayoutDislike2(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TopLayoutDislike2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mProgressStr = "";
        this.mProgressColor = com.bytedance.adsdk.ugeno.ra.ouw.ouw("#FFD813", ViewCompat.MEASURED_STATE_MASK);
        this.mProgressBgColor = com.bytedance.adsdk.ugeno.ra.ouw.ouw("rgba(0, 0, 0, 0.5)", ViewCompat.MEASURED_STATE_MASK);
        setOrientation(1);
    }

    private ImageView getCommonRingBGImageView() {
        yu yuVar = new yu(getContext());
        int iOuw = osn.ouw(getContext(), 5.0f);
        yuVar.setPadding(iOuw, iOuw, iOuw, iOuw);
        yuVar.setScaleType(ImageView.ScaleType.CENTER);
        yuVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.yu.ouw());
        return yuVar;
    }

    private void initListener() {
        View view = this.mImgDislike;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/top/TopLayoutDislike2$1;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(g.f53147u, view2);
                    safedk_TopLayoutDislike2$1_onClick_07c8465f593befce97bf882266401e5e(view2);
                }

                public void safedk_TopLayoutDislike2$1_onClick_07c8465f593befce97bf882266401e5e(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.vt();
                    }
                }
            });
        }
        ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/top/TopLayoutDislike2$2;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(g.f53147u, view2);
                    safedk_TopLayoutDislike2$2_onClick_3ac04b14d259e05ac6c7043f98736e22(view2);
                }

                public void safedk_TopLayoutDislike2$2_onClick_3ac04b14d259e05ac6c7043f98736e22(View view2) {
                    TopLayoutDislike2.this.mIsSoundMute = !r3.mIsSoundMute;
                    TopLayoutDislike2.this.mImgSound.setImageDrawable(TopLayoutDislike2.this.mSkipIV != null ? TopLayoutDislike2.this.mIsSoundMute ? vpp.lh(TopLayoutDislike2.this.getContext(), "tt_reward_full_mute") : vpp.lh(TopLayoutDislike2.this.getContext(), "tt_reward_full_unmute") : TopLayoutDislike2.this.mIsSoundMute ? cf.ouw(TopLayoutDislike2.this.getContext(), "tt_mute_wrapper") : cf.ouw(TopLayoutDislike2.this.getContext(), "tt_unmute_wrapper"));
                    if (TopLayoutDislike2.this.mImgSound.getDrawable() != null) {
                        TopLayoutDislike2.this.mImgSound.getDrawable().setAutoMirrored(true);
                    }
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        Object tag = TopLayoutDislike2.this.mImgSound.getTag(TopLayoutDislike2.this.mImgSound.getId());
                        TopLayoutDislike2.this.mTopListener.ouw(tag instanceof String ? tag.toString() : "nativeClick");
                    }
                    TopLayoutDislike2.this.mImgSound.setTag(TopLayoutDislike2.this.mImgSound.getId(), null);
                }
            });
        }
        ImageView imageView2 = this.mSkipIV;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/top/TopLayoutDislike2$3;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(g.f53147u, view2);
                    safedk_TopLayoutDislike2$3_onClick_27400631db877f6de09e30aa42f2ac4b(view2);
                }

                public void safedk_TopLayoutDislike2$3_onClick_27400631db877f6de09e30aa42f2ac4b(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.ouw();
                    }
                }
            });
        } else {
            TextView textView = this.mTextViewCountDown;
            if (textView != null) {
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/top/TopLayoutDislike2$4;->onClick(Landroid/view/View;)V");
                        CreativeInfoManager.onViewClicked(g.f53147u, view2);
                        safedk_TopLayoutDislike2$4_onClick_bb506814ec67772454de11ab04684503(view2);
                    }

                    public void safedk_TopLayoutDislike2$4_onClick_bb506814ec67772454de11ab04684503(View view2) {
                        if (TopLayoutDislike2.this.mTopListener != null) {
                            TopLayoutDislike2.this.mTopListener.ouw();
                        }
                    }
                });
            }
        }
        yu yuVar = this.mCloseBtn;
        if (yuVar != null) {
            yuVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/top/TopLayoutDislike2$5;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(g.f53147u, view2);
                    safedk_TopLayoutDislike2$5_onClick_ccdece47b8e4c126ceaafe865e66e5a9(view2);
                }

                public void safedk_TopLayoutDislike2$5_onClick_ccdece47b8e4c126ceaafe865e66e5a9(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.lh();
                    }
                }
            });
        }
        fkw fkwVar = this.mPlayableNextAd;
        if (fkwVar != null) {
            fkwVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/top/TopLayoutDislike2$6;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(g.f53147u, view2);
                    safedk_TopLayoutDislike2$6_onClick_de9ead704de5f29bb914af0dc93be5b7(view2);
                }

                public void safedk_TopLayoutDislike2$6_onClick_de9ead704de5f29bb914af0dc93be5b7(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.yu();
                    }
                }
            });
        }
    }

    private void initProgressBar(com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        com.bytedance.sdk.openadsdk.core.model.ouw ouwVar;
        ex exVar;
        ex.vt vtVar;
        if (vppVar == null || (ouwVar = vppVar.f13800vm) == null || (exVar = ouwVar.f13699le) == null || exVar == null || (vtVar = exVar.f13656rn) == null || vtVar == null) {
            return;
        }
        if (!TextUtils.isEmpty(vtVar.vt)) {
            this.mProgressColor = com.bytedance.adsdk.ugeno.ra.ouw.ouw(vtVar.vt, ViewCompat.MEASURED_STATE_MASK);
        }
        if (!TextUtils.isEmpty(vtVar.f13660lh)) {
            this.mProgressBgColor = com.bytedance.adsdk.ugeno.ra.ouw.ouw(vtVar.f13660lh, ViewCompat.MEASURED_STATE_MASK);
        }
        if (vtVar.yu <= 0.0f) {
            this.mProgressSize = osn.ouw(getContext(), 1.0f);
        } else {
            this.mProgressSize = osn.ouw(getContext(), vtVar.yu);
        }
        if (vtVar.fkw > 0.0f) {
            this.mProgressRadiusSize = osn.ouw(getContext(), vtVar.fkw);
        }
        this.mProgressType = vtVar.ouw;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void initView(com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        fkw fkwVar = new fkw(getContext());
        this.container = fkwVar;
        fkwVar.setOrientation(0);
        int iOuw = osn.ouw(getContext(), 16.0f);
        int iOuw2 = osn.ouw(getContext(), 12.0f);
        int iOuw3 = osn.ouw(getContext(), 24.0f);
        int iOuw4 = osn.ouw(getContext(), 28.0f);
        ImageView commonRingBGImageView = getCommonRingBGImageView();
        this.mImgDislike = commonRingBGImageView;
        commonRingBGImageView.setId(520093713);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iOuw4, iOuw4);
        layoutParams.topMargin = iOuw3;
        layoutParams.leftMargin = iOuw;
        this.mImgDislike.setLayoutParams(layoutParams);
        this.mImgSound = getCommonRingBGImageView();
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iOuw4, iOuw4);
        layoutParams2.leftMargin = iOuw2;
        layoutParams2.topMargin = iOuw3;
        this.mImgSound.setId(rn.tpk);
        this.mImgSound.setLayoutParams(layoutParams2);
        View view = new View(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 0);
        layoutParams3.weight = 1.0f;
        view.setLayoutParams(layoutParams3);
        pno pnoVar = new pno(getContext());
        this.mTextViewCountDown = pnoVar;
        pnoVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.yu.vt());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, osn.ouw(getContext(), 28.0f));
        layoutParams4.topMargin = iOuw3;
        layoutParams4.rightMargin = iOuw;
        this.mTextViewCountDown.setPadding(iOuw2, 0, iOuw2, 0);
        this.mTextViewCountDown.setLayoutParams(layoutParams4);
        this.mTextViewCountDown.setGravity(17);
        this.mTextViewCountDown.setTextColor(-1);
        this.mTextViewCountDown.setTextSize(14.0f);
        this.mTextViewCountDown.setVisibility(8);
        fkw fkwVar2 = new fkw(getContext());
        this.mPlayableNextAd = fkwVar2;
        fkwVar2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, iOuw4);
        layoutParams5.topMargin = iOuw3;
        if (vppVar == null || !vppVar.euf()) {
            layoutParams5.rightMargin = iOuw;
        } else {
            layoutParams5.rightMargin = osn.ouw(getContext(), 8.0f);
        }
        this.mPlayableNextAd.setLayoutParams(layoutParams5);
        this.mPlayableNextAd.setBackground(com.bytedance.sdk.openadsdk.core.widget.yu.vt());
        this.mPlayableNextAd.setVisibility(8);
        this.mNextAdTextTv = new pno(getContext());
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, osn.ouw(getContext(), 28.0f));
        layoutParams6.gravity = 16;
        this.mNextAdTextTv.setLayoutParams(layoutParams6);
        this.mNextAdTextTv.setPadding(iOuw2, 0, 0, 0);
        String strJg = od.jg(vppVar);
        if (TextUtils.isEmpty(strJg)) {
            this.mNextAdTextTv.setText(vpp.vt(getContext(), "tt_multiple_playable_next_ad_tips"));
        } else {
            this.mNextAdTextTv.setText(strJg);
        }
        this.mNextAdTextTv.setGravity(17);
        this.mNextAdTextTv.setTextColor(-1);
        this.mNextAdTextTv.setTextSize(14.0f);
        yu yuVar = new yu(getContext());
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(iOuw2, iOuw2);
        layoutParams7.rightMargin = iOuw2;
        yuVar.setScaleType(ImageView.ScaleType.CENTER);
        layoutParams7.gravity = 16;
        yuVar.setLayoutParams(layoutParams7);
        yuVar.setImageResource(vpp.yu(zih.ouw(), "tt_ad_arrow_right"));
        this.mPlayableNextAd.addView(this.mNextAdTextTv);
        this.mPlayableNextAd.addView(yuVar);
        ImageView commonRingBGImageView2 = getCommonRingBGImageView();
        this.mSkipIV = commonRingBGImageView2;
        commonRingBGImageView2.setId(520093714);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(iOuw4, iOuw4);
        layoutParams8.topMargin = iOuw3;
        layoutParams8.rightMargin = iOuw;
        this.mSkipIV.setLayoutParams(layoutParams8);
        this.mSkipIV.setScaleType(ImageView.ScaleType.CENTER_CROP);
        yu yuVarVt = le.vt(getContext());
        this.mCloseBtn = yuVarVt;
        yuVarVt.setId(520093708);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams9.gravity = BadgeDrawable.TOP_END;
        layoutParams9.topMargin = iOuw3;
        layoutParams9.rightMargin = iOuw3;
        this.mCloseBtn.setLayoutParams(layoutParams9);
        this.mCloseBtn.setContentDescription(vpp.ouw(getContext(), "tt_ad_close_text"));
        this.mCloseBtn.setVisibility(8);
        if (this.mProgressType == 1) {
            this.mProgressRing = new com.bytedance.sdk.openadsdk.core.cf.vt.lh.ouw(getContext());
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(Color.parseColor("#66666666"));
            gradientDrawable.setCornerRadius(osn.ouw(getContext(), 14.0f));
            gradientDrawable.setShape(0);
            this.mProgressRing.setBackground(gradientDrawable);
            LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(iOuw4, iOuw4);
            layoutParams10.topMargin = iOuw3;
            layoutParams10.rightMargin = iOuw;
            this.mProgressRing.setLayoutParams(layoutParams10);
            com.bytedance.sdk.openadsdk.core.cf.vt.lh.ouw ouwVar = this.mProgressRing;
            ouwVar.vt = "ring";
            ouwVar.ouw(this.mProgressSize).ouw(this.mProgressColor).vt(this.mProgressBgColor).ouw = this.mProgressRadiusSize;
            this.mProgressRing.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.core.le.lh lhVar = new com.bytedance.sdk.openadsdk.core.le.lh(getContext());
        lhVar.addView(this.mSkipIV);
        com.bytedance.sdk.openadsdk.core.cf.vt.lh.ouw ouwVar2 = this.mProgressRing;
        if (ouwVar2 != null) {
            lhVar.addView(ouwVar2);
        }
        if (this.mProgressType == 2) {
            this.mProgressBar = new com.bytedance.sdk.openadsdk.core.cf.vt.lh.ouw(getContext());
            this.mProgressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            com.bytedance.sdk.openadsdk.core.cf.vt.lh.ouw ouwVar3 = this.mProgressBar;
            ouwVar3.vt = "line";
            ouwVar3.ouw(this.mProgressSize).ouw(this.mProgressColor).vt(this.mProgressBgColor).ouw = this.mProgressRadiusSize;
            this.mProgressBar.setVisibility(8);
        }
        this.container.addView(this.mImgDislike);
        this.container.addView(this.mImgSound);
        this.container.addView(view);
        if (this.mProgressRing == null) {
            this.container.addView(this.mPlayableNextAd);
        } else {
            lhVar.addView(this.mPlayableNextAd);
        }
        this.container.addView(this.mTextViewCountDown);
        this.container.addView(lhVar);
        this.container.addView(this.mCloseBtn);
        com.bytedance.sdk.openadsdk.core.cf.vt.lh.ouw ouwVar4 = this.mProgressBar;
        if (ouwVar4 != null) {
            addView(ouwVar4);
        }
        addView(this.container);
    }

    private void updateTime(boolean z10) {
        if (this.hasShowClose) {
            return;
        }
        if (this.shouldShowSkipTime) {
            this.mSkipIV.setVisibility(8);
            this.mTextViewCountDown.setVisibility(0);
        } else if (z10) {
            this.mTextViewCountDown.setVisibility(0);
            this.mSkipIV.setVisibility(8);
        } else {
            this.mTextViewCountDown.setVisibility(8);
            this.mSkipIV.setVisibility(0);
        }
    }

    public void clickDislike() {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public void clickSkip() {
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.performClick();
        }
        TextView textView = this.mTextViewCountDown;
        if (textView != null) {
            textView.performClick();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public void clickSound(String str) {
        ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.setTag(imageView.getId(), str);
            this.mImgSound.performClick();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.le.fkw, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public View getCloseButton() {
        return this.mCloseBtn;
    }

    public void hideCountDownText() {
        this.mTextViewCountDown.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2 load(@androidx.annotation.NonNull com.bytedance.sdk.openadsdk.core.model.vpp r7) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.load(com.bytedance.sdk.openadsdk.core.model.vpp):com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.le.fkw, android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public void setCountDownFor1InN(CharSequence charSequence, int i10) {
        int i11 = this.mProgressType;
        if (i11 == 1) {
            this.mTextViewCountDown.setVisibility(8);
            if (i10 < 0) {
                this.mProgressRing.setVisibility(8);
                this.mSkipIV.setVisibility(8);
                return;
            }
            this.mProgressRing.setVisibility(0);
            this.mProgressRing.setAnimationDuration(1000);
            this.mProgressRing.setProgress(i10);
            this.mProgressRing.setClickable(false);
            this.mProgressRing.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/top/TopLayoutDislike2$7;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(g.f53147u, view);
                    safedk_TopLayoutDislike2$7_onClick_1134cba380acacb01ad367968b1cbca1(view);
                }

                public void safedk_TopLayoutDislike2$7_onClick_1134cba380acacb01ad367968b1cbca1(View view) {
                }
            });
            ImageView imageView = this.mSkipIV;
            if (imageView != null) {
                imageView.setVisibility(0);
                return;
            }
            return;
        }
        if (i11 == 2) {
            this.mTextViewCountDown.setVisibility(8);
            if (i10 < 0) {
                this.mProgressBar.setVisibility(8);
                this.mSkipIV.setVisibility(8);
                return;
            } else {
                this.mProgressBar.setVisibility(0);
                this.mProgressBar.setAnimationDuration(1000);
                this.mProgressBar.setProgress(i10);
                return;
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.mTextViewCountDown.setVisibility(8);
            return;
        }
        this.mTextViewCountDown.setText(charSequence);
        if (this.mTextViewCountDown.getVisibility() != 0) {
            this.mTextViewCountDown.setVisibility(0);
        }
        ImageView imageView2 = this.mSkipIV;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public void setListener(vt vtVar) {
        this.mTopListener = vtVar;
    }

    public void setShouldShowSkipTime(boolean z10) {
        this.shouldShowSkipTime = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public void setShowDislike(boolean z10) {
        View view = this.mImgDislike;
        if (view == null || this.isVast) {
            return;
        }
        view.setVisibility(z10 ? 0 : 8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public void setShowEndCardNextAd(boolean z10, com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        tc tcVar;
        fkw fkwVar = this.mPlayableNextAd;
        if (fkwVar != null) {
            fkwVar.setVisibility(z10 ? 0 : 8);
            if (this.mNextAdTextTv == null || !z10 || vppVar == null || (tcVar = vppVar.ccd) == null) {
                return;
            }
            String str = tcVar.yu;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.mNextAdTextTv.setText(str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public void setShowPlayableNextAd(boolean z10, com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        fkw fkwVar = this.mPlayableNextAd;
        if (fkwVar != null) {
            fkwVar.setVisibility(z10 ? 0 : 8);
            if (this.mNextAdTextTv == null || !z10) {
                return;
            }
            String strJg = od.jg(vppVar);
            if (TextUtils.isEmpty(strJg)) {
                this.mNextAdTextTv.setText(vpp.vt(getContext(), "tt_multiple_playable_next_ad_tips"));
            } else {
                this.mNextAdTextTv.setText(strJg);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public void setShowSkip(boolean z10) {
        TextView textView = this.mTextViewCountDown;
        if (textView == null) {
            return;
        }
        if (!z10) {
            textView.setText("");
        }
        if (this.mSkipIV.getVisibility() == 4) {
            return;
        }
        this.hasShowClose = !z10;
        this.mSkipIV.setVisibility((z10 && this.hasCutDown) ? 0 : 8);
        this.mTextViewCountDown.setVisibility(z10 & (TextUtils.isEmpty(this.mTextViewCountDown.getText()) ^ true) ? 0 : 8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public void setShowSound(boolean z10) {
        ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public void setSkipEnable(boolean z10) {
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setEnabled(z10);
            this.mSkipIV.setClickable(z10);
            return;
        }
        TextView textView = this.mTextViewCountDown;
        if (textView != null) {
            textView.setEnabled(z10);
            this.mTextViewCountDown.setClickable(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public void setSkipInvisiable() {
        this.mTextViewCountDown.setWidth(20);
        this.mTextViewCountDown.setVisibility(4);
        this.mSkipIV.setVisibility(4);
        this.hasShowClose = true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public void setSkipText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.mTextViewCountDown.setVisibility(8);
            return;
        }
        this.mTextViewCountDown.setText(charSequence);
        if (this.mTextViewCountDown.getVisibility() != 0) {
            this.mTextViewCountDown.setVisibility(0);
        }
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public void setSoundMute(boolean z10) {
        this.mIsSoundMute = z10;
        this.mImgSound.setImageDrawable(this.mSkipIV != null ? z10 ? vpp.lh(getContext(), "tt_reward_full_mute") : vpp.lh(getContext(), "tt_reward_full_unmute") : z10 ? cf.ouw(getContext(), "tt_mute_wrapper") : cf.ouw(getContext(), "tt_unmute_wrapper"));
        if (this.mImgSound.getDrawable() != null) {
            this.mImgSound.getDrawable().setAutoMirrored(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    @SuppressLint({"SetTextI18n"})
    public void setTime(CharSequence charSequence, CharSequence charSequence2) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.mProgressStr = charSequence;
        }
        if (this.mSkipIV == null) {
            return;
        }
        this.hasCutDown = true;
        if (this.shouldShowSkipTime) {
            this.mTextViewCountDown.setText(((Object) this.mProgressStr) + "s");
            updateTime(false);
            return;
        }
        String str = (String) this.mProgressStr;
        try {
            int i10 = this.skipTime;
            int i11 = i10 == 0 ? Integer.parseInt(str) : i10 - (this.videoDuration - Integer.parseInt(str));
            if (i11 <= 0) {
                this.mTextViewCountDown.setText(((Object) this.mProgressStr) + "s");
                updateTime(false);
                return;
            }
            if (this.skipTime == 0) {
                updateTime(false);
                return;
            }
            this.mTextViewCountDown.setText(i11 + "s");
            updateTime(true);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public void showCloseButton() {
        setSkipInvisiable();
        this.mSkipIV.setVisibility(8);
        this.mCloseBtn.setVisibility(0);
        com.bytedance.sdk.openadsdk.core.cf.vt.lh.ouw ouwVar = this.mProgressRing;
        if (ouwVar != null) {
            ouwVar.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.core.cf.vt.lh.ouw ouwVar2 = this.mProgressBar;
        if (ouwVar2 != null) {
            ouwVar2.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public void showCountDownText() {
        this.mTextViewCountDown.setVisibility(0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public void showSkipButton() {
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        this.mTextViewCountDown.setVisibility(8);
        com.bytedance.sdk.openadsdk.core.cf.vt.lh.ouw ouwVar = this.mProgressRing;
        if (ouwVar != null) {
            ouwVar.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.core.cf.vt.lh.ouw ouwVar2 = this.mProgressBar;
        if (ouwVar2 != null) {
            ouwVar2.setVisibility(8);
        }
    }
}
