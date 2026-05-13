package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C3255pw<ModelType, StateType> {
    public final ModelType A03;
    public final StateType A04;
    public final String A05;
    public final String A06;
    public List<ViewpointAction<ModelType, StateType>> A01 = null;
    public C3253pu A00 = C3253pu.A0B;
    public boolean A02 = false;

    public C3255pw(ModelType modeltype, StateType statetype, String str) {
        this.A03 = modeltype;
        this.A04 = statetype;
        this.A06 = str;
        this.A05 = str;
    }

    public final C3255pw<ModelType, StateType> A06(ViewpointAction<ModelType, StateType> viewpointAction) {
        if (this.A01 == null) {
            this.A01 = new ArrayList();
        }
        this.A01.add(viewpointAction);
        return this;
    }

    public final C3253pu<ModelType, StateType> A07() {
        return new C3253pu<>(this);
    }
}
