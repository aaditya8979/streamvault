package com.facebook.ads.redexgen.core;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC2459cC implements View.OnTouchListener {
    public static String[] A01 = {"gOpLt4x0eEJeQNNuJ46yxDU2qUJdqYEL", "PZOrqZevLxuD31hIKj0gHyYQ4Dcgh", "igMzK0YYgnV8ISg3WYQba3hiJQ", "r1F", "hmhkt", "BWRo0uQSzThSh5wdl5bQ5g6bgNQDxstJ", "eE2oRBOJxbFK8ZaewsAA6sP9tyWNw24H", "pn2BkqsWP7aYSksb5nO6IYLmlyBMEu5T"};
    public final /* synthetic */ C4Z A00;

    public ViewOnTouchListenerC2459cC(C4Z c4z) {
        this.A00 = c4z;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.A00.A00 = motionEvent.getY();
                return true;
            case 1:
                float y10 = motionEvent.getY();
                float f10 = this.A00.A00;
                String[] strArr = A01;
                if (strArr[1].length() != strArr[2].length()) {
                    String[] strArr2 = A01;
                    strArr2[1] = "FGPeZwV3hST1IH5pUqKb6TkoTjuvG";
                    strArr2[2] = "XZOwAM4xH67XqTDn0ifpo8neSL";
                    if (f10 >= y10) {
                        return true;
                    }
                    C4Z c4z = this.A00;
                    if (A01[5].charAt(29) != 'h') {
                        A01[4] = "lWtjS";
                        c4z.A0j(false);
                        return true;
                    }
                }
                throw new RuntimeException();
            default:
                return true;
        }
    }
}
