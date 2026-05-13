package com.bytedance.sdk.openadsdk.common;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.jae;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.ko;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes9.dex */
public final class ouw {

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.common.ouw$ouw, reason: collision with other inner class name */
    public interface InterfaceC0214ouw {
        void ouw(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar);
    }

    public interface vt {
        void ouw();

        void vt();
    }

    private static com.bytedance.sdk.openadsdk.component.reward.top.vt lh(final ko koVar) {
        final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = koVar.ouw;
        final String str = koVar.vt;
        final vt vtVar = koVar.yu;
        final zih zihVar = koVar.f13094le;
        final boolean z10 = koVar.fkw;
        return new com.bytedance.sdk.openadsdk.component.reward.top.vt() { // from class: com.bytedance.sdk.openadsdk.common.ouw.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void lh() {
                com.bytedance.sdk.openadsdk.component.reward.view.ryl rylVar;
                View viewTlj;
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = ouwVar;
                if (ouwVar2 == null || (rylVar = ouwVar2.ey) == null || (viewTlj = rylVar.tlj()) == null) {
                    return;
                }
                viewTlj.performClick();
            }

            /* JADX WARN: Removed duplicated region for block: B:30:0x008a A[RETURN] */
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void ouw() {
                /*
                    r8 = this;
                    java.lang.String r0 = r1
                    java.lang.String r1 = "onClickSkip: "
                    com.bytedance.sdk.component.utils.qbp.ouw(r0, r1)
                    com.bytedance.sdk.openadsdk.common.zih r0 = r2
                    com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r1 = r3
                    java.lang.String r2 = r1
                    r3 = 0
                    boolean r0 = com.bytedance.sdk.openadsdk.common.ouw.ouw(r0, r1, r3, r2)
                    if (r0 == 0) goto L15
                    return
                L15:
                    boolean r0 = r4
                    if (r0 == 0) goto L8b
                    com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r3
                    java.lang.String r1 = r1
                    com.bytedance.sdk.openadsdk.common.ouw$vt r2 = r5
                    com.bytedance.sdk.openadsdk.activity.pno r4 = r0.f13261gh
                    boolean r4 = r4 instanceof com.bytedance.sdk.openadsdk.activity.fkw
                    r5 = 1
                    if (r4 == 0) goto L2b
                    r2.vt()
                L29:
                    r3 = r5
                    goto L88
                L2b:
                    com.bytedance.sdk.openadsdk.core.model.vpp r4 = r0.vt
                    boolean r4 = com.bytedance.sdk.openadsdk.core.model.od.pno(r4)
                    com.bytedance.sdk.openadsdk.core.model.vpp r6 = r0.vt
                    boolean r6 = com.bytedance.sdk.openadsdk.core.model.od.le(r6)
                    com.bytedance.sdk.openadsdk.core.model.vpp r7 = r0.vt
                    boolean r7 = com.bytedance.sdk.openadsdk.core.model.od.fkw(r7)
                    if (r6 != 0) goto L6b
                    if (r7 == 0) goto L4c
                    com.bytedance.sdk.openadsdk.component.reward.ouw.pno r6 = r0.ksc
                    int r7 = com.bytedance.sdk.openadsdk.component.reward.ouw.pno.f13283lh
                    boolean r6 = r6.lh(r7)
                    if (r6 == 0) goto L4c
                    goto L6b
                L4c:
                    com.bytedance.sdk.openadsdk.core.model.vpp r4 = r0.vt
                    boolean r4 = com.bytedance.sdk.openadsdk.core.model.th.ouw(r4)
                    if (r4 == 0) goto L65
                    java.util.concurrent.atomic.AtomicBoolean r4 = r0.f13272rn
                    boolean r4 = r4.get()
                    if (r4 != 0) goto L65
                    java.lang.String r0 = "onClickSkip: finish self"
                    com.bytedance.sdk.component.utils.ko.vt(r1, r0)
                    r2.vt()
                    goto L29
                L65:
                    com.bytedance.sdk.openadsdk.component.reward.ouw.ryl r0 = r0.uoy
                    r0.yu(r3)
                    goto L88
                L6b:
                    if (r4 == 0) goto L73
                    com.bytedance.sdk.openadsdk.component.reward.ouw.pno r0 = r0.ksc
                    r0.ra()
                    goto L29
                L73:
                    com.bytedance.sdk.openadsdk.component.reward.view.ryl r0 = r0.ey
                    android.view.View r0 = r0.tlj()
                    if (r0 == 0) goto L7f
                    r0.performClick()
                    goto L29
                L7f:
                    r2.vt()
                    java.lang.String r0 = "onClickSkip: closeButton is null"
                    com.bytedance.sdk.component.utils.qbp.ouw(r1, r0)
                    goto L29
                L88:
                    if (r3 == 0) goto L8b
                    return
                L8b:
                    com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r3
                    com.bytedance.sdk.openadsdk.common.ouw.ouw(r0)
                    com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r3
                    com.bytedance.sdk.openadsdk.common.ouw$vt r1 = r5
                    com.bytedance.sdk.openadsdk.common.ouw.ouw(r0, r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.common.ouw.AnonymousClass2.ouw():void");
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void ouw(String str2) {
                vpp vppVar;
                com.bytedance.sdk.openadsdk.core.model.yu yuVarSd;
                com.bytedance.sdk.openadsdk.component.reward.view.tlj tljVar;
                com.bytedance.sdk.openadsdk.component.reward.view.yu yuVar;
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = ouwVar;
                if (ouwVar2 == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar2 = ouwVar2.coz;
                if (ouwVar2 == null || vtVar2 == null) {
                    com.bytedance.sdk.component.utils.qbp.lh("handleSoundClickCommonLogic adContext is null", new Object[0]);
                    return;
                }
                ouwVar2.f13260cj = !ouwVar2.f13260cj;
                if (vtVar2 != null && vtVar2.yu() != null) {
                    vtVar2.yu().ouw(ouwVar2.f13260cj);
                }
                boolean z11 = !(ouwVar2.f13261gh instanceof com.bytedance.sdk.openadsdk.activity.fkw);
                if (ouwVar2.euf && z11 && (tljVar = ouwVar2.jae) != null && (yuVar = tljVar.ouw) != null) {
                    yuVar.setSoundMute(ouwVar2.f13260cj);
                }
                ouwVar2.ex.ouw(ouwVar2.f13260cj, str2);
                ouwVar2.f13257bs.lh(ouwVar2.f13260cj);
                ouwVar2.ksc.ouw(ouwVar2.f13260cj);
                if (!z11 || (vppVar = ouwVar2.vt) == null || (yuVarSd = vppVar.sd()) == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.ryl.yu yuVar2 = yuVarSd.ouw;
                long jFkw = ouwVar2.ex.fkw();
                if (ouwVar2.f13260cj) {
                    yuVar2.ra(jFkw);
                } else {
                    yuVar2.pno(jFkw);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void vt() {
                com.bytedance.sdk.openadsdk.component.reward.ouw.lh lhVar;
                com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar2;
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = ouwVar;
                if (ouwVar2 == null || (lhVar = ouwVar2.f13270pd) == null || (vtVar2 = ouwVar2.coz) == null) {
                    return;
                }
                lhVar.ouw(vtVar2);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void yu() {
                InterfaceC0214ouw interfaceC0214ouw;
                ko koVar2 = koVar;
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = koVar2.ouw;
                if (ouwVar2 == null || (interfaceC0214ouw = koVar2.f13096ra) == null) {
                    return;
                }
                interfaceC0214ouw.ouw(ouwVar2);
            }
        };
    }

    public static void ouw(ko koVar) {
        vt(koVar);
        koVar.ouw.uoy.ouw(lh(koVar));
    }

    public static void ouw(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        if (ouwVar == null) {
            com.bytedance.sdk.component.utils.qbp.lh("reportSkipCommonEvent adContext is null", new Object[0]);
            return;
        }
        ko.ouw ouwVar2 = new ko.ouw();
        ouwVar2.ouw(ouwVar.ex.fkw());
        ouwVar2.vt(ouwVar.ex.ko());
        ouwVar2.vt = ouwVar.ex.pno();
        ouwVar2.tlj = 3;
        ouwVar2.ryl = ouwVar.ex.jg();
        com.bytedance.sdk.openadsdk.component.reward.ouw.ko koVar = ouwVar.ex;
        ouwVar2.f14415le = koVar.f13237jg;
        com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.ouw(koVar.lh(), ouwVar2, ouwVar.ex.zin);
        jae.ouw(ouwVar.f13265le);
        ouwVar.ex.ouw("skip", false);
    }

    public static void ouw(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar, vt vtVar) {
        com.bytedance.sdk.openadsdk.component.reward.view.yu yuVar;
        if (!ouwVar.f13266lh || (com.bytedance.sdk.openadsdk.core.model.th.lh(ouwVar.vt) && (yuVar = ouwVar.jae.ouw) != null && yuVar.yu == 0)) {
            vtVar.vt();
        } else {
            vtVar.ouw();
        }
        vt(ouwVar);
    }

    public static /* synthetic */ boolean ouw(zih zihVar, com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar, boolean z10, String str) {
        if (zihVar == null) {
            return false;
        }
        boolean zOuw = zihVar.ouw(od.lh(ouwVar.vt), z10, null);
        if (zOuw) {
            return true;
        }
        boolean z11 = ouwVar.f13261gh instanceof com.bytedance.sdk.openadsdk.activity.fkw;
        com.bytedance.sdk.component.utils.qbp.ouw(str, "handleTipDialogLogic: isEndCardScene=%s, dialogResult=%s", Boolean.valueOf(z11), Boolean.valueOf(zOuw));
        if (z11) {
            return ((com.bytedance.sdk.openadsdk.activity.fkw) ouwVar.f13261gh).bly();
        }
        return true;
    }

    public static boolean ouw(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar, View view) {
        if (!ouwVar.f13257bs.cf() || (!ouwVar.euf && !ouwVar.tlj.get())) {
            return false;
        }
        boolean z10 = ouwVar.fak.fkw.get();
        ouwVar.f13257bs.yu(z10);
        ouwVar.ey.le(8);
        if (view instanceof com.bytedance.sdk.openadsdk.core.le.yu) {
            ((com.bytedance.sdk.openadsdk.core.le.yu) view).setImageResource(com.bytedance.sdk.component.utils.vpp.yu(ouwVar.hun, "tt_close_btn"));
        }
        ouwVar.ux.sendEmptyMessageDelayed(600, 5000L);
        return !vpp.lh(ouwVar.vt) || z10;
    }

    private static void vt(final ko koVar) {
        com.bytedance.sdk.openadsdk.component.reward.view.ryl rylVar;
        final View viewTlj;
        final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = koVar.ouw;
        if (ouwVar == null || (rylVar = ouwVar.ey) == null || (viewTlj = rylVar.tlj()) == null) {
            return;
        }
        final String str = koVar.vt;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.ouw.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/common/ouw$1;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(g.f53147u, view);
                safedk_ouw$1_onClick_8118eb6a0d740d920b327176faed6cdb(view);
            }

            public void safedk_ouw$1_onClick_8118eb6a0d740d920b327176faed6cdb(View view) {
                com.bytedance.sdk.component.utils.ko.vt(str, "onClick: Close Button");
                if (ouw.ouw(ouwVar, viewTlj)) {
                    return;
                }
                ouwVar.f13257bs.ryl();
                ouwVar.fak.fkw();
                ouwVar.f13258cd.lh();
                zih zihVar = koVar.f13094le;
                if (zihVar == null || !od.yu(ouwVar.vt)) {
                    koVar.f13095lh.run();
                    return;
                }
                boolean zOuw = ouw.ouw(zihVar, ouwVar, true, str);
                if (!(ouwVar.f13261gh instanceof com.bytedance.sdk.openadsdk.activity.fkw) || zOuw) {
                    return;
                }
                koVar.f13095lh.run();
            }
        };
        viewTlj.setOnClickListener(onClickListener);
        viewTlj.setTag(viewTlj.getId(), onClickListener);
    }

    public static void vt(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        com.bytedance.sdk.openadsdk.core.model.yu yuVarSd;
        com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
        if (ouwVar == null) {
            return;
        }
        vpp vppVar = ouwVar.vt;
        if (vppVar != null && (yuVarSd = vppVar.sd()) != null && (yuVar = yuVarSd.ouw) != null) {
            long jFkw = ouwVar.ex.fkw();
            yuVar.fkw(jFkw);
            yuVar.yu(jFkw);
        }
        com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(ouwVar.vt, 5);
    }
}
