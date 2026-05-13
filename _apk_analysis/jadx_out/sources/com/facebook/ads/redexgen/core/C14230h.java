package com.facebook.ads.redexgen.core;

import android.os.Build;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C14230h extends C15766g {
    public static String[] A00 = {"4mrgyhu5NuMSfoRJ7wvth", "0QrbVGKHuGc2eSGsbm7N10peHve4GVgP", "Meba3O6SWeMBrZzPyfP10SBJe7jX", "3Oa5wanHMWuCrkjHvXNfwyLB0ZtCKHr4", "YOQh7xYBrfW2123ECT3lDkRgUFpenV07", "JuO7BKBrPjkMVs4", "5m", "UWhmaXdvjdchgK72Wd2HML9QO634NCpp"};

    public C14230h(C2529dL c2529dL) {
        super(c2529dL);
        setCarouselLayoutManager(c2529dL);
    }

    private void setCarouselLayoutManager(C2529dL c2529dL) {
        C2709gI c2709gI = new C2709gI(c2529dL, 0, false);
        if (Build.VERSION.SDK_INT >= 24) {
            c2709gI.A1T(true);
        }
        super.setLayoutManager(c2709gI);
    }

    public FG getFullscreenCarouselRecyclerViewAdapter() {
        getAdapter();
        if (0 != 0) {
            getAdapter();
            return null;
        }
        if (A00[6].length() != 2) {
            throw new RuntimeException();
        }
        A00[2] = "XAsjP5XwQSgGjSaOGRXjEIyXW47w";
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.C15766g
    public C2709gI getLayoutManager() {
        return (C2709gI) super.getLayoutManager();
    }

    public QT getOnScrollListener() {
        return new OC(this);
    }

    @Override // com.facebook.ads.redexgen.core.C15766g
    public void setLayoutManager(QO qo2) {
    }
}
