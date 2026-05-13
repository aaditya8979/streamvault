package com.facebook.ads.redexgen.core;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3246pm {
    public static String[] A0E = {"hvB6Y5lFyDpOUo5WE2d6RBuRXgbY5ZUm", "NE", "ywY8EvofFV55395JkJDayoeTErGWKbkG", "zJ8LsRBLLSys8CPHp", "gH0zTalybZGhm0qBmcsXdCP28l4r1an9", "kduBCn7ltQGfodptcqURcnO6EcdnH0I2", "cBbzau3JoVbeDspRwe3LG6GIj8yddyUH", "tX"};
    public InterfaceC3248pp A00;
    public boolean A01;
    public final Rect A02;
    public final Rect A03;
    public final Handler A04;
    public final InterfaceC2711gK A05;
    public final InterfaceC3256px A06;
    public final ViewpointQeConfig A07;
    public final ViewpointRegistry A08;
    public final A6 A09;
    public final Runnable A0A;
    public final List<Rect> A0B;
    public final List<DspViewableNode> A0C;
    public final List<C3253pu<?, ?>> A0D;

    public C3246pm(ViewpointQeConfig viewpointQeConfig, InterfaceC3256px interfaceC3256px, InterfaceC2711gK interfaceC2711gK, A6 a62, ViewpointRegistry viewpointRegistry, Handler handler) {
        this(viewpointQeConfig, interfaceC3256px, interfaceC2711gK, a62, viewpointRegistry, handler, 100);
    }

    public C3246pm(ViewpointQeConfig viewpointQeConfig, InterfaceC3256px interfaceC3256px, InterfaceC2711gK interfaceC2711gK, A6 a62, ViewpointRegistry viewpointRegistry, Handler handler, int i10) {
        this.A03 = new Rect();
        this.A02 = new Rect();
        this.A0C = new ArrayList();
        this.A0D = new ArrayList();
        this.A0B = new ArrayList();
        this.A01 = false;
        this.A07 = viewpointQeConfig;
        this.A06 = interfaceC3256px;
        this.A05 = interfaceC2711gK;
        this.A09 = a62;
        this.A08 = viewpointRegistry;
        this.A04 = handler;
        this.A0A = new RunnableC3247pn(this, i10, new Exception());
    }

    public static Activity A00(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    private void A04(long j10) {
        if (!this.A0C.isEmpty()) {
            throw new IllegalStateException();
        }
        this.A06.A9R(this.A0B);
        this.A09.A4Z(j10, this.A0B);
        this.A09.A6H(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(long j10) {
        this.A06.A9R(this.A0B);
        this.A09.A4Z(j10, this.A0B);
        if (!this.A0C.isEmpty()) {
            throw new IllegalStateException();
        }
        if (!this.A0D.isEmpty()) {
            throw new IllegalStateException();
        }
        this.A08.A0A(this.A0C, this.A0D);
        for (final DspViewableNode dspViewableNode : this.A0C) {
            if (this.A07.A00) {
                this.A08.A09(dspViewableNode, new InterfaceC16569v() { // from class: com.facebook.ads.redexgen.X.1I
                    @Override // com.facebook.ads.redexgen.core.InterfaceC16569v
                    public final Object AAB(Object obj) {
                        return this.A00.A0B(dspViewableNode, (C3253pu) obj);
                    }
                });
            } else {
                A07(dspViewableNode, this.A08.A04(dspViewableNode));
            }
        }
        A6 a62 = this.A09;
        String[] strArr = A0E;
        if (strArr[6].charAt(3) == strArr[4].charAt(3)) {
            String[] strArr2 = A0E;
            strArr2[2] = "nrcH38GFR0AnNATGilmIDxGLEfq4UsQc";
            strArr2[5] = "6vipxWZV3AO1VWKwqmDQLGTjEEAJtLqC";
            a62.A6H(this.A0D);
            if (this.A00 != null) {
                this.A00.AF8();
            }
            this.A0C.clear();
            if (A0E[0].charAt(13) != 'n') {
                A0E[0] = "FnmTy5Nmh2EcYtYiSa9Vz9TfA3yApsYC";
                this.A0D.clear();
                return;
            }
        }
        throw new RuntimeException();
    }

    private void A07(DspViewableNode dspViewableNode, C3253pu<?, ?> c3253pu) {
        Iterator<Rect> it = this.A0B.iterator();
        while (it.hasNext()) {
            if (dspViewableNode.A9Q(this.A03, this.A02, it.next()) && c3253pu != C3253pu.A0B) {
                A6 a62 = this.A09;
                Rect rect = this.A03;
                Rect rect2 = this.A02;
                ViewpointQeConfig viewpointQeConfig = this.A07;
                String[] strArr = A0E;
                if (strArr[6].charAt(3) != strArr[4].charAt(3)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0E;
                strArr2[1] = "vG";
                strArr2[7] = "kB";
                a62.A3y(c3253pu, rect, rect2, viewpointQeConfig.A01);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A08() {
        Context contextA7M = this.A06.A7M();
        if (contextA7M == null) {
            return true;
        }
        Activity activityA00 = A00(contextA7M);
        if (activityA00 != null) {
            boolean zIsDestroyed = activityA00.isDestroyed();
            if (A0E[3].length() != 17) {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[2] = "bz230dZZFwB5VtBTUF6Wd1FYETvWTo5q";
            strArr[5] = "SaD2YYriklneEcKSamPXZGVrEiYqxj4X";
            if (zIsDestroyed) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ C3229pL A0B(DspViewableNode dspViewableNode, C3253pu c3253pu) {
        A07(dspViewableNode, c3253pu);
        return null;
    }

    public final void A0C() {
        if (this.A00 != null) {
            this.A00.AF8();
        }
        if (this.A01) {
            this.A04.removeCallbacks(this.A0A);
            A04(this.A05.AC6());
        }
        this.A01 = false;
    }

    public final void A0D() {
        if (this.A01) {
            return;
        }
        this.A01 = true;
        this.A04.post(this.A0A);
    }

    public final void A0E(InterfaceC3250pr interfaceC3250pr) {
        this.A09.AJA(interfaceC3250pr);
    }

    public final void A0F(InterfaceC3248pp interfaceC3248pp) {
        this.A00 = interfaceC3248pp;
    }
}
