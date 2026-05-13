package com.bytedance.adsdk.ugeno.fkw;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
class yu {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public static final /* synthetic */ boolean f11708lh = true;
    private boolean[] fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private long[] f11709le;
    public int[] ouw;
    public long[] vt;
    private final com.bytedance.adsdk.ugeno.fkw.ouw yu;

    public static class ouw {
        public List<lh> ouw;
        public int vt;

        public final void ouw() {
            this.ouw = null;
            this.vt = 0;
        }
    }

    public static class vt implements Comparable<vt> {
        public int ouw;
        public int vt;

        private vt() {
        }

        public /* synthetic */ vt(byte b10) {
            this();
        }

        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(vt vtVar) {
            vt vtVar2 = vtVar;
            int i10 = this.vt;
            int i11 = vtVar2.vt;
            return i10 != i11 ? i10 - i11 : this.ouw - vtVar2.ouw;
        }

        public final String toString() {
            return "Order{order=" + this.vt + ", index=" + this.ouw + '}';
        }
    }

    public yu(com.bytedance.adsdk.ugeno.fkw.ouw ouwVar) {
        this.yu = ouwVar;
    }

    private static int fkw(com.bytedance.adsdk.ugeno.fkw.vt vtVar, boolean z10) {
        return z10 ? vtVar.jg() : vtVar.mwh();
    }

    private static int le(com.bytedance.adsdk.ugeno.fkw.vt vtVar, boolean z10) {
        return z10 ? vtVar.rn() : vtVar.ko();
    }

    private static int lh(com.bytedance.adsdk.ugeno.fkw.vt vtVar, boolean z10) {
        return z10 ? vtVar.mwh() : vtVar.jg();
    }

    private int lh(boolean z10) {
        return z10 ? this.yu.getPaddingTop() : this.yu.getPaddingStart();
    }

    private int ouw(int i10, com.bytedance.adsdk.ugeno.fkw.vt vtVar, int i11) {
        com.bytedance.adsdk.ugeno.fkw.ouw ouwVar = this.yu;
        int iOuw = ouwVar.ouw(i10, ouwVar.getPaddingLeft() + this.yu.getPaddingRight() + vtVar.mwh() + vtVar.ko() + i11, vtVar.ouw());
        int size = View.MeasureSpec.getSize(iOuw);
        return size > vtVar.bly() ? View.MeasureSpec.makeMeasureSpec(vtVar.bly(), View.MeasureSpec.getMode(iOuw)) : size < vtVar.ra() ? View.MeasureSpec.makeMeasureSpec(vtVar.ra(), View.MeasureSpec.getMode(iOuw)) : iOuw;
    }

    private static int ouw(View view, boolean z10) {
        return z10 ? view.getMeasuredWidth() : view.getMeasuredHeight();
    }

    private static int ouw(com.bytedance.adsdk.ugeno.fkw.vt vtVar, boolean z10) {
        return z10 ? vtVar.ouw() : vtVar.vt();
    }

    private int ouw(boolean z10) {
        return z10 ? this.yu.getPaddingStart() : this.yu.getPaddingTop();
    }

    private List<vt> ouw(int i10) {
        ArrayList arrayList = new ArrayList(i10);
        byte b10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            com.bytedance.adsdk.ugeno.fkw.vt vtVar = (com.bytedance.adsdk.ugeno.fkw.vt) this.yu.ouw(i11).getLayoutParams();
            vt vtVar2 = new vt(b10);
            vtVar2.vt = vtVar.lh();
            vtVar2.ouw = i11;
            arrayList.add(vtVar2);
        }
        return arrayList;
    }

    private static List<lh> ouw(List<lh> list, int i10, int i11) {
        int i12 = (i10 - i11) / 2;
        ArrayList arrayList = new ArrayList();
        lh lhVar = new lh();
        lhVar.f11705ra = i12;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (i13 == 0) {
                arrayList.add(lhVar);
            }
            arrayList.add(list.get(i13));
            if (i13 == list.size() - 1) {
                arrayList.add(lhVar);
            }
        }
        return arrayList;
    }

    private void ouw(int i10, int i11, int i12, View view) {
        long[] jArr = this.vt;
        if (jArr != null) {
            jArr[i10] = vt(i11, i12);
        }
        long[] jArr2 = this.f11709le;
        if (jArr2 != null) {
            jArr2[i10] = vt(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    private void ouw(int i10, int i11, lh lhVar, int i12, int i13, boolean z10) {
        int i14;
        int i15;
        double d10;
        double d11;
        int i16 = i12;
        int i17 = 1;
        boolean z11 = z10;
        while (true) {
            float f10 = lhVar.tlj;
            float f11 = 0.0f;
            if (f10 <= 0.0f || i16 < (i14 = lhVar.fkw)) {
                return;
            }
            float f12 = (i16 - i14) / f10;
            lhVar.fkw = i13 + lhVar.f11703le;
            if (!z11) {
                lhVar.f11705ra = Integer.MIN_VALUE;
            }
            float f13 = 0.0f;
            int i18 = 0;
            boolean z12 = false;
            int i19 = 0;
            while (i18 < lhVar.pno) {
                int i20 = lhVar.f11702ko + i18;
                View viewVt = this.yu.vt(i20);
                if (viewVt == null || viewVt.getVisibility() == 8) {
                    i15 = i18;
                } else {
                    com.bytedance.adsdk.ugeno.fkw.vt vtVar = (com.bytedance.adsdk.ugeno.fkw.vt) viewVt.getLayoutParams();
                    int flexDirection = this.yu.getFlexDirection();
                    if (flexDirection == 0 || flexDirection == i17) {
                        int measuredWidth = viewVt.getMeasuredWidth();
                        long[] jArr = this.f11709le;
                        if (jArr != null) {
                            measuredWidth = (int) jArr[i20];
                        }
                        int measuredHeight = viewVt.getMeasuredHeight();
                        long[] jArr2 = this.f11709le;
                        if (jArr2 != null) {
                            measuredHeight = (int) (jArr2[i20] >> 32);
                        }
                        if (this.fkw[i20] || vtVar.yu() <= 0.0f) {
                            i15 = i18;
                        } else {
                            float fYu = measuredWidth + (vtVar.yu() * f12);
                            if (i18 == lhVar.pno - 1) {
                                fYu += f13;
                                f13 = 0.0f;
                            }
                            int iRound = Math.round(fYu);
                            if (iRound > vtVar.bly()) {
                                iRound = vtVar.bly();
                                this.fkw[i20] = true;
                                lhVar.tlj -= vtVar.yu();
                                z12 = true;
                                i15 = i18;
                            } else {
                                f13 += fYu - iRound;
                                i15 = i18;
                                double d12 = f13;
                                if (d12 > 1.0d) {
                                    iRound++;
                                    d10 = d12 - 1.0d;
                                } else if (d12 < -1.0d) {
                                    iRound--;
                                    d10 = d12 + 1.0d;
                                }
                                f13 = (float) d10;
                            }
                            int iVt = vt(i11, vtVar, lhVar.mwh);
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                            viewVt.measure(iMakeMeasureSpec, iVt);
                            int measuredWidth2 = viewVt.getMeasuredWidth();
                            int measuredHeight2 = viewVt.getMeasuredHeight();
                            ouw(i20, iMakeMeasureSpec, iVt, viewVt);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        }
                        int iMax = Math.max(i19, measuredHeight + vtVar.jg() + vtVar.rn() + 0);
                        lhVar.fkw += measuredWidth + vtVar.mwh() + vtVar.ko();
                        i19 = iMax;
                    } else {
                        int measuredHeight3 = viewVt.getMeasuredHeight();
                        long[] jArr3 = this.f11709le;
                        if (jArr3 != null) {
                            measuredHeight3 = (int) (jArr3[i20] >> 32);
                        }
                        int measuredWidth3 = viewVt.getMeasuredWidth();
                        long[] jArr4 = this.f11709le;
                        if (jArr4 != null) {
                            measuredWidth3 = (int) jArr4[i20];
                        }
                        if (!this.fkw[i20] && vtVar.yu() > f11) {
                            float fYu2 = measuredHeight3 + (vtVar.yu() * f12);
                            if (i18 == lhVar.pno - 1) {
                                fYu2 += f13;
                                f13 = f11;
                            }
                            int iRound2 = Math.round(fYu2);
                            if (iRound2 > vtVar.tlj()) {
                                iRound2 = vtVar.tlj();
                                this.fkw[i20] = true;
                                lhVar.tlj -= vtVar.yu();
                                z12 = true;
                            } else {
                                f13 += fYu2 - iRound2;
                                double d13 = f13;
                                if (d13 > 1.0d) {
                                    iRound2++;
                                    d11 = d13 - 1.0d;
                                } else if (d13 < -1.0d) {
                                    iRound2--;
                                    d11 = d13 + 1.0d;
                                }
                                f13 = (float) d11;
                            }
                            int iOuw = ouw(i10, vtVar, lhVar.mwh);
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                            viewVt.measure(iOuw, iMakeMeasureSpec2);
                            int measuredWidth4 = viewVt.getMeasuredWidth();
                            measuredHeight3 = viewVt.getMeasuredHeight();
                            ouw(i20, iOuw, iMakeMeasureSpec2, viewVt);
                            measuredWidth3 = measuredWidth4;
                        }
                        int iMax2 = Math.max(i19, measuredWidth3 + vtVar.mwh() + vtVar.ko() + 0);
                        lhVar.fkw += measuredHeight3 + vtVar.jg() + vtVar.rn();
                        i19 = iMax2;
                        i15 = i18;
                    }
                    lhVar.f11705ra = Math.max(lhVar.f11705ra, i19);
                }
                i18 = i15 + 1;
                i17 = 1;
                f11 = 0.0f;
            }
            if (!z12 || i14 == lhVar.fkw) {
                return;
            }
            i16 = i12;
            i17 = 1;
            z11 = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void ouw(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.bytedance.adsdk.ugeno.fkw.vt r0 = (com.bytedance.adsdk.ugeno.fkw.vt) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.ra()
            r4 = 1
            if (r1 >= r3) goto L1b
            int r1 = r0.ra()
        L19:
            r3 = r4
            goto L27
        L1b:
            int r3 = r0.bly()
            if (r1 <= r3) goto L26
            int r1 = r0.bly()
            goto L19
        L26:
            r3 = 0
        L27:
            int r5 = r0.pno()
            if (r2 >= r5) goto L32
            int r2 = r0.pno()
            goto L3e
        L32:
            int r5 = r0.tlj()
            if (r2 <= r5) goto L3d
            int r2 = r0.tlj()
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L50
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.ouw(r8, r1, r0, r7)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.fkw.yu.ouw(android.view.View, int):void");
    }

    private void ouw(View view, int i10, int i11) {
        com.bytedance.adsdk.ugeno.fkw.vt vtVar = (com.bytedance.adsdk.ugeno.fkw.vt) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i10 - vtVar.jg()) - vtVar.rn()) + 0, vtVar.pno()), vtVar.tlj());
        long[] jArr = this.f11709le;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i11] : view.getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        ouw(i11, iMakeMeasureSpec, iMakeMeasureSpec2, view);
    }

    private static void ouw(CompoundButton compoundButton) {
        com.bytedance.adsdk.ugeno.fkw.vt vtVar = (com.bytedance.adsdk.ugeno.fkw.vt) compoundButton.getLayoutParams();
        int iRa = vtVar.ra();
        int iPno = vtVar.pno();
        Drawable drawableOuw = com.bytedance.adsdk.ugeno.ra.fkw.ouw(compoundButton);
        int minimumWidth = drawableOuw == null ? 0 : drawableOuw.getMinimumWidth();
        int minimumHeight = drawableOuw != null ? drawableOuw.getMinimumHeight() : 0;
        if (iRa == -1) {
            iRa = minimumWidth;
        }
        vtVar.ouw(iRa);
        if (iPno == -1) {
            iPno = minimumHeight;
        }
        vtVar.vt(iPno);
    }

    private void ouw(List<lh> list, lh lhVar, int i10, int i11) {
        lhVar.mwh = i11;
        this.yu.ouw(lhVar);
        lhVar.f11706rn = i10;
        list.add(lhVar);
    }

    private boolean ouw(int i10, int i11, int i12, int i13, com.bytedance.adsdk.ugeno.fkw.vt vtVar, int i14, int i15, int i16) {
        if (this.yu.getFlexWrap() == 0) {
            return false;
        }
        if (vtVar.cf()) {
            return true;
        }
        if (i10 == 0) {
            return false;
        }
        int maxLine = this.yu.getMaxLine();
        if (maxLine != -1 && maxLine <= i16 + 1) {
            return false;
        }
        int iOuw = this.yu.ouw(i14, i15);
        if (iOuw > 0) {
            i13 += iOuw;
        }
        return i11 < i12 + i13;
    }

    private static boolean ouw(int i10, int i11, lh lhVar) {
        return i10 == i11 - 1 && lhVar.ouw() != 0;
    }

    private static int[] ouw(int i10, List<vt> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i10];
        int i11 = 0;
        for (vt vtVar : list) {
            int i12 = vtVar.ouw;
            iArr[i11] = i12;
            sparseIntArray.append(i12, vtVar.vt);
            i11++;
        }
        return iArr;
    }

    private int vt(int i10, com.bytedance.adsdk.ugeno.fkw.vt vtVar, int i11) {
        com.bytedance.adsdk.ugeno.fkw.ouw ouwVar = this.yu;
        int iVt = ouwVar.vt(i10, ouwVar.getPaddingTop() + this.yu.getPaddingBottom() + vtVar.jg() + vtVar.rn() + i11, vtVar.vt());
        int size = View.MeasureSpec.getSize(iVt);
        return size > vtVar.tlj() ? View.MeasureSpec.makeMeasureSpec(vtVar.tlj(), View.MeasureSpec.getMode(iVt)) : size < vtVar.pno() ? View.MeasureSpec.makeMeasureSpec(vtVar.pno(), View.MeasureSpec.getMode(iVt)) : iVt;
    }

    private static int vt(View view, boolean z10) {
        return z10 ? view.getMeasuredHeight() : view.getMeasuredWidth();
    }

    private static int vt(com.bytedance.adsdk.ugeno.fkw.vt vtVar, boolean z10) {
        return z10 ? vtVar.vt() : vtVar.ouw();
    }

    private int vt(boolean z10) {
        return z10 ? this.yu.getPaddingEnd() : this.yu.getPaddingBottom();
    }

    private static long vt(int i10, int i11) {
        return (((long) i10) & 4294967295L) | (((long) i11) << 32);
    }

    private void vt(int i10, int i11, lh lhVar, int i12, int i13, boolean z10) {
        int i14;
        int i15 = i12;
        int i16 = 1;
        boolean z11 = z10;
        while (true) {
            int i17 = lhVar.fkw;
            float f10 = lhVar.f11700cf;
            float f11 = 0.0f;
            if (f10 <= 0.0f || i15 > i17) {
                return;
            }
            float f12 = (i17 - i15) / f10;
            lhVar.fkw = i13 + lhVar.f11703le;
            if (!z11) {
                lhVar.f11705ra = Integer.MIN_VALUE;
            }
            float f13 = 0.0f;
            int i18 = 0;
            boolean z12 = false;
            int i19 = 0;
            while (i18 < lhVar.pno) {
                int i20 = lhVar.f11702ko + i18;
                View viewVt = this.yu.vt(i20);
                if (viewVt == null || viewVt.getVisibility() == 8) {
                    i14 = i17;
                } else {
                    com.bytedance.adsdk.ugeno.fkw.vt vtVar = (com.bytedance.adsdk.ugeno.fkw.vt) viewVt.getLayoutParams();
                    int flexDirection = this.yu.getFlexDirection();
                    if (flexDirection == 0 || flexDirection == i16) {
                        int measuredWidth = viewVt.getMeasuredWidth();
                        long[] jArr = this.f11709le;
                        if (jArr != null) {
                            measuredWidth = (int) jArr[i20];
                        }
                        int measuredHeight = viewVt.getMeasuredHeight();
                        long[] jArr2 = this.f11709le;
                        if (jArr2 != null) {
                            measuredHeight = (int) (jArr2[i20] >> 32);
                        }
                        if (this.fkw[i20] || vtVar.fkw() <= 0.0f) {
                            i14 = i17;
                        } else {
                            float fFkw = measuredWidth - (vtVar.fkw() * f12);
                            if (i18 == lhVar.pno - 1) {
                                fFkw += f13;
                                f13 = 0.0f;
                            }
                            int iRound = Math.round(fFkw);
                            if (iRound < vtVar.ra()) {
                                iRound = vtVar.ra();
                                this.fkw[i20] = true;
                                lhVar.f11700cf -= vtVar.fkw();
                                z12 = true;
                                i14 = i17;
                            } else {
                                f13 += fFkw - iRound;
                                i14 = i17;
                                double d10 = f13;
                                if (d10 > 1.0d) {
                                    iRound++;
                                    f13 -= 1.0f;
                                } else if (d10 < -1.0d) {
                                    iRound--;
                                    f13 += 1.0f;
                                }
                            }
                            int iVt = vt(i11, vtVar, lhVar.mwh);
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                            viewVt.measure(iMakeMeasureSpec, iVt);
                            int measuredWidth2 = viewVt.getMeasuredWidth();
                            int measuredHeight2 = viewVt.getMeasuredHeight();
                            ouw(i20, iMakeMeasureSpec, iVt, viewVt);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        }
                        int iMax = Math.max(i19, measuredHeight + vtVar.jg() + vtVar.rn() + 0);
                        lhVar.fkw += measuredWidth + vtVar.mwh() + vtVar.ko();
                        i19 = iMax;
                    } else {
                        int measuredHeight3 = viewVt.getMeasuredHeight();
                        long[] jArr3 = this.f11709le;
                        if (jArr3 != null) {
                            measuredHeight3 = (int) (jArr3[i20] >> 32);
                        }
                        int measuredWidth3 = viewVt.getMeasuredWidth();
                        long[] jArr4 = this.f11709le;
                        if (jArr4 != null) {
                            measuredWidth3 = (int) jArr4[i20];
                        }
                        if (!this.fkw[i20] && vtVar.fkw() > f11) {
                            float fFkw2 = measuredHeight3 - (vtVar.fkw() * f12);
                            if (i18 == lhVar.pno - 1) {
                                fFkw2 += f13;
                                f13 = f11;
                            }
                            int iRound2 = Math.round(fFkw2);
                            if (iRound2 < vtVar.pno()) {
                                iRound2 = vtVar.pno();
                                this.fkw[i20] = true;
                                lhVar.f11700cf -= vtVar.fkw();
                                z12 = true;
                            } else {
                                f13 += fFkw2 - iRound2;
                                double d11 = f13;
                                if (d11 > 1.0d) {
                                    iRound2++;
                                    f13 -= 1.0f;
                                } else if (d11 < -1.0d) {
                                    iRound2--;
                                    f13 += 1.0f;
                                }
                            }
                            int iOuw = ouw(i10, vtVar, lhVar.mwh);
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                            viewVt.measure(iOuw, iMakeMeasureSpec2);
                            int measuredWidth4 = viewVt.getMeasuredWidth();
                            measuredHeight3 = viewVt.getMeasuredHeight();
                            ouw(i20, iOuw, iMakeMeasureSpec2, viewVt);
                            measuredWidth3 = measuredWidth4;
                        }
                        int iMax2 = Math.max(i19, measuredWidth3 + vtVar.mwh() + vtVar.ko() + 0);
                        lhVar.fkw += measuredHeight3 + vtVar.jg() + vtVar.rn();
                        i19 = iMax2;
                        i14 = i17;
                    }
                    lhVar.f11705ra = Math.max(lhVar.f11705ra, i19);
                }
                i18++;
                i17 = i14;
                i16 = 1;
                f11 = 0.0f;
            }
            int i21 = i17;
            if (!z12 || i21 == lhVar.fkw) {
                return;
            }
            i15 = i12;
            i16 = 1;
            z11 = true;
        }
    }

    private void vt(View view, int i10, int i11) {
        com.bytedance.adsdk.ugeno.fkw.vt vtVar = (com.bytedance.adsdk.ugeno.fkw.vt) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i10 - vtVar.mwh()) - vtVar.ko()) + 0, vtVar.ra()), vtVar.bly());
        long[] jArr = this.f11709le;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) (jArr[i11] >> 32) : view.getMeasuredHeight(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        ouw(i11, iMakeMeasureSpec2, iMakeMeasureSpec, view);
    }

    private static int yu(com.bytedance.adsdk.ugeno.fkw.vt vtVar, boolean z10) {
        return z10 ? vtVar.ko() : vtVar.rn();
    }

    private int yu(boolean z10) {
        return z10 ? this.yu.getPaddingBottom() : this.yu.getPaddingEnd();
    }

    public final void ouw() {
        View viewVt;
        if (this.yu.getFlexItemCount() > 0) {
            int flexDirection = this.yu.getFlexDirection();
            if (this.yu.getAlignItems() != 4) {
                for (lh lhVar : this.yu.getFlexLinesInternal()) {
                    for (Integer num : lhVar.f11701jg) {
                        View viewVt2 = this.yu.vt(num.intValue());
                        if (flexDirection == 0 || flexDirection == 1) {
                            ouw(viewVt2, lhVar.f11705ra, num.intValue());
                        } else {
                            if (flexDirection != 2 && flexDirection != 3) {
                                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                            }
                            vt(viewVt2, lhVar.f11705ra, num.intValue());
                        }
                    }
                }
                return;
            }
            int[] iArr = this.ouw;
            int i10 = 0;
            int i11 = iArr != null ? iArr[0] : 0;
            List<lh> flexLinesInternal = this.yu.getFlexLinesInternal();
            int size = flexLinesInternal.size();
            while (i11 < size) {
                lh lhVar2 = flexLinesInternal.get(i11);
                int i12 = lhVar2.pno;
                for (int i13 = i10; i13 < i12; i13++) {
                    int i14 = lhVar2.f11702ko + i13;
                    if (i13 < this.yu.getFlexItemCount() && (viewVt = this.yu.vt(i14)) != null && viewVt.getVisibility() != 8) {
                        com.bytedance.adsdk.ugeno.fkw.vt vtVar = (com.bytedance.adsdk.ugeno.fkw.vt) viewVt.getLayoutParams();
                        if (vtVar.le() == -1 || vtVar.le() == 4) {
                            if (flexDirection == 0 || flexDirection == 1) {
                                ouw(viewVt, lhVar2.f11705ra, i14);
                            } else {
                                if (flexDirection != 2 && flexDirection != 3) {
                                    throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                                }
                                vt(viewVt, lhVar2.f11705ra, i14);
                            }
                        }
                    }
                }
                i11++;
                i10 = 0;
            }
        }
    }

    public final void ouw(int i10, int i11) {
        int size;
        int paddingLeft;
        int paddingRight;
        int flexItemCount = this.yu.getFlexItemCount();
        boolean[] zArr = this.fkw;
        if (zArr == null) {
            this.fkw = new boolean[Math.max(flexItemCount, 10)];
        } else if (zArr.length < flexItemCount) {
            this.fkw = new boolean[Math.max(zArr.length * 2, flexItemCount)];
        } else {
            Arrays.fill(zArr, false);
        }
        if (this.yu.getFlexItemCount() > 0) {
            int flexDirection = this.yu.getFlexDirection();
            int flexDirection2 = this.yu.getFlexDirection();
            if (flexDirection2 == 0 || flexDirection2 == 1) {
                int mode = View.MeasureSpec.getMode(i10);
                size = View.MeasureSpec.getSize(i10);
                int largestMainSize = this.yu.getLargestMainSize();
                if (mode != 1073741824) {
                    size = Math.min(largestMainSize, size);
                }
                paddingLeft = this.yu.getPaddingLeft();
                paddingRight = this.yu.getPaddingRight();
            } else {
                if (flexDirection2 != 2 && flexDirection2 != 3) {
                    throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                }
                int mode2 = View.MeasureSpec.getMode(i11);
                size = View.MeasureSpec.getSize(i11);
                if (mode2 != 1073741824) {
                    size = this.yu.getLargestMainSize();
                }
                paddingLeft = this.yu.getPaddingTop();
                paddingRight = this.yu.getPaddingBottom();
            }
            int i12 = paddingLeft + paddingRight;
            int[] iArr = this.ouw;
            List<lh> flexLinesInternal = this.yu.getFlexLinesInternal();
            int size2 = flexLinesInternal.size();
            for (int i13 = iArr != null ? iArr[0] : 0; i13 < size2; i13++) {
                lh lhVar = flexLinesInternal.get(i13);
                int i14 = lhVar.fkw;
                if (i14 < size && lhVar.zih) {
                    ouw(i10, i11, lhVar, size, i12, false);
                } else if (i14 > size && lhVar.f11707vm) {
                    vt(i10, i11, lhVar, size, i12, false);
                }
            }
        }
    }

    public final void ouw(int i10, int i11, int i12) {
        int mode;
        int size;
        int flexDirection = this.yu.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode2 = View.MeasureSpec.getMode(i11);
            int size2 = View.MeasureSpec.getSize(i11);
            mode = mode2;
            size = size2;
        } else {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
            }
            mode = View.MeasureSpec.getMode(i10);
            size = View.MeasureSpec.getSize(i10);
        }
        List<lh> flexLinesInternal = this.yu.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = this.yu.getSumOfCrossSize() + i12;
            int i13 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).f11705ra = size - i12;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.yu.getAlignContent();
                if (alignContent == 1) {
                    int i14 = size - sumOfCrossSize;
                    lh lhVar = new lh();
                    lhVar.f11705ra = i14;
                    flexLinesInternal.add(0, lhVar);
                    return;
                }
                if (alignContent == 2) {
                    this.yu.setFlexLines(ouw(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize < size) {
                        float size3 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                        ArrayList arrayList = new ArrayList();
                        int size4 = flexLinesInternal.size();
                        float f10 = 0.0f;
                        while (i13 < size4) {
                            arrayList.add(flexLinesInternal.get(i13));
                            if (i13 != flexLinesInternal.size() - 1) {
                                lh lhVar2 = new lh();
                                if (i13 == flexLinesInternal.size() - 2) {
                                    lhVar2.f11705ra = Math.round(f10 + size3);
                                    f10 = 0.0f;
                                } else {
                                    lhVar2.f11705ra = Math.round(size3);
                                }
                                int i15 = lhVar2.f11705ra;
                                f10 += size3 - i15;
                                if (f10 > 1.0f) {
                                    lhVar2.f11705ra = i15 + 1;
                                    f10 -= 1.0f;
                                } else if (f10 < -1.0f) {
                                    lhVar2.f11705ra = i15 - 1;
                                    f10 += 1.0f;
                                }
                                arrayList.add(lhVar2);
                            }
                            i13++;
                        }
                        this.yu.setFlexLines(arrayList);
                        return;
                    }
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        this.yu.setFlexLines(ouw(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    lh lhVar3 = new lh();
                    lhVar3.f11705ra = size5;
                    for (lh lhVar4 : flexLinesInternal) {
                        arrayList2.add(lhVar3);
                        arrayList2.add(lhVar4);
                        arrayList2.add(lhVar3);
                    }
                    this.yu.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f11 = 0.0f;
                    while (i13 < size7) {
                        lh lhVar5 = flexLinesInternal.get(i13);
                        float f12 = lhVar5.f11705ra + size6;
                        if (i13 == flexLinesInternal.size() - 1) {
                            f12 += f11;
                            f11 = 0.0f;
                        }
                        int iRound = Math.round(f12);
                        f11 += f12 - iRound;
                        if (f11 > 1.0f) {
                            iRound++;
                            f11 -= 1.0f;
                        } else if (f11 < -1.0f) {
                            iRound--;
                            f11 += 1.0f;
                        }
                        lhVar5.f11705ra = iRound;
                        i13++;
                    }
                }
            }
        }
    }

    public final void ouw(View view, lh lhVar, int i10, int i11, int i12, int i13) {
        com.bytedance.adsdk.ugeno.fkw.vt vtVar = (com.bytedance.adsdk.ugeno.fkw.vt) view.getLayoutParams();
        int alignItems = this.yu.getAlignItems();
        if (vtVar.le() != -1) {
            alignItems = vtVar.le();
        }
        int i14 = lhVar.f11705ra;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.yu.getFlexWrap() == 2) {
                    view.layout(i10, (i11 - i14) + view.getMeasuredHeight() + vtVar.jg(), i12, (i13 - i14) + view.getMeasuredHeight() + vtVar.jg());
                    return;
                } else {
                    int i15 = i11 + i14;
                    view.layout(i10, (i15 - view.getMeasuredHeight()) - vtVar.rn(), i12, i15 - vtVar.rn());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i14 - view.getMeasuredHeight()) + vtVar.jg()) - vtVar.rn()) / 2;
                if (this.yu.getFlexWrap() != 2) {
                    int i16 = i11 + measuredHeight;
                    view.layout(i10, i16, i12, view.getMeasuredHeight() + i16);
                    return;
                } else {
                    int i17 = i11 - measuredHeight;
                    view.layout(i10, i17, i12, view.getMeasuredHeight() + i17);
                    return;
                }
            }
            if (alignItems == 3) {
                if (this.yu.getFlexWrap() != 2) {
                    int iMax = Math.max(lhVar.ryl - view.getBaseline(), vtVar.jg());
                    view.layout(i10, i11 + iMax, i12, i13 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max((lhVar.ryl - view.getMeasuredHeight()) + view.getBaseline(), vtVar.rn());
                    view.layout(i10, i11 - iMax2, i12, i13 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (this.yu.getFlexWrap() != 2) {
            view.layout(i10, i11 + vtVar.jg(), i12, i13 + vtVar.jg());
        } else {
            view.layout(i10, i11 - vtVar.rn(), i12, i13 - vtVar.rn());
        }
    }

    public final void ouw(View view, lh lhVar, boolean z10, int i10, int i11, int i12, int i13) {
        com.bytedance.adsdk.ugeno.fkw.vt vtVar = (com.bytedance.adsdk.ugeno.fkw.vt) view.getLayoutParams();
        int alignItems = this.yu.getAlignItems();
        if (vtVar.le() != -1) {
            alignItems = vtVar.le();
        }
        int i14 = lhVar.f11705ra;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (z10) {
                    view.layout((i10 - i14) + view.getMeasuredWidth() + vtVar.mwh(), i11, (i12 - i14) + view.getMeasuredWidth() + vtVar.mwh(), i13);
                    return;
                } else {
                    view.layout(((i10 + i14) - view.getMeasuredWidth()) - vtVar.ko(), i11, ((i12 + i14) - view.getMeasuredWidth()) - vtVar.ko(), i13);
                    return;
                }
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int measuredWidth = (((i14 - view.getMeasuredWidth()) + marginLayoutParams.getMarginStart()) - marginLayoutParams.getMarginEnd()) / 2;
                if (z10) {
                    view.layout(i10 - measuredWidth, i11, i12 - measuredWidth, i13);
                    return;
                } else {
                    view.layout(i10 + measuredWidth, i11, i12 + measuredWidth, i13);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (z10) {
            view.layout(i10 - vtVar.ko(), i11, i12 - vtVar.ko(), i13);
        } else {
            view.layout(i10 + vtVar.mwh(), i11, i12 + vtVar.mwh(), i13);
        }
    }

    public final void ouw(ouw ouwVar, int i10, int i11) {
        ouw(ouwVar, i11, i10, (List<lh>) null);
    }

    public final void ouw(ouw ouwVar, int i10, int i11, List<lh> list) {
        ouw ouwVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z10;
        List<lh> list2;
        View view;
        int i17;
        int i18;
        boolean z11;
        int i19;
        int i20;
        int i21;
        lh lhVar;
        int i22;
        int i23 = i10;
        boolean zOuw = this.yu.ouw();
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        List<lh> arrayList = list == null ? new ArrayList() : list;
        ouwVar.ouw = arrayList;
        int iOuw = ouw(zOuw);
        int iVt = vt(zOuw);
        int iLh = lh(zOuw);
        int iYu = yu(zOuw);
        lh lhVar2 = new lh();
        lhVar2.f11702ko = 0;
        int i24 = iOuw + iVt;
        lhVar2.fkw = i24;
        int flexItemCount = this.yu.getFlexItemCount();
        lh lhVar3 = lhVar2;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = Integer.MIN_VALUE;
        while (true) {
            if (i27 >= flexItemCount) {
                ouwVar2 = ouwVar;
                break;
            }
            View viewVt = this.yu.vt(i27);
            if (viewVt != null) {
                i12 = i25;
                if (viewVt.getVisibility() != 8) {
                    if (viewVt instanceof CompoundButton) {
                        ouw((CompoundButton) viewVt);
                    }
                    com.bytedance.adsdk.ugeno.fkw.vt vtVar = (com.bytedance.adsdk.ugeno.fkw.vt) viewVt.getLayoutParams();
                    if (vtVar.le() == 4) {
                        lhVar3.f11701jg.add(Integer.valueOf(i27));
                    }
                    int iOuw2 = ouw(vtVar, zOuw);
                    if (vtVar.ryl() != -1.0f && mode == 1073741824) {
                        iOuw2 = Math.round(size * vtVar.ryl());
                    }
                    if (zOuw) {
                        i13 = flexItemCount;
                        int iOuw3 = this.yu.ouw(i23, i24 + lh(vtVar, true) + yu(vtVar, true), iOuw2);
                        i15 = size;
                        i14 = mode;
                        int iVt2 = this.yu.vt(i11, iLh + iYu + fkw(vtVar, true) + le(vtVar, true) + i26, vt(vtVar, true));
                        viewVt.measure(iOuw3, iVt2);
                        ouw(i27, iOuw3, iVt2, viewVt);
                        i16 = iOuw3;
                    } else {
                        i13 = flexItemCount;
                        i14 = mode;
                        i15 = size;
                        int iOuw4 = this.yu.ouw(i11, iLh + iYu + fkw(vtVar, false) + le(vtVar, false) + i26, vt(vtVar, false));
                        int iVt3 = this.yu.vt(i23, lh(vtVar, false) + i24 + yu(vtVar, false), iOuw2);
                        viewVt.measure(iOuw4, iVt3);
                        ouw(i27, iOuw4, iVt3, viewVt);
                        i16 = iVt3;
                    }
                    ouw(viewVt, i27);
                    int iCombineMeasuredStates = View.combineMeasuredStates(i12, viewVt.getMeasuredState());
                    int i30 = i26;
                    int i31 = i27;
                    lh lhVar4 = lhVar3;
                    int i32 = i13;
                    int i33 = i24;
                    z10 = false;
                    list2 = arrayList;
                    if (ouw(i14, i15, lhVar3.fkw, yu(vtVar, zOuw) + ouw(viewVt, zOuw) + lh(vtVar, zOuw), vtVar, i31, i28, arrayList.size())) {
                        i17 = i31;
                        if (lhVar4.ouw() > 0) {
                            if (i17 > 0) {
                                i22 = i17 - 1;
                                lhVar = lhVar4;
                            } else {
                                lhVar = lhVar4;
                                i22 = 0;
                            }
                            ouw(list2, lhVar, i22, i30);
                            i26 = i30 + lhVar.f11705ra;
                        } else {
                            i26 = i30;
                        }
                        if (!zOuw) {
                            view = viewVt;
                            if (vtVar.ouw() == -1) {
                                com.bytedance.adsdk.ugeno.fkw.ouw ouwVar3 = this.yu;
                                view.measure(ouwVar3.ouw(i11, ouwVar3.getPaddingLeft() + this.yu.getPaddingRight() + vtVar.mwh() + vtVar.ko() + i26, vtVar.ouw()), i16);
                                ouw(view, i17);
                            }
                        } else if (vtVar.vt() == -1) {
                            com.bytedance.adsdk.ugeno.fkw.ouw ouwVar4 = this.yu;
                            view = viewVt;
                            view.measure(i16, ouwVar4.vt(i11, ouwVar4.getPaddingTop() + this.yu.getPaddingBottom() + vtVar.jg() + vtVar.rn() + i26, vtVar.vt()));
                            ouw(view, i17);
                        } else {
                            view = viewVt;
                        }
                        lhVar3 = new lh();
                        z11 = true;
                        lhVar3.pno = 1;
                        i18 = i33;
                        lhVar3.fkw = i18;
                        lhVar3.f11702ko = i17;
                        i20 = Integer.MIN_VALUE;
                        i19 = 0;
                    } else {
                        view = viewVt;
                        i17 = i31;
                        i18 = i33;
                        z11 = true;
                        lhVar4.pno++;
                        i19 = i28 + 1;
                        i20 = i29;
                        lhVar3 = lhVar4;
                        i26 = i30;
                    }
                    lhVar3.zih |= vtVar.yu() != 0.0f ? z11 : false;
                    boolean z12 = lhVar3.f11707vm;
                    if (vtVar.fkw() == 0.0f) {
                        z11 = false;
                    }
                    lhVar3.f11707vm = z11 | z12;
                    int[] iArr = this.ouw;
                    if (iArr != null) {
                        iArr[i17] = list2.size();
                    }
                    lhVar3.fkw += ouw(view, zOuw) + lh(vtVar, zOuw) + yu(vtVar, zOuw);
                    lhVar3.tlj += vtVar.yu();
                    lhVar3.f11700cf += vtVar.fkw();
                    this.yu.ouw(i17, i19, lhVar3);
                    int iMax = Math.max(i20, vt(view, zOuw) + fkw(vtVar, zOuw) + le(vtVar, zOuw) + 0);
                    lhVar3.f11705ra = Math.max(lhVar3.f11705ra, iMax);
                    if (zOuw) {
                        if (this.yu.getFlexWrap() != 2) {
                            lhVar3.ryl = Math.max(lhVar3.ryl, view.getBaseline() + vtVar.jg());
                        } else {
                            lhVar3.ryl = Math.max(lhVar3.ryl, (view.getMeasuredHeight() - view.getBaseline()) + vtVar.rn());
                        }
                    }
                    i21 = i32;
                    if (ouw(i17, i21, lhVar3)) {
                        ouw(list2, lhVar3, i17, i26);
                        i26 += lhVar3.f11705ra;
                    }
                    if (i26 > Integer.MAX_VALUE) {
                        ouwVar2 = ouwVar;
                        i25 = iCombineMeasuredStates;
                        break;
                    }
                    i29 = iMax;
                    i28 = i19;
                    i25 = iCombineMeasuredStates;
                    i23 = i10;
                    i24 = i18;
                    i27 = i17 + 1;
                    arrayList = list2;
                    size = i15;
                    mode = i14;
                    flexItemCount = i21;
                } else {
                    lhVar3.bly++;
                    lhVar3.pno++;
                    if (ouw(i27, flexItemCount, lhVar3)) {
                        ouw(arrayList, lhVar3, i27, i26);
                    }
                }
            } else {
                if (ouw(i27, flexItemCount, lhVar3)) {
                    ouw(arrayList, lhVar3, i27, i26);
                }
                i12 = i25;
            }
            i17 = i27;
            i21 = flexItemCount;
            i18 = i24;
            i14 = mode;
            i15 = size;
            i25 = i12;
            z10 = false;
            list2 = arrayList;
            i23 = i10;
            i24 = i18;
            i27 = i17 + 1;
            arrayList = list2;
            size = i15;
            mode = i14;
            flexItemCount = i21;
        }
        ouwVar2.vt = i25;
    }

    public final int[] ouw(SparseIntArray sparseIntArray) {
        int flexItemCount = this.yu.getFlexItemCount();
        return ouw(flexItemCount, ouw(flexItemCount), sparseIntArray);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int[] ouw(View view, int i10, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.yu.getFlexItemCount();
        List<vt> listOuw = ouw(flexItemCount);
        vt vtVar = new vt((byte) 0);
        if (view == null || !(layoutParams instanceof com.bytedance.adsdk.ugeno.fkw.vt)) {
            vtVar.vt = 1;
        } else {
            vtVar.vt = ((com.bytedance.adsdk.ugeno.fkw.vt) layoutParams).lh();
        }
        if (i10 == -1 || i10 == flexItemCount || i10 >= this.yu.getFlexItemCount()) {
            vtVar.ouw = flexItemCount;
        } else {
            vtVar.ouw = i10;
            while (i10 < flexItemCount) {
                listOuw.get(i10).ouw++;
                i10++;
            }
        }
        listOuw.add(vtVar);
        return ouw(flexItemCount + 1, listOuw, sparseIntArray);
    }

    public final boolean vt(SparseIntArray sparseIntArray) {
        int flexItemCount = this.yu.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i10 = 0; i10 < flexItemCount; i10++) {
            View viewOuw = this.yu.ouw(i10);
            if (viewOuw != null && ((com.bytedance.adsdk.ugeno.fkw.vt) viewOuw.getLayoutParams()).lh() != sparseIntArray.get(i10)) {
                return true;
            }
        }
        return false;
    }
}
