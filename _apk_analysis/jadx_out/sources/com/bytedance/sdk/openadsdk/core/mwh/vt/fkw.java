package com.bytedance.sdk.openadsdk.core.mwh.vt;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Message;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.core.lh.ouw;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.mwh.vt.le;
import com.bytedance.sdk.openadsdk.core.widget.qbp;
import com.bytedance.sdk.openadsdk.core.widget.th;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.cf;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.rn;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import io.bidmachine.iab.vast.tags.VastTagName;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public class fkw implements com.bykv.vk.openvk.ouw.ouw.ouw.le.ouw, com.bykv.vk.openvk.ouw.ouw.ouw.yu.vt<vpp>, jae.ouw, ouw.InterfaceC0233ouw, qbp.vt, th.ouw {
    public View bly;

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    public com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh f13840bs;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    public qbp f13841cd;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public View f13842cf;
    public boolean ex;
    public le.ouw ey;
    public com.bytedance.sdk.openadsdk.core.lh.ouw fak;
    public ViewGroup fkw;
    public com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh fvf;
    public vpp jae;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public View f13843jg;
    public boolean jqy;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.widget.ouw f13844ko;
    public int ksc;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public com.bykv.vk.openvk.ouw.ouw.ouw.le.vt f13845le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final int f13846lh;
    public ImageView mwh;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    public Context f13847od;
    public boolean osn;
    private long ouw;

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    public boolean f13848pd;
    public View pno;
    public int qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public ImageView f13849ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public TextView f13850rn;
    public View ryl;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    public int f13851tc;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    public int f13852th;
    public ImageView tlj;
    public com.bytedance.sdk.openadsdk.core.lh.ouw uoy;

    /* JADX INFO: renamed from: uq, reason: collision with root package name */
    public ouw f13853uq;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public TextView f13854vm;
    public int vpp;
    private final String vt;
    public final int yu;
    public TextView zih;
    public int zin;

    public fkw(Context context, ViewGroup viewGroup, vpp vppVar, com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar) {
        this(context, viewGroup, vppVar, lhVar, true);
    }

    public fkw(Context context, ViewGroup viewGroup, vpp vppVar, com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar, boolean z10) {
        this.f13846lh = 228;
        this.yu = 160;
        this.jqy = true;
        this.f13848pd = true;
        this.osn = true;
        this.vt = Build.MODEL;
        if (this instanceof yu) {
            return;
        }
        this.f13847od = zih.ouw().getApplicationContext();
        fkw(z10);
        this.fkw = viewGroup;
        this.jqy = true;
        this.ksc = 17;
        this.f13840bs = lhVar;
        this.jae = vppVar;
        yu(8);
        ouw(context, this.fkw);
        le();
        ko();
    }

    private boolean ex() {
        return vpp.fkw(this.jae) && (!com.bytedance.sdk.openadsdk.core.cf.yu.ouw(this.jae.kfa) ? this.jae.f13803xn == null : this.jae.lht == null) && this.jae.f13774ln == 1;
    }

    private int fkw(int i10) {
        if (this.zin <= 0 || this.vpp <= 0) {
            return 0;
        }
        int iOuw = osn.ouw(this.f13847od, 228.0f);
        int iOuw2 = osn.ouw(this.f13847od, 160.0f);
        int i11 = (int) (this.vpp * ((i10 * 1.0f) / this.zin));
        return i11 > iOuw ? iOuw : i11 < iOuw2 ? iOuw2 : i11;
    }

    private void lh(int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = this.fkw.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (i10 == -1 || i10 == -2 || i10 > 0) {
            layoutParams.width = i10;
        }
        if (i11 == -1 || i11 == -2 || i11 > 0) {
            layoutParams.height = i11;
        }
        this.fkw.setLayoutParams(layoutParams);
    }

    private void tc() {
        if (this.f13853uq == null || this.f13841cd != null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        qbp qbpVar = new qbp();
        this.f13841cd = qbpVar;
        Context context = this.f13847od;
        ViewGroup viewGroup = this.fkw;
        if (context != null && (viewGroup instanceof ViewGroup)) {
            qbpVar.pno = viewGroup;
            qbpVar.f14070lh = zih.ouw().getApplicationContext();
        }
        qbp qbpVar2 = this.f13841cd;
        ouw ouwVar = this.f13853uq;
        qbpVar2.fkw = this;
        qbpVar2.yu = ouwVar;
        ko.vt("useTime", "mVideoTrafficTipLayout use time :" + (System.currentTimeMillis() - jCurrentTimeMillis));
    }

    public void bly() {
    }

    public void cf() {
        yu(8);
        if (jqy()) {
            this.f13845le.setVisibility(8);
        }
        ImageView imageView = this.tlj;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        yu(8);
        osn.ouw(this.ryl, 8);
        osn.ouw((View) this.mwh, 8);
        osn.ouw(this.f13843jg, 8);
        osn.ouw((View) this.f13844ko, 8);
        osn.ouw((View) this.f13850rn, 8);
        osn.ouw((View) this.zih, 8);
        qbp qbpVar = this.f13841cd;
        if (qbpVar != null) {
            qbpVar.ouw(true);
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.le.ouw
    public final void fkw() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f13840bs;
        if (lhVar != null) {
            lhVar.tlj();
        }
    }

    public final void fkw(boolean z10) {
        this.f13848pd = z10;
        if (z10) {
            com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar = this.fak;
            if (ouwVar != null) {
                ouwVar.yu = true;
            }
            com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar2 = this.uoy;
            if (ouwVar2 != null) {
                ouwVar2.yu = true;
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar3 = this.fak;
        if (ouwVar3 != null) {
            ouwVar3.yu = false;
        }
        com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar4 = this.uoy;
        if (ouwVar4 != null) {
            ouwVar4.yu = false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.lh.ouw.InterfaceC0233ouw
    public long getVideoProgress() {
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar;
        if (this.ouw <= 0) {
            vpp vppVar = this.jae;
            if (vppVar != null && (vtVar = vppVar.f13788sd) != null) {
                this.ouw = (long) (vtVar.yu * 1000.0d);
            }
            com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f13840bs;
            if (lhVar != null) {
                this.ouw = lhVar.th();
            }
        }
        return this.ouw;
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.th.ouw
    public void jg() {
    }

    public final boolean jqy() {
        return (this.ksc & 4) != 4 || this.jqy;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ko() {
        /*
            r9 = this;
            boolean r0 = r9.f13848pd
            if (r0 == 0) goto L7
            java.lang.String r0 = "embeded_ad"
            goto L9
        L7:
            java.lang.String r0 = "embeded_ad_landingpage"
        L9:
            com.bytedance.sdk.openadsdk.core.model.vpp r1 = r9.jae
            boolean r1 = r1.ey()
            r2 = 1
            if (r1 == 0) goto L18
            r0 = 7
            java.lang.String r1 = "rewarded_video"
        L15:
            r8 = r0
            r7 = r1
            goto L32
        L18:
            com.bytedance.sdk.openadsdk.core.model.vpp r1 = r9.jae
            boolean r1 = r1.rrs()
            if (r1 == 0) goto L24
            r0 = 5
            java.lang.String r1 = "fullscreen_interstitial_ad"
            goto L15
        L24:
            com.bytedance.sdk.openadsdk.core.model.vpp r1 = r9.jae
            boolean r1 = r1.jvy()
            if (r1 == 0) goto L30
            r0 = 2
            java.lang.String r1 = "banner_ad"
            goto L15
        L30:
            r7 = r0
            r8 = r2
        L32:
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r9.jae
            int r0 = r0.f13782pd
            r1 = 4
            if (r0 != r1) goto L41
            android.content.Context r0 = r9.f13847od
            com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh r0 = com.bytedance.sdk.openadsdk.qbp.ouw.ouw.yu.ouw(r0, r7)
            r9.fvf = r0
        L41:
            com.bytedance.sdk.openadsdk.core.lh.ouw r0 = new com.bytedance.sdk.openadsdk.core.lh.ouw
            android.content.Context r1 = r9.f13847od
            com.bytedance.sdk.openadsdk.core.model.vpp r3 = r9.jae
            r0.<init>(r1, r3, r7, r8)
            r9.fak = r0
            r0.ouw(r9)
            com.bytedance.sdk.openadsdk.core.lh.ouw r0 = r9.fak
            r0.fkw = r2
            boolean r1 = r9.f13848pd
            if (r1 == 0) goto L5a
            r0.yu = r2
            goto L5f
        L5a:
            r1 = 0
            r0.yu = r1
            r0.f13624le = r2
        L5f:
            com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh r1 = r9.f13840bs
            r0.ouw(r1)
            com.bytedance.sdk.openadsdk.core.lh.ouw r0 = r9.fak
            r0.lh()
            com.bytedance.sdk.openadsdk.core.lh.ouw r0 = r9.fak
            com.bytedance.sdk.openadsdk.core.mwh.vt.fkw$1 r1 = new com.bytedance.sdk.openadsdk.core.mwh.vt.fkw$1
            r1.<init>()
            r0.ouw(r1)
            com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh r0 = r9.fvf
            if (r0 == 0) goto L7e
            com.bytedance.sdk.openadsdk.core.lh.ouw r1 = r9.fak
            if (r1 == 0) goto L7e
            r1.ouw(r0)
        L7e:
            boolean r0 = r9.ex()
            if (r0 == 0) goto Lb9
            com.bytedance.sdk.openadsdk.core.mwh.vt.fkw$2 r0 = new com.bytedance.sdk.openadsdk.core.mwh.vt.fkw$2
            android.content.Context r5 = r9.f13847od
            com.bytedance.sdk.openadsdk.core.model.vpp r6 = r9.jae
            r3 = r0
            r4 = r9
            r3.<init>(r5, r6, r7, r8)
            r9.uoy = r0
            com.bytedance.sdk.openadsdk.core.mwh.vt.fkw$3 r1 = new com.bytedance.sdk.openadsdk.core.mwh.vt.fkw$3
            r1.<init>()
            r0.ouw(r1)
            com.bytedance.sdk.openadsdk.core.lh.ouw r0 = r9.uoy
            r0.fkw = r2
            boolean r1 = r9.f13848pd
            r0.yu = r1
            com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh r1 = r9.f13840bs
            r0.ouw(r1)
            com.bytedance.sdk.openadsdk.core.lh.ouw r0 = r9.uoy
            r0.lh()
            com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh r0 = r9.fvf
            if (r0 == 0) goto Lb4
            com.bytedance.sdk.openadsdk.core.lh.ouw r1 = r9.uoy
            r1.ouw(r0)
        Lb4:
            com.bytedance.sdk.openadsdk.core.lh.ouw r0 = r9.uoy
            r0.ouw(r9)
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.mwh.vt.fkw.ko():void");
    }

    public void le() {
        this.f13845le.ouw(this);
        this.f13849ra.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.fkw.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/mwh/vt/fkw$4;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(g.f53147u, view);
                safedk_fkw$4_onClick_249a348b49af2e14a186a2c4e3dcf1cd(view);
            }

            public void safedk_fkw$4_onClick_249a348b49af2e14a186a2c4e3dcf1cd(View view) {
                if (fkw.this.zih()) {
                    TextView textView = fkw.this.f13854vm;
                    if (textView == null || textView.getVisibility() != 0) {
                        fkw.this.f13853uq.ouw();
                    }
                }
            }
        });
    }

    public final void le(boolean z10) {
        ImageView imageView = this.f13849ra;
        if (imageView != null) {
            if (z10) {
                imageView.setImageDrawable(cf.ouw(this.f13847od, "tt_play_movebar_textpage"));
            } else {
                imageView.setImageDrawable(cf.ouw(this.f13847od, "tt_stop_movebar_textpage"));
            }
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.vt
    public final View lh() {
        return this.fkw;
    }

    public final void lh(int i10) {
        osn.ouw((View) this.fkw, 0);
        com.bykv.vk.openvk.ouw.ouw.ouw.le.vt vtVar = this.f13845le;
        if (vtVar != null) {
            vtVar.setVisibility(i10);
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.le.ouw
    public final void lh(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.f13845le.getHolder()) {
            return;
        }
        this.ex = false;
        if (zih()) {
            this.f13853uq.ra();
        }
    }

    public final void lh(@Nullable ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        if (this.fkw.getParent() == null) {
            viewGroup.addView(this.fkw);
        }
        yu(0);
    }

    public void lh(boolean z10) {
        osn.ouw((View) this.f13849ra, 8);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.qbp.vt
    public void mwh() {
        lh(false);
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.vt
    public void ouw() {
        lh(this.jqy);
        qbp();
    }

    public void ouw(int i10) {
        ko.lh(VastTagName.PROGRESS, "setSeekProgress-percent=".concat(String.valueOf(i10)));
    }

    public final void ouw(int i10, int i11) {
        if (i10 == -1) {
            i10 = osn.yu(this.f13847od);
        }
        if (i10 <= 0) {
            return;
        }
        this.f13852th = i10;
        if (this.jqy || ryl() || (this.ksc & 8) == 8) {
            this.qbp = i11;
        } else {
            this.qbp = fkw(i10);
        }
        lh(this.f13852th, this.qbp);
    }

    public void ouw(long j10) {
    }

    public void ouw(long j10, long j11) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.view.ViewGroup, android.widget.RelativeLayout] */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.view.View, com.bykv.vk.openvk.ouw.ouw.ouw.le.vt] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void ouw(android.content.Context r6, android.view.View r7) {
        /*
            r5 = this;
            long r0 = java.lang.System.currentTimeMillis()
            com.bytedance.sdk.openadsdk.core.model.vpp r6 = r5.jae
            r2 = 0
            r3 = 1
            if (r6 == 0) goto L31
            int r6 = r6.uoy()
            r4 = 5
            if (r6 != r4) goto L13
            r6 = r3
            goto L14
        L13:
            r6 = r2
        L14:
            if (r6 != 0) goto L1e
            com.bytedance.sdk.openadsdk.core.model.vpp r6 = r5.jae
            boolean r6 = r6.jvy()
            if (r6 == 0) goto L31
        L1e:
            com.bytedance.sdk.openadsdk.core.settings.cf r6 = com.bytedance.sdk.openadsdk.core.settings.cf.vt()
            com.bytedance.sdk.openadsdk.core.settings.pno r6 = r6.pno
            java.lang.String r4 = "bus_con_video_keep_screen_on"
            int r6 = r6.ouw(r4, r3)
            if (r6 != r3) goto L2e
            r6 = r3
            goto L2f
        L2e:
            r6 = r2
        L2f:
            if (r6 == 0) goto L36
        L31:
            if (r7 == 0) goto L36
            r7.setKeepScreenOn(r3)
        L36:
            com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh r6 = r5.f13840bs
            java.lang.String r3 = "NewLiveViewLayout"
            if (r6 == 0) goto L4f
            boolean r6 = r6.tc()
            if (r6 == 0) goto L4f
            com.bykv.vk.openvk.ouw.ouw.ouw.le.yu r6 = new com.bykv.vk.openvk.ouw.ouw.ouw.le.yu
            android.content.Context r4 = r5.f13847od
            r6.<init>(r4)
            java.lang.String r4 = "use TextureView......"
            com.bytedance.sdk.component.utils.ko.vt(r3, r4)
            goto L5b
        L4f:
            com.bykv.vk.openvk.ouw.ouw.ouw.le.lh r6 = new com.bykv.vk.openvk.ouw.ouw.ouw.le.lh
            android.content.Context r4 = r5.f13847od
            r6.<init>(r4)
            java.lang.String r4 = "use SurfaceView......"
            com.bytedance.sdk.component.utils.ko.vt(r3, r4)
        L5b:
            boolean r3 = r7 instanceof android.widget.RelativeLayout
            if (r3 == 0) goto L70
            android.widget.RelativeLayout$LayoutParams r3 = new android.widget.RelativeLayout$LayoutParams
            r4 = -2
            r3.<init>(r4, r4)
            r4 = 13
            r3.addRule(r4)
            r4 = r7
            android.widget.RelativeLayout r4 = (android.widget.RelativeLayout) r4
            r4.addView(r6, r2, r3)
        L70:
            r2 = 8
            com.bytedance.sdk.openadsdk.utils.osn.ouw(r6, r2)
            r5.f13845le = r6
            int r6 = com.bytedance.sdk.openadsdk.utils.rn.f14348ki
            android.view.View r6 = r7.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r5.f13849ra = r6
            int r6 = com.bytedance.sdk.openadsdk.utils.rn.f14343fn
            android.view.View r6 = r7.findViewById(r6)
            r5.pno = r6
            int r6 = com.bytedance.sdk.openadsdk.utils.rn.ehk
            android.view.View r6 = r7.findViewById(r6)
            r5.bly = r6
            int r6 = com.bytedance.sdk.openadsdk.utils.rn.byv
            android.view.View r6 = r7.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r5.tlj = r6
            int r6 = com.bytedance.sdk.openadsdk.utils.rn.f14355ln
            android.view.View r6 = r7.findViewById(r6)
            r5.f13842cf = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "NativeVideoLayout**findViews use time :"
            r6.<init>(r7)
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "useTime"
            com.bytedance.sdk.component.utils.ko.vt(r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.mwh.vt.fkw.ouw(android.content.Context, android.view.View):void");
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.le.ouw
    public final void ouw(SurfaceTexture surfaceTexture) {
        this.ex = true;
        if (zih()) {
            this.f13853uq.ouw(surfaceTexture);
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.vt
    public final void ouw(Drawable drawable) {
        ViewGroup viewGroup = this.fkw;
        if (viewGroup != null) {
            viewGroup.setBackgroundDrawable(drawable);
        }
    }

    @Override // com.bytedance.sdk.component.utils.jae.ouw
    public void ouw(Message message) {
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.le.ouw
    public final void ouw(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.f13845le.getHolder()) {
            return;
        }
        this.ex = true;
        if (zih()) {
            this.f13853uq.ouw(surfaceHolder);
        }
    }

    public final void ouw(View view, Context context) {
        View view2;
        if (view == null || context == null || (view2 = this.f13842cf) == null || view2.getParent() == null || this.ryl != null) {
            return;
        }
        this.ryl = this.f13842cf;
        this.mwh = (ImageView) view.findViewById(rn.smu);
        this.f13843jg = view.findViewById(rn.qni);
        this.f13844ko = (com.bytedance.sdk.openadsdk.core.widget.ouw) view.findViewById(rn.rrs);
        this.f13850rn = (TextView) view.findViewById(rn.jvy);
        this.zih = (TextView) view.findViewById(rn.fqk);
        this.f13854vm = (TextView) view.findViewById(rn.hun);
    }

    public void ouw(@Nullable ViewGroup viewGroup) {
    }

    public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.yu.ouw ouwVar) {
        this.f13853uq = (ouw) ouwVar;
        tc();
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x01ad  */
    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.vt
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void ouw(final com.bytedance.sdk.openadsdk.core.model.vpp r9) {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.mwh.vt.fkw.ouw(com.bytedance.sdk.openadsdk.core.model.vpp):void");
    }

    public void ouw(String str) {
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.vt
    public final void ouw(boolean z10) {
        this.osn = z10;
    }

    public void pno() {
    }

    public final void qbp() {
        try {
            osn.ouw(this.ryl, 8);
            osn.ouw((View) this.mwh, 8);
            osn.ouw(this.f13843jg, 8);
            osn.ouw((View) this.f13844ko, 8);
            osn.ouw((View) this.f13850rn, 8);
            osn.ouw((View) this.zih, 8);
            osn.ouw((View) this.f13854vm, 8);
        } catch (Exception unused) {
        }
    }

    public void ra() {
    }

    public final void rn() {
        qbp qbpVar = this.f13841cd;
        if (qbpVar != null) {
            qbpVar.ouw(false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.qbp.vt
    public boolean ryl() {
        return false;
    }

    @TargetApi(14)
    public final void th() {
        osn.ouw((View) this.fkw, 0);
        com.bykv.vk.openvk.ouw.ouw.ouw.le.vt vtVar = this.f13845le;
        if (vtVar != null) {
            osn.ouw(vtVar.getView(), 0);
        }
    }

    public void tlj() {
        vpp vppVar;
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar;
        osn.le(this.pno);
        osn.le(this.bly);
        ImageView imageView = this.tlj;
        if (imageView != null && (vppVar = this.jae) != null && (vtVar = vppVar.f13788sd) != null && vtVar.f11283le != null) {
            osn.le(imageView);
            com.bytedance.sdk.openadsdk.th.vt.ouw();
            vpp vppVar2 = this.jae;
            com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar2 = vppVar2.f13788sd;
            com.bytedance.sdk.openadsdk.th.vt.ouw(vtVar2.f11283le, vtVar2.vt, vtVar2.ouw, this.tlj, vppVar2);
        }
        if (this.f13849ra.getVisibility() == 0) {
            osn.ouw((View) this.f13849ra, 8);
        }
    }

    public final void vm() {
        osn.le(this.pno);
        osn.le(this.bly);
        if (this.f13849ra.getVisibility() == 0) {
            osn.ouw((View) this.f13849ra, 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.th.ouw
    public final boolean vpp() {
        qbp qbpVar = this.f13841cd;
        return qbpVar != null && qbpVar.ouw();
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.vt
    public final void vt() {
        osn.fkw(this.pno);
        osn.fkw(this.bly);
        ImageView imageView = this.tlj;
        if (imageView != null) {
            osn.fkw(imageView);
        }
    }

    public final void vt(int i10, int i11) {
        this.zin = i10;
        this.vpp = i11;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.le.ouw
    public final void vt(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.f13845le.getHolder()) {
            return;
        }
        zih();
    }

    public void vt(@Nullable ViewGroup viewGroup) {
    }

    public void vt(boolean z10) {
        osn.ouw((View) this.f13849ra, (!z10 || this.pno.getVisibility() == 0) ? 8 : 0);
    }

    public boolean vt(int i10) {
        return false;
    }

    public final void yu(int i10) {
        this.f13851tc = i10;
        osn.ouw((View) this.fkw, i10);
    }

    public void yu(boolean z10) {
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.le.ouw
    public final boolean yu() {
        this.ex = false;
        if (!zih()) {
            return true;
        }
        this.f13853uq.pno();
        return true;
    }

    public final boolean zih() {
        if (this.f13853uq != null) {
            return true;
        }
        ko.fkw("NewLiveViewLayout", "callback is null");
        return false;
    }

    public final void zin() {
        ImageView imageView = this.mwh;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        com.bytedance.sdk.openadsdk.core.widget.ouw ouwVar = this.f13844ko;
        if (ouwVar != null) {
            ouwVar.setImageBitmap(null);
        }
    }
}
