package com.facebook.ads.redexgen.core;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C15796j extends AbstractC2692g0 {
    public static TimeInterpolator A0B;
    public static String[] A0C = {CampaignEx.CLICKMODE_ON, "w4FteHoxEZNBcBknXysU1QdwgOlgu", "XTfmSewcFvVIPqcU8HiF2JwhBroc2", "gTOT0dcLAsFp3JXaujmr6eSvv", "MioH3rC6822UBFONR3LUPujrkCbYq", "9Rk7JcSITmrZ17kamSQ7i6v9RKdnt", "plmSW6Ql", "PR6dCqey"};
    public ArrayList<AbstractC2076Qg> A0A = new ArrayList<>();
    public ArrayList<AbstractC2076Qg> A07 = new ArrayList<>();
    public ArrayList<C2066Pw> A09 = new ArrayList<>();
    public ArrayList<C2065Pv> A08 = new ArrayList<>();
    public ArrayList<ArrayList<AbstractC2076Qg>> A01 = new ArrayList<>();
    public ArrayList<ArrayList<C2066Pw>> A05 = new ArrayList<>();
    public ArrayList<ArrayList<C2065Pv>> A03 = new ArrayList<>();
    public ArrayList<AbstractC2076Qg> A00 = new ArrayList<>();
    public ArrayList<AbstractC2076Qg> A04 = new ArrayList<>();
    public ArrayList<AbstractC2076Qg> A06 = new ArrayList<>();
    public ArrayList<AbstractC2076Qg> A02 = new ArrayList<>();

    private void A00(C2065Pv c2065Pv) {
        if (c2065Pv.A05 != null) {
            A05(c2065Pv, c2065Pv.A05);
        }
        if (c2065Pv.A04 != null) {
            A05(c2065Pv, c2065Pv.A04);
        }
    }

    private void A01(AbstractC2076Qg abstractC2076Qg) {
        View view = abstractC2076Qg.A0H;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.A06.add(abstractC2076Qg);
        viewPropertyAnimatorAnimate.setDuration(A0D()).alpha(0.0f).setListener(new C2060Pq(this, abstractC2076Qg, viewPropertyAnimatorAnimate, view)).start();
    }

    private void A02(AbstractC2076Qg abstractC2076Qg) {
        if (A0B == null) {
            A0B = new ValueAnimator().getInterpolator();
        }
        abstractC2076Qg.A0H.animate().setInterpolator(A0B);
        A0L(abstractC2076Qg);
    }

    private final void A03(List<AbstractC2076Qg> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).A0H.animate().cancel();
        }
    }

    private void A04(List<C2065Pv> list, AbstractC2076Qg abstractC2076Qg) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C2065Pv c2065Pv = list.get(size);
            if (A05(c2065Pv, abstractC2076Qg) && c2065Pv.A05 == null && c2065Pv.A04 == null) {
                list.remove(c2065Pv);
            }
        }
    }

    private boolean A05(C2065Pv c2065Pv, AbstractC2076Qg abstractC2076Qg) {
        boolean z10 = false;
        if (c2065Pv.A04 == abstractC2076Qg) {
            c2065Pv.A04 = null;
        } else {
            AbstractC2076Qg abstractC2076Qg2 = c2065Pv.A05;
            String[] strArr = A0C;
            if (strArr[2].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[0] = "F";
            strArr2[3] = "q2hYYatvKRTsdUwOPBYP5pb4s";
            if (abstractC2076Qg2 != abstractC2076Qg) {
                return false;
            }
            c2065Pv.A05 = null;
            z10 = true;
        }
        abstractC2076Qg.A0H.setAlpha(1.0f);
        abstractC2076Qg.A0H.setTranslationX(0.0f);
        abstractC2076Qg.A0H.setTranslationY(0.0f);
        A0W(abstractC2076Qg, z10);
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.QK
    public final void A0H() {
        int size;
        for (int size2 = this.A09.size() - 1; size2 >= 0; size2--) {
            C2066Pw c2066Pw = this.A09.get(size2);
            View view = c2066Pw.A04.A0H;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            A0U(c2066Pw.A04);
            this.A09.remove(size2);
        }
        for (int size3 = this.A0A.size() - 1; size3 >= 0; size3--) {
            A0V(this.A0A.get(size3));
            this.A0A.remove(size3);
        }
        for (int size4 = this.A07.size() - 1; size4 >= 0; size4--) {
            AbstractC2076Qg abstractC2076Qg = this.A07.get(size4);
            abstractC2076Qg.A0H.setAlpha(1.0f);
            A0T(abstractC2076Qg);
            this.A07.remove(size4);
        }
        for (int size5 = this.A08.size() - 1; size5 >= 0; size5--) {
            ArrayList<C2065Pv> arrayList = this.A08;
            String[] strArr = A0C;
            if (strArr[0].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[4] = "IUveBZzBDFrSzC13ImzzVKkvQDdr2";
            strArr2[5] = "sCoWws78k8eiD0jPt8s7ggXNZv987";
            A00(arrayList.get(size5));
        }
        this.A08.clear();
        if (A0M()) {
            for (int size6 = this.A05.size() - 1; size6 >= 0; size6--) {
                ArrayList<C2066Pw> arrayList2 = this.A05.get(size6);
                for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                    C2066Pw c2066Pw2 = arrayList2.get(size7);
                    View view2 = c2066Pw2.A04.A0H;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    A0U(c2066Pw2.A04);
                    arrayList2.remove(size7);
                    if (arrayList2.isEmpty()) {
                        this.A05.remove(arrayList2);
                    }
                }
            }
            for (int size8 = this.A01.size() - 1; size8 >= 0; size8--) {
                ArrayList<AbstractC2076Qg> arrayList3 = this.A01.get(size8);
                for (int size9 = arrayList3.size() - 1; size9 >= 0; size9--) {
                    AbstractC2076Qg abstractC2076Qg2 = arrayList3.get(size9);
                    abstractC2076Qg2.A0H.setAlpha(1.0f);
                    A0T(abstractC2076Qg2);
                    arrayList3.remove(size9);
                    if (arrayList3.isEmpty()) {
                        ArrayList<ArrayList<AbstractC2076Qg>> arrayList4 = this.A01;
                        String[] strArr3 = A0C;
                        if (strArr3[0].length() != strArr3[3].length()) {
                            String[] strArr4 = A0C;
                            strArr4[7] = "VBPMrKBD";
                            strArr4[6] = "WZFlfD4M";
                            arrayList4.remove(arrayList3);
                        } else {
                            arrayList4.remove(arrayList3);
                        }
                    }
                }
            }
            ArrayList<ArrayList<C2065Pv>> arrayList5 = this.A03;
            String[] strArr5 = A0C;
            if (strArr5[7].length() != strArr5[6].length()) {
                size = arrayList5.size() - 1;
            } else {
                String[] strArr6 = A0C;
                strArr6[2] = "1rfkrkAxI3SWkdgenr27gUX73o6p1";
                strArr6[1] = "SSeA7srmTqf1oxxrlzMYS1BTDHSjo";
                size = arrayList5.size() - 1;
            }
            while (size >= 0) {
                ArrayList<C2065Pv> arrayList6 = this.A03.get(size);
                for (int size10 = arrayList6.size() - 1; size10 >= 0; size10--) {
                    A00(arrayList6.get(size10));
                    if (arrayList6.isEmpty()) {
                        this.A03.remove(arrayList6);
                    }
                }
                size--;
            }
            A03(this.A06);
            A03(this.A04);
            A03(this.A00);
            A03(this.A02);
            A0G();
        }
    }

    @Override // com.facebook.ads.redexgen.core.QK
    public final void A0I() {
        boolean z10 = !this.A0A.isEmpty();
        boolean z11 = !this.A09.isEmpty();
        boolean z12 = !this.A08.isEmpty();
        boolean z13 = !this.A07.isEmpty();
        if (z10 || z11 || z13 || z12) {
            Iterator<AbstractC2076Qg> it = this.A0A.iterator();
            while (it.hasNext()) {
                A01(it.next());
            }
            this.A0A.clear();
            if (z11) {
                ArrayList<C2066Pw> arrayList = new ArrayList<>();
                arrayList.addAll(this.A09);
                this.A05.add(arrayList);
                this.A09.clear();
                RunnableC2057Pn runnableC2057Pn = new RunnableC2057Pn(this, arrayList);
                if (z10) {
                    P3.A0E(arrayList.get(0).A04.A0H, runnableC2057Pn, A0D());
                } else {
                    runnableC2057Pn.run();
                }
            }
            if (z12) {
                ArrayList<C2065Pv> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.A08);
                this.A03.add(arrayList2);
                this.A08.clear();
                RunnableC2058Po runnableC2058Po = new RunnableC2058Po(this, arrayList2);
                if (z10) {
                    P3.A0E(arrayList2.get(0).A05.A0H, runnableC2058Po, A0D());
                } else {
                    runnableC2058Po.run();
                }
            }
            if (z13) {
                ArrayList<AbstractC2076Qg> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.A07);
                this.A01.add(arrayList3);
                this.A07.clear();
                RunnableC2059Pp runnableC2059Pp = new RunnableC2059Pp(this, arrayList3);
                if (z10 || z11 || z12) {
                    P3.A0E(arrayList3.get(0).A0H, runnableC2059Pp, Math.max(z11 ? A0C() : 0L, z12 ? A0B() : 0L) + (z10 ? A0D() : 0L));
                } else {
                    runnableC2059Pp.run();
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.QK
    public final void A0L(AbstractC2076Qg abstractC2076Qg) {
        View view = abstractC2076Qg.A0H;
        view.animate().cancel();
        for (int size = this.A09.size() - 1; size >= 0; size--) {
            if (this.A09.get(size).A04 == abstractC2076Qg) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                A0U(abstractC2076Qg);
                this.A09.remove(size);
            }
        }
        A04(this.A08, abstractC2076Qg);
        if (this.A0A.remove(abstractC2076Qg)) {
            view.setAlpha(1.0f);
            A0V(abstractC2076Qg);
        }
        if (this.A07.remove(abstractC2076Qg)) {
            view.setAlpha(1.0f);
            String[] strArr = A0C;
            if (strArr[2].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[4] = "yxRUaByjpu2evyevZXzo5CX3I8dRP";
            strArr2[5] = "IuT2zeZcrCaCkdpAEhiSgQgKuQzMH";
            A0T(abstractC2076Qg);
        }
        for (int size2 = this.A03.size() - 1; size2 >= 0; size2--) {
            ArrayList<C2065Pv> arrayList = this.A03.get(size2);
            A04(arrayList, abstractC2076Qg);
            if (arrayList.isEmpty()) {
                this.A03.remove(size2);
            }
        }
        for (int size3 = this.A05.size() - 1; size3 >= 0; size3--) {
            ArrayList<C2066Pw> arrayList2 = this.A05.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).A04 == abstractC2076Qg) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    A0U(abstractC2076Qg);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.A05.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.A01.size() - 1; size5 >= 0; size5--) {
            ArrayList<AbstractC2076Qg> arrayList3 = this.A01.get(size5);
            if (arrayList3.remove(abstractC2076Qg)) {
                view.setAlpha(1.0f);
                A0T(abstractC2076Qg);
                if (arrayList3.isEmpty()) {
                    this.A01.remove(size5);
                }
            }
        }
        this.A06.remove(abstractC2076Qg);
        this.A00.remove(abstractC2076Qg);
        this.A02.remove(abstractC2076Qg);
        this.A04.remove(abstractC2076Qg);
        A0b();
    }

    @Override // com.facebook.ads.redexgen.core.QK
    public final boolean A0M() {
        return (this.A07.isEmpty() && this.A08.isEmpty() && this.A09.isEmpty() && this.A0A.isEmpty() && this.A04.isEmpty() && this.A06.isEmpty() && this.A00.isEmpty() && this.A02.isEmpty() && this.A05.isEmpty() && this.A01.isEmpty() && this.A03.isEmpty()) ? false : true;
    }

    @Override // com.facebook.ads.redexgen.core.QK
    public final boolean A0S(AbstractC2076Qg abstractC2076Qg, List<Object> list) {
        return !list.isEmpty() || super.A0S(abstractC2076Qg, list);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2692g0
    public final boolean A0X(AbstractC2076Qg abstractC2076Qg) {
        A02(abstractC2076Qg);
        abstractC2076Qg.A0H.setAlpha(0.0f);
        this.A07.add(abstractC2076Qg);
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2692g0
    public final boolean A0Y(AbstractC2076Qg abstractC2076Qg) {
        A02(abstractC2076Qg);
        this.A0A.add(abstractC2076Qg);
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2692g0
    public final boolean A0Z(AbstractC2076Qg abstractC2076Qg, int i10, int i11, int i12, int i13) {
        View view = abstractC2076Qg.A0H;
        int translationX = i10 + ((int) abstractC2076Qg.A0H.getTranslationX());
        int translationY = i11 + ((int) abstractC2076Qg.A0H.getTranslationY());
        A02(abstractC2076Qg);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            A0U(abstractC2076Qg);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.A09.add(new C2066Pw(abstractC2076Qg, translationX, translationY, i12, i13));
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2692g0
    public final boolean A0a(AbstractC2076Qg abstractC2076Qg, AbstractC2076Qg abstractC2076Qg2, int i10, int i11, int i12, int i13) {
        if (abstractC2076Qg == abstractC2076Qg2) {
            return A0Z(abstractC2076Qg, i10, i11, i12, i13);
        }
        float translationX = abstractC2076Qg.A0H.getTranslationX();
        float translationY = abstractC2076Qg.A0H.getTranslationY();
        float alpha = abstractC2076Qg.A0H.getAlpha();
        A02(abstractC2076Qg);
        int i14 = (int) ((i12 - i10) - translationX);
        int i15 = (int) ((i13 - i11) - translationY);
        abstractC2076Qg.A0H.setTranslationX(translationX);
        abstractC2076Qg.A0H.setTranslationY(translationY);
        abstractC2076Qg.A0H.setAlpha(alpha);
        if (abstractC2076Qg2 != null) {
            A02(abstractC2076Qg2);
            abstractC2076Qg2.A0H.setTranslationX(-i14);
            abstractC2076Qg2.A0H.setTranslationY(-i15);
            abstractC2076Qg2.A0H.setAlpha(0.0f);
        }
        this.A08.add(new C2065Pv(abstractC2076Qg, abstractC2076Qg2, i10, i11, i12, i13));
        return true;
    }

    public final void A0b() {
        if (A0M()) {
            return;
        }
        A0G();
    }

    public final void A0c(C2065Pv c2065Pv) {
        AbstractC2076Qg abstractC2076Qg = c2065Pv.A05;
        View view = abstractC2076Qg == null ? null : abstractC2076Qg.A0H;
        AbstractC2076Qg abstractC2076Qg2 = c2065Pv.A04;
        View view2 = abstractC2076Qg2 != null ? abstractC2076Qg2.A0H : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(A0B());
            this.A02.add(c2065Pv.A05);
            duration.translationX(c2065Pv.A02 - c2065Pv.A00);
            duration.translationY(c2065Pv.A03 - c2065Pv.A01);
            duration.alpha(0.0f).setListener(new C2063Pt(this, c2065Pv, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.A02.add(c2065Pv.A04);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(A0B()).alpha(1.0f).setListener(new C2064Pu(this, c2065Pv, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    public final void A0d(AbstractC2076Qg abstractC2076Qg) {
        View view = abstractC2076Qg.A0H;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.A00.add(abstractC2076Qg);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(A0A()).setListener(new C2061Pr(this, abstractC2076Qg, view, viewPropertyAnimatorAnimate)).start();
    }

    public final void A0e(AbstractC2076Qg abstractC2076Qg, int i10, int i11, int i12, int i13) {
        View view = abstractC2076Qg.A0H;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.A04.add(abstractC2076Qg);
        viewPropertyAnimatorAnimate.setDuration(A0C()).setListener(new C2062Ps(this, abstractC2076Qg, i14, view, i15, viewPropertyAnimatorAnimate)).start();
    }
}
